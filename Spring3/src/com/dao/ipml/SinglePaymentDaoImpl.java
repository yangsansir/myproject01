package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.SinglePaymentDao;
import com.entities.HouseHoldBill;
import com.entities.SinglePayment;

public class SinglePaymentDaoImpl implements SinglePaymentDao {
     private SessionFactory sessionFactory;
 	@Override
 	public void addbillOutBody(HouseHoldBill houseHoldBill,
 			SinglePayment singlePayment) {
 		Session session=sessionFactory.getCurrentSession();
		session.save(houseHoldBill);
		houseHoldBill.getSinglePaymentSet().add(singlePayment);
		session.save(singlePayment);
 		
 	}
	@SuppressWarnings("unchecked")
	@Override
	public List<SinglePayment> fingAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
	 	Criteria criteria=session.createCriteria(SinglePayment.class);
	 	 int startRow=(currentPage-1)*pageSize;
		 criteria.setFirstResult(startRow);
		 criteria.setMaxResults(pageSize);
	 	List<SinglePayment> singlePaymentlist=criteria.list();
		return singlePaymentlist;
	}
	
	@Override
	public void update(HouseHoldBill houseHoldBill,SinglePayment singlePayment) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(houseHoldBill);
		houseHoldBill.getSinglePaymentSet().add(singlePayment);
		session.saveOrUpdate(singlePayment);
		
	}
	@Override
	public SinglePayment findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		SinglePayment singlePayment=(SinglePayment) session.get(SinglePayment.class, id);
		return singlePayment;
	}
	@Override
	public void delete(SinglePayment singlePayment) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(singlePayment);
		
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
	 	Criteria criteria=session.createCriteria(SinglePayment.class);
	 	
	 	List<SinglePayment> singlePaymentlist=criteria.list();
		return singlePaymentlist.size();
	}


}
