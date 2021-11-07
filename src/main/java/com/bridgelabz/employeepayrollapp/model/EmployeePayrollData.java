package com.bridgelabz.employeepayrollapp.model;

import java.util.List;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;

public @Data class EmployeePayrollData {
	
	private int employeeId;
	private String name;
	private long salary;
	public String gender;
	public String startDate;
	public String note;
	public String profilePic;
	public List<String> department;
	
	public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO) {
		super();
		this.employeeId = employeeId;
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
		this.gender = employeePayrollDTO.gender;
		this.startDate = employeePayrollDTO.startDate;
		this.note = employeePayrollDTO.note;
		this.profilePic = employeePayrollDTO.profilePic;
		this.department = employeePayrollDTO.department;
	}
	public EmployeePayrollData() {}
	
}
