package com.lhfeiyu.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.dao.HospitalMapper;
import com.lhfeiyu.dao.PatientReportDetailMapper;
import com.lhfeiyu.dao.PatientReportMapper;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.po.PatientReport;
import com.lhfeiyu.po.PatientReportDetail;
import com.lhfeiyu.tools.Check;
import com.lhfeiyu.tools.CommonGenerator;
import com.lhfeiyu.tools.Result;

/**
* <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 业务层：通用-PatientReport <p>
* <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华 <p>
* <strong> 编写时间：</strong>2016年3月20日22:22:22<p>
* <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司 <p>
* <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 2.0 <p>
 */
@Service
public class PatientReportService extends CommonService<PatientReport> {

	@Autowired
	PatientReportMapper patientReportMapper;
	@Autowired
	PatientReportDetailMapper prdMapper;
	@Autowired
	HospitalMapper hospitalMapper;
	
	public PatientReport selectService(Map<String, Object> paramMap) {
		return super.selectByCondition(paramMap);
	}
	
	public List<PatientReport> selectListService(Map<String, Object> paramMap) {
		return super.selectListByCondition(paramMap);
	}
	
	public int updateService(PatientReport patientReport) {
		return super.updateByPrimaryKeySelective(patientReport);
	}
	
	public int insertService(PatientReport patientReport) {
		return super.insertSelective(patientReport);
	}
	
	public int updateDeleteService(Integer id, String updatedBy) {
		return super.updateDeletedNowById(id, updatedBy);
	}
	
	public int deleteService(Integer id) {
		return super.deleteByPrimaryKey(id);
	}
	
	public List<PatientReport> selectListWitdhDetailListStr(Map<String, Object> paramMap) {
		List<PatientReport> prList = super.selectListByCondition(paramMap);
		Map<String, Object> map = CommonGenerator.getHashMap();
		for(PatientReport pr : prList){
			String adiconBarcode = pr.getAdiconBarcode();
			if(Check.isNotNull(adiconBarcode)){
				String detailListStr = "";
				map.put("adiconBarcode", adiconBarcode);
				List<PatientReportDetail> prdList = prdMapper.selectListByCondition(map);
				for(PatientReportDetail prd : prdList){
					String itemName_EN = prd.getItemName_EN();
					String itemName_CN = prd.getItemName_CN();
					String result = prd.getResult();
					String resultReference = prd.getResultReference();
					String resultUnit = prd.getResultUnit();
					String resultHint = prd.getResultHint();
					if("z".equals(resultHint)){
						prd.setResultTip("正常");
					}else if("z".equals(resultHint)){
						prd.setResultTip("低↓");
					}else if("z".equals(resultHint)){
						prd.setResultTip("高↑");
					}
					String resultTip = prd.getResultTip();
					detailListStr += "简称："+itemName_EN+" 项目："+itemName_CN+" 结果："+result+" 提示："+resultTip+" 参考值："+resultReference+" 单位："+resultUnit+"；\r\n";
				}
				pr.setDetailListStr(detailListStr);
			}
		}
		return prList;
	}
	
	
	public JSONObject insertBatchByItemCodes(JSONObject json, PatientReport patientReport, Doctor session_doctor){
		//如果有多个检测项目，就为每个检测项目建立个report
		if(Check.isNull(patientReport.getAdiconBarcode())){
			return Result.failure(json, "请输入条形码", "adiconBarcode_null");
		}
		if(Check.isNull(patientReport.getPatientName())){
			return Result.failure(json, "请输入患者姓名", "username_null");
		}
		
		Map<String, Object> map = CommonGenerator.getHashMap();
		map.put("adiconBarcode", patientReport.getAdiconBarcode());
		int count = patientReportMapper.selectCountByCondition(map);
		if(count > 0){
			return Result.failure(json, "该条形码已经存在，请重新输入", "adiconBarcode_repeat");
		}
		
		if( Check.isNotNull(patientReport.getItemCodes()) ){
			String[] codesAry = patientReport.getItemCodes().split(",");
			for(String code : codesAry){
				if(Check.isNotNull(code)){
					PatientReport pr = new PatientReport();
					pr.setItemCode(code);
					pr.setItemCodes(patientReport.getItemCodes());
					pr.setPatientPhone(patientReport.getPatientPhone());
					pr.setPhone(patientReport.getPatientPhone());
					pr.setSex(patientReport.getSex());
					pr.setAge(patientReport.getAge());
					pr.setIdcardNum(patientReport.getIdcardNum());
					pr.setPatientId(patientReport.getPatientId());
					pr.setPatientName(patientReport.getPatientName());
					pr.setAdiconBarcode(patientReport.getAdiconBarcode());
					pr.setAttrDate(patientReport.getAttrDate());
					pr.setAttrInt(patientReport.getAttrInt());
					insertService(json, pr, session_doctor);
					break;//由于一个检测项目对应一个二维码，暂时只支持一次只输入一个检测项
				}
			}
		}else{
			return Result.failure(json, "请选择血液检测项", "itemCodes_null");
			//insertService(json, patientReport, session_doctor);
		}
		return json;			
	}

	public void insertService(JSONObject json, PatientReport patientReport, Doctor session_doctor) {
		
		Integer hospitalId = session_doctor.getHospitalId();
		Hospital hos = hospitalMapper.selectByPrimaryKey(hospitalId);
		if(null != hospitalId && null != hos){
			patientReport.setHospitalId(hospitalId);
			patientReport.setHospitalName(hos.getWholeName());
		}
		patientReport.setDoctorId(session_doctor.getId());
		Date date = new Date();
		patientReport.setMainStatus(1);//1未出报告2.已出报告
		patientReport.setServiceFlag("1");//1：不是2：是(服务器获取还是创建)
		patientReport.setAgeType("岁");
		patientReport.setCreatedBy(session_doctor.getUsername());
		patientReport.setCreatedAt(date);
		super.insertSelective(patientReport);
		
	}

	public List<PatientReport> getOnlyAdiconBarcode(Map<String, Object> map) {
		return patientReportMapper.selectOnlyAdiconBarcode(map);
	}
	
	public JSONObject updateReportByAdiconBarcode(JSONObject json, String adiconBarcode, 
			String key, Map<String,Object> map, Date date, boolean forceUpdate) {
		if(Check.isNull(adiconBarcode)){
			return Result.failure(json, "艾迪康条形码不能为空", "adiconBarcode_null");
		}
		if(Check.isNull(key))key = resultKey();
		if(null == map)map = new HashMap<String,Object>();
		if(null == date)date = new Date();

		JSONObject json2 = getJSONReportItemListByAdiconBarocde(key, adiconBarcode);
		if(null == json2 || json2.size() <= 0){
			return Result.failure(json, "通过该艾迪康条形码没有查询到对应检测结果数据", "adiconBarcode_data_null");
		}
		if(Result.hasError(json2)){
			json = json2;
			return json;//有错误就直接返回
		}
		String listtableString2 = json2.getString("常规报告");
		if( Check.isNull(listtableString2)){
			return Result.failure(json, "该艾迪康条形码还没有生成检测结果", "adiconBarcode_result_null");
		}
		JSONObject jso2 = JSONObject.parseObject(listtableString2);
		JSONArray ja2 = jso2.getJSONArray("item");
		List<PatientReportDetail> patientReportDetailList = JSONObject.parseArray(ja2.toString(), PatientReportDetail.class);
		if( Check.isNull(patientReportDetailList) ){
			return Result.failure(json, "检测结果为空", "adiconBarcode_patientReportDetail_null");
		}
		for(PatientReportDetail prd : patientReportDetailList){
			map.clear();
			String itemCode = prd.getItemCode();
			String adiconBarcode2 = prd.getAdiconBarcode();
			map.put("itemCode", itemCode);
			map.put("serialNumber", prd.getSerialNumber());
			map.put("adiconBarcode", adiconBarcode2);
			PatientReportDetail patientReportDetail = prdMapper.selectByCondition(map);
			if(null == patientReportDetail){
				prd.setServiceFlag("2");// 1手动创建， 2服务器获取
				prd.setLogicStatus(2);//1未出报告 2已出报告
				prd.setMainStatus(1);
				prd.setCreatedAt(date);
				prdMapper.insert(prd);
				updateReportResult(json, prd, forceUpdate);//根据检测结果更新report
			}else{
				updateReportResult(json, patientReportDetail, forceUpdate);
			}
		}
		return Result.success(json);
	}

	
	private static final String loginId = "H14037";
	private static final String password = "2kwtcr";
	private static final String url = "http://59.46.35.154:8088/";
	
	public void insertGetbloadTestResult(){
		Date date = new Date();
		JSONObject paramJson = new JSONObject();
		String key = resultKey();
		Map<String,Object> map = new HashMap<String,Object>();
		JSONObject json = getAllSampleList(key);
		if(null == json || json.size() <= 0)return;
		String listtableString = json.getString("NewDataSet");
		if( Check.isNull(listtableString) )return;
		JSONObject jso = JSONObject.parseObject(listtableString);
		JSONArray ja = jso.getJSONArray("listtable");
		if(null == ja || ja.size() <= 0)return;
		for(int i=0; i<ja.size(); i++){
			JSONObject item = ja.getJSONObject(i);
			String AdiconBarcode = item.getString("AdiconBarcode").replace("[\"", "").replace("\"]", "");
			updateReportByAdiconBarcode(paramJson, AdiconBarcode, key, map, date, false);
		}
	}

	public JSONObject updateReportResult(JSONObject json, PatientReportDetail prd, boolean forceUpdate){
		Map<String,Object> map = new HashMap<String,Object>();
		String adiconBarcode = prd.getAdiconBarcode();
		map.put("adiconBarcode", adiconBarcode);//根据条形码查出对应的report
		PatientReport patientReport = patientReportMapper.selectByCondition(map);
		if(null != patientReport){
			//假如已经有结果了就不再更新（但是要检测检测结果，如果不一致就要更新report的result:只要有一个项是下正常，result就为不正常，否则为正常）
			String resultHint = patientReport.getResultHint();
			if(forceUpdate || Check.isNull(resultHint)){//更新report
				patientReport.setCollectionDate(prd.getCollectionDate());
				patientReport.setReceivedDate(prd.getReceivedDate());
				patientReport.setLisDate(prd.getLisDate());
				patientReport.setReportDate(prd.getReportDate());
				patientReport.setTechnician(prd.getTechnician());
				patientReport.setCheckedBy(prd.getCheckedBy());
				patientReport.setSampleChar(prd.getSampleChar());
				patientReport.setSampleType(prd.getSampleType());
				patientReport.setInstrument(prd.getInstrument());
				patientReport.setSerialNumber(prd.getSerialNumber());
				patientReport.setAttrStr2(prd.getPatientName());//占用：接口数据中的患者名称
				patientReport.setRemark(prd.getRemark());
				patientReport.setLogicStatus(2);//已出报告
			}
			if(Check.isNull(resultHint) || ( "z".equals(resultHint) && !resultHint.equals(prd.getResultHint()) ) ){//只要有不正常的项，report就更新为异常（g或d）
				patientReport.setResultHint(prd.getResultHint());//检测结果，前端根据此字段显示结果，result_hint: 高低标记(g:高,z:正常,d:低)
			}
			patientReportMapper.updateByPrimaryKeySelective(patientReport);
		}
		return json;
	}
	
	private JSONObject getAllSampleList(String key){
		//Key＝有效授权码，BeginDateTime＝起始时间， EndDateTime＝结束时间，TypeDateTime＝1=按采集时间统计，2＝按报告时间统计；AgainFlag:1=重新下载已下载过的标本，0＝只下载未下载的标本
		JSONObject json = new JSONObject();
		int TypeDateTime = 1;
		int AgainFlag = 0;
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		String beginTime;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		int total = prdMapper.selectCountByCondition(null);
		if(total < 10000){
			int year = c.get(Calendar.YEAR);
			beginTime = year + "-01-01";
		}else{
			c.add(Calendar.DATE, -7);//如果数据超过一万条了，就只加载7天之内的数据
			beginTime = format.format(c.getTime());
		}
		String endTime = format.format(date);
		System.out.println("adicon api : beginTime - "+beginTime+" , endTime - "+ endTime);
		String getAllSampleList = HttpService.sendGet(url+"ADReportWebService.asmx/GetAllSampleList", "Key="+key+"&BeginDateTime="+beginTime+"&EndDateTime="+endTime+"&TypeDateTime="+TypeDateTime+"&AgainFlag="+AgainFlag+""); 
		//System.out.println("getAllSampleList:"+getAllSampleList);
		String jsonString = HttpService.xml2JSON(content2lt(contentSubHeadEnd(getAllSampleList)));
		//String jsonString = HttpService.xml2JSON(contentSubHeadEnd(getAllSampleList));
		if(null != jsonString){
			json = JSONObject.parseObject(jsonString);
		}
		System.out.println("adicon api : result_json部分数据substring(0,500): - "+json.toJSONString().substring(0,500));
		return json;
	}
	
	private JSONObject getJSONReportItemListByAdiconBarocde(String key,String AdiconBarcode){
		JSONObject json = new JSONObject();
		String  getJSONReportItemListByAdiconBarocdeString = HttpService.sendGet(url+"ADReportWebService.asmx/GetJSONReportItemListByAdiconBarocde", "AdiconBarcode="+AdiconBarcode+"&Key="+key+"");
		if(null != getJSONReportItemListByAdiconBarocdeString){//<?xml version="1.0" encoding="utf-8"?><string xmlns="http://www.adicon.com.cn/">03：错误的输入参数，请重新输入！</string>
			if(getJSONReportItemListByAdiconBarocdeString.contains("错误的输入参数")){
				return Result.failure(json, "艾迪康条形码错误，请重新输入正确的条形码。 （03：错误的输入参数，请重新输入！）", "adiconBarcode_invalid");
			}
			json = JSONObject.parseObject(contentSubHeadEnd(getJSONReportItemListByAdiconBarocdeString));
		}
		return json;
	}
	
	private  String resultKey(){
		String result = HttpService.sendGet(url+"ADReportWebService.asmx/Login", "logid="+loginId+"&password="+password+"");
		return contentSubHeadEnd(result);
	}
	
	private static String contentSubHeadEnd(String content){
		String subContent = content.replace("<?xml version=\"1.0\" encoding=\"utf-8\"?><string xmlns=\"http://www.adicon.com.cn/\">","");
		return subContent.replace("</string>", "");
	}
	
	private static String content2lt(String content){
		String subContent = content.replaceAll("&lt;", "<");
		return subContent.replaceAll("&gt;", ">");
	}

}