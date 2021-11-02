package com.bridgelabz.employeepayrollapp.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController 
{
	
	@RequestMapping({"","/","/get"})
	public ResponseEntity<ResponseDTO>  getEmployeePayrollData(){
		EmployeePayrollData employeePayrollData=null;
		employeePayrollData= new EmployeePayrollData(1,new EmployeePayrollDTO("Shruthi", 3000));
		ResponseDTO respDTO=new ResponseDTO("Get call Success",employeePayrollData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}								
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId){
		EmployeePayrollData employeePayrollData=null;
		employeePayrollData= new EmployeePayrollData(1,new EmployeePayrollDTO("Shruthi", 3000));
		ResponseDTO respDTO=new ResponseDTO("Get call for ID Success",employeePayrollData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO)
	{
		EmployeePayrollData employeePayrollData=null;
		employeePayrollData= new EmployeePayrollData(1,empPayrollDTO);
		ResponseDTO respDTO=new ResponseDTO("Created Employee Payroll Data Successfully",employeePayrollData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update") 
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO){
		EmployeePayrollData employeePayrollData=null;
		employeePayrollData= new EmployeePayrollData(1,empPayrollDTO);
		ResponseDTO respDTO=new ResponseDTO("Updated Employee Payroll Data Successfully",employeePayrollData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully","Deleted Id:"+empId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
