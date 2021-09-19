package com.csi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepository;

@Component
public class EmployeeDaoImpl {

	@Autowired
	EmployeeRepository employeeRepositoryImpl;

	public List<Employee> getAllData() {
		return employeeRepositoryImpl.findAll();
	}

	public Optional<Employee> getDataById(long empId) {
		return employeeRepositoryImpl.findById(empId);
	}

	public Employee saveData(Employee employee) {
		return employeeRepositoryImpl.save(employee);
	}

	public Employee updateData(long empId, Employee employee) {
		Employee empData = new Employee();
		for (Employee emp : employeeRepositoryImpl.findAll()) {
			if (emp.getEmpId() == empId) {
				empData.setEmpId(empId);
				empData.setEmpFirstName(employee.getEmpFirstName());
				empData.setEmpLastName(employee.getEmpLastName());
				empData.setEmpEmailId(employee.getEmpEmailId());
				empData = employeeRepositoryImpl.save(empData);
			}
		}

		return empData;
	}
	
	public void deleteData(long empId)
	{
		employeeRepositoryImpl.deleteById(empId);
	}
}
