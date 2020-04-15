package com.dao;

import java.util.List;

import com.entities.Messages;

public interface MessagesDao {
public void addMessages(Messages messages );
public List<Messages> findAll(int currentPage,int pageSize);
public void deleteMessages(Messages messages );
public Messages findById(Integer id);
public void updateMessages(Messages messages);
public int getTotle();
}
