package com.lhfeiyu.dao;

import java.util.List;
import java.util.Map;

import com.lhfeiyu.po.insertstorageparticular;

//只做添加不做删除
public interface insertstorageparticularMapper {
	public List<insertstorageparticular> find(Map map);
	Integer add(Map map);
	Integer delete(Integer id);
	Integer update(Map map);
	
}
