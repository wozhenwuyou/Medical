/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : medical

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2017-06-16 08:56:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for phr_basic_info
-- ----------------------------
DROP TABLE IF EXISTS `phr_basic_info`;
CREATE TABLE `phr_basic_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `user_no` varchar(255) DEFAULT NULL COMMENT '编号',
  `sex` varchar(255) DEFAULT NULL COMMENT '0未知的性别   1男   2女  9未说明的性别',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `id_card_no` varchar(40) DEFAULT NULL COMMENT '身份证号',
  `work_unit` varchar(255) DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `linkman` varchar(50) DEFAULT NULL,
  `linkman_tel` varchar(50) DEFAULT NULL,
  `resident_type` varchar(15) DEFAULT NULL,
  `nation` varchar(50) DEFAULT NULL,
  `nation_name` varchar(50) DEFAULT NULL,
  `blood_type` varchar(15) DEFAULT NULL,
  `rh_type` varchar(50) DEFAULT NULL,
  `degree` varchar(50) DEFAULT NULL,
  `profession` varchar(50) DEFAULT NULL,
  `marital_status` varchar(50) DEFAULT NULL,
  `pay_type` varchar(255) DEFAULT NULL,
  `pay_type_other` varchar(50) DEFAULT NULL,
  `ywgms` varchar(50) DEFAULT NULL,
  `ywgms_name` varchar(50) DEFAULT NULL,
  `bls` varchar(50) DEFAULT NULL,
  `jws_disease_des` varchar(4000) DEFAULT NULL,
  `jws_operation_des` varchar(4000) DEFAULT '',
  `jws_trauma_des` varchar(4000) DEFAULT NULL,
  `jws_transfusion_des` varchar(4000) DEFAULT NULL,
  `jzs_fq` varchar(255) DEFAULT NULL,
  `jzs_mq` varchar(255) DEFAULT NULL,
  `jzs_xdjm` varchar(255) DEFAULT NULL,
  `jzs_zn` varchar(255) DEFAULT NULL,
  `ycbs` varchar(255) DEFAULT NULL,
  `cjqk` varchar(255) DEFAULT NULL,
  `shhj_cfpfss` varchar(255) DEFAULT NULL,
  `shhj_rllx` varchar(255) DEFAULT NULL,
  `shhj_ys` varchar(255) DEFAULT NULL,
  `shhj_cs` varchar(255) DEFAULT NULL,
  `shhj_qcl` varchar(255) DEFAULT NULL,
  `doctor_id` int(11) DEFAULT NULL COMMENT '所属医生',
  `create_time` datetime DEFAULT NULL,
  `last_update_time` datetime DEFAULT NULL,
  `create_user_id` int(11) DEFAULT NULL COMMENT '创建人id',
  `patient_id` int(11) DEFAULT NULL COMMENT '患者id',
  `del_flag` tinyint(1) DEFAULT '0',
  `has_cover` tinyint(4) DEFAULT NULL COMMENT '1代表有封面',
  `hospital_id` int(11) DEFAULT NULL COMMENT '诊所id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of phr_basic_info
-- ----------------------------
INSERT INTO `phr_basic_info` VALUES ('14', '周浩然2', 'zsr01', '男', '2016-07-07', '341222198809135992', '无', '12345678', '邹文继', '18355855589', '非户籍', '其他', '回族', 'O型', '否', '大学专科及以上', '专业技术人员', '已婚', '新型农村合作医疗', '', '青霉素,磺胺,链霉素', '', '', '无', '无', '无', '无', null, null, null, null, '32', '视力残疾,听力残疾,言语残疾,肢体残疾,智力残疾,精神残疾,其他残疾', '油烟机,换气扇,烟囱', '液化气,煤,天然气,沼气,柴火,其他', '自来水,经净化过滤的水,井水,河湖水,塘水,其他', '卫生厕所,一格或二格粪池式,马桶,露天粪坑,简易棚厕', '单设,室内,室外', '1', '2017-05-27 23:12:38', '2017-06-15 22:48:20', '1', '13', '0', '1', '1');
INSERT INTO `phr_basic_info` VALUES ('15', '测试用户', '12306', '男', '2016-07-05', '341222198809135992', '263企业通信', '18702827609', '邹文继', '18355855589', '非户籍', '汉族', '', 'O型', '否', '大学专科及以上', '国家机关、党群组织、企业、事业单位负责人', '未婚', '全自费', null, '青霉素,磺胺,链霉素', null, '化学品,毒物,射线', '慢性阻塞性肺疾病;2017-06-02,高血压;2017-05-24', '无', '无', '无', '高血压,糖尿病,冠心病,慢性阻塞性肺疾病,恶性肿瘤,脑卒中,重性精神疾病,结核病,肝炎,先天畸形', '高血压,糖尿病,冠心病,慢性阻塞性肺疾病,恶性肿瘤,脑卒中,重性精神疾病,结核病,肝炎,先天畸形', '高血压,糖尿病,冠心病,慢性阻塞性肺疾病,恶性肿瘤,脑卒中,重性精神疾病,结核病,肝炎,先天畸形', '高血压,糖尿病,冠心病,慢性阻塞性肺疾病,恶性肿瘤,脑卒中,重性精神疾病,结核病,肝炎,先天畸形', '1,2,3', '视力残疾,听力残疾,言语残疾,肢体残疾,智力残疾,精神残疾,其他残疾', '油烟机,换气扇,烟囱', '液化气,煤,天然气,沼气 ,柴火,其他', '自来水,经净化过滤的水,井水,河湖水,塘水,其他', '卫生厕所,一格或二格粪池式,马桶,露天粪坑,简易棚厕', '单设,室内,室外', '1', '2017-05-28 09:25:39', '2017-06-04 19:14:13', '1', '1', '0', '0', '1');
INSERT INTO `phr_basic_info` VALUES ('16', '张三', '00004', '男', '2017-05-31', '341222198809135992', '无', '18355855589', '', '', '户籍', '汉族', '', 'B型', '不详', '文盲及半文盲', '国家机关、党群组织、企业、事业单位负责人,专业技术人员', '未婚', '贫困救助,商业医疗保险', '', '青霉素,磺胺', '', '', '高血压;2017-05-30', '无1;2017-05-24', '无2;2017-05-17', '无3;2017-05-11', '父亲;糖尿病', '母亲;慢性阻塞性肺疾病', '兄弟姐妹;恶性肿瘤', '子女;先天畸形', '但是', '听力残疾,智力残疾,精神残疾', '油烟机,换气扇,烟囱', '煤,天然气,沼气,柴火,其他', '河湖水', '一格或二格粪池式,马桶,露天粪坑', '室内,室外', null, '2017-05-29 16:42:47', '2017-06-04 19:14:13', '1', null, '0', '0', '1');
INSERT INTO `phr_basic_info` VALUES ('17', 'xxx', 'xxx', '男', '2017-05-23', '无', '无', 'xx', 'xx', 'xx', '户籍', '汉族', '', 'O型', '不详', '小学', '商业、服务业人员,农、林、牧、渔、水利业生产人员', '丧偶', '新型农村合作医疗,贫困救助', '', '链霉素', '', '', '无', '无', '无', '无', null, null, null, null, '无', '视力残疾,精神残疾', '油烟机', '煤', '经净化过滤的水', '一格或二格粪池式', '室外', null, '2017-05-29 16:44:16', '2017-06-04 19:14:13', '1', null, '0', '0', '1');
INSERT INTO `phr_basic_info` VALUES ('18', 'cccc', 'ccc', '男', '2017-05-16', 'cc', '无', 'cc', 'cc', 'cc', '户籍', '汉族', '', '不详', '不详', '初中', '办事人员和有关人员,商业、服务业人员', '已婚', '城镇职工基本医疗保险,城镇居民基本医疗保险', '', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '无', '视力残疾,精神残疾', '油烟机', '煤', '经净化过滤的水', '一格或二格粪池式', '室内,室外', null, '2017-05-29 16:45:31', '2017-06-04 19:14:13', '1', null, '0', '0', '1');
INSERT INTO `phr_basic_info` VALUES ('19', 'ff', 'ff', '男', '2017-05-31', 'sdd', 'dwe', 'sdsd', 'sds', 'dsd', '户籍', '汉族', '', 'O型', '不详', '小学', '农、林、牧、渔、水利业生产人员', '已婚', '城镇居民基本医疗保险', '', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '有', '听力残疾,精神残疾', '', '煤', '经净化过滤的水', '一格或二格粪池式', '室外', null, '2017-05-29 16:46:47', '2017-06-04 19:14:13', '1', null, '0', '0', '1');
INSERT INTO `phr_basic_info` VALUES ('20', 'ff', 'ff', '男', '2017-05-31', 'sdd', 'dwe', 'sdsd', 'sds', 'dsd', '户籍', '汉族', '', 'O型', '不详', '小学', '农、林、牧、渔、水利业生产人员', '已婚', '城镇居民基本医疗保险', '', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '有', '听力残疾,精神残疾', '', '煤', '经净化过滤的水', '一格或二格粪池式', '室外', null, '2017-05-29 18:06:34', '2017-06-04 19:14:13', '1', null, '0', '0', '0');
INSERT INTO `phr_basic_info` VALUES ('21', 'ff', 'ff', '男', '2017-05-31', 'sdd', 'dwe', 'sdsd', 'sds', 'dsd', '户籍', '汉族', '', 'O型', '不详', '小学', '农、林、牧、渔、水利业生产人员', '已婚', '城镇居民基本医疗保险', '', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '有', '听力残疾,精神残疾', '', '煤', '经净化过滤的水', '一格或二格粪池式', '室外', null, '2017-05-29 18:08:24', '2017-06-04 19:14:13', '1', null, '0', '0', '0');
INSERT INTO `phr_basic_info` VALUES ('22', 'ff', 'ff', '男', '2017-05-31', 'sdd', 'dwe', 'sdsd', 'sds', 'dsd', '户籍', '汉族', '', 'O型', '不详', '小学', '农、林、牧、渔、水利业生产人员', '已婚', '城镇居民基本医疗保险', '', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '有', '听力残疾,精神残疾', '', '煤', '经净化过滤的水', '一格或二格粪池式', '室外', null, '2017-05-29 18:10:10', '2017-06-04 19:14:13', '1', null, '0', '0', '0');
INSERT INTO `phr_basic_info` VALUES ('23', 'ff', 'ff', '男', '2017-05-31', 'sdd', 'dwe', 'sdsd', 'sds', 'dsd', '户籍', '汉族', '', 'O型', '不详', '小学', '农、林、牧、渔、水利业生产人员', '已婚', '城镇居民基本医疗保险', '', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '有', '听力残疾,精神残疾', '', '煤', '经净化过滤的水', '一格或二格粪池式', '室外', null, '2017-05-29 18:11:17', '2017-06-04 19:14:13', '1', null, '0', '0', '0');
INSERT INTO `phr_basic_info` VALUES ('24', 'ff', 'ff', '男', '2017-05-31', 'sdd', 'dwe', 'sdsd', 'sds', 'dsd', '户籍', '其他', '回族', '不详', '否', '小学', '农、林、牧、渔、水利业生产人员', '已婚', '城镇居民基本医疗保险,其他', '这是什么', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '无', '听力残疾,精神残疾', '油烟机,烟囱', '煤,柴火', '经净化过滤的水,塘水', '一格或二格粪池式', '室外', null, '2017-05-29 18:14:54', '2017-06-14 21:41:43', '1', null, '1', '0', '0');
INSERT INTO `phr_basic_info` VALUES ('25', '刘医生建的患者甲2', '21332112', '男', '2016-07-08', '55555', '无', '55555', '', '', '户籍', '汉族', '', '不详', '不详', '不详', '不便分类的其他从业人员', '未说明的婚姻状况', '新型农村合作医疗', '', '无', '', '', '无', '无', '无', '无', null, null, null, null, '无', '', '无', '', '', '', '', null, '2017-06-13 20:43:27', '2017-06-13 23:39:06', '1', '19', '1', '1', '1');

-- ----------------------------
-- Table structure for phr_cover
-- ----------------------------
DROP TABLE IF EXISTS `phr_cover`;
CREATE TABLE `phr_cover` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `xzz` varchar(255) DEFAULT NULL,
  `hjdz` varchar(255) DEFAULT NULL,
  `lxdh` varchar(255) DEFAULT NULL,
  `xzmc` varchar(255) DEFAULT NULL,
  `cwhmc` varchar(255) DEFAULT NULL,
  `jddw` varchar(255) DEFAULT NULL,
  `jdr` varchar(255) DEFAULT NULL,
  `zrys` varchar(255) DEFAULT NULL,
  `jdrq` date DEFAULT NULL,
  `doctor_id` int(11) DEFAULT NULL,
  `create_user_id` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `patient_id` int(11) DEFAULT NULL,
  `hospital_id` int(11) DEFAULT NULL,
  `basic_info_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of phr_cover
-- ----------------------------
INSERT INTO `phr_cover` VALUES ('14', '刘医生建的患者甲1', '北京', '安徽', '55555', '没有', '无', '诊所的地址11都是对费点功夫更好测试诊所全称', '测试医生', '测试医生', '2017-06-13', '1', '1', null, '19', '1', '25');
INSERT INTO `phr_cover` VALUES ('15', '周浩然1', '北京', '安徽', '12345678', '没有', '无', '诊所的地址11都是对费点功夫更好测试诊所全称', '测试医生', '测试医生', '2017-06-13', '1', '1', null, '13', '1', '14');

-- ----------------------------
-- Table structure for phr_health_check
-- ----------------------------
DROP TABLE IF EXISTS `phr_health_check`;
CREATE TABLE `phr_health_check` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phr_basic_info_id` int(11) DEFAULT NULL COMMENT '健康档案基本信息id',
  `patient_id` int(11) DEFAULT NULL COMMENT '患者id',
  `doctor_id` int(11) DEFAULT NULL COMMENT '医生id',
  `hospital_id` int(11) DEFAULT NULL COMMENT '诊所id',
  `create_user_id` int(11) DEFAULT NULL COMMENT '后台创建用户id',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `lastUpdateTime` datetime DEFAULT NULL COMMENT '最后更新时间',
  `deleteFlag` bit(1) DEFAULT NULL COMMENT '是否删除标记',
  `tjrq` date DEFAULT NULL COMMENT '体检日期',
  `zrys` varchar(25) DEFAULT NULL COMMENT '责任医生',
  `zhengzhuang` varchar(150) DEFAULT NULL,
  `zhengzhuang_qt` varchar(105) DEFAULT NULL,
  `ybqk_tw` varchar(25) DEFAULT NULL COMMENT '体温',
  `ybqk_ml` varchar(25) DEFAULT NULL,
  `ybqk_hxpl` varchar(25) DEFAULT NULL,
  `ybqk_xw_zc1` varchar(25) DEFAULT NULL,
  `ybqk_xw_zc2` varchar(25) DEFAULT NULL,
  `ybqk_xw_yc1` varchar(25) DEFAULT NULL COMMENT '血压 右侧',
  `ybqk_xw_yc2` varchar(25) DEFAULT NULL,
  `ybqk_sg` varchar(25) DEFAULT NULL,
  `ybqk_tz` varchar(25) DEFAULT NULL,
  `ybqk_yw` varchar(25) DEFAULT NULL COMMENT '腰围',
  `ybqk_tzzs` varchar(25) DEFAULT NULL COMMENT 'bmi',
  `ybqk_zwpg_jkzk` varchar(30) DEFAULT NULL COMMENT '自我评估-健康状况',
  `ybqk_zwpg_zlnl` varchar(30) DEFAULT NULL COMMENT '自理能力',
  `ybqk_rzgn` varchar(25) DEFAULT NULL COMMENT '认知功能',
  `ybqk_rzgn_zf` varchar(25) DEFAULT NULL COMMENT '认知功能-总分',
  `ybqk_qgzt` varchar(25) DEFAULT NULL,
  `ybqk_qgzt_zf` varchar(25) DEFAULT NULL,
  `shfs_tydl_dlpl` varchar(25) DEFAULT NULL COMMENT '生活方式，体育锻炼,锻炼频率',
  `shfs_tydl_mcdlsj` varchar(25) DEFAULT NULL,
  `shfs_tydl_jcdlsj` varchar(25) DEFAULT NULL COMMENT '坚持锻炼时间',
  `shfs_tydl_dlfs` varchar(25) DEFAULT NULL COMMENT '锻炼方式',
  `shfs_ysxg` varchar(80) DEFAULT NULL COMMENT '饮食习惯',
  `shfs_xyqk_xyzk` varchar(25) DEFAULT NULL,
  `shfs_xyqk_rxyl` varchar(25) DEFAULT NULL,
  `shfs_xyqk_ksxynl` varchar(25) DEFAULT NULL,
  `shfs_xyqk_jynl` varchar(25) DEFAULT NULL COMMENT '戒烟年龄',
  `shfs_yjqk_yjpl` varchar(25) DEFAULT NULL,
  `shfs_yjqk_ryjl` varchar(25) DEFAULT NULL,
  `shfs_yjqk_sfjj` varchar(25) DEFAULT NULL COMMENT '是否戒酒',
  `shfs_yjqk_jjnl` varchar(25) DEFAULT NULL COMMENT '戒酒年龄',
  `shfs_yjqk_ksyjnl` varchar(25) DEFAULT NULL,
  `shfs_yjqk_jynnsfzj` varchar(25) DEFAULT NULL COMMENT '近一年内是否醉酒',
  `shfs_yjqk_yjzl` varchar(50) DEFAULT NULL,
  `shfs_yjqk_yjzl_qt` varchar(50) DEFAULT NULL,
  `shfs_zybwhysjcs` varchar(255) DEFAULT NULL COMMENT '职业病危害因素接触史',
  `zqgn_kq_kc` varchar(55) DEFAULT NULL,
  `zqgn_kq_cl` varchar(55) DEFAULT NULL,
  `zqgn_kq_yb` varchar(55) DEFAULT NULL,
  `zqgn_sl_zy` varchar(25) DEFAULT NULL,
  `zqgn_sl_yy` varchar(25) DEFAULT NULL,
  `zqgn_sl_jz_zy` varchar(25) DEFAULT NULL,
  `zqgn_sl_jz_yy` varchar(25) DEFAULT NULL COMMENT '右眼矫正视力',
  `zqgn_tl` varchar(25) DEFAULT NULL,
  `zqgn_ydgn` varchar(55) DEFAULT NULL COMMENT '脏器功能-运动功能',
  `ct_yd` varchar(55) DEFAULT NULL COMMENT '查体——眼底',
  `ct_yd_zyjc` varchar(100) DEFAULT NULL COMMENT '眼底专业检查',
  `ct_pf` varchar(55) DEFAULT NULL,
  `ct_pf_qt` varchar(100) DEFAULT NULL,
  `ct_gm` varchar(55) DEFAULT NULL,
  `ct_gm_qt` varchar(100) DEFAULT NULL,
  `ct_lbj` varchar(55) DEFAULT NULL,
  `ct_lbj_qt` varchar(100) DEFAULT NULL,
  `ct_f_tzx` varchar(25) DEFAULT NULL,
  `ct_f_hxy` varchar(25) DEFAULT NULL,
  `ct_f_hxy_qt` varchar(100) DEFAULT NULL,
  `ct_f_ly` varchar(25) DEFAULT NULL,
  `ct_f_ly_qt` varchar(100) DEFAULT NULL COMMENT '罗  音-其他',
  `ct_xz_xl` varchar(25) DEFAULT NULL,
  `ct_xz_xlq` varchar(25) DEFAULT NULL COMMENT '心律：   齐    不齐    绝对不齐',
  `ct_xz_zy` varchar(25) DEFAULT NULL,
  `ct_xz_zy_qt` varchar(100) DEFAULT NULL,
  `ct_fb_yt` varchar(25) DEFAULT NULL,
  `ct_fb_yt_qt` varchar(255) DEFAULT NULL,
  `ct_fb_bk` varchar(25) DEFAULT NULL,
  `ct_fb_bk_qt` varchar(100) DEFAULT NULL,
  `ct_fb_gd` varchar(25) DEFAULT NULL COMMENT '肝大',
  `ct_fb_gd_qt` varchar(100) DEFAULT NULL,
  `ct_fb_pd` varchar(25) DEFAULT NULL,
  `ct_fb_pd_qt` varchar(100) DEFAULT NULL,
  `ct_fb_ydxzy` varchar(25) DEFAULT NULL,
  `ct_fb_ydxzy_qt` varchar(100) DEFAULT NULL,
  `ct_xzsz` varchar(55) DEFAULT NULL COMMENT '下肢水肿',
  `ct_zbdmbd` varchar(55) DEFAULT NULL,
  `ct_gmzz` varchar(55) DEFAULT NULL,
  `ct_gmzz_qt` varchar(100) DEFAULT NULL,
  `ct_rx` varchar(55) DEFAULT NULL COMMENT '乳腺',
  `ct_rx_qt` varchar(100) DEFAULT NULL,
  `ct_fk_wy` varchar(55) DEFAULT NULL,
  `ct_fk_wy_qt` varchar(55) DEFAULT NULL,
  `ct_fk_yd` varchar(55) DEFAULT NULL,
  `ct_fk_yd_qt` varchar(55) DEFAULT NULL,
  `ct_fk_gj` varchar(55) DEFAULT NULL COMMENT '宫颈',
  `ct_fk_gj_qt` varchar(55) DEFAULT NULL,
  `ct_fk_gt` varchar(55) DEFAULT NULL,
  `ct_fk_gt_qt` varchar(55) DEFAULT NULL,
  `ct_fk_fj` varchar(55) DEFAULT NULL COMMENT '附件',
  `ct_fk_fj_qt` varchar(55) DEFAULT NULL,
  `ct_qt` varchar(1000) DEFAULT NULL,
  `fzjc_xcg_xhdb` varchar(25) DEFAULT NULL COMMENT '辅助检查-血常规-血红蛋白',
  `fzjc_xcg_bxb` varchar(25) DEFAULT NULL,
  `fzjc_xcg_xxb` varchar(25) DEFAULT NULL,
  `fzjc_ncg_ndb` varchar(25) DEFAULT NULL COMMENT '尿常规-尿蛋白',
  `fzjc_ncg_nt` varchar(25) DEFAULT NULL,
  `fzjc_ncg_ntt` varchar(25) DEFAULT NULL,
  `fzjc_ncg_nqx` varchar(25) DEFAULT NULL,
  `fzjc_ncg_qt` varchar(100) DEFAULT NULL COMMENT '尿常规-其他',
  `fzjc_kfxt_mm` varchar(25) DEFAULT NULL,
  `fzjc_kfxt_mg` varchar(25) DEFAULT NULL COMMENT 'mg/dL',
  `fzjc_xdt` varchar(100) DEFAULT NULL COMMENT '心电图',
  `fzjc_xdt_qt` varchar(255) DEFAULT NULL COMMENT '心电图其他',
  `fzjc_nwlbdb` varchar(25) DEFAULT NULL COMMENT '尿微量白蛋白',
  `fzjc_dbqx` varchar(25) DEFAULT NULL,
  `fzjc_thxhdb` varchar(25) DEFAULT NULL,
  `fzjc_yxgybmky` varchar(25) DEFAULT NULL,
  `fzjc_ggn_xqgbzam` varchar(25) DEFAULT NULL COMMENT '血清谷丙转氨酶',
  `fzjc_ggn_xqgczam` varchar(25) DEFAULT NULL,
  `fzjc_ggn_bdb` varchar(25) DEFAULT NULL COMMENT '肝功能-白蛋白',
  `fzjc_ggn_zdhs` varchar(25) DEFAULT NULL,
  `fzjc_ggn_jhdhs` varchar(25) DEFAULT NULL,
  `fzjc_xgn_xqjg` varchar(25) DEFAULT NULL COMMENT '肾功能-血清肌酐',
  `fzjc_xgn_xnsd` varchar(25) DEFAULT NULL,
  `fzjc_xgn_xjnd` varchar(25) CHARACTER SET utf8mb4 DEFAULT NULL,
  `fzjc_xgn_xnnd` varchar(25) DEFAULT NULL,
  `fzjc_xz_zdgc` varchar(25) DEFAULT NULL COMMENT '血   脂-总胆固醇',
  `fzjc_xz_gysz` varchar(25) DEFAULT NULL,
  `fzjc_xz_xqdmdzdbdgc` varchar(25) DEFAULT NULL COMMENT '血清低密度脂蛋白胆固醇',
  `fzjc_xz_xqgmdzdbdgc` varchar(25) DEFAULT NULL,
  `fzjc_xbxxp` varchar(55) DEFAULT NULL,
  `fzjc_xbxxp_qt` varchar(55) DEFAULT NULL,
  `fzjc_bc` varchar(55) DEFAULT NULL COMMENT 'B超',
  `fzjc_bc_qt` varchar(55) DEFAULT NULL,
  `fzjc_gjtp` varchar(55) DEFAULT NULL,
  `fzjc_gjtp_qt` varchar(55) DEFAULT NULL,
  `fzjc_qt` varchar(1000) DEFAULT NULL,
  `zytzbs_phz` varchar(20) DEFAULT NULL COMMENT '中医体质辨识-平和质',
  `zytzbs_qxz` varchar(20) DEFAULT NULL,
  `zytzbs_yanx` varchar(20) DEFAULT NULL COMMENT '阳虚',
  `zytzbs_yinx` varchar(20) DEFAULT NULL COMMENT '阴虚',
  `zytzbs_tx` varchar(20) DEFAULT NULL,
  `zytzbs_xr` varchar(20) DEFAULT NULL,
  `zytzbs_xy` varchar(20) DEFAULT NULL,
  `zytzbs_qy` varchar(20) DEFAULT NULL,
  `zytzbs_tb` varchar(20) DEFAULT NULL,
  `xczyjkwt_nxgjb` varchar(255) DEFAULT NULL COMMENT '现存主要健康问题',
  `xczyjkwt_nxgjb_qt` varchar(255) DEFAULT NULL,
  `xczyjkwt_szjb` varchar(255) DEFAULT NULL,
  `xczyjkwt_szjb_qt` varchar(255) DEFAULT NULL,
  `xczyjkwt_xzjb` varchar(255) DEFAULT NULL,
  `xczyjkwt_xzjb_qt` varchar(255) DEFAULT NULL,
  `xczyjkwt_xgjb` varchar(255) DEFAULT NULL,
  `xczyjkwt_xgjb_qt` varchar(255) DEFAULT NULL,
  `xczyjkwt_ybjb` varchar(255) DEFAULT NULL,
  `xczyjkwt_ybjb_qt` varchar(255) DEFAULT NULL,
  `xczyjkwt_sjxtjb` varchar(25) DEFAULT NULL,
  `xczyjkwt_sjxtjb_qt` varchar(100) DEFAULT NULL,
  `xczyjkwt_qtxtjb` varchar(25) DEFAULT NULL,
  `xczyjkwt_qtxtjb_qt` varchar(100) DEFAULT NULL,
  `zys_des` varchar(1000) DEFAULT NULL COMMENT '住院',
  `jtbcs_des` varchar(1000) DEFAULT NULL,
  `yyqk_des` varchar(1000) DEFAULT NULL,
  `fmyghyfjzs_des` varchar(1000) DEFAULT NULL,
  `jkpj` varchar(25) DEFAULT NULL,
  `jkpj_des` varchar(1000) DEFAULT NULL,
  `jkzd_des` varchar(1000) DEFAULT NULL,
  `wxyskz` varchar(1000) DEFAULT '',
  `wxyskz_mb` varchar(255) DEFAULT NULL,
  `wxyskz_jyjzym` varchar(255) DEFAULT NULL,
  `wxyskz_qt` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of phr_health_check
-- ----------------------------
INSERT INTO `phr_health_check` VALUES ('1', '24', null, null, null, '1', '2017-06-06 22:01:02', '2017-06-06 22:01:02', '\0', '2017-06-06', '走恩及', '无症状,多尿,便秘', '其他xxx', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', null, null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, null, null, null, null, null, '', '', '');
INSERT INTO `phr_health_check` VALUES ('2', '23', null, null, null, '1', null, '2017-06-15 22:16:29', '\0', '2017-06-07', '邹文继', '无症状,头痛,头晕,心悸,胸闷,胸痛,慢性咳嗽,咳痰,呼吸困难,多饮,多尿,体重下降,乏力,关节肿痛,视力模糊,手脚麻木,尿急,尿痛,便秘,腹泻,恶心呕吐,眼花,耳鸣,乳房胀痛,其他', '其他装在', '38', '88', '88', '23', '32', '24', '42', '173', '67', '123', '34', '基本满意', '可自理', '粗筛阳性', '124', '粗筛阳性', '675', null, '54', '3', '方式', '荤食为主', null, '23', '23', '5', '从不', '3', '已戒酒', '23', '1', '是', '红酒,黄酒', '其他酒', '<p>工种1，从业时间2年，毒物种类3，防护措施4 <input value=\"x\" type=\"button\" class=\"btn-danger\" onclick=\"$(this).parent().remove();\"></p>', '红润,苍白,发绀,皲裂,疱疹', '正常,缺齿,龋齿,义齿', '无充血,充血,淋巴滤泡增生', '32', '2323', '23', '23', '听不清或无法听见', '可顺利完成', '异常', '属专业检查', '正常,潮红,苍白,黄染,色素沉着,其他', '其他', '正常', 'sdaf', '未触及', 'sdfsaf', '是', '正常', '', '无', 'safdsaf', '', null, '有', '112', '有', '121', '有', '3', '有', '4', '有', 'er', '有', 'rwe32', '单侧', '触及双侧对称', '触痛', 'sdafsa', '未见异常,乳房切除', 'safdsaf', '异常', '1212', '异常', '121', '异常', '212', '异常', '12', '异常', '3223', '23r23r', '23', '23', '23', '32', '2332', '23', '32', '23', '23', '23', '异常', '32', '23', '阴性', '323', '阴性', '2323', '23', '32', '32', '32', '32', '23', '32', '32', '23', '23', '32', '32', null, '32', '异常', '32', '异常', '32', '23frwefasf', '是', '是', '是', '是', '是', '是', '是', '是', '是', '未发现,缺血性卒中,蛛网膜下腔出血,短暂性脑缺血发作', '1212', '未发现,糖尿病肾病,肾功能衰竭,急性肾炎,慢性肾炎,其他', 'sfsafsa', '未发现,心肌梗死,心绞痛,冠状动脉血运重建,心前区疼痛,其他', 'afdsaf', '未发现,其他', 'safdsa', '未发现', 'fsfda', '有', 'sdfa', '有', 'fsdaf', '<p>入/出院日期：1，原因：2，医疗机构名称：3，病案号：4。 <input value=\"x\" class=\"btn-danger\" type=\"button\" onclick=\"$(this).parent().remove();\"></p>', '<p>建/撤床日期：1，原因：2，医疗机构名称：3，病案号：4。 <input value=\"x\" class=\"btn-danger\" type=\"button\" onclick=\"$(this).parent().remove();\"></p>', '<p>药物名称：1，用法：2，用量：3，用药时间：4，服药依从性：规律。 <input class=\"btn-danger\" value=\"x\" type=\"button\" onclick=\"$(this).parent().remove();\"></p>', '', '有异常', null, '纳入慢性病患者健康管理,建议复查,建议转诊', '戒烟,健康饮酒,饮食,减体重,建议接种疫苗', 'fsafsda', 'fsaf', 'sadffsa');
INSERT INTO `phr_health_check` VALUES ('4', '14', '13', '1', '1', '1', null, '2017-06-15 22:48:37', '\0', '2017-06-15', '张三', '头痛,体重下降,腹泻', '', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', '', null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', null, null, null, null, '', '', '');
INSERT INTO `phr_health_check` VALUES ('5', '14', '13', '1', '1', '1', null, '2017-06-08 21:37:20', '\0', '2017-06-21', 'wefwrw', null, 'rwrwwrwree', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', null, null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, null, null, null, null, '戒烟,减体重,建议接种疫苗,其他', '33', '2323', '232332');
INSERT INTO `phr_health_check` VALUES ('6', '14', '13', '1', '1', '1', '2017-06-08 21:56:58', '2017-06-08 21:56:58', '\0', '2017-06-08', '', '慢性咳嗽,手脚麻木,其他', '', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', null, null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, null, null, null, null, null, '', '', '');
INSERT INTO `phr_health_check` VALUES ('7', '25', '19', '1', '1', '1', '2017-06-13 23:17:35', '2017-06-13 23:17:35', '\0', '2017-06-13', '邹文继', null, '', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', null, null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, null, null, null, null, null, '', '', '');
INSERT INTO `phr_health_check` VALUES ('8', '25', '19', '1', '1', '1', '2017-06-13 23:19:22', '2017-06-13 23:19:24', '\0', '2017-06-14', '邹文继2', null, '', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', null, null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, null, null, null, null, null, '', '', '');
INSERT INTO `phr_health_check` VALUES ('9', null, null, null, null, '1', '2017-06-14 21:41:20', '2017-06-14 21:41:20', '\0', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', null, null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, null, null, null, null, null, '', '', '');
INSERT INTO `phr_health_check` VALUES ('10', null, null, null, null, '1', '2017-06-14 21:42:03', '2017-06-14 21:42:03', '\0', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', null, null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, null, null, null, null, null, '', '', '');
INSERT INTO `phr_health_check` VALUES ('11', null, null, null, null, '1', '2017-06-14 21:42:30', '2017-06-14 21:42:30', '\0', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', null, null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, null, null, null, null, null, '', '', '');
INSERT INTO `phr_health_check` VALUES ('12', null, null, null, null, '1', '2017-06-14 21:43:36', '2017-06-14 21:43:36', '\0', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', null, null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, null, null, null, null, null, '', '', '');
INSERT INTO `phr_health_check` VALUES ('13', null, null, null, null, '1', '2017-06-14 21:45:30', '2017-06-14 21:45:30', '\0', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', null, null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, null, null, null, null, null, '', '', '');
INSERT INTO `phr_health_check` VALUES ('14', null, null, null, null, '1', '2017-06-14 21:46:43', '2017-06-14 21:46:43', '\0', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', null, null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, null, null, null, null, null, '', '', '');
INSERT INTO `phr_health_check` VALUES ('15', null, null, null, null, '1', '2017-06-14 21:47:11', '2017-06-14 21:47:11', '\0', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', null, null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, null, null, null, null, null, '', '', '');
INSERT INTO `phr_health_check` VALUES ('16', '23', null, null, null, '1', '2017-06-15 20:29:24', '2017-06-15 20:29:24', '\0', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, null, null, '', null, '', null, '', '', '', null, null, '', '', '', null, '', null, '', '', null, null, '', null, null, null, null, '', '', '', '', null, null, null, '', null, '', null, '', null, '', null, null, '', null, '', '', null, null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', '', null, '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, '', null, '', null, '', null, '', null, '', null, '', null, '', null, null, null, null, null, null, null, null, '', '', '');
