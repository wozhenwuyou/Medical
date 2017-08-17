package com.lhfeiyu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.Stoutintype;
import com.lhfeiyu.po.Stoutstorage;

public interface StoutstorageMapper {
	Integer count(Integer id);
	Integer add(Stoutstorage Stoutstorage);
	Integer update(Stoutstorage Stoutstorage);
	Integer delete(Integer id);
	List<Stoutstorage> find(Stoutstorage Stoutstorage);
}