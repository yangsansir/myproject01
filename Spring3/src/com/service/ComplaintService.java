package com.service;

import java.util.List;

import com.entities.Complaint;

public interface ComplaintService {
	public void add(Complaint complaint );
	public List<Complaint> findAll(int currentPage,int pageSize);
	public void delete(Complaint complaint);
	public Complaint findById(Integer id);
	public void update(Complaint complaint);
	public int getTotle();
}
