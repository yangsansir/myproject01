package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;




import com.dao.UserDao;
import com.entities.Function;
import com.entities.User;

public class UserDaoImpl implements UserDao {
      private SessionFactory  sessionFactory;
	@Override
	public void add(User user) {
			Session  session=sessionFactory.getCurrentSession();
			session.save(user);

	}
	
	@Override
	public User login(String loginName, String password) {
		Session  session=sessionFactory.getCurrentSession();
		String hql="from User where loginName=:name and password=:pwd";
		
		User user=(User) session.createQuery(hql).setParameter("name", loginName).setParameter("pwd", password).uniqueResult();
		return user;
	}


	@Override
	public List<Function> getFunctionByRoleId() {
		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll(int currentPage,int pageSize) {
		Session  session=sessionFactory.getCurrentSession();
		Criteria criteria=session.createCriteria(User.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<User> userlist=criteria.list();
		return userlist;
	}

	@Override
	public User findById(Integer id) {
		Session  session=sessionFactory.getCurrentSession();
		User user=(User) session.get(User.class,id);
		return user;
	}

	@Override
	public void updateuser(User user) {
		Session  session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);	
	}
	@Override
	public void delete(User user) {
		Session  session=sessionFactory.getCurrentSession();
		session.delete(user);
		
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
		Session  session=sessionFactory.getCurrentSession();
		Criteria criteria=session.createCriteria(User.class);
		List<User> userlist=criteria.list();
		return userlist.size();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> query(String keyWord) {
		Session  session=sessionFactory.getCurrentSession();
		String sql="select * FROM user where realName LIKE '%��%'";
		SQLQuery criteria=session.createSQLQuery(sql);
		List<User> userlist1=criteria.list();
		return userlist1;
	}

	
}
