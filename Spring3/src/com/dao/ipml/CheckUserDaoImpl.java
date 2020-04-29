package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.CheckUserDao;

import com.entities.CheckUser;


public class CheckUserDaoImpl implements CheckUserDao {
    private SessionFactory sessionFactory;
	@Override
	public void addcheckUser(CheckUser checkUser) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(checkUser);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CheckUser> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(CheckUser.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<CheckUser>	checkUserlist=criteria.list();
		return checkUserlist;
	}

	@Override
	public void deletecheckUser(CheckUser checkUser) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(checkUser);

	}

	@Override
	public CheckUser findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		CheckUser checkUser= (CheckUser) session.get(CheckUser.class, id);
		return checkUser;
	}

	@Override
	public void updatecheckUser(CheckUser checkUser) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(checkUser);

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
		Criteria criteria= session.createCriteria(CheckUser.class);
		List<CheckUser>	checkUserlist=criteria.list();
		return checkUserlist.size();
	}

}
