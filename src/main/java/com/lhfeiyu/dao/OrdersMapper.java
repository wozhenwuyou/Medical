package com.lhfeiyu.dao;

import java.util.List;
import java.util.Map;

import com.lhfeiyu.po.Orders;

public interface OrdersMapper {
	//获取用户下的订单
   List<Orders> findOrders(Map map);
}