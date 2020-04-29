package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import com.dao.EmployeeDao;
import com.entities.Employee;
import com.entities.Function;

public class EmployeeDaoImpl implements EmployeeDao {
      private SessionFactory  sessionFactory;
	@Override
	public void addEmployee(Employee employee) {
			Session  session=sessionFactory.getCurrentSession();
			session.save(employee);

	}
	
	@Override
	public Employee login(String LoginName, String Password) {
		Session  session=sessionFactory.getCurrentSession();
		String hql="from Employee where LoginName=:name and Password=:pwd";
		Employee employee=(Employee) session.createQuery(hql).setParameter("name", LoginName).setParameter("pwd", Password).uniqueResult();
		return employee;
	}


	@Override
	public List<Function> getFunctionByRoleId() {
		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAll(int currentPage,int pageSize) {
		Session  session=sessionFactory.getCurrentSession();
		Criteria criteria=session.createCriteria(Employee.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<Employee> employeelist=criteria.list();
		return employeelist;
	}

	@Override
	public Employee findById(Integer id) {
		Session  session=sessionFactory.getCurrentSession();
		Employee employee=(Employee) session.get(Employee.class,id);
		return employee;
	}

	@Override
	public void updateEmployee(Employee employee) {
		Session  session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(employee);	
	}
	@Override
	public void delete(Employee employee) {
		Session  session=sessionFactory.getCurrentSession();
		session.delete(employee);
		
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
		Criteria criteria=session.createCriteria(Employee.class);
		List<Employee> employeelist=criteria.list();
		return employeelist.size();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> query(String keyWord) {
		Session  session=sessionFactory.getCurrentSession();
		String sql="select * FROM employee where realName LIKE '%Со%'";
		SQLQuery criteria=session.createSQLQuery(sql);
		List<Employee> employeelist1=criteria.list();
		return employeelist1;
	}
}
