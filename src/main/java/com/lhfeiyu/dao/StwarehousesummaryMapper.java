package com.lhfeiyu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.Stsupplier;
import com.lhfeiyu.po.Stwarehousesummary;

public interface StwarehousesummaryMapper {
	Integer count(Integer id);
	Integer add(Stwarehousesummary Stwarehousesummary);
	Integer update(Stwarehousesummary Stwarehousesummary);
	Integer delete(Integer id);
	List<Stwarehousesummary> find(Stwarehousesummary Stwarehousesummary);
}