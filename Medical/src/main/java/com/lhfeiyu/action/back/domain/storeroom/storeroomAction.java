package com.lhfeiyu.action.back.domain.storeroom;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.po.Admin;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.PhrBasicInfo;
import com.lhfeiyu.po.User;
import com.lhfeiyu.service.DoctorService;
import com.lhfeiyu.service.PhrBasicInfoService;
import com.lhfeiyu.service.PhrCoverService;
import com.lhfeiyu.service.PhrHealthCheckService;
import com.lhfeiyu.service.UserService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.vo.JsonResult;
import com.lhfeiyu.vo.PhrBasicInfoCmd;
import com.lhfeiyu.vo.PhrCountCmd;
import com.lhfeiyu.vo.PhrCoverCmd;
import com.lhfeiyu.vo.PhrHealthCheckCmd;

/**
 * 库存管理控制器
 * 
 * @author （hefuqiang）
 *
 */
@Controller
public class storeroomAction {

	// 日志支持
	private static Logger logger = Logger.getLogger(storeroomAction.class);

	
	/**
	 * 列表页面GET请求
	 * 
	 * @param modelMap
	 * @param request
	 * @return
	 */

	/**
	 * 列表页面POST请求
	 * 
	 * @param cmd
	 * @param request
	 * @return
	 */


	/**
	 * 添加页面GET请求
	 * 
	 * @param modelMap
	 * @param request
	 * @return
	 */


	/**
	 * 详情页面GET请求
	 * 
	 * @param modelMap
	 * @param request
	 * @return
	 */
	

	/**
	 * 编辑页面GET请求
	 * 
	 * @param modelMap
	 * @param request
	 * @return
	 */
	
	/**
	 * 编辑POST请求
	 * 
	 * @param modelMap
	 * @param request
	 * @return
	 */
	
	
	
	/*-----------------------hefuqiang以上未改-----------------------------*/
	
	// -------------------------------------------back---------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 订货订单列表页面
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 * 
	 */
	@RequestMapping(value = "/back/storeroom/dinghuo", method = RequestMethod.GET)  //订货页面
	public ModelAndView dinghuoPage(HttpServletRequest request, ModelMap modelMap) {
		String path = PagePath.BACK_DOMAIN_STOREROOM_DINGHUO;
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());// 验证session中的user，存在即返回
			if (admin.getRoleId() == 3) {
				modelMap.put("notAdmin", 1);
			}
			Result.success(modelMap, "订货订单列表页面加载成功", null);
		} catch (Exception e) {
			path = PagePath.backLogin;
			Result.catchError(e, logger, "LH_ERROR-Hospital-PAGE-/back/phr/list-订货订单列表页面出现异常", modelMap);
		}
		return new ModelAndView(path, modelMap);
	}
	
	@RequestMapping(value = "/back/storeroom/ruku", method = RequestMethod.GET)  //入库页面
	public ModelAndView rukuPage(HttpServletRequest request, ModelMap modelMap) {
		String path = PagePath.BACK_DOMAIN_STOREROOM_RUKU;
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());// 验证session中的user，存在即返回
			if (admin.getRoleId() == 3) {
				modelMap.put("notAdmin", 1);
			}
			Result.success(modelMap, "入库页面加载成功", null);
		} catch (Exception e) {
			path = PagePath.backLogin;
			Result.catchError(e, logger, "LH_ERROR-Hospital-PAGE-/back/phr/list-入库页面出现异常", modelMap);
		}
		return new ModelAndView(path, modelMap);
	}
	
	@RequestMapping(value = "/back/storeroom/chuku", method = RequestMethod.GET)  //出库页面
	public ModelAndView chukuPage(HttpServletRequest request, ModelMap modelMap) {
		String path = PagePath.BACK_DOMAIN_STOREROOM_CHUKU;
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());// 验证session中的user，存在即返回
			if (admin.getRoleId() == 3) {
				modelMap.put("notAdmin", 1);
			}
			Result.success(modelMap, "出库页面加载成功", null);
		} catch (Exception e) {
			path = PagePath.backLogin;
			Result.catchError(e, logger, "LH_ERROR-Hospital-PAGE-/back/phr/list-出库页面出现异常", modelMap);
		}
		return new ModelAndView(path, modelMap);
	}
	
	@RequestMapping(value = "/back/storeroom/kucun", method = RequestMethod.GET)  //库存页面
	public ModelAndView kucunPage(HttpServletRequest request, ModelMap modelMap) {
		String path = PagePath.BACK_DOMAIN_STOREROOM_KUCUN;
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());// 验证session中的user，存在即返回
			if (admin.getRoleId() == 3) {
				modelMap.put("notAdmin", 1);
			}
			Result.success(modelMap, "库存页面加载成功", null);
		} catch (Exception e) {
			path = PagePath.backLogin;
			Result.catchError(e, logger, "LH_ERROR-Hospital-PAGE-/back/phr/list-库存页面出现异常", modelMap);
		}
		return new ModelAndView(path, modelMap);
	}
	
	@ResponseBody
	@RequestMapping(value = "/back/phr/phrAdd1", method = RequestMethod.POST)
	public JSONObject backPhrAddPOST(PhrBasicInfoCmd cmd, HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());// 验证session中的user，存在即返回
			if (null == admin) {
				Doctor doctor = ActionUtil.checkSession4Doctor(request.getSession());// 验证session中的user，存在即返回
				if (doctor != null) {
					cmd.setDoctor(doctor);
					cmd.setCreateUserId(doctor.getId());// 创建者id
				}
			} else {
				cmd.setAdmin(admin);
				cmd.setCreateUserId(admin.getId());// 创建者id
			}
			cmd.setCreateTime(new Date());// 创建时间
			cmd.setLastUpdateTime(cmd.getCreateTime());// 最后修改时间
			// 设置患者的信息
			//phrBasicInfoService.savePhrBasicInfo(cmd);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-DoctorPatient-AJAX-/back/phr/phrAdd添加健康档案出现异常", json);
		}
		return Result.success(json);
	}

	

}
