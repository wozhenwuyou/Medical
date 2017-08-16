package com.lhfeiyu.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.dao.OrdersparticularMapper;
import com.lhfeiyu.po.Ordersparticular;

@Service(value="OrdersparticularService")
public class OrdersparticularService {

	@Autowired
	private OrdersparticularMapper mapper;

	public int addOrdersDaitles(Map map){
		return mapper.addOrdersDetails(map);
	}

	public int updateOrdersDaitles(Map map){
		return mapper.addOrdersDetails(map);
	}

	public int deleteOrdersDaitles(Integer id){
		return mapper.deleteOrdersDetails(id);
	}

	public Map castDaitles4Map(Ordersparticular ordersparticular){
		Map map = new HashMap();
		if(ordersparticular.getOrdersno()!=null && ordersparticular.getOrdersno()!="")
			map.put("ordersno", ordersparticular.getOrdersno());
		if(ordersparticular.getProductname()!=null && ordersparticular.getProductname()!="")
			map.put("productname", ordersparticular.getProductname());
		if(ordersparticular.getProductid()>0)
			map.put("productid", ordersparticular.getProductid());
		if(ordersparticular.getSize()!=null && ordersparticular.getSize()!="")
			map.put("size", ordersparticular.getSize());
		if(ordersparticular.getNum()>0)
			map.put("num", ordersparticular.getNum());
		if(ordersparticular.getMununit()!=null && ordersparticular.getMununit()!="")
			map.put("mununit", ordersparticular.getMununit());
		if(ordersparticular.getCreateproduct()!=null && ordersparticular.getCreateproduct()!="")
			map.put("createproduct", ordersparticular.getCreateproduct());//改为供货商与生产商合并
		if(ordersparticular.getSupplierid()>0)
			map.put("supplierid", ordersparticular.getSupplierid());//通过下拉列表获取的供货商数据与createproduct同时传递
		if(ordersparticular.getProducttypeid()>0)
			map.put("producttypeid", ordersparticular.getProducttypeid());
		if(ordersparticular.getOrdersid()>0)
		map.put("orders_id", ordersparticular.getOrdersid());//关联外键

		return map;
	}
}
