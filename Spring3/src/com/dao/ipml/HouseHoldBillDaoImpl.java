package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.HouseHoldBillDao;
import com.entities.HouseHoldBill;
import com.entities.SinglePayment;

public class HouseHoldBillDaoImpl implements HouseHoldBillDao {
   private SessionFactory sessionFactory;
	@Override
	public void addHouseHoldBill(HouseHoldBill houseHoldBill,
			SinglePayment singlePayment) {
		Session session=sessionFactory.getCurrentSession();
		session.save(houseHoldBill);
			houseHoldBill.getSinglePaymentSet().add(singlePayment);
			session.save(singlePayment);
		

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<HouseHoldBill> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria=session.createCriteria(HouseHoldBill.class);
		 int startRow=(currentPage-1)*pageSize;
		 criteria.setFirstResult(startRow);
		 criteria.setMaxResults(pageSize);
	 	List<HouseHoldBill> houseHoldBillList=criteria.list();
		return houseHoldBillList;
	}
	@Override
	public void update(HouseHoldBill houseHoldBill, SinglePayment singlePayment) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(houseHoldBill);
		session.saveOrUpdate(singlePayment);
		
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void delete(HouseHoldBill houseHoldBill) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(houseHoldBill);
		
	}

	@Override
	public HouseHoldBill findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		HouseHoldBill houseHoldBill=(HouseHoldBill) session.get(HouseHoldBill.class, id);
		return houseHoldBill;
	}

	@Override
	public void update(HouseHoldBill houseHoldBill) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(houseHoldBill);
		
	}



	@Override
	public int getTotle() {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria=session.createCriteria(HouseHoldBill.class);
	
	 	List<HouseHoldBill> houseHoldBillList=criteria.list();
		return houseHoldBillList.size();
	}
}
