package com.netsol.neo4j.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netsol.neo4j.domain.Employee;
import com.netsol.neo4j.dto.EmployeeDto;
import com.netsol.neo4j.repositories.EmployeeRepository;
import static com.netsol.neo4j.utill.NetsolUtill.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		Employee employee = getMapper().map(employeeDto, Employee.class);
		employee = employeeRepo.save(employee);
        return getMapper().map(employee, EmployeeDto.class);
	}

}
