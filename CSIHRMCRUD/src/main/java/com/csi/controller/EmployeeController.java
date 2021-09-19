package com.csi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@GetMapping("/")
	public List<Employee> getAllData() {
		return employeeServiceImpl.getAllData();
	}

	@GetMapping("/{empId}")
	public Optional<Employee> getDataById(@PathVariable long empId) {
		return employeeServiceImpl.getDataById(empId);
	}

	@PostMapping("/")
	public Employee saveData(@RequestBody Employee employee) {
		return employeeServiceImpl.saveData(employee);
	}

	@PutMapping("/{empId}")
	public Employee updateData(@PathVariable long empId, @RequestBody Employee employee) {
		return employeeServiceImpl.updateData(empId, employee);
	}

	@DeleteMapping("/{empId}")
	public String deleteData(@PathVariable long empId) {
		employeeServiceImpl.deleteData(empId);
		return "Data deleted Successfully";
	}
}
