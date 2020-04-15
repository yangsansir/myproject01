package com.dao;

import java.util.List;


import com.entities.MiddleFloor;

public interface MiddleFloorDao {
	public void add(MiddleFloor middleFloor );
	public void delete(MiddleFloor middleFloor );
	public MiddleFloor findById(Integer id);
	public void update(MiddleFloor middleFloor );
	public  List<MiddleFloor> findAll(int currentPage,int pageSize);
	public int getTotle();
}
