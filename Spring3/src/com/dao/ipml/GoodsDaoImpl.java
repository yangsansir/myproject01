package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.GoodsDao;
import com.entities.Goods;



public class GoodsDaoImpl implements GoodsDao {
    private SessionFactory sessionFactory;
	@Override
	public void addgoods(Goods goods) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.persist(goods);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Session session=sessionFactory.getCurrentSession();
		session.persist(goods);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Goods> findAll(int currentPage, int pageSize){
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(Goods.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<Goods>	goodslist=criteria.list();
		return goodslist;
	}

	@Override
	public void deletegoods(Goods goods) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(goods);

	}

	@Override
	public Goods findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Goods goods= (Goods) session.get(Goods.class, id);
		return goods;
	}

	@Override
	public void updategoods(Goods goods) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(goods);

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@SuppressWarnings("unchecked")
	public int getTotle() {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(Goods.class);
		List<Goods>	goodslist=criteria.list();
		return goodslist.size();
	}

	@Override
	public List<Goods> query(int currentPage, int pageSize,String keyword) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Goods g where g.goodsName like '%"+keyword+"%'";
		//String hql="from Propertyfee pf where pf.community="+comId+" and pf.crateTime like '%"+createTime+"-"+monId+"%'";
		Query criteria=session.createQuery(hql);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<Goods>	goodslist1=criteria.list();
		return goodslist1;
	}

}
