package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



import com.dao.WarehouseDao;
import com.entities.CarPayment;
import com.entities.Warehouse;
import com.service.WarehouseService;

public class WarehouseDaoIpml implements WarehouseDao {
	private SessionFactory sessionFactory;

	@Override
	public void addwarehouse(Warehouse warehouse) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(warehouse);

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Warehouse> findAll(int currentPage,int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Warehouse.class);
		 int startRow=(currentPage-1)*pageSize;
		 criteria.setFirstResult(startRow);
		 criteria.setMaxResults(pageSize);
		List<Warehouse> warehouselist = criteria.list();
		return warehouselist;
	}

	
	@Override
	public void delete(Warehouse warehouse) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(warehouse);
		
	}

	@Override
	public Warehouse findById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Warehouse warehouse=(Warehouse) session.get(Warehouse.class, id);
		return warehouse;
	}

	@Override
	public void update(Warehouse warehouse) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(warehouse);
		
	}

	@Override
	public int getTotle() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Warehouse.class);
		List<Warehouse> warehouselist = criteria.list();
		return warehouselist.size();
	}

}
