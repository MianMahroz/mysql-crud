package com.netsol.neo4j.services;

import org.springframework.stereotype.Service;

import com.netsol.neo4j.dto.CompanyDto;

@Service
public interface CompanyService {

	public CompanyDto saveCompany(CompanyDto companyDto);
}
