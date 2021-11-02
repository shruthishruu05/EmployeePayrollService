package com.bridgelabz.employeepayrollapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		List<EmployeePayrollData> empDataList = new ArrayList<>();
		empDataList.add(new EmployeePayrollData(1,new EmployeePayrollDTO("Shruthi", 3000)));
		return empDataList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = new EmployeePayrollData(1,new EmployeePayrollDTO("Shruthi", 3000));
		return employeePayrollData;							
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		
	}
	
	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empDTO) {
		EmployeePayrollData empData=null;
		empData = new EmployeePayrollData(1,empDTO);
	
		return empData;	
	}

	@Override
	public EmployeePayrollData updatedEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData=null;
		empData = new EmployeePayrollData(1,empPayrollDTO);
		return null;
	}

	

}