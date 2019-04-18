package com.netsol.neo4j.services;

import org.springframework.stereotype.Service;

import com.netsol.neo4j.dto.EmployeeDto;

@Service
public interface EmployeeService {

	public EmployeeDto saveEmployee(EmployeeDto employeeDto);
	
}
