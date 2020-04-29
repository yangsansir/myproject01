package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.CustomerDao;

import com.entities.Customer;


public class CustomerDaoImpl implements CustomerDao {
    private SessionFactory sessionFactory;
	@Override
	public void addcustomer(Customer customer) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(customer);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(Customer.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<Customer>	customerlist=criteria.list();
		return customerlist;
	}

	@Override
	public void deletecustomer(Customer customer) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(customer);

	}

	@Override
	public Customer findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Customer customer= (Customer) session.get(Customer.class, id);
		return customer;
	}

	@Override
	public void updatecustomer(Customer customer) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);

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
		Criteria criteria= session.createCriteria(Customer.class);
		List<Customer>	customerlist=criteria.list();
		return customerlist.size();
	}

}
