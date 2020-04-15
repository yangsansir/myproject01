package com.entities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Salary implements Serializable{
private Integer id;
private String RealName;//员工姓名
private  double Insurance;//保险
private double  AccumlationFund;//公积金
private double Individual;//个人所得税
private double  Bonus;//奖金
private  double Replacement;//补发
private  double Realhair;//实发
private String  status;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getRealName() {
	return RealName;
}
public void setRealName(String realName) {
	RealName = realName;
}
public double getInsurance() {
	return Insurance;
}
public void setInsurance(double insurance) {
	Insurance = insurance;
}
public double getAccumlationFund() {
	return AccumlationFund;
}
public void setAccumlationFund(double accumlationFund) {
	AccumlationFund = accumlationFund;
}
public double getIndividual() {
	return Individual;
}
public void setIndividual(double individual) {
	Individual = individual;
}
public double getBonus() {
	return Bonus;
}
public void setBonus(double bonus) {
	Bonus = bonus;
}
public double getReplacement() {
	return Replacement;
}
public void setReplacement(double replacement) {
	Replacement = replacement;
}
public double getRealhair() {
	return Realhair;
}
public void setRealhair(double realhair) {
	Realhair = realhair;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
