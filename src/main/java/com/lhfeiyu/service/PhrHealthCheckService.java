package com.lhfeiyu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.dao.PhrHealthCheckMapper;
import com.lhfeiyu.po.PhrHealthCheck;
import com.lhfeiyu.vo.PhrHealthCheckCmd;

@Service
public class PhrHealthCheckService {

	@Autowired
	private PhrHealthCheckMapper phrHealthCheckMapper;

	public PhrHealthCheck findById(Integer id) {
		return phrHealthCheckMapper.selectByPrimaryKey(id);
	}

	public void save(PhrHealthCheckCmd cmd) {
		if(cmd.getId() != null && cmd.getId().intValue() > 0){
			phrHealthCheckMapper.updateByPrimaryKey(cmd);
		}else{
			phrHealthCheckMapper.insert(cmd);
		}
	}
	
	public List<Integer> getPhrHealthCheckByBasicInfoId(Integer basicInfoId){
		return phrHealthCheckMapper.getPhrHealthCheckByBasicInfoId(basicInfoId);
	}

}
