package com.lhfeiyu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.PhrBasicInfo;
import com.lhfeiyu.po.PhrBasicInfoExample;

public interface PhrBasicInfoMapper {
	int countByExample(PhrBasicInfoExample example);

	int deleteByExample(PhrBasicInfoExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(PhrBasicInfo record);

	int insertSelective(PhrBasicInfo record);

	List<PhrBasicInfo> selectByExampleWithBLOBs(PhrBasicInfoExample example);

	List<PhrBasicInfo> selectByExample(PhrBasicInfoExample example);

	PhrBasicInfo selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") PhrBasicInfo record,
			@Param("example") PhrBasicInfoExample example);

	int updateByExampleWithBLOBs(@Param("record") PhrBasicInfo record,
			@Param("example") PhrBasicInfoExample example);

	int updateByExample(@Param("record") PhrBasicInfo record, @Param("example") PhrBasicInfoExample example);

	int updateByPrimaryKeySelective(PhrBasicInfo record);

	int updateByPrimaryKeyWithBLOBs(PhrBasicInfo record);

	int updateByPrimaryKey(PhrBasicInfo record);

}
