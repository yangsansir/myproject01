package com.entities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Salary implements Serializable{
private Integer id;
private String RealName;//Ա������
private  double Insurance;//����
private double  AccumlationFund;//������
private double Individual;//��������˰
private double  Bonus;//����
private  double Replacement;//����
private  double Realhair;//ʵ��
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
