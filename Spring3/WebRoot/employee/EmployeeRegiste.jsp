<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'EmployeeRegiste.jsp' starting page</title>
    
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
   <form action="employee/addEmployee.action" method="post">
  登录名： <input type="text" name="employee.LoginName"/><br>
  密码：  <input type="password" name="employee.Password"/><br>
  真实姓名：  <input type="text" name="employee.RealName"/><br>
 性别： <input type="radio" name="employee.Sex" value="男" checked="checked"/>男<input type="radio" name="employee.Sex" value="女"/>女<br>
  联系方式：  <input type="text" name="employee.Contact"/><br>
 备注：<textarea rows="3" cols="30" name="employee.remarks"></textarea><br>

    <input type="submit" value="添加"/>
   </form>
  </body>
</html>
