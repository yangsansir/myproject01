package com.service.impl;

import java.util.List;

import com.dao.ComplaintDao;
import com.entities.Complaint;
import com.service.ComplaintService;

public class ComplaintServiceImpl implements ComplaintService {
    private ComplaintDao complaintDao;
	@Override
	public void add(Complaint complaint) {
		complaintDao.add(complaint);

	}

	@Override
	public List<Complaint> findAll(int currentPage, int pageSize) {
		List<Complaint> complaintlist=complaintDao.findAll(currentPage, pageSize);
		return complaintlist;
	}

	@Override
	public void delete(Complaint complaint) {
		complaintDao.delete(complaint);

	}

	@Override
	public Complaint findById(Integer id) {
		Complaint complaint=	complaintDao.findById(id);
		return complaint;
	}

	@Override
	public void update(Complaint complaint) {
		complaintDao.update(complaint);

	}

	public ComplaintDao getComplaintDao() {
		return complaintDao;
	}

	public void setComplaintDao(ComplaintDao complaintDao) {
		this.complaintDao = complaintDao;
	}


	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return complaintDao.getTotle();
	}

}
