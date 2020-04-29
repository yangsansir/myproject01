package com.service.impl;

import java.util.List;

import com.dao.YearReportDao;
import com.entities.YearReport;
import com.service.YearReportService;

public class YearReportServiceImpl implements YearReportService {
private YearReportDao yearReportDao;
	@Override
	public void addCarType(YearReport yearReport) {
		yearReportDao.add(yearReport);

	}

	@Override
	public List<YearReport> findAll(int currentPage, int pageSize) {
		List<YearReport> yearReportlist=yearReportDao.findAll(currentPage, pageSize);
		return yearReportlist;
	}

	@Override
	public void delete(YearReport yearReport) {
		yearReportDao.delete(yearReport);

	}

	@Override
	public YearReport findById(Integer id) {
		YearReport yearReport=yearReportDao.findById(id);
		return yearReport;
	}

	@Override
	public void update(YearReport yearReport) {
		yearReportDao.update(yearReport);

	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return yearReportDao.getTotle();
	}

	public YearReportDao getYearReportDao() {
		return yearReportDao;
	}

	public void setYearReportDao(YearReportDao yearReportDao) {
		this.yearReportDao = yearReportDao;
	}

	@Override
	public double Intotle() {
		// TODO Auto-generated method stub
		return yearReportDao.Intotle();
	}

	@Override
	public double Outtotle() {
		// TODO Auto-generated method stub
		return yearReportDao.Outtotle();
	}

}
