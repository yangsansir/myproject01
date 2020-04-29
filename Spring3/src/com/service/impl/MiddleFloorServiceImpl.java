package com.service.impl;

import java.util.List;

import com.dao.MiddleFloorDao;
import com.entities.MiddleFloor;
import com.service.MiddleFloorService;

public class MiddleFloorServiceImpl implements MiddleFloorService {
     private MiddleFloorDao middleFloorDao;
	@Override
	public void delete(MiddleFloor middleFloor) {
		// TODO Auto-generated method stub

	}

	@Override
	public MiddleFloor findById(Integer id) {
		MiddleFloor middleFloor=middleFloorDao.findById(id);
		return middleFloor;
	}

	@Override
	public void update(MiddleFloor middleFloor) {
		middleFloorDao.update(middleFloor);

	}

	@Override
	public List<MiddleFloor> findAll(int currentPage, int pageSize) {
		List<MiddleFloor> middleFloorlist= middleFloorDao.findAll(currentPage, pageSize);
		return middleFloorlist;
	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return middleFloorDao.getTotle();
	}

	public MiddleFloorDao getMiddleFloorDao() {
		return middleFloorDao;
	}

	public void setMiddleFloorDao(MiddleFloorDao middleFloorDao) {
		this.middleFloorDao = middleFloorDao;
	}

	@Override
	public void add(MiddleFloor middleFloor) {
		middleFloorDao.add(middleFloor);
		
	}

}
