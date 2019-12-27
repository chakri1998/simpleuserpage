package com.mindtree.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.employee.entity.Employee;
import com.mindtree.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/")
	public String index(Model model) {
//		System.out.println(employee);
//		List<Employee> employees= employeeService.listAll();
//		System.out.println(employees);
//		model.addAttribute("employees",employees);
		return "index";
	}

	@RequestMapping("/addemployee")
	public String addEmployee() {
		return "addemployee";
	}

	@PostMapping("/name")
	public String getName(/*
							 * @RequestParam("employeeId") String employeeId,
							 * 
							 * @RequestParam("employeeName") String
							 * employeeName, @RequestParam("designation") String designation,
							 * 
							 *@RequestParam("gender") String gender,*/
							  Employee employee, Model model) {

		/*
		 * employee.setEmployeeId(Integer.parseInt(employee.getEmployeeId()));
		 * employee.setEmployeeName(employeeName); employee.setDesignation(designation);
		 * employee.setGender(gender);
		 */

		model.addAttribute("employeeId", employee.getEmployeeId());
		model.addAttribute("employeeName", employee.getEmployeeName());
		model.addAttribute("designation", employee.getDesignation());
		model.addAttribute("gender", employee.getGender());
//		System.out.println(employee);
		employeeService.setEmployeeDetailsIntoDataBase(employee);

		return "name";
	}

	@RequestMapping("/gett")
	public String getEmployee() {
		return "getname";
	}

	@GetMapping("/getname")
	public ModelAndView getName_(@RequestParam int employeeId) {
		ModelAndView mv = new ModelAndView("name");
		Employee employee = employeeService.getEmployee(employeeId);
		mv.addObject("employeeId", employee.getEmployeeId());
		mv.addObject("employeeName", employee.getEmployeeName());
		mv.addObject("designation", employee.getDesignation());
		mv.addObject("gender", employee.getGender());
		System.out.println(mv);
		return mv;
	}

	@GetMapping("/getnames")
	public String getNames(Model model) {
		List<Employee> employees = employeeService.getEmployees();
		model.addAttribute("employees", employees);
		return "names";
	}

	@RequestMapping("/delet")
	public String deleteEmployee() {
		return "deleteemployee";
	}

	@GetMapping("/deletename")
	public ModelAndView getEmployeeToDeleteFromDatabase(@RequestParam("employeeId") String employeeId) {
		ModelAndView mv = new ModelAndView("delete");
		Employee employee = employeeService.getId(Integer.parseInt(employeeId));
		mv.addObject("employeeId", employee.getEmployeeId());
		mv.addObject("employeeName", employee.getEmployeeName());
		mv.addObject("designation", employee.getDesignation());
		mv.addObject("gender", employee.getGender());
		return mv;

	}

}
