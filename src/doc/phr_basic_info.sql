/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : medical

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2017-05-31 11:17:43
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of phr_basic_info
-- ----------------------------
INSERT INTO `phr_basic_info` VALUES ('14', '周浩然', 'zsr01', '男', '2016-07-07', '341222198809135992', '无', '12345678', '邹文继', '18355855589', '非户籍', '其他', '回族', 'O型', '否', '大学专科及以上', '专业技术人员', '已婚', '新型农村合作医疗', null, '青霉素,磺胺,链霉素', null, '化学品,毒物,射线', '高血压;2017-05-18', '手术1;2017-05-17', '外伤1;2017-05-15', '输血1;2017-05-10', '高血压,糖尿病,冠心病,慢性阻塞性肺疾病,恶性肿瘤,脑卒中,重性精神疾病,结核病,肝炎,先天畸形', '高血压,糖尿病,冠心病,慢性阻塞性肺疾病,恶性肿瘤,脑卒中,重性精神疾病,结核病,肝炎,先天畸形', '高血压,糖尿病,冠心病,慢性阻塞性肺疾病,恶性肿瘤,脑卒中,重性精神疾病,结核病,肝炎,先天畸形', '高血压,糖尿病,冠心病,慢性阻塞性肺疾病,恶性肿瘤,脑卒中,重性精神疾病,结核病,肝炎,先天畸形', '32', '视力残疾,听力残疾,言语残疾,肢体残疾,智力残疾,精神残疾,其他残疾', '油烟机,换气扇,烟囱', '液化气,煤,天然气,沼气 ,柴火,其他', '自来水,经净化过滤的水,井水,河湖水,塘水,其他', '卫生厕所,一格或二格粪池式,马桶,露天粪坑,简易棚厕', '单设,室内,室外', '1', '2017-05-27 23:12:38', '2017-05-30 22:58:12', '1', '13', '1');
INSERT INTO `phr_basic_info` VALUES ('15', '测试用户', '12306', '男', '2016-07-05', '341222198809135992', '263企业通信', '18702827609', '邹文继', '18355855589', '非户籍', '汉族', '', 'O型', '否', '大学专科及以上', '国家机关、党群组织、企业、事业单位负责人', '未婚', '全自费', null, '青霉素,磺胺,链霉素', null, '化学品,毒物,射线', '慢性阻塞性肺疾病;2017-06-02,高血压;2017-05-24', '无', '无', '无', '高血压,糖尿病,冠心病,慢性阻塞性肺疾病,恶性肿瘤,脑卒中,重性精神疾病,结核病,肝炎,先天畸形', '高血压,糖尿病,冠心病,慢性阻塞性肺疾病,恶性肿瘤,脑卒中,重性精神疾病,结核病,肝炎,先天畸形', '高血压,糖尿病,冠心病,慢性阻塞性肺疾病,恶性肿瘤,脑卒中,重性精神疾病,结核病,肝炎,先天畸形', '高血压,糖尿病,冠心病,慢性阻塞性肺疾病,恶性肿瘤,脑卒中,重性精神疾病,结核病,肝炎,先天畸形', '1,2,3', '视力残疾,听力残疾,言语残疾,肢体残疾,智力残疾,精神残疾,其他残疾', '油烟机,换气扇,烟囱', '液化气,煤,天然气,沼气 ,柴火,其他', '自来水,经净化过滤的水,井水,河湖水,塘水,其他', '卫生厕所,一格或二格粪池式,马桶,露天粪坑,简易棚厕', '单设,室内,室外', '1', '2017-05-28 09:25:39', '2017-05-30 22:58:11', '1', '1', '1');
INSERT INTO `phr_basic_info` VALUES ('16', '张三', '00004', '男', '2017-05-31', '341222198809135992', '无', '18355855589', '', '', '户籍', '汉族', '', 'B型', '不详', '文盲及半文盲', '国家机关、党群组织、企业、事业单位负责人,专业技术人员', '未婚', '贫困救助,商业医疗保险', '', '青霉素,磺胺', '', '', '高血压;2017-05-30', '无1;2017-05-24', '无2;2017-05-17', '无3;2017-05-11', '父亲;糖尿病', '母亲;慢性阻塞性肺疾病', '兄弟姐妹;恶性肿瘤', '子女;先天畸形', '但是', '听力残疾,智力残疾,精神残疾', '油烟机,换气扇,烟囱', '煤,天然气,沼气,柴火,其他', '河湖水', '一格或二格粪池式,马桶,露天粪坑', '室内,室外', null, '2017-05-29 16:42:47', '2017-05-30 22:58:11', '1', null, '1');
INSERT INTO `phr_basic_info` VALUES ('17', 'xxx', 'xxx', '男', '2017-05-23', '无', '无', 'xx', 'xx', 'xx', '户籍', '汉族', '', 'O型', '不详', '小学', '商业、服务业人员,农、林、牧、渔、水利业生产人员', '丧偶', '新型农村合作医疗,贫困救助', '', '链霉素', '', '', '无', '无', '无', '无', null, null, null, null, '无', '视力残疾,精神残疾', '油烟机', '煤', '经净化过滤的水', '一格或二格粪池式', '室外', null, '2017-05-29 16:44:16', '2017-05-30 22:58:11', '1', null, '1');
INSERT INTO `phr_basic_info` VALUES ('18', 'cccc', 'ccc', '男', '2017-05-16', 'cc', '无', 'cc', 'cc', 'cc', '户籍', '汉族', '', '不详', '不详', '初中', '办事人员和有关人员,商业、服务业人员', '已婚', '城镇职工基本医疗保险,城镇居民基本医疗保险', '', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '无', '视力残疾,精神残疾', '油烟机', '煤', '经净化过滤的水', '一格或二格粪池式', '室内,室外', null, '2017-05-29 16:45:31', '2017-05-30 22:58:10', '1', null, '1');
INSERT INTO `phr_basic_info` VALUES ('19', 'ff', 'ff', '男', '2017-05-31', 'sdd', 'dwe', 'sdsd', 'sds', 'dsd', '户籍', '汉族', '', 'O型', '不详', '小学', '农、林、牧、渔、水利业生产人员', '已婚', '城镇居民基本医疗保险', '', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '有', '听力残疾,精神残疾', '', '煤', '经净化过滤的水', '一格或二格粪池式', '室外', null, '2017-05-29 16:46:47', '2017-05-30 22:58:10', '1', null, '1');
INSERT INTO `phr_basic_info` VALUES ('20', 'ff', 'ff', '男', '2017-05-31', 'sdd', 'dwe', 'sdsd', 'sds', 'dsd', '户籍', '汉族', '', 'O型', '不详', '小学', '农、林、牧、渔、水利业生产人员', '已婚', '城镇居民基本医疗保险', '', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '有', '听力残疾,精神残疾', '', '煤', '经净化过滤的水', '一格或二格粪池式', '室外', null, '2017-05-29 18:06:34', '2017-05-30 22:58:10', '1', null, '1');
INSERT INTO `phr_basic_info` VALUES ('21', 'ff', 'ff', '男', '2017-05-31', 'sdd', 'dwe', 'sdsd', 'sds', 'dsd', '户籍', '汉族', '', 'O型', '不详', '小学', '农、林、牧、渔、水利业生产人员', '已婚', '城镇居民基本医疗保险', '', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '有', '听力残疾,精神残疾', '', '煤', '经净化过滤的水', '一格或二格粪池式', '室外', null, '2017-05-29 18:08:24', '2017-05-30 22:58:09', '1', null, '1');
INSERT INTO `phr_basic_info` VALUES ('22', 'ff', 'ff', '男', '2017-05-31', 'sdd', 'dwe', 'sdsd', 'sds', 'dsd', '户籍', '汉族', '', 'O型', '不详', '小学', '农、林、牧、渔、水利业生产人员', '已婚', '城镇居民基本医疗保险', '', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '有', '听力残疾,精神残疾', '', '煤', '经净化过滤的水', '一格或二格粪池式', '室外', null, '2017-05-29 18:10:10', '2017-05-30 22:58:09', '1', null, '1');
INSERT INTO `phr_basic_info` VALUES ('23', 'ff', 'ff', '男', '2017-05-31', 'sdd', 'dwe', 'sdsd', 'sds', 'dsd', '户籍', '汉族', '', 'O型', '不详', '小学', '农、林、牧、渔、水利业生产人员', '已婚', '城镇居民基本医疗保险', '', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '有', '听力残疾,精神残疾', '', '煤', '经净化过滤的水', '一格或二格粪池式', '室外', null, '2017-05-29 18:11:17', '2017-05-30 22:58:08', '1', null, '1');
INSERT INTO `phr_basic_info` VALUES ('24', 'ff', 'ff', '男', '2017-05-31', 'sdd', 'dwe', 'sdsd', 'sds', 'dsd', '户籍', '其他', '回族', '不详', '否', '小学', '农、林、牧、渔、水利业生产人员', '已婚', '城镇居民基本医疗保险,其他', '这是什么', '磺胺', '', '', '无', '无', '无', '无', null, null, null, null, '无', '听力残疾,精神残疾', '油烟机,烟囱', '煤,柴火', '经净化过滤的水,塘水', '一格或二格粪池式', '室外', null, '2017-05-29 18:14:54', '2017-05-30 22:58:08', '1', null, '1');
