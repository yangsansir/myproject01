package com.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class MiddleFloor implements Serializable {
private Integer id;
private String BuildNUmber;//Â¥¶°±àºÅ
private District district;//Ð¡Çø
private Set<Residernt> residerntSet=new HashSet<Residernt>();
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getBuildNUmber() {
	return BuildNUmber;
}
public void setBuildNUmber(String buildNUmber) {
	BuildNUmber = buildNUmber;
}
public District getDistrict() {
	return district;
}
public void setDistrict(District district) {
	this.district = district;
}
public Set<Residernt> getResiderntSet() {
	return residerntSet;
}
public void setResiderntSet(Set<Residernt> residerntSet) {
	this.residerntSet = residerntSet;
}
@Override
public String toString() {
	return "MiddleFloor [id=" + id + ", BuildNUmber=" + BuildNUmber
			+ ", district=" + district + ", residerntSet=" + residerntSet + "]";
}


}
