package com.netsol.neo4j.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netsol.neo4j.domain.Company;
import com.netsol.neo4j.dto.CompanyDto;
import com.netsol.neo4j.dto.ProductForm;
import com.netsol.neo4j.exception.BadRequestException;
import com.netsol.neo4j.repositories.CompanyRepository;
import com.netsol.neo4j.repositories.EmployeeRepository;
import com.netsol.neo4j.services.CompanyService;
import com.netsol.neo4j.vo.CompanyVo;
import static com.netsol.neo4j.utill.NetsolUtill.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@Autowired
	private CompanyRepository companyRepo;

	@PostMapping("/company")
	public @ResponseBody ResponseEntity saveCompany(@RequestBody CompanyVo companyVo) throws BadRequestException {

		if (companyVo.getName() == null || companyVo.getName().isEmpty())
			throw new BadRequestException("Company name is required!");

		CompanyDto companyDto = companyService.saveCompany(getMapper().map(companyVo, CompanyDto.class));
		return new ResponseEntity(companyDto, HttpStatus.CREATED);
	}

	@GetMapping("/companies")
	public Iterable<Company> getAll() {
		return companyRepo.findAll();
	}

}
