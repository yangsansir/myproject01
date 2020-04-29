package com.dao;

import java.util.List;

import com.entities.Employee;
import com.entities.Function;

public interface EmployeeDao {
public void addEmployee( Employee employee );
public Employee login(String LoginName,String Password);
public List<Function> getFunctionByRoleId();
public  List<Employee> findAll(int currentPage,int pageSize);
public  Employee findById(Integer id);
public  void updateEmployee(Employee employee);
public  void delete(Employee employee); 
public int getTotle();
public  List<Employee> query(String keyWord);
}
