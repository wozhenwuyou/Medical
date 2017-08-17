package com.lhfeiyu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.Stoutstorage;
import com.lhfeiyu.po.Stoutstorageparticular;
import com.lhfeiyu.po.Stproduct;

public interface StproductMapper {
	Integer count(Integer id);
	Integer add(Stproduct Stproduct);
	Integer update(Stproduct Stproduct);
	Integer delete(Integer id);
	List<Stproduct> find(Stproduct Stproduct);
}