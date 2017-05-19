package com.lhfeiyu.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.AssetsPath;
import com.lhfeiyu.dao.DiagnoseMapper;
import com.lhfeiyu.dao.DoctorMapper;
import com.lhfeiyu.dao.DoctorPatientMapper;
import com.lhfeiyu.dao.MedicationLogMapper;
import com.lhfeiyu.dao.MedicationMapper;
import com.lhfeiyu.dao.MedicationRepertoryMapper;
import com.lhfeiyu.dao.UserMapper;
import com.lhfeiyu.po.Diagnose;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.DoctorPatient;
import com.lhfeiyu.po.MedicationLog;
import com.lhfeiyu.po.User;
import com.lhfeiyu.tools.Check;
import com.lhfeiyu.tools.CommonGenerator;
import com.lhfeiyu.tools.DateFormat;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.Md5Util;
import com.lhfeiyu.vo.Prescription;

/**
* <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 业务层：通用-Diagnose <p>
* <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华 <p>
* <strong> 编写时间：</strong>2016年3月20日22:22:22<p>
* <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司 <p>
* <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 2.0 <p>
 */
@Service
public class DiagnoseService extends CommonService<Diagnose> {

	@Autowired
	DiagnoseMapper diagnoseMapper;
	@Autowired
	MedicationMapper medicationMapper;
	@Autowired
	MedicationRepertoryMapper medicationRepertoryMapper;
	@Autowired
	MedicationLogMapper medicationLogMapper;
	@Autowired
	DoctorMapper doctorMapper;
	@Autowired
	DoctorPatientMapper dpMapper;
	@Autowired
	UserMapper userMapper;
	@Autowired
	private DictService  dictService;
	
	public Diagnose selectService(Map<String, Object> map) {
		return super.selectByCondition(map);
	}
	
	public List<Diagnose> selectListService(Map<String, Object> map) {
		return super.selectListByCondition(map);
	}
	
	public int updateService(Diagnose diagnose) {
		return super.updateByPrimaryKeySelective(diagnose);
	}
	
	public int insertService(Diagnose diagnose) {
		return super.insertSelective(diagnose);
	}
	
	public int deleteService(Integer id) {
		return super.deleteByPrimaryKey(id);
	}

	public int updateService(JSONObject json, Diagnose diagnose, User session_user) {
		diagnose.setUpdatedBy(session_user.getUsername());
		return super.updateByPrimaryKeySelective(diagnose);
	}
	
	public JSONObject addDiagnose(JSONObject json, Doctor sessionDoctor, Diagnose diagnose) throws ParseException{
		//更新药品库存
		Date date = new Date();
		//String name = sessionDoctor.getRealname();
		String pres = diagnose.getPrescription();
		Map<String, Object> mapu = new HashMap<String, Object>();
		Integer userId = diagnose.getUserId();//判断用户ID是否存在，如果不存在就新增一个用户
		
		if(Check.isNull(userId)){
			String idCard = diagnose.getPatientIdcardNum();
			Map<String,Object> map = CommonGenerator.getHashMap();
			map.put("idcardNum", idCard);
			int count = userMapper.selectCountByCondition(map);
			if(count > 0)return Result.failure(json, "该身份证号码已经存在，请重新输入", "idNum_repeat");
			if(Check.isNull(idCard))return Result.failure(json, "请填写身份证号码", "idNum_null");
			
			//DoctorPatientAction addOrUpdatePatient 有重复代码
			User user = new User();
			user.setSex(diagnose.getPatientSex());
			user.setPhone(diagnose.getPatientPhone());
			if(Check.isNotNull(diagnose.getPatientBirthday())){
				user.setBirthday( DateFormat.getStringToFormatDate(diagnose.getPatientBirthday(), "yyyy-MM-dd") );
			}
			if(Check.isNotNull(diagnose.getJobId())){
				user.setJobId(diagnose.getJobId());
			}
			user.setIdcardNum(diagnose.getPatientIdcardNum());
			user.setUsername(diagnose.getPatientName());
			user.setRealName(diagnose.getPatientName());
			if(Check.isNull(user.getRealName())){//页面上医生只会输入一个名字，这里要同步到用户名和真实名
				user.setRealName(user.getUsername());
			}else{
				user.setUsername(user.getRealName());
			}
			user.setCreateDoctorId(sessionDoctor.getId());
			user.setMainStatus(1);//医生添加的患者默认停用状态:改为默认广收启用
			user.setCreatedAt(date);
			user.setCreatedBy(sessionDoctor.getRealname());
			if(Check.isNull(user.getPassword())){
				String dictValue = dictService.getDictValueByCode(AssetsPath.code_defaultUserPassword);
				user.setPassword(Md5Util.encrypt(dictValue));
			}
			String dictValue = dictService.getDictValueByCode(AssetsPath.code_defaultUserAvatar);
			user.setAvatar(dictValue);
			/*user.setProvince(sessionDoctor.getProvince());
			user.setCity(sessionDoctor.getCity());不默认使用医生的省市地址*/
			userMapper.insert(user);
			userId = user.getId();
		}
		mapu.put("userId", userId);
		mapu.put("doctorId", sessionDoctor.getId());
		DoctorPatient doctorPatient = dpMapper.selectByCondition(mapu);
		if(null == doctorPatient){
			DoctorPatient dp = new DoctorPatient();
			dp.setDoctorId(sessionDoctor.getId());
			dp.setUserId(userId);
			dp.setCreatedAt(date);
			dp.setCreatedBy(sessionDoctor.getRealname());
			dpMapper.insert(dp);
		}
		Integer hospitalId = sessionDoctor.getHospitalId();
		Integer doctorId = sessionDoctor.getId();
		String doctorName = sessionDoctor.getRealname();
		if(Check.isNotNull(pres)){
			List<Prescription> presList = JSONObject.parseArray(pres, Prescription.class);
			Map<String,Object> map = CommonGenerator.getHashMap();
			for(Prescription p : presList){
				Integer num = p.getMedicalNum();
				if(null == num || num <= 0)continue;
				Integer medicationId = p.getMedicationId();
				if(null == medicationId || medicationId <= 0)continue;
				//map.put("id", p.getId());
				map.put("medicationId", medicationId);
				map.put("hospitalId", hospitalId);
				map.put("consumeNum", num);
				map.put("updatedBy", doctorName);
				//DOTO FIXME 这里是修改库存
				medicationRepertoryMapper.updateReduceNumById(map);
				//同时要新增medication_log:药品进出库记录表
				MedicationLog mLog = new MedicationLog();
				mLog.setMedicationId(medicationId);
				mLog.setHospitalId(hospitalId);
				mLog.setOptUserId(doctorId);
				mLog.setOptUsername(doctorName);
				mLog.setNum(num);
				mLog.setInOrOut(2);
				mLog.setInOrOutTime(date);
				mLog.setCreatedAt(date);
				mLog.setCreatedBy(doctorName);
				medicationLogMapper.insert(mLog);
			}
		}
		diagnose.setHospitalId(hospitalId);
		diagnose.setHospitalName(sessionDoctor.getHospitalName());
		diagnose.setDepartmentId(sessionDoctor.getDepartmentId());
		diagnose.setDepartmentName(sessionDoctor.getDepartmentName());
		diagnose.setDoctorId(doctorId);
		diagnose.setDoctorName(doctorName);
		diagnose.setMainStatus(1);
		diagnose.setCreatedAt(date);
		diagnose.setCreatedBy(doctorName);
		diagnoseMapper.insert(diagnose);
		return Result.success(json);
	}

	/** 该方法弃用  */
	public JSONObject getDoctorData(JSONObject json, User db_user,Map<String,Object> map) {
		String idcardNum = db_user.getIdcardNum();
		map.put("patientIdcardNum", idcardNum);
		List<Diagnose> diagnoseList = diagnoseMapper.selectListByCondition(map);
		if(diagnoseList.size() > 0){
			List<Doctor> doctorList = new ArrayList<>(diagnoseList.size());
			Integer total = 0;
			for(Diagnose d:diagnoseList){
				Integer doctorId = d.getDoctorId();
				if(null != doctorId){
					map.clear();
					map.put("id", doctorId);
					Doctor doctor = doctorMapper.selectByCondition(map);
					total = doctorMapper.selectCountByCondition(map);
					doctorList.add(doctor);
				}
			}
			if(doctorList.size() > 0){
				Result.gridData(doctorList, total, json);
			}else{
				Result.failure(json, "暂无我的医生", null);
			}
		}else{
			Result.failure(json, "病历不存在", null);
		}
		return json;
	}

}