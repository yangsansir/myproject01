package com.service.impl;

import java.util.List;

import com.dao.MessagesDao;
import com.entities.Messages;
import com.service.MessagesService;

public class MessagesServiceImpl implements MessagesService {
     private MessagesDao messagesDao;
	@Override
	public void addMessages(Messages messages) {
		messagesDao.addMessages(messages);

	}

	@Override
	public List<Messages> findAll(int currentPage, int pageSize) {
		List<Messages>	messageslist=	messagesDao.findAll(currentPage, pageSize);
		return messageslist;
	}

	@Override
	public void deleteMessages(Messages messages) {
		messagesDao.deleteMessages(messages);

	}

	@Override
	public Messages findById(Integer id) {
		Messages messages=messagesDao.findById(id);
		return messages;
	}

	@Override
	public void updateMessages(Messages messages) {
		messagesDao.updateMessages(messages);
	}

	public MessagesDao getMessagesDao() {
		return messagesDao;
	}

	public void setMessagesDao(MessagesDao messagesDao) {
		this.messagesDao = messagesDao;
	}

	

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return messagesDao.getTotle();
	}

}
