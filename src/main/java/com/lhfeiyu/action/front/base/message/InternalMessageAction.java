package com.lhfeiyu.action.front.base.message;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.po.InternalMessage;
import com.lhfeiyu.po.User;
import com.lhfeiyu.service.InternalMessageService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Pagination;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.RequestUtil;

@Controller
public class InternalMessageAction {
	
	@Autowired
	private InternalMessageService  internalMessageService;
	
	private static Logger logger = Logger.getLogger("R");
	
	
	@ResponseBody
	@RequestMapping(value = "/getInternalMessageList", method=RequestMethod.POST)
	public JSONObject getInternalMessageList(HttpServletRequest request, 
			@RequestParam Integer groupId) {
		JSONObject json = new JSONObject();
		try {//自动获取所有参数（查询条件）
			if(null != groupId){
				Result.gridData(null, 0, json);
			}
			Integer receiverId = null;
			if(groupId == 1){
				User session_user = ActionUtil.checkSession4User(request.getSession());//验证session中的user，存在即返回
				if(null == session_user)return Result.userSessionInvalid(json,"user");
				receiverId= session_user.getId();
				
			}else if(groupId == 2){
				Doctor session_doctor = ActionUtil.checkSession4Doctor(request.getSession());//验证session中的user，存在即返回
				if(null == session_doctor)return Result.userSessionInvalid(json, "doctor");
				receiverId= session_doctor.getId();
			}else if(groupId == 3){
				Hospital hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的user，存在即返回
				if(null == hospital)return Result.userSessionInvalid(json,"hospital");
				receiverId= hospital.getId();
			}
			
			if(null == receiverId){
				Result.gridData(null, 0, json);
			}
			
			HashMap<String, Object> map = Pagination.getOrderByAndPage(RequestUtil.getRequestParam(request), request);
			map.put("receiverIdAndToAll", receiverId);
			List<InternalMessage> internalMessageList = internalMessageService.selectListByCondition(map);
			Integer total = internalMessageService.selectCountByCondition(map);
			Result.gridData(internalMessageList, total, json);
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-InternalMessage-AJAX-/getInternalMessageList-加载站内信列表出现异常", json);
		}
		return json;
	}
	
	
	
	
}
