package com.lhfeiyu.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.dao.HospitalMapper;
import com.lhfeiyu.dao.PhrArchiveNumberMapper;
import com.lhfeiyu.po.PhrArchiveNumber;
import com.lhfeiyu.po.PhrArchiveNumberExample;
import com.lhfeiyu.po.PhrArchiveNumberExample.Criteria;

@Service
public class PhrArchiveNumberService {

	@Autowired
	private PhrArchiveNumberMapper mapper;
	@Autowired
	private HospitalMapper hospitalMapper;

	@PostConstruct
	public void initTable() {// 初始化表格，分配医院初始值

		// 如果表格不为空，则不用初始化
		int totalCount = mapper.countByExample(new PhrArchiveNumberExample());
		if (totalCount > 0)
			return;

		List<Integer> ids = hospitalMapper.selectAllHospitalIds();

		int startValue = 0;
		for (Integer id : ids) {

			PhrArchiveNumber entity = new PhrArchiveNumber();
			entity.setHospitalId(id);
			entity.setStartValue(startValue + 1);
			entity.setNextValue(startValue + 1);

			startValue = startValue + 150000;// 每个诊所分配15w个数字，现在可以发现应该使用long主键，而非int
			
			mapper.insert(entity);
		}

	}

	/**
	 * 根据诊所id，得到档案编号
	 * 
	 * @param hospitalId 诊所id
	 * @return
	 */
	public synchronized int generateArchiveNumber(int hospitalId) {
		int result = 0;
		// 去除nextValue，并nextValue+1
		PhrArchiveNumberExample example = new PhrArchiveNumberExample();
		Criteria c = example.createCriteria();
		c.andHospitalIdEqualTo(hospitalId);
		
		List<PhrArchiveNumber> list = mapper.selectByExample(example);
		
		if(list != null && list.size() > 0){
			PhrArchiveNumber one = list.get(0);
			result = one.getNextValue();
			//得到当前诊所的所有档案数目
			one.setNextValue(result + 1);
			mapper.updateByPrimaryKey(one);
		}
		return result;
	}

}



/**
 * PhrArchiveNumberExample example = new PhrArchiveNumberExample();
		example.createCriteria().andHospitalIdEqualTo(hospitalId);
		List<PhrArchiveNumber> list = mapper.selectByExample(example);
		if (CollectionUtils.isEmpty(list))
			return 0;
		PhrArchiveNumber one = list.get(0);
		
		// 得到当前诊所的所有档案数目
		PhrBasicInfoExample basicExam = new PhrBasicInfoExample();
		basicExam.createCriteria().andHospitalIdEqualTo(hospitalId);
		int haveCount = basicInfoMapper.countByExample(basicExam);
		one.setNextValue(one.getStartValue() + haveCount + 1);
		mapper.updateByPrimaryKey(one);
		return one.getNextValue();
		*/
