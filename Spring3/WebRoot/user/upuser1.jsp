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
	<div class="logo">进销存管理系统</div>
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
								<li style="margin-left:25px;">您当前的位置：</li>
								<li><a href="#">系统公告</a></li>
								<li></li>
								<li><a href="#">最新公告</a></li>
						</ul>
						
			</div>
			<div class="main">
				
			
		<center>
   <form action="user/update1.action" method="post">
   <input type="hidden" name="user.id" value='<s:property value='user.id'/>'/><br>
 <table style="margin-top: 100">
    <tr>
    <td id="a" style="font-size: 14px;">用户:</td>
    <td><input name="user.loginName" type="text" class="loginpwd1" value='<s:property value='user.loginName'/>' /></td>
    
   
    <tr>
    <td  style="font-size: 14px;">密码:</td>
    <td><input name="user.password" type="text" value='<s:property value='user.password'/>' class="loginpwd1" id="password"/></td>
    </tr>
    
     <tr>
    <td  >确认密码:</td>
    <td><input name="user.repassword" type="text" value='<s:property value='user.repassword'/>' class="loginpwd1" id="repassword" /></td>
    </tr>
   
     <tr>
    <td  style="font-size: 14px;">姓名:</td>
    <td><input name="user.realName" type="text"  value='<s:property value='user.realName'/>' class="loginpwd1"/></td>
    </tr>
   
     <tr>
    <td  style="font-size: 14px;">手机:</td>
    <td><input name="user.mobilephone" type="text" value='<s:property value='user.mobilephone'/>' class="loginpwd1" /></td>
    </tr>
    
     <tr>
    <td  style="font-size: 14px;">邮箱:</td>
    <td><input name="user.email" type="text"  value='<s:property value='user.email'/>' class="loginpwd1"/></td>
    </tr>
   
     <tr >
    <td  style="font-size: 14px;">备注:</td>
    <td><input name="user.remark" type="text"  value='<s:property value='user.remark'/>' class="loginpwd1"/></td>
    </tr>
    <tr >
    <td  style="font-size: 14px;">角色:</td>
    <td><select  name="user.role.id" >
			<s:iterator var="role" value="#session.rolelist">
				<option value="<s:property value='#role.id'/>"><s:property
						value='#role.RoleName' /></option>
			</s:iterator>
		</select><br></td>
    </tr>
    
     <tr>
    <td></td>
    <td align="center"> <input type="submit" class="loginbtn" value="保存"/></td>
    </tr>
  
    
    </table>
   
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
