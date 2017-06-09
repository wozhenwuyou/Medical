package com.lhfeiyu.action.convert;

import org.apache.commons.lang.StringUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component("arrayParamToStringConvert")
public class ArrayParamToStringConvert implements Converter<String[], String> {

	@Override
	public String convert(String[] stringArray) {
		if (stringArray == null || stringArray.length == 0)
			return "";
		return StringUtils.join(stringArray, ",");
	}

}
