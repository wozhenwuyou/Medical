package com.lhfeiyu.action.back.base.storager;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.dao.OrdersMapper;
import com.lhfeiyu.po.Orders;
import com.lhfeiyu.po.User;
import com.lhfeiyu.service.OrdersService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Result;

public class OrdersAction {
	@Autowired
	private OrdersService ordersService;
	
	private static Logger logger = Logger.getLogger("R");
	
	@RequestMapping(value = "")
	public JSONObject findOdersList(Map<String, Object> map,HttpServletRequest request){
		JSONObject json = new JSONObject();
		try {
			User user = ActionUtil.checkSession4User(request.getSession());//验证session中的user，存在即返回
			if(null == user)return Result.userSessionInvalid(json, "doctor");
			
			List<Orders> list = ordersService.findOrders(map);
			Integer total = list.size();
			Result.gridData(list, total, json);
			
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Orders-AJAX-/????-加载仓库模块订单页面出现问题", json);
		}
		return json;
		
	} 
}
