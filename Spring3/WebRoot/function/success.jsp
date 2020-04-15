<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addcarType.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  function
   <a href="residernt/SelectAllDistrict">住户信息添加</a><br>
  <a href="residernt/SelectAll">所有住户信息</a><br>
    <a href="houseHoldBill/SelectAll">所有单据</a><br>
    <a href="role/getAllRole">员工注册</a><br>
    <a href="role/getAllRole1">添加功能</a><br>
    <a href="function/findALL">所以功能</a><br>
    <a href="role/getAllRole2">查看功能1</a><br>
    <a href="role/getAllRole3">查看功能</a><br>
    <a href="employee/findAll">所有员工</a><br>
    <a href="carPayment/findAll">所有车位缴费单</a><br>
     <a href="carport/findAll2">填写车位缴费单</a><br>
      <a href="repairType/findAll1">填写车位缴费单</a><br>
  </body>
</html>
