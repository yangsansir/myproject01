package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.TsaleDao;

import com.entities.Tsale;



public class TsaleDaoImpl implements TsaleDao {
    private SessionFactory sessionFactory;
	@Override
	public void addtsale(Tsale tsale) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(tsale);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tsale> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(Tsale.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<Tsale>	tsalelist=criteria.list();
		return tsalelist;
	}

	@Override
	public void deletetsale(Tsale tsale) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(tsale);

	}

	@Override
	public Tsale findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Tsale tsale= (Tsale) session.get(Tsale.class, id);
		return tsale;
	}

	@Override
	public void updatetsale(Tsale tsale) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(tsale);

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
		Criteria criteria= session.createCriteria(Tsale.class);
		List<Tsale>	tsalelist=criteria.list();
		return tsalelist.size();
	}

}
