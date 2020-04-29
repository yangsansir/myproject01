package com.service.impl;

import java.util.List;

import com.dao.EmployeeDao;
import com.entities.Employee;
import com.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;

	@Override
	public void addEmployee(Employee employee) {

		employeeDao.addEmployee(employee);
	}

	@Override
	public Employee login(String LoginName, String Password) {
		Employee employee = employeeDao.login(LoginName, Password);
		return employee;
	}

	@Override
	public List<Employee> findAll(int currentPage, int pageSize) {
		List<Employee> employeelist = employeeDao
				.findAll(currentPage, pageSize);
		return employeelist;
	}

	@Override
	public Employee findById(Integer id) {
		Employee employee = employeeDao.findById(id);
		return employee;
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);

	}

	@Override
	public void delete(Employee employee) {
		employeeDao.delete(employee);

	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public int getTotle() {

		return employeeDao.getTotle();
	}

	@Override
	public List<Employee> query(String keyWord) {
		List<Employee> employeelist1 = employeeDao.query(keyWord);
		return employeelist1;
	}
}
