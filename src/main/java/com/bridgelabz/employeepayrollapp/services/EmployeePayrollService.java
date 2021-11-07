	package com.bridgelabz.employeepayrollapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.exceptions.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService {

	@Autowired
	private EmployeePayrollRepository employeePayrollRepository;
	
	private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		return employeePayrollRepository.findAll();
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		return employeePayrollRepository
				.findById(empId)
				.orElseThrow(() ->new EmployeePayrollException("Employee with employeeId " +empId +" not found!"));
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		EmployeePayrollData empData=this.getEmployeePayrollDataById(empId);
		employeePayrollRepository.delete(empData);
	}
	
	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empDTO) {
		EmployeePayrollData empData=null;
		empData = new EmployeePayrollData(empDTO);
		log.debug("Emp Data :"+empData.toString());
		return employeePayrollRepository.save(empData);	
	}

	@Override
	public EmployeePayrollData updatedEmployeePayrollData(int empId,EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData=this.getEmployeePayrollDataById(empId);
		empData.updateEmployeePayrollData(empPayrollDTO);
		return employeePayrollRepository.save(empData);
		
	}

	@Override
	public List<EmployeePayrollData> findEmployeeByDepartment(String department) {
		
		return employeePayrollRepository.findEmployeeByDepartment(department);
	}

	

}