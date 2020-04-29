package com.dao.ipml;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.MessagesDao;
import com.entities.Messages;

public class MessagesDaoImpl implements MessagesDao {
    private SessionFactory sessionFactory;
	@Override
	public void addMessages(Messages messages) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(messages);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Messages> findAll(int currentPage, int pageSize) {
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria= session.createCriteria(Messages.class);
		int startRow=(currentPage-1)*pageSize;
		criteria.setFirstResult(startRow);
		criteria.setMaxResults(pageSize);
		List<Messages>	messageslist=criteria.list();
		return messageslist;
	}

	@Override
	public void deleteMessages(Messages messages) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(messages);

	}

	@Override
	public Messages findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Messages messages= (Messages) session.get(Messages.class, id);
		return messages;
	}

	@Override
	public void updateMessages(Messages messages) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(messages);

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
		Criteria criteria= session.createCriteria(Messages.class);
		List<Messages>	messageslist=criteria.list();
		return messageslist.size();
	}

}
