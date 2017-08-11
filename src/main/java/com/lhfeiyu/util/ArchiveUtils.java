package com.lhfeiyu.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;

/**
 * 档案工具类
 * 
 * @author （zouwenji）
 *
 */
public abstract class ArchiveUtils {

	/**
	 * 生成档案编号
	 * 
	 * @return
	 */
	// A,D,H,U
	public static String generateArchiveNum(String A_D_H_U, Integer A_D_H_U_id) {
		// 诊所id，医生id，那一天，第几个
		if (StringUtils.isBlank(A_D_H_U)) {
			A_D_H_U = "U";
		}
		if (A_D_H_U_id == null || A_D_H_U_id.intValue() <= 0) {
			A_D_H_U_id = new Random().nextInt(999) + 1;
		}
		return A_D_H_U + "-" + StringUtils.leftPad(String.valueOf(A_D_H_U_id), 9, "0") + "-"
				+ new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "-" + (new Random().nextInt(99999) + 1);
	}

}
