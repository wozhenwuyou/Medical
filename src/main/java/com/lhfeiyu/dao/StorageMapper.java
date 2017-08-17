package com.lhfeiyu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.Storage;

public interface StorageMapper {
	Integer add(Storage storage);
	Integer update(Storage storage);
	Integer delete(Integer id);
	Integer count(Integer id);
	List<Storage> find(Storage storage);
}