package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.model.Employee;
import com.zensar.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp")
public class EmpController 
{
	@Autowired
	EmployeeRepository emprepo;
	
	@GetMapping(value="/allemp")
	public List<Employee>getAllEmp()
	{
		return emprepo.findAll();
	}
	
	/*
	 * @GetMapping(value="/{name}") public
	 * List<Employee>getEmpByName(@PathVariable("name") final String name) { return
	 * emprepo.findByName(name); }
	 */
	
	/*
	 * @GetMapping(value="/id/{id}") public Employee getEmpById(@PathVariable("id")
	 * final Integer EmpId) { Optional<Employee> emp = this.emprepo.findById(EmpId);
	 * if (emp.isPresent()) { return emp.get(); } else { return null; }
	 
	}*/
	
	@PostMapping(value="/saveemp")
	public List<Employee>saveemp(@RequestBody final Employee emp1)
	{
		emprepo.save(emp1);
		return emprepo.findAll();
	}
	
}
