<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台模板管理系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link type="text/css" rel="stylesheet" href="<%=basePath%>css/style.css" />
   <script type="text/javascript" src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/menu.js"></script>
  </head>
  
  <body>
  
 
				
	
    <form action="repair/addrepair.action" method="post">
   联系人 ：<input name="repair.contact" type="text" id="form" size="22" /><br>
  电话：  <input name="repair.telephone" type="text" id="fax" size="22" /><br>
 
   报修类型：
   <select name="repair.repairType.id">
    				<s:iterator var="repairType" value="#session.repairTypelist">
    					<option value="<s:property value='#repairType.id'/>"><s:property value='#repairType.RepairType'/></option>
    				</s:iterator>
    		    </select><br>
  报修信息
 <input type="text" name="repair.RepairMessages"/> <br>

 <s:submit value="保存"></s:submit>
 
   
    </form>
    
		

  </body>
</html>
