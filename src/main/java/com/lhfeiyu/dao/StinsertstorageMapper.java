package com.lhfeiyu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.Stinsertstorage;


public interface StinsertstorageMapper {
	Integer count(Integer id);
	List<Stinsertstorage> find(Stinsertstorage stinsertstorage);
	Integer update(Stinsertstorage stinsertstorage);
	Integer delete(Integer id);
	Integer add(Stinsertstorage stinsertstorage);
}