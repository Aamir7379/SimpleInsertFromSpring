package com.jsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsoft.model.Employee;
import com.jsoft.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
@Autowired
EmployeeRepository employeeRepository;
public void Insert(Employee emp) {
	employeeRepository.insert(emp);
}	
}
