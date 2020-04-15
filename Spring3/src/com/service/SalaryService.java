package com.service;

import java.util.List;

import com.entities.Salary;

public interface SalaryService {
	public void addMessages(Salary salary );
	public List<Salary> findAll(int currentPage,int pageSize);
	public void deleteMessages(Salary salary );
	public Salary findById(Integer id);
	public void updateMessages(Salary salary);
	public int getTotle();
	public Double Totle();
}
