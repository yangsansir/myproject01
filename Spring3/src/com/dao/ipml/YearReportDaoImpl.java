package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.YearReportDao;
import com.entities.MonthReport;
import com.entities.YearReport;

public class YearReportDaoImpl implements YearReportDao {
	private SessionFactory sessionFactory;
	@Override
	public void add(YearReport yearReport) {
		Session session=sessionFactory.getCurrentSession();
		session.save(yearReport);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<YearReport> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(YearReport.class);
		 int startRow=(currentPage-1)*pageSize;
		 criteria.setFirstResult(startRow);
		 criteria.setMaxResults(pageSize);
		List<YearReport> yearReportlist=criteria.list();
				return yearReportlist;
		
	}

	@Override
	public void delete(YearReport yearReport) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(yearReport);

	}

	@Override
	public YearReport findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		YearReport yearReport=(YearReport) session.get(YearReport.class, id);
		return yearReport;
		
	}

	@Override
	public void update(YearReport yearReport) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(yearReport);

	}

	@SuppressWarnings("unchecked")
	@Override
	public int getTotle() {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(YearReport.class);
		List<YearReport> yearReportlist=criteria.list();
				return yearReportlist.size();
}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public double Intotle() {
		Session session=sessionFactory.getCurrentSession();
		String sql="select SUM(yearIncomeCount) FROM yearreport";
		double totle1 =(Double) session.createSQLQuery(sql).uniqueResult();
		return totle1;
		
	}

	@Override
	public double Outtotle() {
		Session session=sessionFactory.getCurrentSession();
		String sql="select SUM(yearPayCount) FROM yearreport";
		double totle2 =(Double) session.createSQLQuery(sql).uniqueResult();
		return totle2;
	}
	
}