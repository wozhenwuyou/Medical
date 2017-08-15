package com.lhfeiyu.action.back.base.export;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.po.DataHospital;
import com.lhfeiyu.po.Diagnose;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.po.Medication;
import com.lhfeiyu.po.MedicationRepertory;
import com.lhfeiyu.po.Nurse;
import com.lhfeiyu.po.PatientReport;
import com.lhfeiyu.po.User;
import com.lhfeiyu.service.DataHospitalService;
import com.lhfeiyu.service.DiagnoseService;
import com.lhfeiyu.service.DoctorService;
import com.lhfeiyu.service.HospitalService;
import com.lhfeiyu.service.MedicationRepertoryService;
import com.lhfeiyu.service.MedicationService;
import com.lhfeiyu.service.NurseService;
import com.lhfeiyu.service.PatientReportService;
import com.lhfeiyu.service.UserService;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.ExportExcel;
import com.lhfeiyu.util.RequestUtil;

@Controller
@RequestMapping("/back")
public class BackExportExcel {

	@Autowired
	private UserService userService;
	@Autowired
	private NurseService nurseService;
	@Autowired
	private PatientReportService patientReportService;
	@Autowired
	private DiagnoseService diagnoseService;
	@Autowired
	private MedicationService medicationService;
	@Autowired
	private MedicationRepertoryService medicationRepertoryService;
	@Autowired
	private HospitalService hospitalService;
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private DataHospitalService dataHospitalService;

	private static Logger logger = Logger.getLogger("R");

	/** 导出 */
	@ResponseBody
	@RequestMapping(value = "/userExcel")
	public String exportUserExcel(HttpServletRequest request, HttpServletResponse response) {
		JSONObject json = new JSONObject();
		try {
			HashMap<String, Object> paramMap = RequestUtil.getRequestParam(request);// 自动获取所有参数（查询条件）
			List<User> userList = userService.selectListByCondition(paramMap);
			String filename = "用户信息";
			String columnOrder = "username,realName,sexName,phone,provinceName,"
							   + "cityName,idcardNum,birthdayName,jobName,mainStatusName,"
							   + "userRelationName,userRelation,email,address";
			
			String columnOrderType = "String,String,String,String,String,"
								   + "String,String,String,String,String,"
								   + "String,String,String,String";
			
			String templateFileName = "user.xls";
			String labelFileName = "用户信息";
			String path = request.getSession().getServletContext().getRealPath("/file/template/");
			baseExport(response, json, userList, filename, columnOrder, columnOrderType, templateFileName,
					labelFileName, path);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-ExportExcel-PAGE-/back/userExcel-导出用户信息出现异常", json);
		}
		return null;
	}

	@ResponseBody
	@RequestMapping(value = "/medicationRepertoryExcel")
	public String medicationRepertoryExcel(HttpServletRequest request, HttpServletResponse response) {
		JSONObject json = new JSONObject();
		try {
			HashMap<String, Object> paramMap = RequestUtil.getRequestParam(request);// 自动获取所有参数（查询条件）
			List<MedicationRepertory> medicationList = medicationRepertoryService.selectListByCondition(paramMap);
			String filename = "药物库信息";
			response.reset();
			response.setContentType("application/vnd.ms-excel;charset=utf-8");
			response.setHeader("Content-Disposition",
					"attachment;filename=" + new String((filename + ".xls").getBytes(), "iso-8859-1"));
			response.setBufferSize(1024);
			String columnOrder = "hospitalName,medicationTypeName,medicationName,remainNum,warningNum,"
							   + "price,mainStatusName";
			
			String columnOrderType = "String,String,String,String,String,"
								   + "String,String";
			
			String templateFileName = "medicationRepertoryl.xls";
			String labelFileName = "药物库信息";
			String path = request.getSession().getServletContext().getRealPath("/file/template/");
			baseExport(response, json, medicationList, filename, columnOrder, columnOrderType, templateFileName,
					labelFileName, path);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-ExportExcel-PAGE-/back/medicationRepertoryExcel-导出药物信息出现异常", json);
		}
		return null;
	}

	@ResponseBody
	@RequestMapping(value = "/medicationExcel")
	public String medicationExcel(HttpServletRequest request, HttpServletResponse response) {
		JSONObject json = new JSONObject();
		try {
			HashMap<String, Object> paramMap = RequestUtil.getRequestParam(request);// 自动获取所有参数（查询条件）
			List<Medication> medicationList = medicationService.selectListByCondition(paramMap);
			String filename = "药物信息";
			response.reset();
			response.setContentType("application/vnd.ms-excel;charset=utf-8");
			response.setHeader("Content-Disposition",
					"attachment;filename=" + new String((filename + ".xls").getBytes(), "iso-8859-1"));
			response.setBufferSize(1024);
			String columnOrder = "medicationTypeName,name,englishName,price,producer,"
							   + "produceAddress,lotNumber,producedateName,unit,producerTel,"
							   + "usageAndDosage,attention,mainStatusName";
			
			String columnOrderType = "String,String,String,String,String,"
								   + "String,String,String,String,String,"
								   + "String,String,String";
			
			String templateFileName = "medication.xls";
			String labelFileName = "药物信息";
			String path = request.getSession().getServletContext().getRealPath("/file/template/");
			baseExport(response, json, medicationList, filename, columnOrder, columnOrderType, templateFileName,
					labelFileName, path);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-ExportExcel-PAGE-/back/medicationExcel-导出药物信息出现异常", json);
		}
		return null;
	}

	@ResponseBody
	@RequestMapping(value = "/hospitalExcel")
	public String hospitalExcel(HttpServletRequest request, HttpServletResponse response) {
		JSONObject json = new JSONObject();
		try {
			HashMap<String, Object> paramMap = RequestUtil.getRequestParam(request);// 自动获取所有参数（查询条件）
			List<Hospital> hospitalList = hospitalService.selectListByCondition(paramMap);
			String filename = "诊所信息";
			String columnOrder = "briefName,wholeName,address,phone,provinceName,"
							   + "cityName,bloodTestName,mainStatusName,tel,website,"
							   + "email,qq,weibo,weixin";
			
			String columnOrderType = "String,String,String,String,String,"
								   + "String,String,String,String,String,"
								   + "String,String,String,String";
			
			String templateFileName = "hospital.xls";
			String labelFileName = "诊所信息";
			String path = request.getSession().getServletContext().getRealPath("/file/template/");
			baseExport(response, json, hospitalList, filename, columnOrder, columnOrderType, templateFileName,
					labelFileName, path);

		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-ExportExcel-PAGE-/back/hospitalExcel-导出诊所信息出现异常", json);
		}
		return null;
	}

	@ResponseBody
	@RequestMapping(value = "/doctorExcel")
	public String doctorExcel(HttpServletRequest request, HttpServletResponse response) {
		JSONObject json = new JSONObject();
		try {
			HashMap<String, Object> paramMap = RequestUtil.getRequestParam(request);// 自动获取所有参数（查询条件）
			List<Doctor> doctorList = doctorService.selectListByCondition(paramMap);
			String filename = "医生信息";
			String columnOrder = "hospitalName,departmentName,username,realname,idCard,"
							   + "sexName,provinceName,cityName,phone,address,"
							   + "titleName,mainStatusName,email,weixin,weibo,"
							   + "qq,goodAt,introduction,consultScope";
			
			String columnOrderType = "String,String,String,String,String,"
								   + "String,String,String,String,String,"
								   + "String,String,String,String,String,"
								   + "String,String,String,String";
			
			String templateFileName = "doctor.xls";
			String labelFileName = "医生信息";
			String path = request.getSession().getServletContext().getRealPath("/file/template/");
			baseExport(response, json, doctorList, filename, columnOrder, columnOrderType, templateFileName,
					labelFileName, path);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-ExportExcel-PAGE-/back/doctorExcel-导出医生信息出现异常", json);
		}
		return null;
	}

	// 护士ecxl导出
	@ResponseBody
	@RequestMapping(value = "/nurseExcel")
	public String nurseExcel(HttpServletRequest request, HttpServletResponse response) {
		JSONObject json = new JSONObject();
		try {
			HashMap<String, Object> paramMap = RequestUtil.getRequestParam(request);// 自动获取所有参数（查询条件）
			List<Nurse> nurseList = nurseService.selectListByCondition(paramMap);
			String filename = "护士信息";
			String columnOrder = "hospitalName,username,realName,provinceName,cityName,"
							   + "mainStatusName,idcardNum,sexName,phone,address,"
							   + "email";
			
			String columnOrderType = "String,String,String,String,String,"
								   + "String,String,String,String,String,"
								   + "String";
			
			String templateFileName = "nurse.xls";
			String labelFileName = "护士信息";
			String path = request.getSession().getServletContext().getRealPath("/file/template/");
			baseExport(response, json, nurseList, filename, columnOrder, columnOrderType, templateFileName,
					labelFileName, path);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-ExportExcel-PAGE-/back/NurseExcel-导出护士信息出现异常", json);
		}
		return null;
	}

	// 血液检测信息导出
	@ResponseBody
	@RequestMapping(value = "/patientReportExcel")
	public String patientReportExcel(HttpServletRequest request, HttpServletResponse response) {
		JSONObject json = new JSONObject();
		try {
			HashMap<String, Object> paramMap = RequestUtil.getRequestParam(request);// 自动获取所有参数（查询条件）
			List<PatientReport> patientReportList = patientReportService.selectListWitdhDetailListStr(paramMap);
			String filename = "血液检测信息";
			/*
			 * 条形码： *用户： *关联医生： *身份证号： *患者姓名： *电话号码： *年龄： *用户性别： *用户职业： *采血日期：
			 * *检测项： *状态 条形码：用户：关联医生：身份证号：患者姓名：电话号码：年龄：用户性别：用户职业：采血日期：检测项：状态
			 */
			String columnOrder = "adiconBarcode,patientUserName,itemName,idcardNum,patientName,"
							   + "phone,age,sexName,jobName,attrDateName,"
							   + "mainStatusName,detailListStr,hospitalName,doctorResult";
			
			String columnOrderType = "String,String,String,String,String,"
								   + "String,String,String,String,String,"
								   + "String,String,String,String";
			
			String templateFileName = "patientReport.xls";
			String labelFileName = "血液检测信息";
			String path = request.getSession().getServletContext().getRealPath("/file/template/");
			baseExport(response, json, patientReportList, filename, columnOrder, columnOrderType, templateFileName,
					labelFileName, path);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-ExportExcel-PAGE-/back/xueyeExcel-导出血液信息出现异常", json);
		}
		return null;
	}

	@ResponseBody
	@RequestMapping(value = "/diagnoseExcel")
	public String diagnoseExcel(HttpServletRequest request, HttpServletResponse response) {
		JSONObject json = new JSONObject();
		try {
			HashMap<String, Object> paramMap = RequestUtil.getRequestParam(request);// 自动获取所有参数（查询条件）
			List<Diagnose> diagnoseList = diagnoseService.selectListByCondition(paramMap);
			List<Diagnose> diagnoseList1 = diagnoseList;
			// 取出getDiagnoseTags（病例结果）json并手动转换为String 代码 265~282Line
			for (Diagnose list : diagnoseList1) {
				if (list.getDiagnoseTags() != null) {
					JSONArray jsonArray = new JSONArray(list.getDiagnoseTags());
					if (list.getDiagnoseTags().length() > 2) {
						String tagName="";
						org.json.JSONObject jsonObj=null;
						for(int i=0;i<(list.getDiagnoseTags().length()/17);i++){
							jsonObj = jsonArray.getJSONObject(i);
							tagName+=jsonObj.get("tagName").toString()+"、";
						}
						list.setDiagnoseTags(tagName);
					}
				}
			}
			String filename = "病历信息";
			// 诊所 科室 医生名称 患者名称 用户性别 用户年龄 用户出生日期 用户身份证号码..
			String columnOrder = "patientName,patientPhone,patientIdcardNum,patientAge,patientSexName,"
							   + "patientBirthday,patientJobName,allergyHistory,baseCondition,diagnoseTags,"
							   + "diagnoseTime,hospitalName,departmentName,doctorName,mainStatusName";
			
			String columnOrderType = "String,String,String,String,String,"
								   + "String,String,String,String,String,"
								   + "String,String,String,String,String";
			String templateFileName = "diagnose.xls";
			String labelFileName = "病历信息";
			String path = request.getSession().getServletContext().getRealPath("/file/template/");
			baseExport(response, json, diagnoseList, filename, columnOrder, columnOrderType, templateFileName,
					labelFileName, path);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-ExportExcel-PAGE-/back/diagnoseExcel-导出病历信息出现异常", json);
		}
		return null;
	}
	
	//导出诊所数据
	@RequestMapping(value = "/dataHospitalExcel")
	public String dataHospitalExcel(HttpServletRequest request, HttpServletResponse response) {
		JSONObject json = new JSONObject();
		try {
			HashMap<String, Object> paramMap = RequestUtil.getRequestParam(request);// 自动获取所有参数（查询条件）
			List<DataHospital> doctorList = dataHospitalService.selectListWitdhSubData(paramMap);
			String filename = "诊所数据";
			//省	市	创建人	诊所名称	诊所类型	地址	联系电话	负责人姓名	GPS大数	GPS小数	诊所面积	医生人数	护士人数	走访日期	走访次数	是否有效走访	是否签意向书	
			//是否签合同	合同编号	合同开始日期	是否有加盟型诊所服务手册	是否有合同	是否有营业执照副本	是否有法人身份证	是否有负责人身份证	是否有授权委托书	
			//是否有医生资格证书	是否有诊所资料表格	是否有补充协议	备注
			String columnOrder = 
					  "provinceName,cityName,adminUserName,wholeName,hospitalTypeName,"
					+ "address,phone,adminName,gps,qrCode2,"
					+ "area,doctorNum,nurseNum,isDoctorStr,isLegalPersonStr,"
					+ "weixin,isAdvertisementStr,bed,haveVisitValidStr,isAssignContractStr,"//haveVisitValid:资料是否完整
					+ "isAssignIntentionStr,hygienismConditionStr,otherFacility,visitListStr,doctorListStr,doctorListStrSUM,"//haveVisitValid:
					+ "nurseListStr,contractSerialStr,contractStartDateStr,contractLimitStr,contractRemarkStr,"
					+ "createdAtStr,updatedAtStr";//,contractListStr
					/*+ "f_nurseNum,f_nurseNum,"//走访日期	走访次数
					+ "f_haveVisitValid,f_isAssignIntention,f_isAssignContract,f_isAssignContract,f_isAssignContract,"//合同编号	合同开始日期
					+ "f_isAssignContract,"*/;
			String columnOrderType = 
					  "String,String,String,String,String,"
					+ "String,String,String,String,String,"
					+ "String,int,int,String,String,"
					+ "String,String,String,String,String,"
					+ "String,String,String,String,String,"
					+ "String,String,String,String,String,Integer,"
					+ "String,String"
					/*+ ",String,String,"
					+ "String,String,String,String"*/;
			String templateFileName = "dataHospital.xls";
			String labelFileName = "诊所数据";
			String path = request.getSession().getServletContext().getRealPath("/file/template/");
			baseExport(response, json, doctorList, filename, columnOrder, columnOrderType, templateFileName,
					labelFileName, path);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-ExportExcel-PAGE-/back/dataHospitalExcel-导出诊所数据表单出现异常", json);
		}
		return null;
	}


	public static <T> void baseExport(HttpServletResponse response, JSONObject json, List<T> dataList, String filename,
			String columnOrder, String columnOrderType, String templateFileName, String labelFileName, String path)
			throws Exception {
		response.reset();
		response.setContentType("application/vnd.ms-excel;charset=utf-8");
		response.setHeader("Content-Disposition",
				"attachment;filename=" + new String((filename + ".xls").getBytes(), "iso-8859-1"));
		response.setBufferSize(1024);
		ExportExcel ee = new ExportExcel();
		InputStream excelStream = ee.exportExcelTest(dataList, columnOrder, columnOrderType, path, templateFileName,
				labelFileName, 0, 0);
		int i = excelStream.available();
		byte data[] = new byte[i];
		excelStream.read(data); // 读数据
		OutputStream ops = response.getOutputStream();
		ops.write(data);
		ops.flush();
		ops.close();
		excelStream.close();
		Result.success(json);
	}

}
