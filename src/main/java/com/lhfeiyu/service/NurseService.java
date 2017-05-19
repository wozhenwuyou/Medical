package com.lhfeiyu.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.AssetsPath;
import com.lhfeiyu.dao.NurseMapper;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.po.Nurse;
import com.lhfeiyu.tools.Check;
import com.lhfeiyu.tools.CommonGenerator;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.Md5Util;

/**
* <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 业务层：通用-Nurse <p>
* <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华 <p>
* <strong> 编写时间：</strong>2016年3月20日22:22:22<p>
* <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司 <p>
* <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 2.0 <p>
 */
@Service
public class NurseService extends CommonService<Nurse> {

	@Autowired
	NurseMapper nurseMapper;
	@Autowired
	PictureService pictureService;
	@Autowired
	private DictService  dictService;
	
	public Nurse selectService(Map<String, Object> paramMap) {
		return super.selectByCondition(paramMap);
	}
	
	public List<Nurse> selectListService(Map<String, Object> paramMap) {
		return super.selectListByCondition(paramMap);
	}
	
	public int updateService(Nurse nurse) {
		return super.updateByPrimaryKeySelective(nurse);
	}
	
	public int insertService(Nurse nurse) {
		return super.insertSelective(nurse);
	}
	
	public int updateDeleteService(Integer id, String updatedBy) {
		return super.updateDeletedNowById(id, updatedBy);
	}
	
	public int deleteService(Integer id) {
		return super.deleteByPrimaryKey(id);
	}
	
	public JSONObject check(JSONObject json, Nurse nurse){
		
		String phone = nurse.getPhone();
		String idcardNum = nurse.getIdcardNum();
		if(Check.isNull(phone)){
			return Result.failure(json, "请输入手机号码", "phone_null");
		}
		if(Check.isNull(idcardNum)){
			return Result.failure(json, "请输入身份证号码", "idcardNum_null");
		}
		Integer adminId = nurse.getId();
		if(null != adminId){
			boolean checkPhone = true;
			boolean checkIdcardNum = true;
			Nurse oldAdmin = nurseMapper.selectByPrimaryKey(adminId);
			if(null != oldAdmin.getPhone() && phone.equals(oldAdmin.getPhone())){
				checkPhone = false;
			}
			if(null != oldAdmin.getIdcardNum() && idcardNum.equals(oldAdmin.getIdcardNum())){
				checkIdcardNum = false;
			}
			
			Map<String, Object> map = CommonGenerator.getHashMap();
			if(checkPhone){
				map.put("phoneCheck", phone);
				int count = nurseMapper.selectCountByCondition(map);
				if(count > 0){
					return Result.failure(json, "手机号码已存在，请重新输入", "phone_repeat");
				}
			}
			if(checkIdcardNum){
				map.clear();
				map.put("idcardNumCheck", idcardNum);
				int count2 = nurseMapper.selectCountByCondition(map);
				if(count2 > 0){
					return Result.failure(json, "身份证号码已存在，请重新输入", "idcardNum_repeat");
				}
			}
		}
		return json;
	}

	public JSONObject insertService(JSONObject json, Nurse nurse, Hospital hospital, String basePath) {
		String phone = nurse.getPhone();
		String idcardNum = nurse.getIdcardNum();
		String dictValue = dictService.getDictValueByCode(AssetsPath.code_defaultNurseAvatar);
		if(Check.isNull(phone)){
			return Result.failure(json, "请输入手机号码", "phone_null");
		}
		if(Check.isNull(idcardNum)){
			return Result.failure(json, "请输入身份证号码", "idcardNum_null");
		}
			
		Map<String, Object> map = CommonGenerator.getHashMap();
		map.put("phoneCheck", phone);
		int count = nurseMapper.selectCountByCondition(map);
		if(count > 0){
			return Result.failure(json, "手机号码已存在，请重新输入", "phone_repeat");
		}
		map.clear();
		map.put("idcardNumCheck", idcardNum);
		int count2 = nurseMapper.selectCountByCondition(map);
		if(count2 > 0){
			return Result.failure(json, "身份证号码已存在，请重新输入", "idcardNum_repeat");
		}
		Date date = new Date();
		nurse.setMainStatus(1);
		String password = nurse.getPassword();
		Integer hospitalId = hospital.getId();
		if(Check.isNotNull(password)){
			password = Md5Util.encrypt(password);
			nurse.setPassword(password);
		}
		
		if(Check.isNotNull(nurse.getAvatar())){//路径不相等，删除之前的头像
			
			if(!nurse.getAvatar().equals(dictValue)){
				Integer picId = pictureService.insertPicAndTransfer(nurse.getAvatar(), basePath, AssetsPath.foler_nurseAvatar);//现在是上传照片时不插入数据库，具体业务功能时插入数据库
				String savePic = nurse.getAvatar().replace( AssetsPath.defaultFileFolder, AssetsPath.foler_nurseAvatar);
				nurse.setAvatar(savePic);
				nurse.setAvatarPicId(picId);
			}
		
		}
		
		if(Check.isNull(nurse.getAvatar())){
			nurse.setAvatar(dictValue);
		}
		nurse.setHospitalId(hospitalId);
		nurse.setCreatedBy(hospital.getWholeName());
		nurse.setCreatedAt(date);
		super.insertSelective(nurse);
		return json;
	}

	public JSONObject updateService(JSONObject json, Nurse nurse, Hospital hospital, String basePath) {
		Nurse sessionNurse = nurseMapper.selectByPrimaryKey(nurse.getId());
		String username = sessionNurse.getUsername();
		nurse.setUpdatedBy(username);
		String dictValue = dictService.getDictValueByCode(AssetsPath.code_defaultNurseAvatar);
		String newAvatar = nurse.getAvatar();
		String oldAvatar = sessionNurse.getAvatar();
		
		String phone = nurse.getPhone();
		String idcardNum = nurse.getIdcardNum();
		if(Check.isNull(phone)){
			return Result.failure(json, "请输入手机号码", "phone_null");
		}
		if(Check.isNull(idcardNum)){
			return Result.failure(json, "请输入身份证号码", "idcardNum_null");
		}
		Integer adminId = nurse.getId();
		if(null != adminId){
			boolean checkPhone = true;
			boolean checkIdcardNum = true;
			Nurse oldAdmin = nurseMapper.selectByPrimaryKey(adminId);
			if(null != oldAdmin.getPhone() && phone.equals(oldAdmin.getPhone())){
				checkPhone = false;
			}
			if(null != oldAdmin.getIdcardNum() && idcardNum.equals(oldAdmin.getIdcardNum())){
				checkIdcardNum = false;
			}
			
			Map<String, Object> map = CommonGenerator.getHashMap();
			if(checkPhone){
				map.put("phoneCheck", phone);
				int count = nurseMapper.selectCountByCondition(map);
				if(count > 0){
					return Result.failure(json, "手机号码已存在，请重新输入", "phone_repeat");
				}
			}
			if(checkIdcardNum){
				map.clear();
				map.put("idcardNumCheck", idcardNum);
				int count2 = nurseMapper.selectCountByCondition(map);
				if(count2 > 0){
					return Result.failure(json, "身份证号码已存在，请重新输入", "idcardNum_repeat");
				}
			}
		}
		
		if(Check.isNotNull(newAvatar) && (Check.isNull(oldAvatar) || (Check.isNotNull(oldAvatar) && !newAvatar.equals(oldAvatar))) ){//路径不相等，删除之前的头像
			if(!newAvatar.equals(dictValue)){
				Integer picId = pictureService.insertPicAndTransfer(newAvatar, basePath, AssetsPath.foler_nurseAvatar);//现在是上传照片时不插入数据库，具体业务功能时插入数据库
				String savePic = newAvatar.replace( AssetsPath.defaultFileFolder, AssetsPath.foler_nurseAvatar);
				nurse.setAvatar(savePic);
				nurse.setAvatarPicId(picId);
			}
			
			Integer avatarPicId = sessionNurse.getAvatarPicId();
			if(Check.isNotNull(avatarPicId)){
				pictureService.deleteByPrimaryKey(avatarPicId);
			}
		}
		
		if(Check.isNull(nurse.getAvatar())){
			nurse.setAvatar(dictValue);
		}
		
		String password = nurse.getPassword();
		if(Check.isNotNull(password)){
			password = Md5Util.encrypt(password);
			nurse.setPassword(password);
		}
		
		Date date = new Date();
		Integer hospitalId = hospital.getId();
		nurse.setHospitalId(hospitalId);
		nurse.setUpdatedBy(hospital.getWholeName());
		nurse.setUpdatedAt(date);
		super.updateByPrimaryKeySelective(nurse);
		return json;
	}

}