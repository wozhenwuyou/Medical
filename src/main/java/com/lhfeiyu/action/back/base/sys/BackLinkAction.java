package com.lhfeiyu.action.back.base.sys;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.config.Table;
import com.lhfeiyu.po.Admin;
import com.lhfeiyu.po.Link;
import com.lhfeiyu.service.AA_UtilService;
import com.lhfeiyu.service.LinkService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Pagination;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.RequestUtil;

@Controller
@RequestMapping(value="/back")
public class BackLinkAction {
	
	@Autowired
	private LinkService  linkService;
	@Autowired
	private AA_UtilService  utilService;
	
	private static Logger logger = Logger.getLogger("R");
	
	@RequestMapping(value="/link")
	public ModelAndView  link(ModelMap modelMap,HttpSession session,
			@RequestParam(value="typeId",required=false) Integer typeId){
		String path = PagePath.backLink;
		try{
			modelMap.put("typeId", typeId);
			Result.success(modelMap, "友情链接页面加载成功", null);
		}catch(Exception e){
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-Link-PAGE-/back/link-加载友情链接出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getLinkList", method=RequestMethod.POST)
	public JSONObject getLinkList(HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {//自动获取所有参数（查询条件）
			HashMap<String, Object> map = Pagination.getOrderByAndPage(RequestUtil.getRequestParam(request), request);
			String ascOrdesc = request.getParameter("ascOrdesc");
			if(null != ascOrdesc){
				if(ascOrdesc.equals("1")){
					map.put("orderBy", "created_at");
					map.put("ascOrdesc", "ASC");
				}else if(ascOrdesc.equals("2")){
					map.put("orderBy", "created_at");
					map.put("ascOrdesc", "DESC");
				}
			}
		//	map.put("parentCodeIsNotNull", 1);
			//map.put("parentCodeNotNull", 1);//不查跟节点
			List<Link> linkList = linkService.selectListByCondition(map);
			Integer total = linkService.selectCountByCondition(map);
			Result.gridData(linkList, total, json);
			Result.success(json, "数据加载成功", null);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Link-AJAX-/back/getLinkList-加载友情链接列表出现异常", json);
		}
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value = "/addOrUpdateLink", method = RequestMethod.POST)
	public JSONObject addOrUpdateLink(@ModelAttribute Link link,HttpServletRequest request){
		JSONObject json = new JSONObject();
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());//验证session中的user，存在即返回
			if(null == admin)return Result.adminSessionInvalid(json);
			Date date = new Date();
			String username = admin.getUsername();
			if(null == link.getId()){//添加
				link.setCreatedAt(date);
				link.setCreatedBy(username);
				linkService.insert(link);
			}else{//修改
				link.setUpdatedAt(date);
				link.setUpdatedBy(username);
				linkService.updateByPrimaryKeySelective(link);
			}
			json.put("id", link.getId());
			Result.success(json, "添加或修改友情链接成功", null);
		}catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Link-AJAX-/back/addOrUpdateLink-新增或修改友情链接出现异常", json);
		}
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value = "/updateLinkDelete",method=RequestMethod.POST)
	public JSONObject updateLinkDelete(HttpServletRequest request, @RequestParam(value="ids") String ids) {
		JSONObject json = new JSONObject();
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());//验证session中的user，存在即返回
			if(null == admin)return Result.adminSessionInvalid(json);
			String username = admin.getUsername();
			/*Map<String,Object> map = new HashMap<String,Object>();
			map.put("linkIds", ids);
			map.put("authority", 3);//只读
			int count = linkService.selectCountByCondition(map);
			if(count > 0){
				return Result.failure(json, "不能删除权限为只读的数据", "authority_readonly");
			}*/
			linkService.updateDeletedNowByIds(ids, username);
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Link-AJAX-/back/updateLinkDelete-删除友情链接出现异常", json);
		}
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value = "/updateLinkRecover",method=RequestMethod.POST)
	public JSONObject updateLinkRecover(HttpServletRequest request, @RequestParam(value="ids") String ids) {
		JSONObject json = new JSONObject();
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());//验证session中的user，存在即返回
			if(null == admin)return Result.adminSessionInvalid(json);
			String username = admin.getUsername();
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("ids", ids);
			map.put("table", Table.link);
			map.put("username", username);
			utilService.updateDeletedNullByIds(map);
			Result.success(json, "数据恢复成功", null);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Link-AJAX-/back/updateLinkRecover-恢复友情链接出现异常", json);
		}
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value = "/deleteLinkThorough",method=RequestMethod.POST)
	public JSONObject deleteLinkThorough(HttpServletRequest request, @RequestParam(value="ids") String ids) {
		JSONObject json = new JSONObject();
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());//验证session中的user，存在即返回
			if(null == admin)return Result.adminSessionInvalid(json);
			/*Map<String,Object> map = new HashMap<String,Object>();
			map.put("linkIds", ids);
			map.put("authority", 3);//只读
			int count = linkService.selectCountByCondition(map);
			if(count > 0){
				return Result.failure(json, "不能删除权限为只读的数据", "authority_readonly");
			}*/
			linkService.deleteByIds(ids);
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Link-AJAX-/back/deleteLinkThorough-彻底删除友情链接出现异常", json);
		}
		return json;
	}
	
}
