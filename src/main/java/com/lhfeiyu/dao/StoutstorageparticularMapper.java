package com.lhfeiyu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.Stoutstorage;
import com.lhfeiyu.po.Stoutstorageparticular;

public interface StoutstorageparticularMapper {
	Integer count(Integer id);
	Integer add(Stoutstorageparticular Stoutstorageparticular);
	Integer update(Stoutstorageparticular Stoutstorageparticular);
	Integer delete(Integer id);
	List<Stoutstorageparticular> find(Stoutstorageparticular Stoutstorageparticular);
}