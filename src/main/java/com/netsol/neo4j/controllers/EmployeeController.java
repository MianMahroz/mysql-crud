package com.netsol.neo4j.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import static com.netsol.neo4j.utill.NetsolUtill.*;

import com.netsol.neo4j.dto.EmployeeDto;
import com.netsol.neo4j.services.EmployeeService;
import com.netsol.neo4j.vo.EmployeeVo;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/api/employee")
	public @ResponseBody ResponseEntity saveEmployee(@RequestBody EmployeeVo employeeVo) {
		EmployeeDto employeeDto = employeeService.saveEmployee(getMapper().map(employeeVo, EmployeeDto.class));
		return new ResponseEntity(employeeDto, HttpStatus.CREATED);
	}
}
