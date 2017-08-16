package com.lhfeiyu.action.back.base.storager;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.po.Admin;
import com.lhfeiyu.po.Insertstorage;
import com.lhfeiyu.service.InsertstorageService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Result;

/**
 * @version 入库操作不做删除添加错误只能出库备注重入*/
@Controller
public class StorageAction {
	@Autowired
	private InsertstorageService insertstorageService;
	
	private static Logger logger = Logger.getLogger("R");
	
	//入库单操作开始
	@RequestMapping(value="/back/storeroom/ruku")
	public ModelAndView isnertstoragePageData(ModelMap modelMap, HttpServletRequest request){
		String path = PagePath.BACK_DOMAIN_STOREROOM_RUKU;
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());// 验证session中的user，存在即返回
			if (admin.getRoleId() == 3) {
				modelMap.put("notAdmin", 1);
			}
			
			
			Result.success(modelMap, "入库页面加载成功", null);
		} catch (Exception e) {
			path = PagePath.backLogin;
			Result.catchError(e, logger, "LH_ERROR-Hospital-PAGE-/back/storeroom/ruku-入库页面出现异常", modelMap);
		}
		return new ModelAndView(path, modelMap);
	}
	
	@RequestMapping(value="/back/storeroom/findInList")
	public JSONObject getIsnertstorageList(Insertstorage insertstorage,Integer page,Integer rows,HttpServletRequest request){
		JSONObject json = new JSONObject();
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());//验证session中的user，存在即返回
			if(null == admin)return Result.adminSessionInvalid(json);
			Map map = insertstorageService.insertstorage2Map(insertstorage);
			if(rows>0 && rows!=null && page>0 && page!=null){
				map.put("start", (page-1)*rows);
				map.put("count", rows);
			}
			
			List list = insertstorageService.findInsertstorage(map);
			Integer total = insertstorageService.count();
			
			Result.gridData(list, total, json);
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-OrdersDetails-AJAX-/back/storeroom/findInList-获取入库集合出现问题", json);
		}
		return json;
	}

	@RequestMapping(value="/back/storeroom/addIsnertstorage")
	public JSONObject addIsnertstorage(Insertstorage insertstorage,HttpServletRequest request){
		JSONObject json = new JSONObject();
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());//验证session中的user，存在即返回
			if(null == admin)return Result.adminSessionInvalid(json);
			
			insertstorage.setUserid(admin.getId());
			//时间是否为空
			if(insertstorage.getInserttime()==null|insertstorage.getInserttime().equals("")){
				insertstorage.setInserttime(Calendar.getInstance().getTime());
			}
			Map map = insertstorageService.insertstorage2Map(insertstorage);
			insertstorageService.addInsertstorage(map);
			
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-OrdersDetails-AJAX-/back/orderDetailsAdd-添加订单详细出现问题", json);
		}
		return json;
	}
	//入库单操作结束
	//入库明细开始
	
	
}
