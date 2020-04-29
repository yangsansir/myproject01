package com.service.impl;

import java.util.List;

import com.dao.MonthReportDao;
import com.entities.MonthReport;
import com.service.MonthReportService;

public class MonthReportServiceImpl implements MonthReportService {
private  MonthReportDao monthReportDao;
	@Override
	public void add(MonthReport monthReport) {
		monthReportDao.add(monthReport);
	}

	@Override
	public List<MonthReport> findAll(int currentPage, int pageSize) {
		List<MonthReport> monthReportlist=monthReportDao.findAll(currentPage, pageSize);
		return monthReportlist;
	}

	@Override
	public void delete(MonthReport monthReport) {
		monthReportDao.delete(monthReport);

	}

	@Override
	public MonthReport findById(Integer id) {
		MonthReport monthReport=monthReportDao.findById(id);
		return monthReport;
	}

	@Override
	public void update(MonthReport monthReport) {
		monthReportDao.update(monthReport);

	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return monthReportDao.getTotle();
	}

	public MonthReportDao getMonthReportDao() {
		return monthReportDao;
	}

	public void setMonthReportDao(MonthReportDao monthReportDao) {
		this.monthReportDao = monthReportDao;
	}

	@Override
	public double Intotle() {
		
		return monthReportDao.Intotle();
	}

	@Override
	public double Outtotle() {
		// TODO Auto-generated method stub
		return monthReportDao.Outtotle();
	}

}
