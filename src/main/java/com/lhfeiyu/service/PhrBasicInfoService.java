package com.lhfeiyu.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.dao.PhrBasicInfoMapper;
import com.lhfeiyu.dao.PhrCoverMapper;
import com.lhfeiyu.po.Admin;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.po.PhrBasicInfo;
import com.lhfeiyu.po.PhrBasicInfoExample;
import com.lhfeiyu.po.PhrBasicInfoExample.Criteria;
import com.lhfeiyu.po.PhrCover;
import com.lhfeiyu.po.ProvinceCityArea;
import com.lhfeiyu.vo.PhrBasicInfoCmd;
import com.lhfeiyu.vo.PhrCountCmd;

@Service
public class PhrBasicInfoService {

	@Autowired
	private PhrBasicInfoMapper phrBasicInfoMapper;// 基本信息数据访问支持
	@Autowired
	private PhrCoverMapper phrCoverMapper;// 封面信息数据访问支持

	@Autowired
	private HospitalService hopitalService;
	@Autowired
	private ProvinceCityAreaService pcaService;

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
			if (StringUtils.isNotBlank(cmd.getJddw())) {
				c.andJddwLike("%" + cmd.getJddw() + "%");
			}
			if (cmd.getCreateUserId() != null && cmd.getCreateUserId() > 0) {
				c.andDoctorIdIsNotNull().andCreateUserIdEqualTo(cmd.getCreateUserId());
			}
			if (cmd.getCreateTimeBegin() != null) {
				c.andCreateTimeGreaterThanOrEqualTo(cmd.getCreateTimeBegin());
			}
			if (cmd.getCreateTimeEnd() != null) {
				c.andCreateTimeLessThanOrEqualTo(cmd.getCreateTimeEnd());
			}

			if (cmd.getQueryScope() != null) {
				if (new Integer(1).equals(cmd.getQueryScope())) {// 我的
					if (cmd.getDoctor() != null) {
						c.andDoctorIdIsNotNull().andDoctorIdEqualTo(cmd.getDoctor().getId());
					}
				} else if (new Integer(2).equals(cmd.getQueryScope())) {// 本诊所
					if (cmd.getDoctor() != null) {
						c.andHospitalIdEqualTo(cmd.getDoctor().getHospitalId());
					}
					if (cmd.getHospital() != null) {
						c.andHospitalIdEqualTo(cmd.getHospital().getId());
					}
				} else if (new Integer(3).equals(cmd.getQueryScope())) {// 全部

				}
			}

			// 城市
			if (cmd.getCityId() != null && cmd.getCityId().intValue() > 0) {
				// 找到这个城市下面所有的诊所
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("city", cmd.getCityId());
				List<Hospital> hospitals = hopitalService.selectListByCondition(map);
				List<Integer> list = new ArrayList<Integer>();
				if (CollectionUtils.isNotEmpty(hospitals)) {
					for (Hospital hospital : hospitals) {
						list.add(hospital.getId());
					}

				} else {
					list.add(99999);
				}
				c.andHospitalIdIn(list);
			}

			if (cmd.getPage() > 0 && cmd.getRows() > 0) {
				example.setStart((cmd.getPage() - 1) * cmd.getRows());
				example.setLimit(cmd.getRows());
			}
			if (StringUtils.isNotBlank(cmd.getSort())) {
				example.setOrderByClause(cmd.getSort() + " " + cmd.getOrder());
			}
		}
		example.setOrderByClause("create_time desc");
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
			if (StringUtils.isNotBlank(cmd.getJddw())) {
				c.andJddwLike("%" + cmd.getJddw() + "%");
			}
			if (cmd.getCreateUserId() != null && cmd.getCreateUserId() > 0) {
				c.andDoctorIdIsNull().andCreateUserIdEqualTo(cmd.getCreateUserId());
			}
			if (cmd.getCreateTimeBegin() != null) {
				c.andCreateTimeGreaterThanOrEqualTo(cmd.getCreateTimeBegin());
			}
			if (cmd.getCreateTimeEnd() != null) {
				c.andCreateTimeLessThanOrEqualTo(cmd.getCreateTimeEnd());
			}
			if (cmd.getQueryScope() != null) {
				if (new Integer(1).equals(cmd.getQueryScope())) {// 我的
					if (cmd.getDoctor() != null) {
						c.andDoctorIdIsNotNull().andDoctorIdEqualTo(cmd.getDoctor().getId());
					}
				} else if (new Integer(2).equals(cmd.getQueryScope())) {// 本诊所
					if (cmd.getDoctor() != null) {
						c.andHospitalIdEqualTo(cmd.getDoctor().getHospitalId());
					}
					if (cmd.getHospital() != null) {
						c.andHospitalIdEqualTo(cmd.getHospital().getId());
					}
				} else if (new Integer(3).equals(cmd.getQueryScope())) {// 全部

				}
			}
		}
		example.setOrderByClause("create_time desc");
		return phrBasicInfoMapper.countByExample(example);
	}

	public void savePhrBasicInfo(PhrBasicInfoCmd cmd) {

		cmd.setHasCover((byte) 1);
		cmd.setDelFlag(false);

		PhrBasicInfo entity = new PhrBasicInfo();
		try {
			BeanUtils.copyProperties(entity, cmd);
			if (cmd.getId() != null && cmd.getId().intValue() > 0) {
				// 修改基本信息
				PhrBasicInfo old = phrBasicInfoMapper.selectByPrimaryKey(cmd.getId());
				entity.setCreateTime(old.getCreateTime());
				entity.setHasCover(old.getHasCover());
				entity.setHospitalId(old.getHospitalId());
				entity.setCreateUserId(old.getCreateUserId());
				entity.setCreateTime(old.getCreateTime());
				entity.setDoctorId(old.getDoctorId());
				entity.setJdr(old.getJdr());
				entity.setJddw(old.getJddw());
				phrBasicInfoMapper.updateByPrimaryKey(entity);
			} else {
				// 生成基本信息表
				if (cmd.getDoctor() != null) {
					Doctor doctor = cmd.getDoctor();
					entity.setDoctorId(doctor.getId());
					entity.setHospitalId(doctor.getHospitalId());
					entity.setJdr(doctor.getRealname());
					Hospital hospital = hopitalService.selectByPrimaryKey(doctor.getHospitalId());
					if (hospital != null) {

						ProvinceCityArea sheng = pcaService.selectByPrimaryKey(hospital.getProvince());
						ProvinceCityArea shi = pcaService.selectByPrimaryKey(hospital.getCity());

						String str = hospital.getWholeName();
						if (shi != null) {
							str = shi.getAreaName() + "," + str;
						}
						if (sheng != null) {
							str = sheng.getAreaName() + "," + str;
						}
						entity.setJddw(str);// 建档单位
					}
				} else if (cmd.getAdmin() != null) {
					entity.setJdr(cmd.getAdmin().getUsername());
				}
				phrBasicInfoMapper.insert(entity);
				// 生成封面信息表
				PhrCover cover = new PhrCover();
				cover.setName(entity.getName());// name
				cover.setJdrq(new Date());// 建档日期
				cover.setLxdh(entity.getTel());// 联系电话
				cover.setCreateTime(new Date());// 创建时间
				cover.setBasicInfoId(entity.getId());// 基本信息id
				cover.setPatientId(entity.getPatientId());
				cover.setHospitalId(entity.getHospitalId());
				cover.setDoctorId(entity.getDoctorId());
				Doctor doctor = cmd.getDoctor();
				if (doctor != null) {
					cover.setJddw(entity.getJddw());
					cover.setZrys(doctor.getRealname());// 责任医生
					cover.setJdr(doctor.getRealname());
					cover.setCreateUserId(doctor.getId());
				}
				Admin admin = cmd.getAdmin();
				if (admin != null) {
					cover.setJdr(admin.getUsername());
					cover.setCreateUserId(admin.getId());
				}
				phrCoverMapper.insert(cover);
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
		if (StringUtils.isNoneBlank(ids)) {
			for (String id : ids.split("[,，;；]")) {

				PhrBasicInfo one = findById(Integer.valueOf(id));
				if (one != null) {
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

	public List<PhrBasicInfo> selectByPatientIds(List<Integer> patientIds) {
		return phrBasicInfoMapper.selectByPatientIds(patientIds);
	}

	// 健康档案统计结果
	public List<PhrBasicInfo> selectPhrCountList(PhrCountCmd cmd) {
		return phrBasicInfoMapper.selectPhrCountList(cmd);
	}

	// 健康档案值
	public Integer selectPhrCountValue(PhrCountCmd cmd) {
		return phrBasicInfoMapper.selectPhrCountValue(cmd);
	}

	public boolean checkUserNo(String userNo, String id) {
		PhrBasicInfoExample ex = new PhrBasicInfoExample();
		Criteria query = ex.createCriteria();
		query.andUserNoEqualTo(userNo);
		if (StringUtils.isNoneBlank(id)) {
			query.andIdNotEqualTo(Integer.valueOf(id));
		}
		List<PhrBasicInfo> list = phrBasicInfoMapper.selectByExample(ex);
		return list != null && list.size() > 0;
	}
}
