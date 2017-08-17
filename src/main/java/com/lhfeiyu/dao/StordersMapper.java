package com.lhfeiyu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.Storders;

public interface StordersMapper {
	Integer count(Integer id);
	Integer add(Storders storders);
	Integer update(Storders storders);
	Integer delete(Integer id);
	List find(Storders storders);
}