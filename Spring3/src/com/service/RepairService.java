package com.service;

import java.util.List;

import com.entities.Repair;

public interface RepairService {
	public void add(Repair repair );
	public List<Repair> findAll(int currentPage,int pageSize);
	public void delete(Repair repair);
	public Repair findById(Integer id);
	public void update(Repair repair);
	public int getTotle();
}
