package com.service.impl;

import java.util.List;

import com.dao.CheckUserDao;

import com.entities.CheckUser;

import com.service.CheckUserService;


public class CheckUserServiceImpl implements CheckUserService {
     private CheckUserDao checkUserDao;
	@Override
	public void addcheckUser(CheckUser checkUser) {
		checkUserDao.addcheckUser(checkUser);

	}

	@Override
	public List<CheckUser> findAll(int currentPage, int pageSize) {
		List<CheckUser>	checkUserlist=	checkUserDao.findAll(currentPage, pageSize);
		return checkUserlist;
	}

	@Override
	public void deletecheckUser(CheckUser checkUser) {
		checkUserDao.deletecheckUser(checkUser);

	}

	@Override
	public CheckUser findById(Integer id) {
		CheckUser checkUser=checkUserDao.findById(id);
		return checkUser;
	}

	@Override
	public void updatecheckUser(CheckUser checkUser) {
		checkUserDao.updatecheckUser(checkUser);
	}

	

	

	public CheckUserDao getCheckUserDao() {
		return checkUserDao;
	}

	public void setCheckUserDao(CheckUserDao checkUserDao) {
		this.checkUserDao = checkUserDao;
	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return checkUserDao.getTotle();
	}

}
