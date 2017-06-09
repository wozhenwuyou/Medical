package com.lhfeiyu.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.dao.PhrBasicInfoMapper;
import com.lhfeiyu.po.PhrBasicInfo;
import com.lhfeiyu.po.PhrBasicInfoExample;
import com.lhfeiyu.vo.PhrBasicInfoCmd;

@Service
public class PhrBasicInfoService {

	@Autowired
	private PhrBasicInfoMapper phrBasicInfoMapper;

	public List<PhrBasicInfo> selectListByCondition(PhrBasicInfoCmd cmd) {

		PhrBasicInfoExample example = new PhrBasicInfoExample();
		PhrBasicInfoExample.Criteria c = example.createCriteria();

		// 未被删除的
		if ("hsz".equals(cmd.getType())) {
			c.andDelFlagEqualTo(true);
		} else {
			c.andDelFlagEqualTo(false);
		}

		if (StringUtils.isBlank(cmd.getType())) {
			if (StringUtils.isNotBlank(cmd.getName())) {
				c.andNameLike("%" + cmd.getName() + "%");
			}
			if (StringUtils.isNotBlank(cmd.getIdCardNo())) {
				c.andIdCardNoLike("%" + cmd.getIdCardNo() + "%");
			}
			if (StringUtils.isNotBlank(cmd.getUserNo())) {
				c.andUserNoLike("%" + cmd.getUserNo() + "%");
			}
			if (StringUtils.isNotBlank(cmd.getTel())) {
				c.andTelLike("%" + cmd.getTel() + "%");
			}
			if (cmd.getPage() > 0 && cmd.getRows() > 0) {
				example.setStart((cmd.getPage() - 1) * cmd.getRows());
				example.setLimit(cmd.getRows());
			}
			if (StringUtils.isNotBlank(cmd.getSort())) {
				example.setOrderByClause(cmd.getSort() + " " + cmd.getOrder());
			}
		}

		return phrBasicInfoMapper.selectByExample(example);
	}

	public Integer selectCountByCondition(PhrBasicInfoCmd cmd) {
		PhrBasicInfoExample example = new PhrBasicInfoExample();
		PhrBasicInfoExample.Criteria c = example.createCriteria();
		// 未被删除的
		if ("hsz".equals(cmd.getType())) {
			c.andDelFlagEqualTo(true);
		} else {
			c.andDelFlagEqualTo(false);
		}

		if (StringUtils.isBlank(cmd.getType())) {
			if (StringUtils.isNotBlank(cmd.getName())) {
				c.andNameLike("%" + cmd.getName() + "%");
			}
			if (StringUtils.isNotBlank(cmd.getIdCardNo())) {
				c.andIdCardNoLike("%" + cmd.getIdCardNo() + "%");
			}
			if (StringUtils.isNotBlank(cmd.getUserNo())) {
				c.andUserNoLike("%" + cmd.getUserNo() + "%");
			}
			if (StringUtils.isNotBlank(cmd.getTel())) {
				c.andTelLike("%" + cmd.getTel() + "%");
			}
		}
		return phrBasicInfoMapper.countByExample(example);
	}

	public void savePhrBasicInfo(PhrBasicInfoCmd cmd) {

		cmd.setHasCover((byte)1);
		cmd.setDelFlag(false);

		PhrBasicInfo entity = new PhrBasicInfo();
		try {
			BeanUtils.copyProperties(entity, cmd);
			if (cmd.getId() != null && cmd.getId().intValue() > 0) {
				PhrBasicInfo old = phrBasicInfoMapper.selectByPrimaryKey(cmd.getId());
				entity.setCreateTime(old.getCreateTime());
				entity.setHasCover(old.getHasCover());
				phrBasicInfoMapper.updateByPrimaryKey(entity);
			} else {
				phrBasicInfoMapper.insert(entity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public PhrBasicInfo findById(Integer id) {
		return phrBasicInfoMapper.selectByPrimaryKey(id);
	}

	public void deletePhrBasicInfo(Integer id) {
		PhrBasicInfo entity = phrBasicInfoMapper.selectByPrimaryKey(id);
		entity.setDelFlag(true);
		entity.setLastUpdateTime(new Date());
		phrBasicInfoMapper.updateByPrimaryKey(entity);
	}

	public void recoverPhrBasicInfo(String ids) {
		if(StringUtils.isNoneBlank(ids)){
			for(String id : ids.split("[,，;；]")){
				
				PhrBasicInfo one = findById(Integer.valueOf(id));
				if(one != null){
					one.setDelFlag(false);
					one.setLastUpdateTime(new Date());
					phrBasicInfoMapper.updateByPrimaryKey(one);
				}
			}
		}
	}

	public void savePhrBasicInfo(PhrBasicInfo basicInfo) {
		phrBasicInfoMapper.updateByPrimaryKey(basicInfo);
	}
}
