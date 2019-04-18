package com.netsol.neo4j.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netsol.neo4j.domain.Company;
import com.netsol.neo4j.domain.Employee;
import com.netsol.neo4j.repositories.CompanyRepository;
import com.netsol.neo4j.repositories.EmployeeRepository;
import static com.netsol.neo4j.utill.NetsolUtill.*;

import java.time.Instant;

@RestController
public class InsertDataController {

	@Autowired
	private EmployeeRepository employeeRepo;
	@Autowired
	private CompanyRepository companyRepo;

	Company company;
	Employee employee;

	@GetMapping("/insertData")
	public String insertDate() {

		company = companyRepo.getCompantByName("Netsol");
		if (company == null) {
			System.out.println("Inside New Company");
			Company companyNew = new Company();
			companyNew.setName("Netsol");
			company = companyRepo.save(companyNew);
		}

		employee = new Employee();
		employee.setName(genearteRandomNo("Emp"));
		employee.setCompany(company);
		employee.setApprovedBy(genearteRandomNo("ApprovedBy"));
		employee.setDept(genearteRandomNo("dept"));
		employee.setHiringDate(Instant.now());
		employee.setInterviewedBy(genearteRandomNo("InterviewBy"));
		employee.setReportingManager(genearteRandomNo("reportingManager"));
		employee = employeeRepo.save(employee);

		return "";
	}

	@GetMapping("/test")
	public void test() {
		for (int i = 0; i <= 1000; i++) {
			RestTemplate restTemplate = new RestTemplate();
			restTemplate.getForObject("http://localhost:8080/insertData", String.class);
		}
	}
}
