package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.ShoppingListDao;
import com.entities.ShoppingList;

public class ShoppingListDaoImpl implements ShoppingListDao {
	private SessionFactory sessionFactory;
	@Override
	public void add(ShoppingList shoppingList) {
		Session session=sessionFactory.getCurrentSession();
		session.save(shoppingList);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ShoppingList> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(ShoppingList.class);
		 int startRow=(currentPage-1)*pageSize;
		 criteria.setFirstResult(startRow);
		 criteria.setMaxResults(pageSize);
		 List<ShoppingList> shoppinglist= criteria.list();
		return shoppinglist;
	}

	@Override
	public void delete(ShoppingList shoppingList) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(shoppingList);

	}

	@Override
	public ShoppingList findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		ShoppingList shoppingList=(ShoppingList) session.get(ShoppingList.class, id);
		
		return shoppingList;
	}

	@Override
	public void update(ShoppingList shoppingList) {
		Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(shoppingList);
	}

	@SuppressWarnings("unchecked")
	@Override
	public int getTotle() {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(ShoppingList.class);
		 List<ShoppingList> shoppinglist= criteria.list();
		return shoppinglist.size();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
