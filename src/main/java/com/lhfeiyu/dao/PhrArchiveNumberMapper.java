package com.lhfeiyu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.PhrArchiveNumber;
import com.lhfeiyu.po.PhrArchiveNumberExample;

public interface PhrArchiveNumberMapper {
	int countByExample(PhrArchiveNumberExample example);

	int deleteByExample(PhrArchiveNumberExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(PhrArchiveNumber record);

	int insertSelective(PhrArchiveNumber record);

	List<PhrArchiveNumber> selectByExampleWithBLOBs(PhrArchiveNumberExample example);

	List<PhrArchiveNumber> selectByExample(PhrArchiveNumberExample example);

	PhrArchiveNumber selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") PhrArchiveNumber record,
			@Param("example") PhrArchiveNumberExample example);

	int updateByExampleWithBLOBs(@Param("record") PhrArchiveNumber record,
			@Param("example") PhrArchiveNumberExample example);

	int updateByExample(@Param("record") PhrArchiveNumber record, @Param("example") PhrArchiveNumberExample example);

	int updateByPrimaryKeySelective(PhrArchiveNumber record);

	int updateByPrimaryKeyWithBLOBs(PhrArchiveNumber record);

	int updateByPrimaryKey(PhrArchiveNumber record);

	List<PhrArchiveNumber> selectByPatientIds(List<Integer> patientIds);

}
