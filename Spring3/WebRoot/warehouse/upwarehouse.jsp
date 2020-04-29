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
  
   <div class="top"></div>
<div id="header">
	<div class="logo">进销存后台管理系统</div>
	<div class="navigation">
		<ul>
		 		<li>欢迎您！</li>
			<li>当前登录：${RoleName}</li>
			<li><a href="employee/findById?id=${id}">${RealName}</a></li>
			<li><a href="">设置</a></li>
			<li><a href="">退出</a></li>
		</ul>
	</div>
</div>

<div id="content">
	<div class="left_menu">
				<ul id="nav_dot">
      <li>
          <h4 class="M1"><span></span>管理员管理</h4>
          <div class="list-item none">
          <table>
        <s:iterator value="#session.rolelist[0].functionSet" var="function">
          <tr> <td><a href='${Url}'>${FunctionName}</a></td> 
          <td><a href=''></a></td>
          </tr>
            </s:iterator>
            </table>
          </div>
  </ul>
		</div>
		<div class="m-right">
			<div class="right-nav">
					<ul>
							<li><img src="images/home.png"></li>
								<li style="margin-left:25px;">您当前的位置：修改仓库信息</li>
							
						</ul>
						
			</div>
			<div class="main">
				
			
		<center>
    <form action="warehouse/update.action" method="post">
    <input type="hidden" name="warehouse.id" value='<s:property value='warehouse.id'/>'/>
  <table border="1" cellspacing="0" cellpadding="10">
  <tr>
  <td>仓库名称<label style="color: red">*</label></td>
  <td> <input type="text" name="warehouse.warehouseName" value='<s:property value='warehouse.warehouseName'/>'/><br></td>
  </tr>
   <tr>
  <td>拼音码<label style="color: red">*</label></td>
  <td> <input type="text" name="warehouse.pyCode" value='<s:property value='warehouse.pyCode'/>'/><br></td>
  </tr>
   <tr>
  <td>地址<label style="color: red">*</label></td>
  <td> <input type="text" name="warehouse.location" value='<s:property value='warehouse.location'/>'/><br></td>
  </tr>
   <tr>
  <td>描述<label style="color: red">*</label></td>
  <td> <input type="text" name="warehouse.description" value='<s:property value='warehouse.description'/>'/><br></td>
  </tr>
  </table>
    <input type="submit" value="保存"/>
   </form>
   </center>
			</div>	
		</div>	
</div>
<div class="bottom"></div>
<div id="footer"><p>Copyright©  2015 版权所有 京ICP备05019125号-10  来源:<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p></div>
<script>navList(12);</script>
  </body>
</html>
