package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.ReturnBillDao;

import com.entities.ReturnBill;



public class ReturnBillDaoImpl implements ReturnBillDao {
    private SessionFactory sessionFactory;
	@Override
	public void addreturnBill(ReturnBill returnBill) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(returnBill);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ReturnBill> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(ReturnBill.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<ReturnBill>	returnBilllist=criteria.list();
		return returnBilllist;
	}

	@Override
	public void deletereturnBill(ReturnBill returnBill) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(returnBill);

	}

	@Override
	public ReturnBill findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		ReturnBill returnBill= (ReturnBill) session.get(ReturnBill.class, id);
		return returnBill;
	}

	@Override
	public void updatereturnBill(ReturnBill returnBill) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(returnBill);

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
		Criteria criteria= session.createCriteria(ReturnBill.class);
		List<ReturnBill>	returnBilllist=criteria.list();
		return returnBilllist.size();
	}

}
