package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.SalaryDao;
import com.dao.SaleDao;
import com.entities.Goods;
import com.entities.Salary;
import com.entities.Sale;



public class SaleDaoImpl implements SaleDao {
    private SessionFactory sessionFactory;
	@Override
	public void addsale(Sale sale) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(sale);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sale> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(Sale.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<Sale>	salelist=criteria.list();
		return salelist;
	}

	@Override
	public void deletesale(Sale sale) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(sale);

	}

	@Override
	public Sale findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Sale sale= (Sale) session.get(Sale.class, id);
		return sale;
	}

	@Override
	public void updatesale(Sale sale) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(sale);

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public int getTotle() {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(Sale.class);
		List<Sale>	salelist=criteria.list();
		return salelist.size();
	}

	@Override
	public double totleprice() {
		Session session=sessionFactory.getCurrentSession();
		String sql="select SUM(toprice) FROM sale" ;
		double totleprice =(Double) session.createSQLQuery(sql).uniqueResult();
		return totleprice;
	}

	@Override
	public double  query(String begindate,String enddate) {
		Session session=sessionFactory.getCurrentSession();
		//String sql="select SUM(toprice) FROM sale where  createdate  BETWEEN '"+begindate+"' and '"+enddate+"'";
		String sql="select SUM(toprice) FROM sale where  createdate  >='"+begindate+"'and createdate<='"+enddate+"'";
		double price=(Double) session.createSQLQuery(sql).uniqueResult();
		return price;
	}

}
