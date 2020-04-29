package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.FunctionDao;
import com.entities.Function;
import com.entities.Role;

public class FunctionDaoImpl implements FunctionDao {
	private SessionFactory sessionFactory;

	@Override
	public void addFunction(Function function) {
		Session session = sessionFactory.getCurrentSession();
		session.save(function);
		

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Function> findAll(int currentPage,int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria=	session.createCriteria(Function.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<Function> functionlist=criteria.list();
		return functionlist;
	}

	@Override
	public void delete(Function function) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(function);
		
	}

	@Override
	public Function findById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Function function=(Function) session.get(Function.class, id);
		return function;
	}

	@Override
	public void update(Function function) {
		Session session = sessionFactory.getCurrentSession();
		session.update(function);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public int getTotle() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria=	session.createCriteria(Function.class);
		List<Function> functionlist=criteria.list();
		return functionlist.size();
	}

}
