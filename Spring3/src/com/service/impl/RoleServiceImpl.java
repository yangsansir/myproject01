package com.service.impl;

import java.util.List;

import com.dao.RoleDao;
import com.entities.Function;
import com.entities.Role;
import com.service.RoleService;

public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;
	@Override
	public void addRole(List<Role> roles) {
		roleDao.addRole(roles);

	}
	
	@Override
	public List<Role> getAllRole(int currentPage,int pageSize) {
		 List<Role> rolelist=roleDao.getAllRole(currentPage, pageSize);
		return rolelist;
	}
	@Override
	public Role getRoleById(Integer id) {
	Role role=roleDao.getRoleById(id);
		return role;
	}
	@Override
	public void delete(Role role) {
		roleDao.delete(role);
		
	}
	@Override
	public Role findById(Integer id) {
		Role role=roleDao.findById(id);
		return role;
	}
	@Override
	public void update(Role role) {
		roleDao.update(role);
		
	}
	public RoleDao getRoleDao() {
		return roleDao;
	}
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return roleDao.getTotle();
	}
}
