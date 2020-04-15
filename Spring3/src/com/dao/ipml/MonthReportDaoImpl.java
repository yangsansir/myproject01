package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;

import com.dao.MonthReportDao;
import com.entities.CarPayment;
import com.entities.MonthReport;

public class MonthReportDaoImpl implements MonthReportDao {
	private SessionFactory sessionFactory;
	@Override
	public void add(MonthReport monthReport) {
		Session session=sessionFactory.getCurrentSession();
		session.save(monthReport);

	}

	@Override
	public List<MonthReport> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(MonthReport.class);
		 int startRow=(currentPage-1)*pageSize;
		 criteria.setFirstResult(startRow);
		 criteria.setMaxResults(pageSize);
		List<MonthReport> monthReportlist=criteria.list();
				return monthReportlist;
		
	}

	@Override
	public void delete(MonthReport monthReport) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(monthReport);

	}

	@Override
	public MonthReport findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		MonthReport monthReport=(MonthReport) session.get(MonthReport.class, id);
		return monthReport;
	}

	@Override
	public void update(MonthReport monthReport) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(monthReport);

	}

	@SuppressWarnings("unchecked")
	@Override
	public int getTotle() {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(MonthReport.class);
		List<MonthReport> monthReportlist=criteria.list();		
		return monthReportlist.size();
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
		String sql="select SUM(monthIncomeCount) FROM monthreport";
		double totle2 =(Double) session.createSQLQuery(sql).uniqueResult();
		return totle2;
	}

	@Override
	public double Outtotle() {
		Session session=sessionFactory.getCurrentSession();
		String sql="select SUM(monthPayCount) FROM monthreport";
		double totle1 =(Double) session.createSQLQuery(sql).uniqueResult();
	 
		return totle1;
		
	}

}
