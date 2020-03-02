package com.jsift.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsoft.model.Employee;
import com.jsoft.service.EmployeeService;


@Controller
@RequestMapping("user")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
@RequestMapping("/show")
public String show(Model model){
	model.addAttribute("emp",new Employee());
	return "registration";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute("emp") Employee emp) {
	employeeService.Insert(emp);
	return "registration";
	}
}
