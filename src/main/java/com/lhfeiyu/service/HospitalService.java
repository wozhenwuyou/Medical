package com.lhfeiyu.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.AssetsPath;
import com.lhfeiyu.dao.AdvertisementMapper;
import com.lhfeiyu.dao.AnnouncementMapper;
import com.lhfeiyu.dao.ArticleMapper;
import com.lhfeiyu.dao.BespeakMapper;
import com.lhfeiyu.dao.DiagnoseTemplateMapper;
import com.lhfeiyu.dao.DoctorMapper;
import com.lhfeiyu.dao.HospitalMapper;
import com.lhfeiyu.po.Advertisement;
import com.lhfeiyu.po.Announcement;
import com.lhfeiyu.po.Article;
import com.lhfeiyu.po.Bespeak;
import com.lhfeiyu.po.DiagnoseTemplate;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.tools.Check;
import com.lhfeiyu.tools.CommonGenerator;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.Md5Util;
import com.lhfeiyu.util.RegexUtil;
import com.lhfeiyu.vo.DiagnoseTag;
import com.lhfeiyu.vo.Prescription;

/**
* <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 业务层：通用-Hospital <p>
* <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华 <p>
* <strong> 编写时间：</strong>2016年3月20日22:22:22<p>
* <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司 <p>
* <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 2.0 <p>
 */
@Service
public class HospitalService extends CommonService<Hospital> {

	@Autowired
	HospitalMapper hospitalMapper;
	@Autowired
	ArticleMapper articleMapper;
	@Autowired
	DiagnoseTemplateMapper diagnoseTemplateMapper;
	@Autowired
	DoctorMapper doctorMapper;
	@Autowired
	BespeakMapper bespeakMapper;
	@Autowired
	AnnouncementMapper announcementMapper;
	@Autowired
	AdvertisementMapper advertisementMapper;
	@Autowired
	PictureService pictureService;
	@Autowired
	private DictService  dictService;
	
	public Hospital selectService(Map<String, Object> map) {
		return super.selectByCondition(map);
	}
	
	public List<Hospital> selectListService(Map<String, Object> map) {
		return super.selectListByCondition(map);
	}
	
	public int updateService(Hospital hospital) {
		return super.updateByPrimaryKeySelective(hospital);
	}
	
	public int insertService(Hospital hospital) {
		return super.insertSelective(hospital);
	}
	
	public int deleteService(Integer id) {
		return super.deleteByPrimaryKey(id);
	}

	public JSONObject insertService(JSONObject json,Hospital hospital, String basePath) {
		hospital.setMainStatus(1);
		String dictValue = dictService.getDictValueByCode(AssetsPath.code_defaultHospitalLogo);
		String defaultPassword = dictService.getDictValueByCode(AssetsPath.code_defaultUserPassword);
		String phone = hospital.getPhone();
		if(Check.isNull(phone)){
			return Result.failure(json, "请输入手机号码", "phone_null");
		}
		
		String attrStr = hospital.getAttrStr();//固定网址后缀
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
		String serial = CommonGenerator.getSerialByDate("h");
		hospital.setSerial(serial);
		if(asCount > 0){
			return Result.failure(json, "固定访问网址后缀已存在，请重新输入", "attrStr_exist");
		}else{
			hospital.setAttrStr(serial);//固定医生访问地址后缀
		}
		
		Map<String, Object> map = CommonGenerator.getHashMap();
		map.put("phoneCheck", hospital.getPhone());
		int count = hospitalMapper.selectCountByCondition(map);
		if(count > 0){
			return Result.failure(json, "手机号码已存在，请重新输入", "phone_repeat");
		}
		
		String password = hospital.getPassword();
		if(Check.isNull(password)){
			password = defaultPassword;
		}
		password = Md5Util.encrypt(password);
		hospital.setPassword(password);
		
		if(Check.isNotNull(hospital.getLogo())){//路径不相等，删除之前的头像
			if(!hospital.getLogo().equals(dictValue)){
				Integer picId = pictureService.insertPicAndTransfer(hospital.getLogo(), basePath, AssetsPath.foler_hospitalLogo);//现在是上传照片时不插入数据库，具体业务功能时插入数据库
				String savePic = hospital.getLogo().replace( AssetsPath.defaultFileFolder, AssetsPath.foler_hospitalLogo);
				hospital.setLogo(savePic);
				hospital.setLogoPicId(picId);
			}
			
		}
		
		if(Check.isNull(hospital.getLogo())){
			hospital.setLogo(dictValue);
		}
		super.insertSelective(hospital);
		return json;
	}
	
	private int checkAttrStrAleadyExist(String attrStr){
		if(Check.isNull(attrStr)){
			return 0;
		}
		Map<String,Object> map = CommonGenerator.getHashMap();
		map.put("attrStr", attrStr);
		int count = hospitalMapper.selectCountByCondition(map);
		return count;
	}

	public JSONObject updateService(JSONObject json,Hospital hospital, Hospital db_hospital, String basePath) {
		if(Check.isNull(hospital.getUpdatedBy())){
			hospital.setUpdatedBy(db_hospital.getWholeName());
		}
		String dictValue = dictService.getDictValueByCode(AssetsPath.code_defaultHospitalLogo);
		//db_hospital = hospitalMapper.selectByPrimaryKey(db_hospital.getId());
		String newAvatar = hospital.getLogo();
		String oldAvatar = db_hospital.getLogo();
		
		String attrStr = hospital.getAttrStr();//固定网址后缀
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
		if(Check.isNotNull(attrStr) && Check.isNotNull(db_hospital.getAttrStr()) && !attrStr.equals(db_hospital.getAttrStr())){
			int asCount = checkAttrStrAleadyExist(attrStr);
			if(asCount > 1){
				return Result.failure(json, "固定访问网址后缀已存在，请重新输入", "attrStr_exist");
			}
		}
		
		String phone = hospital.getPhone();
		if(Check.isNull(phone)){
			return Result.failure(json, "请输入手机号码", "phone_null");
		}
		Integer adminId = hospital.getId();
		if(null != adminId){
			boolean checkPhone = true;
			Hospital oldAdmin = hospitalMapper.selectByPrimaryKey(adminId);
			if(null != oldAdmin.getPhone() && phone.equals(oldAdmin.getPhone())){
				checkPhone = false;
			}
			Map<String, Object> map = CommonGenerator.getHashMap();
			if(checkPhone){
				map.put("phoneCheck", phone);
				int count = hospitalMapper.selectCountByCondition(map);
				if(count > 0){
					return Result.failure(json, "手机号码已存在，请重新输入", "phone_repeat");
				}
			}
		}
		
		if(Check.isNotNull(newAvatar) && (Check.isNull(oldAvatar) || (Check.isNotNull(oldAvatar) && !newAvatar.equals(oldAvatar))) ){//路径不相等，删除之前的头像
			
			if(!newAvatar.equals(dictValue)){
				Integer picId = pictureService.insertPicAndTransfer(newAvatar, basePath, AssetsPath.foler_hospitalLogo);//现在是上传照片时不插入数据库，具体业务功能时插入数据库
				String savePic = newAvatar.replace( AssetsPath.defaultFileFolder, AssetsPath.foler_hospitalLogo);
				hospital.setLogo(savePic);
				hospital.setLogoPicId(picId);
			}
			
			Integer avatarPicId = db_hospital.getLogoPicId();
			if(Check.isNotNull(avatarPicId)){
				pictureService.deleteByPrimaryKey(avatarPicId);
			}
		}
		
		if(Check.isNull(hospital.getLogo())){
			hospital.setLogo(dictValue);
		}
		super.updateByPrimaryKeySelective(hospital);
		return json;
	}

	public int updateHospitalDelete(JSONObject json,String ids, Hospital db_hospital) {
		Hospital hospital = new Hospital();
		hospital.setMainStatus(2);
		hospital.setIds(ids);
		hospital.setUpdatedBy(db_hospital.getWholeName());
		return super.updateByIdsSelective(hospital);
	}

	public ModelMap getHospitalData(ModelMap modelMap, Hospital db_hospital, Integer id) {
		Hospital hospital = null;
		Integer hospitalId = null;
		if(null == id){
			hospitalId = db_hospital.getId();
		}else{
			hospitalId = id;
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", hospitalId);
		hospital = hospitalMapper.selectByCondition(map);
		if(null == hospital){
			return Result.failure(modelMap, "您访问的诊所信息不存在", "hospital_null");
		}
		modelMap = getHotDiscussionAndHealthInformation(modelMap,hospitalId);
		modelMap = getAnnouncementAndActivity(modelMap,hospitalId);
		modelMap = getHospitalDoctorArticle(modelMap,hospitalId,null);
		modelMap = getAdvertisement(modelMap);
		modelMap.put("hospital", hospital);
		return modelMap;
	}
	
	public ModelMap getAdvertisement(ModelMap modelMap){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("catId", 3);
		map.put("mainStatus", 1);
		map.put("start", 0);
		map.put("count", 5);
		List<Advertisement> advertisementList = advertisementMapper.selectListByCondition(map);//首页广告
		modelMap.put("advertisementList", advertisementList);
		return modelMap;
	}
	
	public ModelMap getHospitalDoctorArticle(ModelMap modelMap, Integer hospitalId,Integer typeId) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("hospitalId", hospitalId);
		map.put("mainStatus", 1);
		if(null == typeId){
			map.put("start", 0);
			map.put("count", 15);
			List<Article> articleList = articleMapper.selectListByCondition(map);
			modelMap.put("articleList", articleList);
			return modelMap;
		}
		
		List<Doctor> doctorList = doctorMapper.selectListByCondition(map);
		if(doctorList.size() > 0){
			List<Article> articleListArray = new ArrayList<Article>();
			for(Doctor d: doctorList){
				map.clear();
				map.put("userId", d.getId());
				if(null != typeId){
					map.put("typeId", typeId);
				}
				map.put("mainStatus",1);
				List<Article> articleList = articleMapper.selectListByCondition(map);
				articleListArray.addAll(articleList);
				if(articleListArray.size() > 6){
					break;
				}
			}
			if(null != typeId){
				if(typeId == 43){
					modelMap.put("hotDiscussionList", articleListArray);
				}else if(typeId == 42){
					modelMap.put("healthInformationList", articleListArray);
				}
			}else{
				modelMap.put("articleList", articleListArray);
			}
		}
		return modelMap;
	}
	
	public JSONObject getHospitalDoctorArticle(JSONObject json,Map<String,Object> map) {
		map.put("mainStatus", 1);
		List<Doctor> doctorList = doctorMapper.selectListByCondition(map);
		if(doctorList.size() > 0){
			List<Article> articleListArray = new ArrayList<Article>();
			for(Doctor d: doctorList){
				map.clear();
				map.put("userId", d.getId());
				map.put("mainStatus",1);
				List<Article> articleList = articleMapper.selectListByCondition(map);
				articleListArray.addAll(articleList);
			}
			Result.gridData(articleListArray, articleListArray.size(), json);
			Result.success(json, "数据加载成功", null);
		}
		return json;
	}

	private ModelMap getHotDiscussionAndHealthInformation(ModelMap modelMap,Integer hospitalId) {
		modelMap = getHospitalDoctorArticle(modelMap,hospitalId,43);//热点讨论
		modelMap = getHospitalDoctorArticle(modelMap,hospitalId,42);//健康资讯
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
	
	public ModelMap getDiagnoseTemplateData(ModelMap modelMap, Hospital db_hospital, Integer diagnoseTemplateId) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", diagnoseTemplateId);
		DiagnoseTemplate diagnoseTemplate = diagnoseTemplateMapper.selectByCondition(map);
		modelMap.put("diagnoseTemplate", diagnoseTemplate);
		String prescription = diagnoseTemplate.getPrescription();
		String diagnoseTags = diagnoseTemplate.getDiagnoseTags();
		if(Check.isNotNull(prescription)){
			List<Prescription> prescriptionList = JSONObject.parseArray(prescription, Prescription.class);
			List<DiagnoseTag> diagnoseTagList = JSONObject.parseArray(diagnoseTags, DiagnoseTag.class);
			modelMap.put("prescriptionList", prescriptionList);
			modelMap.put("diagnoseTagList", diagnoseTagList);
		}
		return modelMap;
	}

	public ModelMap getDoctorData(ModelMap modelMap, Hospital db_hospital, Integer doctorId) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", doctorId);
		Doctor doctor = doctorMapper.selectByCondition(map);
		modelMap.put("doctor", doctor);
		return modelMap;
	}

	public ModelMap getBespeakData(ModelMap modelMap, Hospital db_hospital, Integer bespeakId) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", bespeakId);
		Bespeak bespeak = bespeakMapper.selectByCondition(map);
		modelMap.put("bespeak", bespeak);
		return modelMap;
	}
	
}