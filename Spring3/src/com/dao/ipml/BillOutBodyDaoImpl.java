package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.BillOutBodyDao;

import com.entities.BillOutBody;
import com.entities.BillOutHead;
import com.entities.CarHoldBill;


public class BillOutBodyDaoImpl implements BillOutBodyDao {
   private SessionFactory sessionFactory;
	@Override
	public void addbillOutBody(BillOutBody billOutBody, BillOutHead billOutHead) {
		Session session=sessionFactory.getCurrentSession();
		session.save(billOutHead);
		billOutHead.getBillOutBodySet().add(billOutBody);
		session.save(billOutBody);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BillOutBody> findAll(int currentPage,int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(BillOutBody.class);
		 int startRow=(currentPage-1)*pageSize;
		 criteria.setFirstResult(startRow);
		 criteria.setMaxResults(pageSize);
		List<BillOutBody> billOutBodylist=criteria.list();
				return billOutBodylist;
	}


	@Override
	public void delete(BillOutBody billOutBody) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(billOutBody);
		
	}

	@Override
	public BillOutBody findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		BillOutBody billOutBody=(BillOutBody) session.get(BillOutBody.class, id);
		return billOutBody;
	}

	/* (non-Javadoc)
	 * @see com.dao.billOutBodyDao#update(com.entities.billOutBody, com.entities.CarHoldBill)
	 */
	@Override
	public void update(BillOutBody billOutBody, BillOutHead billOutHead) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(billOutHead);
		billOutHead.getBillOutBodySet().add(billOutBody);
		//billOutBody.getCarPaymentSet().add(billOutHead);
		session.saveOrUpdate(billOutBody);
		
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
		Criteria criteria= session.createCriteria(BillOutBody.class);
		List<BillOutBody> billOutBodylist=criteria.list();
		return billOutBodylist.size();
	}
}
