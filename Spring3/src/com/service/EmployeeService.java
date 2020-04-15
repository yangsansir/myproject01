package com.service;

import java.util.List;

import com.entities.Employee;

public interface EmployeeService {
	public void addEmployee( Employee employee );
	public Employee login(String LoginName,String Password);
	public  List<Employee> findAll(int currentPage,int pageSize);
	public  Employee findById(Integer id);
	public  void updateEmployee(Employee employee);
	public  void delete(Employee employee); 
	public int getTotle();
	public  List<Employee> query(String keyWord);
}
