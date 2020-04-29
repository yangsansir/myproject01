package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.DistrictDao;
import com.entities.District;
import com.entities.MiddleFloor;

public class DistrictDaoImpl implements DistrictDao {
   private SessionFactory sessionFactory;
	@Override
	public void addDistrict(District district,List<MiddleFloor> middleFloors) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(district);
		for (MiddleFloor middleFloor:middleFloors) {
			district.getMiddleFloorSet().add(middleFloor);
			session.persist(middleFloor);
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<District> getAllDistrict(int currentPage, int pageSize) {
	Session session=sessionFactory.getCurrentSession();
	Criteria criteria=	session.createCriteria(District.class);
	int startRow=(currentPage-1)*pageSize;
	criteria.setFirstResult(startRow);
	criteria.setMaxResults(pageSize);
	  List<District>  districtlist= criteria.list();
		return districtlist;
	}
	@Override
	public District getDistrictbyId(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from  District where id=:id";
	    District district= (District) session.createQuery(hql).setParameter("id", id).uniqueResult();
		return district;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MiddleFloor> findMiddleFloorByDistrictId(MiddleFloor middleFloor) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria=	session.createCriteria(MiddleFloor.class);
		 List<MiddleFloor>  middleFloorlist=criteria.list();
		return middleFloorlist; 
	}
	@Override
	public void delete(District district) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(district);
		
	}
	@Override
	public District findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		District district=(District) session.get(District.class, id);
		return district;
	}
	@Override
	public void update(District district) {
		Session session=sessionFactory.getCurrentSession();
		session.update(district);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public int getTotle() {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria=	session.createCriteria(District.class);
		  List<District>  districtlist= criteria.list();
			return districtlist.size();
	
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<MiddleFloor> findByDistrictId(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from MiddleFloor m where m.district="+id;
		List<MiddleFloor> middlist=session.createQuery(hql).list();
		return middlist;
	}
}
