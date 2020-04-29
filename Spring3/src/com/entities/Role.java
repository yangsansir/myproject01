package com.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class Role implements Serializable{
	private Integer id;
	private String RoleName;//��ɫ���
	private Set<User> userSet=new HashSet<User>();
	private Set<Function> functionSet=new HashSet<Function>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return RoleName;
	}
	public void setRoleName(String roleName) {
		RoleName = roleName;
	}
	
	public Set<User> getUserSet() {
		return userSet;
	}
	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
	}
	public Set<Function> getFunctionSet() {
		return functionSet;
	}
	public void setFunctionSet(Set<Function> functionSet) {
		this.functionSet = functionSet;
	}
	
}
