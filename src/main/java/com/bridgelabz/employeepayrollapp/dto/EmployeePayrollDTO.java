package com.bridgelabz.employeepayrollapp.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.ToString;

public @ToString class EmployeePayrollDTO {
	
	@NotEmpty(message="Employee name cannot be null")
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee name Invalid")
	public String name;
	
	@Min(value=500, message="Min Wage should be more than 500")
	public long salary;
	
	@Pattern(regexp="male|female",message="Gender needs to be male or female")
	public String gender;
	
	@JsonFormat(pattern="dd MMM yyyy")
	@NotNull(message="Start date should not be empty")
	@PastOrPresent(message = "Start date should be past or todays date")
	public LocalDate startDate;
	
	@NotBlank(message = "Note cannot be empty")
	public String note;
	
	@NotBlank(message = "ProfilePic cannot be empty")
	public String profilePic;
	
	@NotNull(message= "department should not be empty")
	public List<String> department;
	
}
