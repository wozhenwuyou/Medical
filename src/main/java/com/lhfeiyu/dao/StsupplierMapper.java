package com.lhfeiyu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.Stproduct;
import com.lhfeiyu.po.Stsupplier;

public interface StsupplierMapper {
	Integer count(Integer id);
	Integer add(Stsupplier Stsupplier);
	Integer update(Stsupplier Stsupplier);
	Integer delete(Integer id);
	List<Stsupplier> find(Stsupplier Stsupplier);
}