package com.lhfeiyu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.lhfeiyu.dao.AdvertisementMapper;
import com.lhfeiyu.dao.AnnouncementMapper;
import com.lhfeiyu.dao.ArticleMapper;
import com.lhfeiyu.dao.DoctorMapper;
import com.lhfeiyu.dao.SysArticleMapper;
import com.lhfeiyu.po.Advertisement;
import com.lhfeiyu.po.Announcement;
import com.lhfeiyu.po.Article;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.tools.Check;

@Service
public class IndexService {
	
	@Autowired
	DoctorMapper  doctorMapper;
	@Autowired
	ArticleMapper  articleMapper;
	@Autowired
	SysArticleMapper  sysArticleMapper;
	@Autowired
	AdvertisementMapper  advertisementMapper;
	@Autowired
	AnnouncementMapper  announcementMapper;
	
	public ModelMap getData(ModelMap modelMap, HttpServletRequest request) {
		//JSONObject json = new JSONObject();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("start", 0);
		map.put("count", 5);
		map.put("orderBy", "last_login_time");
		map.put("ascOrdesc", "DESC");
		List<Doctor> doctorList = doctorMapper.selectListByCondition(map);//良医在线
		if( Check.isNotNull(doctorList) ){
			modelMap.put("doctorList", doctorList);
			/*modelMap.put("doctorTotal", doctorList.size());*/
		}
		map.clear();
		map.put("gradeId", 2);//系统公告
		map.put("mainStatus", 1);
		map.put("start", 0);
		map.put("count", 10);
		map.put("orderBy", "is_top DESC,A.id");
		map.put("ascOrdesc", "DESC");
		List<Announcement> announcementList = announcementMapper.selectListByCondition(map);//公告
			modelMap.put("announcementList", announcementList);
		map.clear();
		map.put("typeId", 46);
		map.put("mainStatus", 1);
		map.put("start", 0);
		map.put("count", 10);
		map.put("orderBy", "is_top DESC,A.id");
		map.put("ascOrdesc", "DESC");
		List<Article> activityList = articleMapper.selectListByCondition(map);//活动
			modelMap.put("activityList", activityList);
		map.clear();
		map.put("typeId", 47);
		map.put("mainStatus", 1);
		map.put("start", 0);
		map.put("count", 10);
		map.put("orderBy", "is_top DESC,A.id");
		map.put("ascOrdesc", "DESC");
		List<Article> investigationList = articleMapper.selectListByCondition(map);//调查
			modelMap.put("investigationList", investigationList);
		map.clear();
		map.put("typeId", 43);
		map.put("mainStatus", 1);
		map.put("start", 0);
		map.put("count", 6);
		map.put("orderBy", "is_top DESC, commentCount");
		map.put("ascOrdesc", "DESC");
		map.put("currentMonth", 1);
		List<Article> hotDiscussionList = articleMapper.selectListByCondition(map);//热点讨论
		int leftCount = 0;
		if(Check.isNotNull(hotDiscussionList)){
			int count = hotDiscussionList.size();
			leftCount = 6 - count;
		}else{
			leftCount = 6;
		}
		if(leftCount > 0){
			map.clear();
			map.put("typeId", 43);
			map.put("mainStatus", 1);
			map.put("start", 0);
			map.put("count", leftCount);
			map.put("orderBy", "is_top DESC, commentCount");
			map.put("ascOrdesc", "DESC");
			map.put("notCurrentMonth", 1);
			List<Article> hotDiscussionList2 = articleMapper.selectListByCondition(map);//热点讨论
			hotDiscussionList.addAll(hotDiscussionList2);
		}
		modelMap.put("hotDiscussionList", hotDiscussionList);
		
		map.clear();
		map.put("typeId", 42);
		map.put("mainStatus", 1);
		map.put("start", 0);
		map.put("count", 6);
		map.put("orderBy", "is_top DESC,A.id");
		map.put("ascOrdesc", "DESC");
		List<Article> healthInformationList = articleMapper.selectListByCondition(map);//健康资讯
			modelMap.put("healthInformationList", healthInformationList);
		map.clear();
		map.put("typeId", 44);
		map.put("mainStatus", 1);
		map.put("start", 0);
		map.put("count", 7);
		map.put("orderBy", "is_top DESC,A.id");
		map.put("ascOrdesc", "DESC");
		List<Article> medicalOpinionList = articleMapper.selectListByCondition(map);//名医观点
			modelMap.put("medicalOpinionList", medicalOpinionList);
		map.clear();
		map.put("typeId", 48);
		map.put("mainStatus", 1);
		map.put("start", 0);
		map.put("count", 4);
		map.put("orderBy", "is_top DESC,A.id");
		map.put("ascOrdesc", "DESC");
		List<Article> sideList = articleMapper.selectListByCondition(map);//周边
			modelMap.put("sideList", sideList);
		modelMap = getIntroductionAndvision(modelMap);
		modelMap = getAdvertisement(modelMap);
		
		/*map.clear();
		map.put("typeId", 1);
		SysArticle link = sysArticleMapper.selectByCondition(map);//友情链接
		modelMap.put("link", link);
		json.put("link", link);
		modelMap.put("paramJson", json);*/
		return modelMap;
	}
	
	public ModelMap getIntroductionAndvision(ModelMap modelMap){
		Map<String,Object> map = new HashMap<String,Object>();
		map.clear();
		map.put("typeId", 55);
		map.put("mainStatus", 1);
		Article introduction = articleMapper.selectByCondition(map);//公司简介
		modelMap.put("introduction", introduction);
		map.clear();
		map.put("typeId", 56);
		map.put("mainStatus", 1);
		Article vision = articleMapper.selectByCondition(map);//公司愿景
		modelMap.put("vision", vision);
		return modelMap;
	}
	
	public ModelMap getAdvertisement(ModelMap modelMap){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("catId", 1);//栏目ID（位置ID,1.首页2.医生主页3.诊所主页4.首页下部）
		map.put("mainStatus", 1);
		map.put("start", 0);
		map.put("count", 10);
		List<Advertisement> advertisementList = advertisementMapper.selectListByCondition(map);//首页广告
		modelMap.put("advertisementList", advertisementList);
		
		map.put("catId", 4);//栏目ID（位置ID,1.首页2.医生主页3.诊所主页4.首页下部）
		List<Advertisement> advertisementList2 = advertisementMapper.selectListByCondition(map);//首页广告
		modelMap.put("advertisementList2", advertisementList2);
		
		return modelMap;
	}
	
}
