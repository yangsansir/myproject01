package com.action;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.Function;
import com.entities.Role;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoleService;

public class RoleAction  implements SessionAware {
	private Integer id;
	private List<Role> role;
	private RoleService roleService;
	private List<Function> function;
	private Role role1;
	private Set<Function> functionSet=new HashSet<Function>();
	private int currentPage;
	private int totalPage;
	private int totalSize;
	private int pageSize=5;
    private Map<String, Object> session;
	public String addRole() {
		roleService.addRole(role);
		return "success";

	}
public String getAllRole(){
	if(currentPage==0){
		   currentPage = 1;
		  }
	 totalSize=roleService.getTotle();
	  
	  int mod = totalSize%pageSize;
	   if(mod==0){
	    totalPage = totalSize/pageSize;
	   }else 
	    totalPage = totalSize/pageSize+1;
	
	 List<Role> rolelist=roleService.getAllRole(currentPage, pageSize);
	 session.put("rolelist", rolelist);
	return "success";
	
}
public String findById(){
	role1=roleService.findById(id);
	return "success";
}
public String delete(){
	role1=roleService.findById(id);
	roleService.delete(role1);
	return "success";
}
public String update(){
	roleService.update(role1);
	return "success";
}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	

	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
	public List<Function> getFunction() {
		return function;
	}
	public void setFunction(List<Function> function) {
		this.function = function;
	}
	public Set<Function> getFunctionSet() {
		return functionSet;
	}
	public void setFunctionSet(Set<Function> functionSet) {
		this.functionSet = functionSet;
	}
	public Role getRole1() {
		return role1;
	}
	public void setRole1(Role role1) {
		this.role1 = role1;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
