package com.dao.ipml;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.SalaryDao;
import com.entities.Salary;

public class SalaryDaoImpl implements SalaryDao {
private SessionFactory sessionFactory;

	@Override
	public void addMessages(Salary salary) {
		Session session=sessionFactory.getCurrentSession();
		session.save(salary);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Salary> findAll(int currentPage,int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Query query= session.createQuery("from Salary ");
		int startRow=(currentPage-1)*pageSize;
		query.setFirstResult(startRow);
		query.setMaxResults(pageSize);
		List<Salary>  salarylist= query.list();
		return salarylist;
	}

	@Override
	public void deleteMessages(Salary salary) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(salary);
	}

	@Override
	public Salary findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Salary salary=	(Salary) session.get(Salary.class, id);
		return salary;
	}

	@Override
	public void updateMessages(Salary salary) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(salary);

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int getTotle() {
		Session session=sessionFactory.getCurrentSession();
		Query query= session.createQuery("from Salary ");
		@SuppressWarnings("unchecked")
		List<Salary>  salarylist= query.list();
		return salarylist.size();
	}

	@Override
	public Double Totle() {
		Session session=sessionFactory.getCurrentSession();
		String sql="SELECT  SUM( realhair) FROM salary";
	    Double totle1=	(Double) session.createSQLQuery(sql).uniqueResult();
		return totle1;
	}

}
