package com.lhfeiyu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.dao.InsertstorageMapper;
import com.lhfeiyu.po.Insertstorage;

@Service
public class InsertstorageService {

	@Autowired
	private InsertstorageMapper insertstorageMapper;
	
	public Integer addInsertstorage(Map map){
		return insertstorageMapper.addInsertstorage(map);
	}
	
	public Integer count(){
		return insertstorageMapper.count();
	}
	
	public List<Insertstorage> findInsertstorage(Map map){
		return insertstorageMapper.findInsertstorage(map);
	}
	
	public Map insertstorage2Map(Insertstorage insertstorage){
		Map map = new HashMap();
		
		map.put("address", insertstorage.getAddress());
		map.put("remarks", insertstorage.getRemarks());
		map.put("createproduct", insertstorage.getCreateproduct());
		map.put("dealer", insertstorage.getDealer());
		map.put("inorouttypeid", insertstorage.getInorouttypeid());
		map.put("userid", insertstorage.getUserid());
		map.put("inserttime", insertstorage.getInserttime());
		
		return map;
	}
}
