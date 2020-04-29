package com.service.impl;

import java.util.List;

import com.dao.FunctionDao;
import com.entities.Function;
import com.service.FunctionService;

public class FunctionServiceImpl implements FunctionService {
 private FunctionDao functionDao;
	@Override
	public void addFunction(Function function) {
		functionDao.addFunction(function);

	}
	public FunctionDao getFunctionDao() {
		return functionDao;
	}
	public void setFunctionDao(FunctionDao functionDao) {
		this.functionDao = functionDao;
	}
	@Override
	public List<Function> findAll(int currentPage,int pageSize) {
		List<Function> functionlist =functionDao.findAll(currentPage, pageSize);
		return functionlist;
	}
	@Override
	public void delete(Function function) {
		functionDao.delete(function);
		
	}
	@Override
	public Function findById(Integer id) {
		Function function=functionDao.findById(id);
		return function;
	}
	@Override
	public void update(Function function) {
		functionDao.update(function);
		
	}
	
	@Override
	public int getTotle() {
		return functionDao.getTotle();
	}
 
}
