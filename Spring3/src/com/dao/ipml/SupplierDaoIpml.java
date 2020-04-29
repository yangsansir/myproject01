package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.SupplierDao;

import com.entities.CarPayment;
import com.entities.Supplier;


public class SupplierDaoIpml implements SupplierDao {
	private SessionFactory sessionFactory;

	@Override
	public void addsupplier(Supplier supplier) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(supplier);

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Supplier> findAll(int currentPage,int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Supplier.class);
		 int startRow=(currentPage-1)*pageSize;
		 criteria.setFirstResult(startRow);
		 criteria.setMaxResults(pageSize);
		List<Supplier> supplierlist = criteria.list();
		return supplierlist;
	}

	
	@Override
	public void delete(Supplier supplier) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(supplier);
		
	}

	@Override
	public Supplier findById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Supplier supplier=(Supplier) session.get(Supplier.class, id);
		return supplier;
	}

	@Override
	public void update(Supplier supplier) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(supplier);
		
	}

	@Override
	public int getTotle() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Supplier.class);
		List<Supplier> supplierlist = criteria.list();
		return supplierlist.size();
	}

}
