package com.dao.ipml;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.GoodsTypeDao;
import com.entities.GoodsType;

public class GoodsTypeDaoImpl implements GoodsTypeDao {
	  private SessionFactory sessionFactory;
	@Override
	public void add(List<GoodsType> goodsTypes) {
		Session session=sessionFactory.getCurrentSession();
		for (GoodsType goodsType : goodsTypes) {
			session.save(goodsType);
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<GoodsType> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();		
		Query query= session.createQuery("from GoodsType");
		List<GoodsType> goodsTypelist= query.list();
		int startRow=(currentPage-1)*pageSize;
		query.setFirstResult(startRow);
		query.setMaxResults(pageSize);
		return goodsTypelist;	
	}

	@Override
	public void delete(GoodsType goodsType1) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(goodsType1);
	}

	@Override
	public GoodsType findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		GoodsType goodsType1=(GoodsType) session.get(GoodsType.class, id);
		return goodsType1;
	}

	@Override
	public void update(GoodsType goodsType1) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(goodsType1);
	}

	@SuppressWarnings("unchecked")
	@Override
	public int getTotle() {
		Session session=sessionFactory.getCurrentSession();
		Query query= session.createQuery("from GoodsType");
		List<GoodsType> goodsTypelist= query.list();
		return goodsTypelist.size();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
