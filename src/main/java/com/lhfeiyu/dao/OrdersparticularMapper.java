package com.lhfeiyu.dao;

import java.util.List;
import java.util.Map;

import com.lhfeiyu.po.Ordersparticular;

public interface OrdersparticularMapper {
	
	int addOrdersDetails(Map map);
	
	int updateOrdersDetails(Map map);
	
	int deleteOrdersDetails(int detailsId);
	
}