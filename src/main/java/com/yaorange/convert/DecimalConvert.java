package com.yaorange.convert;

import java.math.BigDecimal;

import org.springframework.core.convert.converter.Converter;

public class DecimalConvert implements Converter<String, BigDecimal>{

	public BigDecimal convert(String source) {
		BigDecimal bigDecimal = new BigDecimal(source);
		return bigDecimal;
	}

}
