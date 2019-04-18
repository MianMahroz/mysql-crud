package com.netsol.neo4j.utill;

import org.apache.catalina.mapper.Mapper;
import org.apache.commons.lang3.RandomStringUtils;
import org.modelmapper.ModelMapper;

public class NetsolUtill {

	static ModelMapper mapper;

	public static ModelMapper getMapper() {
		if (mapper == null) {
			mapper = new ModelMapper();
			return mapper;
		} else {
			return mapper;
		}
	}

	public static String genearteRandomNo(String prefix) {
		return prefix + "-" + RandomStringUtils.randomNumeric(6) + "-"
				+ RandomStringUtils.randomAlphabetic(3).toUpperCase();
	}
}
