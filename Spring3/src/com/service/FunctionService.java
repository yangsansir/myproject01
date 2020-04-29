package com.service;

import java.util.List;

import com.entities.Function;
import com.entities.Role;

public interface FunctionService {
	public void addFunction(Function function);
	public  List<Function> findAll(int currentPage,int pageSize);
	public int getTotle();
	public void delete(Function function );
	public Function findById(Integer id);
	public void update(Function function );
}
