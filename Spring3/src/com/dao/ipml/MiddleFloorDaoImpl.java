package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.MiddleFloorDao;
import com.entities.CarPayment;
import com.entities.Function;
import com.entities.MiddleFloor;

public class MiddleFloorDaoImpl implements MiddleFloorDao {
	  private SessionFactory sessionFactory;
	@Override
	public void delete(MiddleFloor middleFloor) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(middleFloor);

	}

	@Override
	public MiddleFloor findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		MiddleFloor middleFloor=(MiddleFloor) session.get(MiddleFloor.class, id);
		return middleFloor;
	}

	@Override
	public void update(MiddleFloor middleFloor) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(middleFloor);

	}

	@Override
	public List<MiddleFloor> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(MiddleFloor.class);
		criteria.setFirstResult(currentPage);
		criteria.setMaxResults(pageSize);
		List<MiddleFloor> middleFloorlist=criteria.list();
				return middleFloorlist;
		
	}

	@Override
	public int getTotle() {
		Session session=sessionFactory.getCurrentSession();
		return 0;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(MiddleFloor middleFloor) {
		Session session=sessionFactory.getCurrentSession();
		session.save(middleFloor);
		
	}

}
