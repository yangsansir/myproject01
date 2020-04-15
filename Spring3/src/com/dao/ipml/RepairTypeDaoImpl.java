package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.RepairTypeDao;
import com.entities.RepairType;

public class RepairTypeDaoImpl implements RepairTypeDao {
     private SessionFactory sessionFactory;
	@Override
	public void add(List<RepairType> repairTypes) {
		Session session=sessionFactory.getCurrentSession();
		for (RepairType repairType : repairTypes) {
			session.persist(repairType);
		}
		
        
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RepairType> findAll() {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria=	session.createCriteria(RepairType.class);
		 List<RepairType> repairTypelist =criteria.list();
		return repairTypelist;
	}

	@Override
	public void delete(RepairType repairType1) {
		Session session=sessionFactory.getCurrentSession();
        session.delete(repairType1);
	}

	@Override
	public RepairType findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		RepairType repairType1=(RepairType) session.get(RepairType.class,id);
		return repairType1;
	}

	@Override
	public void update(RepairType repairType1) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(repairType1);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
