package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.ParkInformationDao;
import com.entities.ParkInformation;

public class ParkInformationDaoIpml implements ParkInformationDao {
     private SessionFactory sessionFactory;
	@Override
	public void addParkInformation(ParkInformation parkInformation) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(parkInformation);

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ParkInformation> findAll(int currentPage,int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria=session.createCriteria(ParkInformation.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<ParkInformation> parkInformationlist=criteria.list();
		return parkInformationlist;
	}
	@Override
	public void delete(ParkInformation parkInformation) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(parkInformation);
		
	}
	@Override
	public ParkInformation findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		ParkInformation parkInformation=(ParkInformation) session.get(ParkInformation.class, id);
		return parkInformation;
	}
	@Override
	public void update(ParkInformation parkInformation) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(parkInformation);
		
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int getTotle() {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria=session.createCriteria(ParkInformation.class);
		List<ParkInformation> parkInformationlist=criteria.list();
		return parkInformationlist.size();
	}
}
