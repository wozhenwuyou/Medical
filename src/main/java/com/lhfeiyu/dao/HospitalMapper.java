package com.lhfeiyu.dao;

import java.util.List;

import com.lhfeiyu.po.Hospital;

public interface HospitalMapper extends CommonMapper<Hospital>{

	List<Integer> selectAllHospitalIds();

}
