package com.service.impl;

import java.util.List;

import com.dao.ResiderntDao;
import com.entities.Residernt;
import com.service.ResiderntService;

public class ResiderntServiceImpl implements ResiderntService {
   private ResiderntDao residerntDao;
	@Override
	public void addresidernt(Residernt residernt) {
		residerntDao.addresidernt(residernt);

	}
	public ResiderntDao getResiderntDao() {
		return residerntDao;
	}
	public void setResiderntDao(ResiderntDao residerntDao) {
		this.residerntDao = residerntDao;
	}
	@Override
	public Residernt login(String LoginName, String Password) {
		Residernt residernt =residerntDao.login(LoginName, Password);
		return residernt;
	}
	@Override
	public List<Residernt> fingAll(int currentPage, int pageSize) {
		List<Residernt> residerntlist=	residerntDao.fingAll(currentPage, pageSize);
		return residerntlist;
	}
	@Override
	public void updateResidernt(Residernt residernt) {
		residerntDao.updateResidernt(residernt);
		
	}
	@Override
	public Residernt findById(Integer id) {
		Residernt residernt=residerntDao.findById(id);
		return residernt;
	}
	@Override
	public void delete(Residernt residernt) {
		residerntDao.delete(residernt);
		
	}
	
	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return residerntDao.getTotle();
	}

}
