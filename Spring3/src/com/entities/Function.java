package com.entities;
import java.io.Serializable;
/*
 * ¹¦ÄÜ±í
 */
@SuppressWarnings("serial")
public  class Function implements Serializable{
	private Integer id;
	private  String FunctionName;
	private  String  Url;
	private Role role;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFunctionName() {
		return FunctionName;
	}
	public void setFunctionName(String functionName) {
		FunctionName = functionName;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	

}
