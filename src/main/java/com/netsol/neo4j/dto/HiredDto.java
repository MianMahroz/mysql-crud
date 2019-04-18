package com.netsol.neo4j.dto;

import java.time.Instant;


import com.netsol.neo4j.domain.Company;
import com.netsol.neo4j.domain.Employee;

public class HiredDto {

	private Long id;
	private Instant hiringDate;
	private String dept;
	private String interviewedBy;
	private String approvedBy;
	private String reportingManager;
	private String company;
	private String employee;

	public HiredDto() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	
}
