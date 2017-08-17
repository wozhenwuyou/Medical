package com.lhfeiyu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.Stoutintype;

public interface StoutintypeMapper {
	Integer count(Integer id);
	Integer add(Stoutintype stoutintype);
	Integer update(Stoutintype stoutintype);
	Integer delete(Integer id);
	List<Stoutintype> find(Stoutintype stoutintype);
}