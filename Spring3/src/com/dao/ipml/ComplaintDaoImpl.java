package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.ComplaintDao;
import com.entities.Complaint;

public class ComplaintDaoImpl implements ComplaintDao {
private SessionFactory sessionFactory;
	@Override
	public void add(Complaint complaint) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(complaint);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Complaint> findAll(int currentPage,int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(Complaint.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<Complaint> complaintlist=criteria.list();
		return complaintlist;
	}

	@Override
	public void delete(Complaint complaint) {
		Session session = sessionFactory.getCurrentSession();
      session.delete(complaint);
	}

	@Override
	public Complaint findById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Complaint complaint=(Complaint) session.get(Complaint.class, id);
		return complaint;
	}

	@Override
	public void update(Complaint complaint) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(complaint);

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
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(Complaint.class);
		List<Complaint> complaintlist=criteria.list();
		return complaintlist.size();
	}

}
