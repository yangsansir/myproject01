package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.GoodsRepairDao;
import com.entities.Function;
import com.entities.GoodsRepair;

public class GoodsRepairDaoImpl implements GoodsRepairDao {
	  private SessionFactory sessionFactory;
	@Override
	public void add(GoodsRepair goodsRepair) {
		Session session=sessionFactory.getCurrentSession();
		session.save(goodsRepair);

	}
	@SuppressWarnings("unchecked")
	@Override
	public List<GoodsRepair> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria=session.createCriteria(GoodsRepair.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<GoodsRepair> goodsRepairlist=criteria.list();
		return goodsRepairlist;
		
	}

	@Override
	public void delete(GoodsRepair goodsRepair) {
		Session session=sessionFactory.getCurrentSession();
   session.delete(goodsRepair);
	}

	@Override
	public GoodsRepair findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		GoodsRepair goodsRepair=(GoodsRepair) session.get(GoodsRepair.class, id);
		return goodsRepair;
	}

	@Override
	public void update(GoodsRepair goodsRepair) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(goodsRepair);

	}

	@SuppressWarnings("unchecked")
	@Override
	public int getTotle() {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria=session.createCriteria(GoodsRepair.class);
	
		List<GoodsRepair> goodsRepairlist=criteria.list();
		return goodsRepairlist.size();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
