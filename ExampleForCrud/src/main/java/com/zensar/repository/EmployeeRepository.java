package com.zensar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//Employee findOne(Integer id);

	

}
