package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.CarPaymentDao;
import com.entities.CarHoldBill;
import com.entities.CarPayment;

public class CarPaymentDaoImpl implements CarPaymentDao {
   private SessionFactory sessionFactory;
	@Override
	public void addCarPayment(CarPayment carPayment,CarHoldBill carHoldBill) {
		Session session=sessionFactory.getCurrentSession();
		session.save(carHoldBill);
		carHoldBill.getCarPaymentSet().add(carPayment);
		session.save(carPayment);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CarPayment> findAll(int currentPage,int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(CarPayment.class);
		 int startRow=(currentPage-1)*pageSize;
		 criteria.setFirstResult(startRow);
		 criteria.setMaxResults(pageSize);
		List<CarPayment> carPaymentlist=criteria.list();
				return carPaymentlist;
	}


	@Override
	public void delete(CarPayment carPayment) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(carPayment);
		
	}

	@Override
	public CarPayment findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		CarPayment carPayment=(CarPayment) session.get(CarPayment.class, id);
		return carPayment;
	}

	/* (non-Javadoc)
	 * @see com.dao.CarPaymentDao#update(com.entities.CarPayment, com.entities.CarHoldBill)
	 */
	@Override
	public void update(CarPayment carPayment, CarHoldBill carHoldBill) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(carHoldBill);
		carHoldBill.getCarPaymentSet().add(carPayment);
		session.saveOrUpdate(carPayment);
		
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
		Criteria criteria= session.createCriteria(CarPayment.class);
		List<CarPayment> carPaymentlist=criteria.list();
		return carPaymentlist.size();
	}
}
