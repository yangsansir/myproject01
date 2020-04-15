package com.dao;

import java.util.List;

import com.entities.CostType;
import com.entities.Function;
import com.entities.Role;

public interface FunctionDao {
public void addFunction(Function function );
public void delete(Function function );
public Function findById(Integer id);
public void update(Function function );
public  List<Function> findAll(int currentPage,int pageSize);
public int getTotle();
}
