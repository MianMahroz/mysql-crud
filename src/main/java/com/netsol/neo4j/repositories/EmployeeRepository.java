package com.netsol.neo4j.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.netsol.neo4j.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	@Query(value = "SELECT * FROM employee where name=?1",nativeQuery = true)
	public Employee getEmployeeByName(String name);
}
