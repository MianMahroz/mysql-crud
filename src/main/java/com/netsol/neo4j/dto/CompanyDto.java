package com.netsol.neo4j.dto;

import java.util.ArrayList;
import java.util.List;


import com.netsol.neo4j.domain.Employee;

public class CompanyDto {

	private String name;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CompanyDto() {
	}

	@Override
	public String toString() {
		return "CompanyDto [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
