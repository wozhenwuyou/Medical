package com.lhfeiyu.service;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.dao.OrdersMapper;
import com.lhfeiyu.po.Orders;
import com.lhfeiyu.util.dust.Pager;

@Service(value = "OrdersService")
public class OrdersService {
	@Autowired
	private OrdersMapper ordersMapper;
	
	public List<Orders> findOrders(Map map){
		return ordersMapper.findOrders(map);
	}
	
	public int addOrders(Map map){
		return ordersMapper.addOrder(map);
	}
	
	public int countTotle(){
		return ordersMapper.countNum();
	}
	
	public int deleteaddOrders(int id){
		return ordersMapper.deleteOrder(id);
	}
	
	public Map castOrders4Map(Orders orders){
		Map map = new HashMap();
		Calendar calendar = Calendar.getInstance();
		map.put("createuserid", orders.getCreateuserid());
		map.put("createtime", orders.getCreatetime()==null|orders.getCreatetime().equals(null)?
				calendar.getTime():orders.getCreatetime());
		map.put("inuserid", orders.getInuserid());
		map.put("inserttime", orders.getInserttime()==null|orders.getInserttime().equals(null)?
				calendar.getTime():orders.getInserttime());
		
		return map;
		
	}
}
