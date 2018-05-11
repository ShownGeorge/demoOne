package com.yaorange.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConvert implements Converter<String, Date>{

	public Date convert(String source) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return sdf.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
			return new Date();
		}
	}
	
}
