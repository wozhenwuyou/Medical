package com.lhfeiyu.action.front.base.article;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.po.Article;
import com.lhfeiyu.po.Dict;
import com.lhfeiyu.po.SysArticle;
import com.lhfeiyu.po.User;
import com.lhfeiyu.service.ArticleService;
import com.lhfeiyu.service.DictService;
import com.lhfeiyu.service.SysArticleService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.CommonGenerator;
import com.lhfeiyu.tools.Result;

@Controller
public class SysArticleAction {
	
	@Autowired
	private SysArticleService sysArticleService;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private DictService dictService;
	
	private static Logger logger = Logger.getLogger("R");
	
	@RequestMapping(value = "/sysArticle/{roleCode}")
	public ModelAndView sysArticle(ModelMap modelMap, HttpServletRequest request ,
			@PathVariable String roleCode) {
		String path = PagePath.sysArticle;
		try {
			User user = ActionUtil.checkSession4User(request.getSession());//验证session中的user，存在即返回
			if(null != user){modelMap.put("user", user);}
			
			Map<String, Object> map = CommonGenerator.getHashMap();
			map.put("roleCode", roleCode);
			map.put("mainStatus", 1);//查看启用的文章
			SysArticle article = sysArticleService.selectByCondition(map);
			modelMap.put("article", article);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-SysArticle-PAGE-/sysArticle-加载文章详情页出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@RequestMapping(value = "/baseArticleList/{typeId}")
	public ModelAndView baseArticleList(ModelMap modelMap, HttpServletRequest request ,
			@PathVariable Integer typeId) {
		String path = PagePath.sysArticleList;
		try {
			User user = ActionUtil.checkSession4User(request.getSession());//验证session中的user，存在即返回
			if(null != user){modelMap.put("user", user);}
			
			Map<String, Object> map = CommonGenerator.getHashMap();
			map.put("typeId", typeId);
			List<Article> articleList = articleService.selectListByCondition(map);
			modelMap.put("articleList", articleList);
			modelMap.put("typeId", typeId);
			Dict dict = dictService.selectByPrimaryKey(typeId);
			if(null != dict){
				modelMap.put("typeName", dict.getCodeName());
			}
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-SysArticle-PAGE-/baseArticleList-加载文章详情页出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@RequestMapping(value = "/baseArticle/{articleId}")
	public ModelAndView baseArticle(ModelMap modelMap, HttpServletRequest request ,
			@PathVariable String articleId) {
		String path = PagePath.sysArticle;
		try {
			User user = ActionUtil.checkSession4User(request.getSession());//验证session中的user，存在即返回
			if(null != user){modelMap.put("user", user);}
			
			Map<String, Object> map = CommonGenerator.getHashMap();
			map.put("id", articleId);
			Article article = articleService.selectByCondition(map);
			modelMap.put("article", article);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-SysArticle-PAGE-/baseArticle-加载文章详情页出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}

	
}
