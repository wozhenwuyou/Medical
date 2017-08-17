package com.lhfeiyu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.Stproduct;
import com.lhfeiyu.po.Stproducttype;

public interface StproducttypeMapper {
	Integer count(Integer id);
	Integer add(Stproducttype Stproducttype);
	Integer update(Stproducttype Stproducttype);
	Integer delete(Integer id);
	List<Stproducttype> find(Stproducttype Stproducttype);
}