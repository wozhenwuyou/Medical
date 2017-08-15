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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.po.Admin;
import com.lhfeiyu.po.Orders;
import com.lhfeiyu.po.Ordersparticular;
import com.lhfeiyu.service.OrdersService;
import com.lhfeiyu.service.OrdersparticularService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Result;

@Controller
public class OrdersAction {
	@Autowired
	private OrdersService ordersService;
	@Autowired
	private OrdersparticularService ordersparticularService;

	private static Logger logger = Logger.getLogger("R");


	@RequestMapping(value="/back/storeroom/dinghuo")
	public ModelAndView  ordersPageDate(ModelMap modelMap, HttpServletRequest request){
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


	@ResponseBody
	@RequestMapping(value = "/back/orders/list",method = RequestMethod.POST)//暂未做条件查询
	public JSONObject getFindOdersList(Orders orders,HttpServletRequest request){
		JSONObject json = new JSONObject();
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());//验证session中的user，存在即返回
			if(null == admin)return Result.adminSessionInvalid(json);
			Map map = ordersService.castOrders4Map(orders);

			List<Orders> list = ordersService.findOrders(map);
			Integer total = ordersService.countTotle();
			
			Result.gridData(list, total, json);
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Orders-AJAX-/????-加载仓库模块订单数据出现问题", json);
		}

		return json;

	} 


	@RequestMapping(value="/back/orderAdd",method = RequestMethod.POST)
	public JSONObject addOrders(Orders orders,
			@RequestParam("ordersno")String[] ordersno ,@RequestParam("productname")String[] productname,
			@RequestParam("productid")String[] productid,@RequestParam("size")String[] size,
			@RequestParam("num")String[] num,@RequestParam("mununit")String[] mununit,
			@RequestParam("createproduct")String[] createproduct,@RequestParam("producttypeid")String[] producttypeid,
			@RequestParam("supplierid")String[] supplierid,HttpServletRequest request){
		JSONObject json = new JSONObject();
		
		try {
			
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());//验证session中的user，存在即返回
			if(null == admin)return Result.adminSessionInvalid(json);
			
			orders.setCreateuserid(admin.getId());
			
			Integer id = ordersService.addOrders(ordersService.castOrders4Map(orders));

			for (int i = 0; i < ordersno.length; i++) {
				Ordersparticular ordersparticular = new Ordersparticular();
				ordersparticular.setOrdersno(ordersno[i]);
				ordersparticular.setProductname(productname[i]);
				ordersparticular.setProductid(Integer.parseInt(productid[i]));
				ordersparticular.setSize(size[i]);
				ordersparticular.setNum(Integer.parseInt(num[i]));
				ordersparticular.setMununit(mununit[i]);
				ordersparticular.setCreateproduct(createproduct[i]);//供货商
				ordersparticular.setProducttypeid(Integer.parseInt(producttypeid[i]));
				ordersparticular.setSupplierid(Integer.parseInt(supplierid[i]));
				ordersparticular.setOrdersid(id);
				Map map = ordersparticularService.castDaitles4Map(ordersparticular);
				ordersparticularService.addOrdersDaitles(map);
			}
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Orders-AJAX-/????-添加订单出现问题", json);
		}
		return json;
	}

	@RequestMapping(value="/back/orderDetailsAdd",method = RequestMethod.POST)
	public JSONObject addOdersDetails(Ordersparticular Details,HttpServletRequest request){
		JSONObject json = new JSONObject();
		try {
			Map map = ordersparticularService.castDaitles4Map(Details);
			ordersparticularService.addOrdersDaitles(map);

			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-OrdersDetails-AJAX-/????-添加订单详细出现问题", json);
		}

		return json;
	}

	public JSONObject updateOrders(){
		return null;
	}

}
