package com.jsoft.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jsoft.model.Employee;

@Repository
@Transactional
public class EmployeeRepository {
	@Autowired
	SessionFactory sessionFactory;
public void insert(Employee emp) {
	Session session=sessionFactory.getCurrentSession();
	emp.setId(0);
	session.save(emp);
}
}
