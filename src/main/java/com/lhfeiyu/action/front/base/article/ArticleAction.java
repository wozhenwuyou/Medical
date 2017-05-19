package com.lhfeiyu.action.front.base.article;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.AssetsPath;
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.po.Article;
import com.lhfeiyu.po.Dict;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.User;
import com.lhfeiyu.service.ArticleService;
import com.lhfeiyu.service.DictService;
import com.lhfeiyu.service.DoctorService;
import com.lhfeiyu.service.IndexService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Check;
import com.lhfeiyu.tools.Pagination;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.RequestUtil;

@Controller
public class ArticleAction {
	
	@Autowired
	private ArticleService  articleService;
	@Autowired
	private DictService  dictService;
	@Autowired
	private DoctorService  doctorService;
	@Autowired
	private IndexService  indexService;
	
	private static Logger logger = Logger.getLogger("R");
	
	@RequestMapping(value="/articleList/{typeId}")
	public ModelAndView  articleList(ModelMap modelMap,@PathVariable Integer typeId){
		String path = PagePath.articleList;
		try{
			modelMap.put("typeId", typeId);
			modelMap = articleService.hotDiscussionAndArticle(modelMap,typeId);
			modelMap = indexService.getIntroductionAndvision(modelMap);
			modelMap = articleService.latestArticle(modelMap, typeId,1);//查询最新文章
			modelMap = articleService.latestArticle(modelMap, typeId,2);//根据访问量倒序查询文章
			modelMap.put("typeId", typeId);
		}catch(Exception e){
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-Article-PAGE-/articleList-加载文章列表出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@RequestMapping(value = "/article/{typeId}/{id}")
	public ModelAndView article(ModelMap modelMap, @PathVariable Integer id, @PathVariable Integer typeId,
			HttpServletRequest request) {
		String path = PagePath.article;
		try {
			User user = ActionUtil.checkSession4User(request.getSession());//验证session中的user，存在即返回
			if(null != user){modelMap.put("user", user);}
			modelMap = articleService.getArticleData(modelMap,id,typeId);
			modelMap.put("typeId", typeId);
			modelMap = indexService.getIntroductionAndvision(modelMap);
			modelMap = articleService.latestArticle(modelMap, typeId,1);//查询最新文章
			modelMap = articleService.latestArticle(modelMap, typeId,2);//根据访问量倒序查询文章
			articleService.updateArticleScans(id);//记录访问文章次数
			modelMap.put("typeId", typeId);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-Article-PAGE-/article-加载文章详情页出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@RequestMapping(value = "/addOrUpdateArticlePage")
	public ModelAndView addOrUpdateArticlePage(ModelMap modelMap,HttpServletRequest request, @RequestParam(required=false) Integer articleId) {
		String path = PagePath.addOrUpdateArticle;
		try {
			JSONObject json = new JSONObject();
			Doctor db_doctor = ActionUtil.checkSession4Doctor(request.getSession());//验证session中的user，存在即返回
			if(null == db_doctor)return Result.userSessionInvalid(modelMap,PagePath.doDctorLogin);
			modelMap = doctorService.getDoctorData(modelMap,db_doctor,null,true);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("parentCode", "article_type");
			List<Dict> dictList = dictService.selectListByCondition(map);
			List<Dict> newDictList = new ArrayList<Dict>(10);
			for(int i=0;i<dictList.size();i++){
				Dict dict = dictList.get(i);
				String code = dict.getCode();
				if("article_type_private".equals(code)){
					continue;
				}else if("article_type_activity".equals(code)){//活动
					continue;
				}else if("article_type_survey".equals(code)){//调查
					continue;
				}else if("article_type_news".equals(code)){//新闻
					continue;
				}else if("article_type_10".equals(code)){//问答
					continue;
				}
				newDictList.add(dict);
			}
			if(null != articleId){//修改文章
				Article article = articleService.selectByPrimaryKey(articleId);
				modelMap.put("article", article);
				json.put("article", article);
			}
			modelMap.put("dictList", newDictList);
			modelMap.put("paramJson", json);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-Article-PAGE-/addOrUpdateArticle-加载文章添加或修改出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@RequestMapping(value = "/addOrUpdateArticlePrivatePage")
	public ModelAndView addOrUpdateArticlePrivatePage(ModelMap modelMap,HttpServletRequest request, @RequestParam(required=false) Integer articleId) {
		String path = PagePath.addOrUpdateArticlePrivate;
		try {
			JSONObject json = new JSONObject();
			Doctor db_doctor = ActionUtil.checkSession4Doctor(request.getSession());//验证session中的user，存在即返回
			if(null == db_doctor)return Result.userSessionInvalid(modelMap,PagePath.doDctorLogin);
			modelMap = doctorService.getDoctorData(modelMap,db_doctor,null,true);
			
			if(null != articleId){//修改文章
				Article article = articleService.selectByPrimaryKey(articleId);
				modelMap.put("article", article);
				json.put("article", article);
			}
			modelMap.put("paramJson", json);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-Article-PAGE-/addOrUpdateArticle-加载文章添加或修改出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getArticleList")
	public JSONObject getArticleList(HttpServletRequest request) {
		List<Article> articleList = null;
		JSONObject json = new JSONObject();
		try {
			HashMap<String, Object> map = RequestUtil.getRequestParam(request);//自动获取所有参数（查询条件）
			map = Pagination.getOrderByAndPage(map,request);
			map.put("orderBy", "is_top DESC,A.id");
			map.put("ascOrdesc", "DESC");
			articleList = articleService.selectListByCondition(map);
			Integer total = articleService.selectCountByCondition(map);
			Result.gridData(articleList, total, json);
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Article-AJAX-/getArticleList-加载新闻文章列表出现异常", json);
		}
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value = "/addOrUpdateArticle", method = RequestMethod.POST)
	public JSONObject addOrUpdateArticle(@ModelAttribute Article article,HttpServletRequest request){
		JSONObject json = new JSONObject();
		try {
			Doctor doctor = ActionUtil.checkSession4Doctor(request.getSession());//验证session中的user，存在即返回
			if(null == doctor)return Result.userSessionInvalid(json);
			
			if(Check.isNull(article.getPicPaths())){
				String dictValue = dictService.getDictValueByCode(AssetsPath.code_defaultArticlePic);
				article.setPicPaths(dictValue);
			}
			if(null == article.getId()){//添加
				articleService.insertService(json,article,doctor);
			}else{//修改
				articleService.updateService(json,article,doctor);
			}
			json.put("id", article.getId());
			Result.success(json);
		}catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Article-AJAX-/addOrUpdateArticle-新增或修改文章出现异常", json);
		}
		return json;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/deleteArticle",method=RequestMethod.POST)
	public JSONObject updateArticleDelete(HttpServletRequest request, @RequestParam Integer articleId) {
		JSONObject json = new JSONObject();
		try {
			Doctor doctor = ActionUtil.checkSession4Doctor(request.getSession());//验证session中的user，存在即返回
			if(null == doctor)return Result.userSessionInvalid(json);
			
			if(null == articleId){
				return Result.failure(json, "请选择需要删除的文章", "articleId_null");
			}
			
			Article article = articleService.selectByPrimaryKey(articleId);
			Integer doctorId = article.getUserId();
			
			if(Check.integerEqual(doctorId, doctor.getId())){
				articleService.updateDeletedNowById(articleId, doctor.getRealname());
			}else{
				return Result.failure(json, "该文章不是由您创建的，您没有权限进行删除", "auth_failure");
			}
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Article-AJAX-/deleteArticle-删除文章出现异常", json);
		}
		return json;
	}
	
	
	
}
