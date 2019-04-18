package com.netsol.neo4j.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.netsol.neo4j.domain.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {

	@Query(value = "SELECT * FROM company where name=?1",nativeQuery = true)
	public Company getCompantByName(String name);
}
