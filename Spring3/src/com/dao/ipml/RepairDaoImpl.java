package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.RepairDao;
import com.entities.Repair;

public class RepairDaoImpl implements RepairDao {
     private SessionFactory sessionFactory;
	@Override
	public void add(Repair repair) {
		Session session=sessionFactory.getCurrentSession();
		session.save(repair);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Repair> findAll(int currentPage,int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(Repair.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<Repair> repairlist= criteria.list();
		return repairlist;
	}

	@Override
	public void delete(Repair repair) {
		Session session=sessionFactory.getCurrentSession();
         session.delete(repair);
	}

	@Override
	public Repair findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Repair repair=	(Repair) session.get(Repair.class, id);
		return repair;
	}

	@Override
	public void update(Repair repair) {
		Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(repair);
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
		Criteria criteria= session.createCriteria(Repair.class);
		List<Repair> repairlist= criteria.list();
		return repairlist.size();
	}

}
