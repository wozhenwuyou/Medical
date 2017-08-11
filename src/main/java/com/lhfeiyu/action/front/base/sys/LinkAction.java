package com.lhfeiyu.action.front.base.sys;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.po.Link;
import com.lhfeiyu.service.DictService;
import com.lhfeiyu.service.LinkService;
import com.lhfeiyu.tools.CommonGenerator;
import com.lhfeiyu.tools.Result;

@Controller
public class LinkAction {
	
	@Autowired
	private LinkService  linkService;
	@Autowired
	private DictService  dictService;
	
	private static Logger logger = Logger.getLogger("R");
	
	@ResponseBody
	@RequestMapping(value = "/getLinkList", method=RequestMethod.POST)
	public JSONObject getLinkList(HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {//自动获取所有参数（查询条件）
			/*HashMap<String, Object> map = Pagination.getOrderByAndPage(RequestUtil.getRequestParam(request), request);
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
			map.put("parentCodeNotNull", 1);//不查跟节点
*/			
	
			Map<String, Object> map = CommonGenerator.getHashMap();
			map.put("orderBy", "id");
			map.put("ascOrdesc", "ASC");
			map.put("code", "link");
			List<Link> baseLinkList = linkService.selectListByCondition(map);
			json.put("baseLinkList", baseLinkList);
			
			map.clear();
			map.put("orderBy", "id");
			map.put("ascOrdesc", "ASC");
			map.put("dictParentCode", "link_famous_type");
			List<Link> linkFamousList = linkService.selectListByCondition(map);
			json.put("linkFamousList", linkFamousList);
			
			map.clear();
			map.put("orderBy", "id");
			map.put("ascOrdesc", "ASC");
			map.put("parentCode", "link_famous_type");
			JSONArray array = new JSONArray();
			array = dictService.getDictArray(map);
			json.put("linkTypeAry", array);
			
			
			Result.success(json, "数据加载成功", null);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Link-AJAX-/back/getLinkList-加载友情链接列表出现异常", json);
		}
		return json;
	}
	
}
