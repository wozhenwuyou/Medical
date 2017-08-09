package com.lhfeiyu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.dao.OrdersMapper;
import com.lhfeiyu.po.Orders;

@Service(value = "OrdersService")
public class OrdersService {
	@Autowired
	private OrdersMapper ordersMapper;
	
	public List<Orders> findOrders(Map map){
		return ordersMapper.findOrders(map);
	}
}
