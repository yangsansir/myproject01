package com.service.impl;

import java.util.List;

import com.dao.UserDao;
import com.entities.Function;
import com.entities.User;
import com.service.UserService;


public class UserServiceImpl implements UserService {
	private UserDao userDao;

	@Override
	public void add(User user) {

		userDao.add(user);
	}

	@Override
	public User login(String LoginName, String Password) {
		User user = userDao.login(LoginName, Password);
		return user;
	}

	@Override
	public List<User> findAll(int currentPage, int pageSize) {
		List<User> userlist = userDao
				.findAll(currentPage, pageSize);
		return userlist;
	}

	@Override
	public User findById(Integer id) {
		User user = userDao.findById(id);
		return user;
	}

	@Override
	public void updateuser(User user) {
		userDao.updateuser(user);

	}

	@Override
	public void delete(User user) {
		userDao.delete(user);

	}

	

	@Override
	public int getTotle() {

		return userDao.getTotle();
	}

	@Override
	public List<User> query(String keyWord) {
		List<User> userlist1 = userDao.query(keyWord);
		return userlist1;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<Function> getFunctionByRoleId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
