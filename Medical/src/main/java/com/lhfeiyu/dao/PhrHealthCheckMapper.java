package com.lhfeiyu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.PhrHealthCheck;
import com.lhfeiyu.po.PhrHealthCheckExample;

public interface PhrHealthCheckMapper {
	int countByExample(PhrHealthCheckExample example);

	int deleteByExample(PhrHealthCheckExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(PhrHealthCheck record);

	int insertSelective(PhrHealthCheck record);

	List<PhrHealthCheck> selectByExampleWithBLOBs(PhrHealthCheckExample example);

	List<PhrHealthCheck> selectByExample(PhrHealthCheckExample example);

	PhrHealthCheck selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") PhrHealthCheck record,
			@Param("example") PhrHealthCheckExample example);

	int updateByExampleWithBLOBs(@Param("record") PhrHealthCheck record,
			@Param("example") PhrHealthCheckExample example);

	int updateByExample(@Param("record") PhrHealthCheck record, @Param("example") PhrHealthCheckExample example);

	int updateByPrimaryKeySelective(PhrHealthCheck record);

	int updateByPrimaryKeyWithBLOBs(PhrHealthCheck record);

	int updateByPrimaryKey(PhrHealthCheck record);

	List<Integer> getPhrHealthCheckByBasicInfoId(Integer basicInfoId);

}
