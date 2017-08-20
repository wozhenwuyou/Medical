package com.lhfeiyu.action.back.domain.storager;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.po.Admin;

import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Result;

@Controller
public class OrdersAction {
	
	@RequestMapping(value="/back/storeroom/dinghuo")
	public ModelAndView picture(ModelMap modelMap,HttpServletRequest request ,@RequestParam(required=false,value="typeId") Integer typeId){
		String path = PagePath.BACK_DOMAIN_STOREROOM_DINGHUO;
		try{
			modelMap.put("typeId", typeId);
			Result.success(modelMap, "页面加载成功", null);
		}catch(Exception e){
			path = PagePath.error;
			//Result.catchError(e, logger, "LH_ERROR-Picture-PAGE-/back/picture-加载图片出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@RequestMapping(value="/back/storeroom/ruku")
	public ModelAndView picture1(ModelMap modelMap,HttpServletRequest request ,@RequestParam(required=false,value="typeId") Integer typeId){
		String path = PagePath.BACK_DOMAIN_STOREROOM_RUKU;
		try{
			modelMap.put("typeId", typeId);
			Result.success(modelMap, "页面加载成功", null);
		}catch(Exception e){
			path = PagePath.error;
			//Result.catchError(e, logger, "LH_ERROR-Picture-PAGE-/back/picture-加载图片出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@RequestMapping(value="/back/storeroom/storeroomuku")
	public ModelAndView picture2(ModelMap modelMap,HttpServletRequest request ,@RequestParam(required=false,value="typeId") Integer typeId){
		String path = PagePath.BACK_DOMAIN_STOREROOM_CHUKU;
		try{
			modelMap.put("typeId", typeId);
			Result.success(modelMap, "页面加载成功", null);
		}catch(Exception e){
			path = PagePath.error;
			//Result.catchError(e, logger, "LH_ERROR-Picture-PAGE-/back/picture-加载图片出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@RequestMapping(value="/back/storeroom/kucun")
	public ModelAndView picture3(ModelMap modelMap,HttpServletRequest request ,@RequestParam(required=false,value="typeId") Integer typeId){
		String path = PagePath.BACK_DOMAIN_STOREROOM_KUCUN;
		try{
			modelMap.put("typeId", typeId);
			Result.success(modelMap, "页面加载成功", null);
		}catch(Exception e){
			path = PagePath.error;
			//Result.catchError(e, logger, "LH_ERROR-Picture-PAGE-/back/picture-加载图片出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
}
