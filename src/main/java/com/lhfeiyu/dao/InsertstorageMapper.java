package com.lhfeiyu.dao;

import java.util.List;
import java.util.Map;

import com.lhfeiyu.po.Insertstorage;

public interface InsertstorageMapper {
	
	public Integer addInsertstorage(Map map);
	public List<Insertstorage> findInsertstorage(Map map);
	public Integer count();
	public Integer update(Map map);
	public Integer delete(Integer id);
	
}
