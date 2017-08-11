package com.lhfeiyu.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.dao.PhrCoverMapper;
import com.lhfeiyu.po.PhrCover;
import com.lhfeiyu.po.PhrCoverExample;
import com.lhfeiyu.po.PhrCoverExample.Criteria;
import com.lhfeiyu.vo.PhrCoverCmd;

@Service
public class PhrCoverService {

	@Autowired
	private PhrCoverMapper phrCoverMapper;

	public PhrCover findById(Integer basicInfoId) {
		PhrCoverExample example = new PhrCoverExample();
		Criteria c = example.createCriteria();
		c.andBasicInfoIdEqualTo(basicInfoId);
		List<PhrCover> list = phrCoverMapper.selectByExample(example);
		return CollectionUtils.isNotEmpty(list) ? list.get(0) : null;
	}

	public void save(PhrCoverCmd cmd) {
		
		PhrCover cover = new PhrCover();
		try {
			BeanUtils.copyProperties(cover, cmd);
			if(cmd.getId() != null && cmd.getId().intValue() > 0){
				phrCoverMapper.updateByPrimaryKey(cover);
			}else{
				phrCoverMapper.insert(cover);
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
