package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.GoodsCategoryDao;
import com.entities.GoodsCategory;

public class GoodsCategoryDaoImpl implements GoodsCategoryDao {
	private SessionFactory sessionFactory;
	@Override
	public void add(GoodsCategory goodsCategory) {
		Session session = sessionFactory.getCurrentSession();
		session.save(goodsCategory);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<GoodsCategory> findAll(int currentPage, int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(GoodsCategory.class);
		 int startRow=(currentPage-1)*pageSize;
		 criteria.setFirstResult(startRow);
		 criteria.setMaxResults(pageSize);
		 List<GoodsCategory> goodsCategorylist= criteria.list();
		return goodsCategorylist;
	}
	@Override
	public void delete(GoodsCategory goodsCategory) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(goodsCategory);
	}
	@Override
	public GoodsCategory findById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		GoodsCategory goodsCategory=(GoodsCategory) session.get(GoodsCategory.class, id);
		return goodsCategory;
	}
	@Override
	public void update(GoodsCategory goodsCategory) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(goodsCategory);
	}
	@SuppressWarnings("unchecked")
	@Override
	public int getTotle() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(GoodsCategory.class);
		 List<GoodsCategory> goodsCategorylist= criteria.list();
		return goodsCategorylist.size();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
