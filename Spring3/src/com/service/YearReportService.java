package com.service;

import java.util.List;

import com.entities.YearReport;

public interface YearReportService {
	public  void addCarType(YearReport yearReport);
	public  List<YearReport> findAll(int currentPage,int pageSize);

	public void delete(YearReport yearReport );
	public YearReport findById(Integer id);
	public void update(YearReport yearReport);
	public int getTotle();
	public double Intotle();
	public double Outtotle();
}
