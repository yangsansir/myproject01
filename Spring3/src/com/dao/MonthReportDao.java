package com.dao;

import java.util.List;


import com.entities.MonthReport;

public interface MonthReportDao {
	public  void add(MonthReport monthReport);
	public  List<MonthReport> findAll(int currentPage,int pageSize);

	public void delete(MonthReport monthReport );
	public MonthReport findById(Integer id);
	public void update(MonthReport monthReport);
	public int getTotle();
	public double Intotle();
	public double Outtotle();
}
