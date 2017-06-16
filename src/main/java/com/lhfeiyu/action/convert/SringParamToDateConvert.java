package com.lhfeiyu.action.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component("stringParamToDateConvert")
public class SringParamToDateConvert implements Converter<String, Date> {
	
	private static final SimpleDateFormat FMT1 = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public Date convert(String param) {
		if (StringUtils.isBlank(param)){
			return null;
		}
		try {
			return FMT1.parse(param);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
