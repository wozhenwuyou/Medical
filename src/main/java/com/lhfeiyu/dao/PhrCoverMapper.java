package com.lhfeiyu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.PhrCover;
import com.lhfeiyu.po.PhrCoverExample;

public interface PhrCoverMapper {
	int countByExample(PhrCoverExample example);

	int deleteByExample(PhrCoverExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(PhrCover record);

	int insertSelective(PhrCover record);

	List<PhrCover> selectByExampleWithBLOBs(PhrCoverExample example);

	List<PhrCover> selectByExample(PhrCoverExample example);

	PhrCover selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") PhrCover record, @Param("example") PhrCoverExample example);

	int updateByExampleWithBLOBs(@Param("record") PhrCover record, @Param("example") PhrCoverExample example);

	int updateByExample(@Param("record") PhrCover record, @Param("example") PhrCoverExample example);

	int updateByPrimaryKeySelective(PhrCover record);

	int updateByPrimaryKeyWithBLOBs(PhrCover record);

	int updateByPrimaryKey(PhrCover record);
}
