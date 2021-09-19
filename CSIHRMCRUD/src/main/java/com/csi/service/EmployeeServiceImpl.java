package com.csi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import com.csi.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	@Autowired
	EmployeeDaoImpl employeeDaoImpl;

	public List<Employee> getAllData() {
		return employeeDaoImpl.getAllData();
	}

	public Optional<Employee> getDataById(long empId) {
		return employeeDaoImpl.getDataById(empId);
	}

	public Employee saveData(Employee employee) {
		return employeeDaoImpl.saveData(employee);
	}

	public Employee updateData(long empId, Employee employee) {
		return employeeDaoImpl.updateData(empId, employee);
	}

	public void deleteData(long empId) {
		employeeDaoImpl.deleteData(empId);
	}

}
