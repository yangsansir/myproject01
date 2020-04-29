package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.entities.Employee;
import com.entities.Role;
import com.service.EmployeeService;
import com.service.RoleService;

public class EmployeeAction implements SessionAware {
	private Integer id;
	private String nextPose;
	private Map<String, Object> session;
	private Employee employee;
	private Role role;
	private EmployeeService employeeService;
	private RoleService roleService;
	private int currentPage;
	private int totalPage;
	private int totalSize;
	private int pageSize = 4;
	private String keyWord="系统管理员";

	public String login() {
		employee = employeeService.login(employee.getLoginName(),
				employee.getPassword());
		if (employee != null) {
			List<Role> rolelist = roleService.getAllRole(currentPage, pageSize);
			session.put("rolelist", rolelist);
			session.put("id", employee.getId());
			session.put("RealName", employee.getRealName());
			session.put("RoleName", employee.getRole().getRoleName());
			if (employee.getRole().getRoleName().equals("系统管理员")) {
				nextPose = "admin";
				return "success";

			} else if (employee.getRole().getRoleName().equals("保安")) {
				nextPose = "baoan";

				return "success";
			} else if (employee.getRole().getRoleName().equals("财务")) {
				nextPose = "caiwu";

				return "success";
			} else if (employee.getRole().getRoleName().equals("维修")) {
				nextPose = "weixiu";
				return "success";
			}
			return "success";
		} else {
			return "error";
		}
	}

	public String addEmployee() {
		employeeService.addEmployee(employee);
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
		List<Employee> employeelist = employeeService.findAll(currentPage,
				pageSize);
		session.put("employeelist", employeelist);
		return "success";
	}

	public String Query() {
		List<Employee> employeelist1 = employeeService.query(keyWord);
		session.put("employeelist1", employeelist1);
		return "success";
	}

	public String findById() {
		employee = employeeService.findById(id);
		List<Role> rolelist = roleService.getAllRole(currentPage, pageSize);
		session.put("rolelist", rolelist);
		return "success";
	}

	public String update() {
		employeeService.updateEmployee(employee);
		return "success";
	}

	public String delete() {
		employee = employeeService.findById(id);
		employeeService.delete(employee);
		return "success";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
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

}
