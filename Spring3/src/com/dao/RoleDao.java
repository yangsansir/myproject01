package com.dao;

import java.util.List;

import com.entities.District;
import com.entities.Function;
import com.entities.Role;

public interface RoleDao {
public void addRole(List<Role> roles);
public List<Role> getAllRole(int currentPage,int pageSize);
public  Role getRoleById(Integer id);
public void delete(Role role );
public Role findById(Integer id);
public void update(Role role );
public int getTotle();
}
