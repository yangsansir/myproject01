package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.RoleDao;
import com.entities.Function;
import com.entities.Role;

public class RoleDaoIpml implements RoleDao {
     private SessionFactory sessionFactory;
	@Override
	public void addRole(List<Role> roles) {
		Session session=sessionFactory.getCurrentSession();
		for (Role role : roles) {
			session.save(role);
		}
		}
		

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Role> getAllRole(int currentPage,int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria  criteria=  session.createCriteria(Role.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
	    List<Role> rolelist= criteria.list();
		return rolelist;
	}
	
	@Override
	public Role getRoleById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Role where id=:id";
		 Role role=  (Role) session.createQuery(hql).setParameter("id", id).uniqueResult();
		return role;
	}



	@Override
	public Role findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Role role=(Role) session.get(Role.class, id);
		return role;
	}



	@Override
	public void delete(Role role) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(role);
	
	}
	@Override
	public void update(Role role) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(role);
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
		Criteria  criteria= session.createCriteria(Role.class);
	    List<Role> rolelist= criteria.list();
		return rolelist.size();
	}
}
