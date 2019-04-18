
package com.netsol.neo4j.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

@Entity
@Table(catalog = "organization", name = "company")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "companyId", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer companyId;
	/**
	 */

	@Column(name = "name", length = 450)
	@Basic(fetch = FetchType.EAGER)
	String name;

	@OneToMany(mappedBy = "company", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	java.util.Set<Employee> employees;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(java.util.Set<Employee> employees) {
		this.employees = employees;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
