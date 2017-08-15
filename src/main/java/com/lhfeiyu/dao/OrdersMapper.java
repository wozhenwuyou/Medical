package com.lhfeiyu.dao;

import java.util.List;
import java.util.Map;

import com.lhfeiyu.po.Orders;

public interface OrdersMapper {
	//获取用户下的订单
   List<Orders> findOrders(Map map);
   
   int addOrder(Map map);
   //获取总记录数
   int countNum();
   
   int deleteOrder(Integer id);
}