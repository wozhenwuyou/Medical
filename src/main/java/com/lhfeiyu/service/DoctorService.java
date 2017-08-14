package com.lhfeiyu.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.AssetsPath;
import com.lhfeiyu.dao.AdvertisementMapper;
import com.lhfeiyu.dao.AnnouncementMapper;
import com.lhfeiyu.dao.ArticleMapper;
import com.lhfeiyu.dao.BespeakMapper;
import com.lhfeiyu.dao.DiagnoseMapper;
import com.lhfeiyu.dao.DoctorMapper;
import com.lhfeiyu.dao.FansMapper;
import com.lhfeiyu.dao.MessageMapper;
import com.lhfeiyu.dao.PhrBasicInfoMapper;
import com.lhfeiyu.dao.UserMapper;
import com.lhfeiyu.po.Admin;
import com.lhfeiyu.po.Advertisement;
import com.lhfeiyu.po.Announcement;
import com.lhfeiyu.po.Article;
import com.lhfeiyu.po.Bespeak;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.Fans;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.po.PhrBasicInfo;
import com.lhfeiyu.tools.Check;
import com.lhfeiyu.tools.CommonGenerator;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.Md5Util;
import com.lhfeiyu.util.RegexUtil;

/**
* <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 业务层：通用-Doctor <p>
* <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华 <p>
* <strong> 编写时间：</strong>2016年3月20日22:22:22<p>
* <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司 <p>
* <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 2.0 <p>
 */
@Service
public class DoctorService extends CommonService<Doctor> {

	@Autowired
	DoctorMapper doctorMapper;
	@Autowired
	ArticleMapper articleMapper;
	@Autowired
	FansMapper fansMapper;
	@Autowired
	DiagnoseMapper diagnoseMapper;
	@Autowired
	AnnouncementMapper announcementMapper;
	@Autowired
	AdvertisementMapper advertisementMapper;
	@Autowired
	BespeakMapper bespeakMapper;
	@Autowired
	PictureService pictureService;
	@Autowired
	UserMapper userMapper;
	@Autowired
	MessageMapper messageMapper;
	@Autowired
	private DictService  dictService;
	
	public Doctor selectService(Map<String, Object> map) {
		return super.selectByCondition(map);
	}
	
	public List<Doctor> selectListService(Map<String, Object> map) {
		return super.selectListByCondition(map);
	}
	
	public JSONObject updateService(JSONObject json,Doctor doctor,Doctor sessionDoctor, String basePath) {
		String username = sessionDoctor.getUsername();
		doctor.setUpdatedBy(username);
		sessionDoctor = doctorMapper.selectByPrimaryKey(sessionDoctor.getId());
		String newAvatar = doctor.getAvatar();
		String oldAvatar = sessionDoctor.getAvatar();
		String dictValue = dictService.getDictValueByCode(AssetsPath.code_defaultDoctorAvatar);
		
		String attrStr = doctor.getAttrStr();//固定网址后缀
		if(Check.isNotNull(attrStr)){
			if(attrStr.length()<5){
				return Result.failure(json, "固定访问网址后缀不能少于5个字符", "attrStr_short");
			}
			if(attrStr.length()>30){
				return Result.failure(json, "固定访问网址后缀不能超过30个字符", "attrStr_long");
			}
			if(!attrStr.matches(RegexUtil.letter_number_regexp)){
				return Result.failure(json, "固定访问网址只能包含字母和数字", "attrStr_specialChar");
			}
		}
		int asCount = checkAttrStrAleadyExist(attrStr);
		if(asCount > 1){
			return Result.failure(json, "固定访问网址后缀已存在，请重新输入", "attrStr_exist");
		}
		
		/*if(!sessionDoctor.getPhone().equals(doctor.getPhone())){//更改了手机号码
			Map<String,Object> map = CommonGenerator.getHashMap();
			map.put("phone", doctor.getPhone());
			Doctor dbUser = doctormapper.selectByCondition(map);
			if(null != dbUser){
				return Result.failure(json, "手机号码已存在", "phone_exist");
			}
		}*/
		
		String phone = doctor.getPhone();
		String idcardNum = doctor.getIdCard();
		if(Check.isNull(phone)){
			return Result.failure(json, "请输入手机号码", "phone_null");
		}
		if(Check.isNull(idcardNum)){
			return Result.failure(json, "请输入身份证号码", "idcardNum_null");
		}
		Integer adminId = doctor.getId();
		if(null != adminId){
			boolean checkPhone = true;
			boolean checkIdcardNum = true;
			Doctor oldAdmin = doctorMapper.selectByPrimaryKey(adminId);
			if(null != oldAdmin.getPhone() && phone.equals(oldAdmin.getPhone())){
				checkPhone = false;
			}
			if(null != oldAdmin.getIdCard() && idcardNum.equals(oldAdmin.getIdCard())){
				checkIdcardNum = false;
			}
			
			Map<String, Object> map = CommonGenerator.getHashMap();
			if(checkPhone){
				map.put("phoneCheck", phone);
				int count = doctorMapper.selectCountByCondition(map);
				if(count > 0){
					return Result.failure(json, "手机号码已存在，请重新输入", "phone_repeat");
				}
			}
			if(checkIdcardNum){
				map.clear();
				map.put("idcardNumCheck", idcardNum);
				int count2 = doctorMapper.selectCountByCondition(map);
				if(count2 > 0){
					return Result.failure(json, "身份证号码已存在，请重新输入", "idcardNum_repeat");
				}
			}
		}
		
		if(Check.isNotNull(newAvatar) && (Check.isNull(oldAvatar) || (Check.isNotNull(oldAvatar) && !newAvatar.equals(oldAvatar))) ){//路径不相等，删除之前的头像
			if(!newAvatar.equals(dictValue)){
				Integer picId = pictureService.insertPicAndTransfer(newAvatar, basePath, AssetsPath.foler_doctorAvatar);//现在是上传照片时不插入数据库，具体业务功能时插入数据库
				String savePic = newAvatar.replace( AssetsPath.defaultFileFolder, AssetsPath.foler_doctorAvatar);
				doctor.setAvatar(savePic);
				doctor.setAvatarPicId(picId);
			}

			Integer avatarPicId = sessionDoctor.getAvatarPicId();
			if(Check.isNotNull(avatarPicId)){
				pictureService.deleteByPrimaryKey(avatarPicId);
			}
		}
		
		if(Check.isNull(doctor.getAvatar())){
			doctor.setAvatar(dictValue);
		}
		
		super.updateByPrimaryKeySelective(doctor);
		return json;
	}
	
	private int checkAttrStrAleadyExist(String attrStr){
		if(Check.isNull(attrStr)){
			return 0;
		}
		Map<String,Object> map = CommonGenerator.getHashMap();
		map.put("attrStr", attrStr);
		int count = doctorMapper.selectCountByCondition(map);
		return count;
	}
	
	public JSONObject insertService(JSONObject json,Doctor doctor, Hospital hospital, String basePath) {
		String dictValue = dictService.getDictValueByCode(AssetsPath.code_defaultDoctorAvatar);
		String defaultPassword = dictService.getDictValueByCode(AssetsPath.code_defaultUserPassword);
		String phone = doctor.getPhone();
		String idcardNum = doctor.getIdCard();
		if(Check.isNull(phone)){
			return Result.failure(json, "请输入手机号码", "phone_null");
		}
		if(Check.isNull(idcardNum)){
			return Result.failure(json, "请输入身份证号码", "idcardNum_null");
		}
		
		String attrStr = doctor.getAttrStr();//固定网址后缀
		if(Check.isNotNull(attrStr)){
			if(attrStr.length()<5){
				return Result.failure(json, "固定访问网址后缀不能少于5个字符", "attrStr_short");
			}
			if(attrStr.length()>30){
				return Result.failure(json, "固定访问网址后缀不能超过30个字符", "attrStr_long");
			}
			if(!attrStr.matches(RegexUtil.letter_number_regexp)){
				return Result.failure(json, "固定访问网址只能包含字母和数字", "attrStr_specialChar");
			}
		}
		int asCount = checkAttrStrAleadyExist(attrStr);
		String serial = CommonGenerator.getSerialByDate("d");
		doctor.setSerial(serial);
		if(asCount > 0){
			return Result.failure(json, "固定访问网址后缀已存在，请重新输入", "attrStr_exist");
		}else{
			doctor.setAttrStr(serial);//固定医生访问地址后缀
		}
		
		Map<String, Object> map = CommonGenerator.getHashMap();
		map.put("phoneCheck", phone);
		int count = doctorMapper.selectCountByCondition(map);
		if(count > 0){
			return Result.failure(json, "手机号码已存在，请重新输入", "phone_repeat");
		}
		map.clear();
		map.put("idcardNumCheck", idcardNum);
		int count2 = doctorMapper.selectCountByCondition(map);
		if(count2 > 0){
			return Result.failure(json, "身份证号码已存在，请重新输入", "idcardNum_repeat");
		}
		
		Date date = new Date();
		doctor.setMainStatus(1);
		String password = doctor.getPassword();
		Integer hospitalId = hospital.getId();
		if(Check.isNull(password)){
			password = defaultPassword;
		}
		password = Md5Util.encrypt(password);
		doctor.setPassword(password);
		
		if(Check.isNotNull(doctor.getAvatar())){//路径不相等，删除之前的头像
			
			if(!doctor.getAvatar().equals(dictValue)){
				Integer picId = pictureService.insertPicAndTransfer(doctor.getAvatar(), basePath, AssetsPath.foler_doctorAvatar);//现在是上传照片时不插入数据库，具体业务功能时插入数据库
				String savePic = doctor.getAvatar().replace( AssetsPath.defaultFileFolder, AssetsPath.foler_doctorAvatar);
				doctor.setAvatar(savePic);
				doctor.setAvatarPicId(picId);
			}
			
		}
		
		doctor.setHospitalId(hospitalId);
		if(Check.isNull(doctor.getAvatar())){
			doctor.setAvatar(dictValue);
		}
		doctor.setCreatedBy(hospital.getWholeName());
		doctor.setCreatedAt(date);
		super.insertSelective(doctor);
		return json;
	}
	
	public int deleteService(Integer id) {
		return super.deleteByPrimaryKey(id);
	}
	
	public int updateDoctorDelete(JSONObject json, String ids, Hospital hospital) {
		Doctor doctor = new Doctor();
		doctor.setMainStatus(2);
		doctor.setIds(ids);
		doctor.setUpdatedBy(hospital.getWholeName());
		return super.updateByIdsSelective(doctor);
	}

	public ModelMap getDoctorData(ModelMap modelMap, Doctor db_doctor, Integer id, boolean showPrivateArticle) {
		Doctor doctor = getDoctorInformation(db_doctor,id);
		if(null == doctor){
			return Result.failure(modelMap, "您访问的医生信息不存在", "doctor_null");
		}
		modelMap = getHotDiscussionAndHealthInformation(modelMap,db_doctor,id);
		modelMap = getAnnouncementAndActivity(modelMap,doctor.getHospitalId());
		modelMap = getFansData(modelMap,db_doctor,id);
		modelMap = getArticleCountAndPatientCount(modelMap,db_doctor,id);
		modelMap = getDoctorArticle(modelMap,db_doctor,id, showPrivateArticle);
		modelMap = getAdvertisement(modelMap);
		modelMap.put("doctor", doctor);
		return modelMap;
	}

	private ModelMap getDoctorArticle(ModelMap modelMap, Doctor db_doctor, Integer id, boolean showPrivateArticle) {
		Integer doctorId = null;
		if(null == id){
			doctorId = db_doctor.getId();
		}else{
			doctorId = id;
		}
		Map<String,Object> map = CommonGenerator.getHashMap();
		map.put("userId", doctorId);
		map.put("mainStatus", 1);
		map.put("start", 0);
		map.put("count", 15);
		if(!showPrivateArticle){//不显示随手记文章
			map.put("notPrivate", 1);
		}
		List<Article> articleList = articleMapper.selectListByCondition(map);
		modelMap.put("articleList", articleList);
		return modelMap;
	}

	private ModelMap getArticleCountAndPatientCount(ModelMap modelMap, Doctor db_doctor, Integer id) {
		Integer doctorId = null;
		if(null == id){
			doctorId = db_doctor.getId();
		}else{
			doctorId = id;
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mainStatus", 1);
		map.put("userId", doctorId);
		map.put("exceptTypeId", 55);//随手记
		Integer articleCount = articleMapper.selectCountByCondition(map);
		modelMap.put("articleCount", articleCount);
		map.clear();
		map.put("mainStatus", 1);
		map.put("belongDoctorId", doctorId);
		Integer patientTotal = userMapper.selectCountByCondition(map);//总患者数据 
		modelMap.put("patientTotal", patientTotal);
		return modelMap;
	}
	
	public ModelMap getHotDiscussionAndHealthInformation(ModelMap modelMap,Doctor db_doctor, Integer id){
		/*Integer doctorId = null;
		if(null == id){
			doctorId = db_doctor.getId();
		}else{
			doctorId = id;
		}*/
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("typeId", 43);
		map.put("mainStatus", 1);
		map.put("start", 0);
		map.put("count", 10);
		//map.put("userId", doctorId);//查询全部该类型的文章
		List<Article> hotDiscussionList = articleMapper.selectListByCondition(map);//热点讨论
			modelMap.put("hotDiscussionList", hotDiscussionList);
		map.clear();
		map.put("typeId", 42);
		map.put("mainStatus", 1);
		map.put("start", 0);
		map.put("count", 10);
		//map.put("userId", doctorId);//查询全部该类型的文章
		List<Article> healthInformationList = articleMapper.selectListByCondition(map);//健康资讯
			modelMap.put("healthInformationList", healthInformationList);
			return modelMap;
	}
	
	private ModelMap getAnnouncementAndActivity(ModelMap modelMap,Integer hospitalId){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mainStatus", 1);
		map.put("hospitalId", hospitalId);
		map.put("count", 15);
		map.put("start", 0);
		map.put("joinSysAnno", 1);
		List<Announcement> announcementList = announcementMapper.selectListByCondition(map);//公告
		modelMap.put("announcementList", announcementList);
		/*map.clear();
		map.put("typeId", 46);
		map.put("mainStatus", 1);
		List<Article> activityList = articleMapper.selectListByCondition(map);//活动
			modelMap.put("activityList", activityList);*/
		return modelMap;
	}
	
	private Doctor getDoctorInformation(Doctor db_doctor, Integer id){
		Doctor doctor = null;
		Integer doctorId = null;
		if(null == id){
			doctorId = db_doctor.getId();
		}else{
			doctorId = id;
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", doctorId);
		doctor = doctorMapper.selectByCondition(map);
		return doctor;
	}
	
	public ModelMap getFansData(ModelMap  modelMap, Doctor db_doctor, Integer doctorId){
		Doctor doctor = getDoctorInformation(db_doctor,doctorId);
		if(null == doctor){
			return Result.failure(modelMap, "您访问的医生信息不存在", "doctor_null");
		}
		if(null == doctorId){
			doctorId = doctor.getId();
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("userId", doctorId);
		map.put("mainStatus", 1);
		map.put("exceptUserId", doctorId);
		List<Fans> fansList = fansMapper.selectListByCondition(map);//粉丝或好友
		modelMap.put("fansList", fansList);
		modelMap.put("doctorId", doctorId);
		modelMap.put("doctor", doctor);
		return modelMap;
	}
	
	public ModelMap getAdvertisement(ModelMap modelMap){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("catId", 2);
		map.put("mainStatus", 1);
		map.put("start", 0);
		map.put("count", 5);
		List<Advertisement> advertisementList = advertisementMapper.selectListByCondition(map);//首页广告
		modelMap.put("advertisementList", advertisementList);
		return modelMap;
	}
	
	public Doctor addRegDoctor(JSONObject json, Doctor doctor, String ip){
		//resetUserField(user, ip);
		return doctor;
	}
	
	public JSONObject validateRegDoctor(JSONObject json, Doctor doctor){
		
		return json;
	}

	public JSONObject updateService(JSONObject json, Doctor doctor, Hospital hospital, String basePath) {
		String dictValue = dictService.getDictValueByCode(AssetsPath.code_defaultDoctorAvatar);
		Doctor sessionDoctor = doctorMapper.selectByPrimaryKey(doctor.getId());
		String username = sessionDoctor.getUsername();
		doctor.setUpdatedBy(username);
		String newAvatar = doctor.getAvatar();
		String oldAvatar = sessionDoctor.getAvatar();
		
		String attrStr = doctor.getAttrStr();//固定网址后缀
		if(Check.isNotNull(attrStr)){
			if(attrStr.length()<5){
				return Result.failure(json, "固定访问网址后缀不能少于5个字符", "attrStr_short");
			}
			if(attrStr.length()>30){
				return Result.failure(json, "固定访问网址后缀不能超过30个字符", "attrStr_long");
			}
			if(!attrStr.matches(RegexUtil.letter_number_regexp)){
				return Result.failure(json, "固定访问网址只能包含字母和数字", "attrStr_specialChar");
			}
		}
		if(Check.isNotNull(attrStr) && Check.isNotNull(sessionDoctor.getAttrStr()) && !attrStr.equals(sessionDoctor.getAttrStr())){
			int asCount = checkAttrStrAleadyExist(attrStr);
			if(asCount > 1){
				return Result.failure(json, "固定访问网址后缀已存在，请重新输入", "attrStr_exist");
			}
		}
		
		String phone = doctor.getPhone();
		String idcardNum = doctor.getIdCard();
		if(Check.isNull(phone)){
			return Result.failure(json, "请输入手机号码", "phone_null");
		}
		if(Check.isNull(idcardNum)){
			return Result.failure(json, "请输入身份证号码", "idcardNum_null");
		}
		Integer adminId = doctor.getId();
		if(null != adminId){
			boolean checkPhone = true;
			boolean checkIdcardNum = true;
			Doctor oldAdmin = doctorMapper.selectByPrimaryKey(adminId);
			if(null != oldAdmin.getPhone() && phone.equals(oldAdmin.getPhone())){
				checkPhone = false;
			}
			if(null != oldAdmin.getIdCard() && idcardNum.equals(oldAdmin.getIdCard())){
				checkIdcardNum = false;
			}
			
			Map<String, Object> map = CommonGenerator.getHashMap();
			if(checkPhone){
				map.put("phoneCheck", phone);
				int count = doctorMapper.selectCountByCondition(map);
				if(count > 0){
					return Result.failure(json, "手机号码已存在，请重新输入", "phone_repeat");
				}
			}
			if(checkIdcardNum){
				map.clear();
				map.put("idcardNumCheck", idcardNum);
				int count2 = doctorMapper.selectCountByCondition(map);
				if(count2 > 0){
					return Result.failure(json, "身份证号码已存在，请重新输入", "idcardNum_repeat");
				}
			}
		}
		
		if(Check.isNotNull(newAvatar) && (Check.isNull(oldAvatar) || (Check.isNotNull(oldAvatar) && !newAvatar.equals(oldAvatar))) ){//路径不相等，删除之前的头像
			if(!doctor.getAvatar().equals(dictValue)){
				Integer picId = pictureService.insertPicAndTransfer(newAvatar, basePath, AssetsPath.foler_doctorAvatar);//现在是上传照片时不插入数据库，具体业务功能时插入数据库
				String savePic = doctor.getAvatar().replace( AssetsPath.defaultFileFolder, AssetsPath.foler_doctorAvatar);
				doctor.setAvatar(savePic);
				doctor.setAvatarPicId(picId);
			}
			
			Integer avatarPicId = sessionDoctor.getAvatarPicId();
			if(Check.isNotNull(avatarPicId)){
				pictureService.deleteByPrimaryKey(avatarPicId);
			}
		}
		
		if(Check.isNull(doctor.getAvatar())){
			doctor.setAvatar(dictValue);
		}
		
		String password = doctor.getPassword();
		if(Check.isNotNull(password)){
			password = Md5Util.encrypt(password);
			doctor.setPassword(password);
		}
		
		Date date = new Date();
		Integer hospitalId = hospital.getId();
		doctor.setHospitalId(hospitalId);
		doctor.setUpdatedBy(hospital.getWholeName());
		doctor.setUpdatedAt(date);
		super.updateByPrimaryKeySelective(doctor);
		return json;
	}

	public ModelMap getBespeakData(ModelMap modelMap, Doctor session_doctor, Integer bespeakId) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", bespeakId);
		Bespeak bespeak = bespeakMapper.selectByCondition(map);
		modelMap.put("bespeak", bespeak);
		return modelMap;
	}
	
	public List<Doctor> selectDiagnoseSumByCondition(Map<String, Object> map) {
		return doctorMapper.selectDiagnoseSumByCondition(map);
	}

	public ModelMap getAllFansData(ModelMap modelMap, Admin session_admin, Object object) {
//		Doctor doctor = getDoctorInformation(db_doctor,doctorId);
//		if(null == doctor){
//			return Result.failure(modelMap, "您访问的医生信息不存在", "doctor_null");
//		}
//		if(null == doctorId){
//			doctorId = doctor.getId();
//		}
		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("userId", doctorId);
		map.put("mainStatus", 1);
//		map.put("exceptUserId", doctorId);
		List<Fans> fansList = fansMapper.selectListByCondition(map);//粉丝或好友
		modelMap.put("fansList", fansList);
//		modelMap.put("doctorId", doctorId);
//		modelMap.put("doctor", doctor);
		return modelMap;
	}
	
	
}