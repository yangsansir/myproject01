package com.service.impl;

import java.util.List;

import com.dao.SalaryDao;
import com.entities.Salary;
import com.service.SalaryService;

public class SalaryServiceImpl implements SalaryService {
private SalaryDao salaryDao;
	@Override
	public void addMessages(Salary salary) {
	salaryDao.addMessages(salary);

	}

	@Override
	public List<Salary> findAll(int currentPage, int pageSize) {
		List<Salary>  salarylist=salaryDao.findAll(currentPage, pageSize);
		return salarylist;
	}

	@Override
	public void deleteMessages(Salary salary) {
		salaryDao.deleteMessages(salary);

	}

	@Override
	public Salary findById(Integer id) {
		Salary salary=salaryDao.findById(id);
		return salary;
	}

	@Override
	public void updateMessages(Salary salary) {
		salaryDao.updateMessages(salary);

	}

	public SalaryDao getSalaryDao() {
		return salaryDao;
	}

	public void setSalaryDao(SalaryDao salaryDao) {
		this.salaryDao = salaryDao;
	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return salaryDao.getTotle();
	}

	@Override
	public Double Totle() {
		// TODO Auto-generated method stub
		return salaryDao.Totle();
	}

}
