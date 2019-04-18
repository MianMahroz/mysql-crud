package com.netsol.neo4j.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static com.netsol.neo4j.utill.NetsolUtill.*;

import com.netsol.neo4j.domain.Company;
import com.netsol.neo4j.dto.CompanyDto;
import com.netsol.neo4j.repositories.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepo;

	@Override
	public CompanyDto saveCompany(CompanyDto companyDto) {
		Company company = getMapper().map(companyDto, Company.class);
		System.out.println(company.toString());
		company = companyRepo.save(company);
		return getMapper().map(company, CompanyDto.class);
	}

}
