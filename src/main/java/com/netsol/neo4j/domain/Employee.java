
package com.netsol.neo4j.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "organization", name = "employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	/**
	 */

	@Column(name = "name", length = 225)
	@Basic(fetch = FetchType.EAGER)
	String name;
	/**
	 */

	@Column(name = "salary", precision = 12)
	@Basic(fetch = FetchType.EAGER)
	BigDecimal salary;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "companyId", referencedColumnName = "companyId") })
	@JsonBackReference
	Company company;

	
	@Column
	private Instant hiringDate;
	@Column
	private String dept;
	@Column
	private String interviewedBy;
	@Column
	private String approvedBy;
	@Column
	private String reportingManager;
	
	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
	}

	/**
	 */
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	/**
	 */
	public BigDecimal getSalary() {
		return this.salary;
	}

	/**
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 */
	public Employee() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Employee that) {
		setId(that.getId());
		setName(that.getName());
		setSalary(that.getSalary());
		setCompany(that.getCompany());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("salary=[").append(salary).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee equalCheck = (Employee) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}

	public Instant getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(Instant hiringDate) {
		this.hiringDate = hiringDate;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getInterviewedBy() {
		return interviewedBy;
	}

	public void setInterviewedBy(String interviewedBy) {
		this.interviewedBy = interviewedBy;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
