<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
 <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎登录后台管理系统</title>
<link href="<%=basePath%>css/style1.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="<%=basePath%>js/jquery.js"></script>
<script src="<%=basePath%>js/cloud.js" type="text/javascript"></script>

<script language="javascript">
	$(function(){
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    }) ; 
   
   
}); 
function zhuce(){
//window.location.href="user/userReg.jsp";
 document.forms[0].action="user/userReg.jsp";
	document.forms[0].submit();
}


</script> 

</head>

<body style="background-color:#1c77ac; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">



    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  


<div class="logintop">    
    <span>欢迎登录后台管理界面平台</span>    
    <ul>
    <li><a href="#">回首页</a></li>
    <li><a href="#">帮助</a></li>
    <li><a href="#">关于</a></li>
    </ul>    
    </div>
    
    <div class="loginbody">
    
    <span class="systemlogo"></span> 
       
    <div class="loginbox">
    <form action="user/login.action" method="post">
    <ul>
    <li><input name="user.loginName" type="text" class="loginpwd" value="用户" /></li>
    <li><input name="user.password" type="text" class="loginpwd" value="密码" /></li>
    <li><input name="" type="submit" class="loginbtn" value="登录" /> &nbsp; &nbsp; &nbsp; &nbsp;<input name="" type="button" class="loginbtn" value="注册" onclick="zhuce()"  /><!-- <label><input name="" type="checkbox" value="" checked="checked" />记住密码</label><label><a href="#">忘记密码？</a></label> --></li>
    </ul>
   <!--  //<a href="user/userReg.jsp">qqq</a> -->
    </form>
    </div>
    
    </div>
    
    
    
    <!-- <div class="loginbm">版权所有  2013  <a href="http://www.uimaker.com">uimaker.com</a>  仅供学习交流，勿用于任何商业用途</div> -->
	
    
</body>

</html>
