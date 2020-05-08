package com.zensar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Employee")
@Entity
public class Employee 
{
	@Id
	@GeneratedValue
	private int EmpId;
	private String EmpName;
	private String EmpAddress;
	
	
	public Employee()
	{
		
	}
	
	public Employee(int empId, String empName, String empAddress) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpAddress = empAddress;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpAddress() {
		return EmpAddress;
	}
	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}

	
}




