package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.CostTypeDao;
import com.entities.CostType;

public class CostTypeDaoImpl implements CostTypeDao {
     private  SessionFactory sessionFactory;
	@Override
	public void addCostType(List<CostType> costTypes) {
		Session session=sessionFactory.getCurrentSession();
		for (CostType costType:costTypes) {
			session.persist(costType);
		}
		

	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<CostType> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria=	session.createCriteria(CostType.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<CostType> costTypelist =criteria.list();
		return costTypelist;
	}
	@Override
	public void delete(CostType costType1) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(costType1);
		
	}
	@Override
	public CostType findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		CostType costType1=(CostType) session.get(CostType.class, id);
		return costType1;
	}
	@Override
	public void update(CostType costType1) {
		Session session=sessionFactory.getCurrentSession();
		session.update(costType1);
		
	}

	@Override
	public int getTotle() {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria=	session.createCriteria(CostType.class);
		List<CostType> costTypelist =criteria.list();
		return costTypelist.size();
	}

}
