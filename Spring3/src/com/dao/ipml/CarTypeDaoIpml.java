package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.CarTypeDao;
import com.entities.CarPayment;
import com.entities.CarType;

public class CarTypeDaoIpml implements CarTypeDao {
	private SessionFactory sessionFactory;

	@Override
	public void addCarType(CarType carType) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(carType);

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<CarType> findAll(int currentPage,int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(CarType.class);
		 int startRow=(currentPage-1)*pageSize;
		 criteria.setFirstResult(startRow);
		 criteria.setMaxResults(pageSize);
		List<CarType> carTypelist = criteria.list();
		return carTypelist;
	}

	
	@Override
	public void delete(CarType carType) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(carType);
		
	}

	@Override
	public CarType findById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		CarType carType=(CarType) session.get(CarType.class, id);
		return carType;
	}

	@Override
	public void update(CarType carType) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(carType);
		
	}

	@Override
	public int getTotle() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(CarType.class);
		List<CarType> carTypelist = criteria.list();
		return carTypelist.size();
	}

}
