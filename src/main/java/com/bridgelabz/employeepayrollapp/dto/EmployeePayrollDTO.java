package com.bridgelabz.employeepayrollapp.dto;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class EmployeePayrollDTO {
	
	@NotEmpty(message="Employee name cannot be null")
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee name Invalid")
	public String name;
	
	@Min(value=500, message="Min Wage should be more than 500")
	public long salary;
	
	public String gender;
	public String startDate;
	public String note;
	public String profilePic;
	public List<String> department;
	
}
