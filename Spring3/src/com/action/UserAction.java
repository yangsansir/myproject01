package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;


import com.entities.Role;
import com.entities.User;

import com.service.RoleService;
import com.service.UserService;

public class UserAction implements SessionAware {
	private Integer id;
	private String nextPose;
	private Map<String, Object> session;
	private User user;
	private Role role;
	private UserService userService;
	private RoleService roleService;
	private int currentPage;
	private int totalPage;
	private int totalSize;
	private int pageSize = 4;
	private String keyWord="ϵͳ����Ա";// 角色(进货管理员、库存管理员、销售管理员、系统管理员)一个用户一个角色

	public String login() {
		user = userService.login(user.getLoginName(),
				user.getPassword());
		if (user != null) {
			List<Role> rolelist = roleService.getAllRole(currentPage, pageSize);
			session.put("rolelist", rolelist);
			session.put("id", user.getId());
			session.put("RealName", user.getRealName());
			session.put("RoleName", user.getRole().getRoleName());
			if (user.getRole().getRoleName().equals("系统管理员")) {
				nextPose = "admin";
				return "success";

			} else if (user.getRole().getRoleName().equals("销售管理员")) {
				nextPose = "xs";

				return "success";
			} else if (user.getRole().getRoleName().equals("库存管理员")) {
				nextPose = "kc";

				return "success";
			} else if (user.getRole().getRoleName().equals("进货管理员")) {
				nextPose = "jh";
				return "success";
			}
			return "success";
		} else {
			return "error";
		}
	}

	public String adduser() {
		userService.add(user);
		return "success";
	}

	public String findAll() {
		if (currentPage == 0) {
			currentPage = 1;
		}
		totalSize = roleService.getTotle();

		int mod = totalSize % pageSize;
		if (mod == 0) {
			totalPage = totalSize / pageSize;
		} else
			totalPage = totalSize / pageSize + 1;
		List<User> userlist = userService.findAll(currentPage,
				pageSize);
		session.put("userlist", userlist);
		return "success";
	}

	public String Query() {
		List<User> userlist1 = userService.query(keyWord);
		session.put("userlist1", userlist1);
		return "success";
	}

	public String findById() {
		user = userService.findById(id);
		List<Role> rolelist = roleService.getAllRole(currentPage, pageSize);
		session.put("rolelist", rolelist);
		return "success";
	}

	public String update() {
		userService.updateuser(user);
		return "success";
	}

	public String delete() {
		user = userService.findById(id);
		userService.delete(user);
		return "success";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getNextPose() {
		return nextPose;
	}

	public void setNextPose(String nextPose) {
		this.nextPose = nextPose;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
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

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
