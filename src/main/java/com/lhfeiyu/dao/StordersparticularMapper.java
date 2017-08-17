package com.lhfeiyu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.Stordersparticular;

public interface StordersparticularMapper {
	Integer count(Integer id);
	Integer add(Stordersparticular stordersparticular);
	Integer update(Stordersparticular stordersparticular);
	Integer delete(Integer id);
	List<Stordersparticular> find(Stordersparticular stordersparticular);
}