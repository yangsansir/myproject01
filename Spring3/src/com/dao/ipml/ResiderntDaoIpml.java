package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.ResiderntDao;
import com.entities.Residernt;

public class ResiderntDaoIpml implements ResiderntDao {
	private SessionFactory sessionFactory;

	@Override
	public void addresidernt(Residernt residernt) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(residernt);

	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Residernt> fingAll(int currentPage,int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(Residernt.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<Residernt> residerntlist=criteria.list();
		return residerntlist;
	}
	

	@Override
	public Residernt login(String LoginName, String Password) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Residernt where LoginName=:name and Password=:pwd";
		Residernt residernt = (Residernt) session.createQuery(hql)
				.setParameter("name", LoginName).setParameter("pwd", Password)
				.uniqueResult();
		return residernt;
	}
	@Override
	public void updateResidernt(Residernt residernt) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(residernt);
		
	}
	@Override
	public Residernt findById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Residernt residernt=(Residernt) session.get(Residernt.class,id);
		return residernt;
		
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void delete(Residernt residernt) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(residernt);
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public int getTotle() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(Residernt.class);
		List<Residernt> residerntlist=criteria.list();
		return residerntlist.size();
	}
}
