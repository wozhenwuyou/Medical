package com.lhfeiyu.action.front.base.article;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.po.Announcement;
import com.lhfeiyu.po.SysArticle;
import com.lhfeiyu.po.User;
import com.lhfeiyu.service.AnnouncementService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.CommonGenerator;
import com.lhfeiyu.tools.Pagination;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.RequestUtil;

@Controller
public class AnnouncementAction {
	
	@Autowired
	private AnnouncementService annoService;
	
	private static Logger logger = Logger.getLogger("R");
	
	@RequestMapping(value = "/anno/{annoId}")
	public ModelAndView announcement(ModelMap modelMap, HttpServletRequest request ,
			@PathVariable Integer annoId) {
		String path = PagePath.sysArticle;
		try {
			/*User user = ActionUtil.checkSession4User(request.getSession());//验证session中的user，存在即返回
			if(null != user){modelMap.put("user", user);}*/
			
			Announcement anno = annoService.selectByPrimaryKey(annoId);
			SysArticle article = new SysArticle();
			if(null != anno){
				article.setTitle(anno.getTitle());
				article.setContent(anno.getContent());
				article.setTypeName("公告");
			}
			modelMap.put("typeName", "公告");
			modelMap.put("article", article);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-announcement-PAGE-/sysArticle-加载公告详情页出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@RequestMapping(value = "/annoArticleList")
	public ModelAndView annoArticleList(ModelMap modelMap, HttpServletRequest request) {
		String path = PagePath.sysArticleList;
		try {
			User user = ActionUtil.checkSession4User(request.getSession());//验证session中的user，存在即返回
			if(null != user){modelMap.put("user", user);}
			
			Map<String, Object> map = CommonGenerator.getHashMap();
			List<Announcement> articleList = annoService.selectListByCondition(map);
			modelMap.put("articleList", articleList);
			modelMap.put("from", "annocement");
			modelMap.put("typeName", "公告列表");
			modelMap.put("postUrl", "getAnnouncementList");
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-SysArticle-PAGE-/baseArticleList-加载文章详情页出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getAnnouncementList")
	public JSONObject getAnnouncementList(HttpServletRequest request) {
		List<Announcement> articleList = null;
		JSONObject json = new JSONObject();
		try {
			HashMap<String, Object> map = RequestUtil.getRequestParam(request);//自动获取所有参数（查询条件）
			map = Pagination.getOrderByAndPage(map,request);
			articleList = annoService.selectListByCondition(map);
			Integer total = annoService.selectCountByCondition(map);
			Result.gridData(articleList, total, json);
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Announcement-AJAX-/getAnnouncementList-加载新闻文章列表出现异常", json);
		}
		return json;
	}

	
}
