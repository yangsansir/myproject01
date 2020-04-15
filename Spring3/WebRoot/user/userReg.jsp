<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
 <base href="<%=basePath%>">
    
    <title>My JSP 'addRole.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎登录后台管理系统</title>
<link href="css/style1.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>
<script src="js/cloud.js" type="text/javascript"></script>
<script language="JavaScript" src="<%=basePath%>js/jquery-1.7.2.js"></script>
<script language="javascript">
	$(function(){
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    });  
    alert("www");
});  
function check(){
var password=document.getElementById("password").valueOf();
var repassword=document.getElementById("repassword").valueOf();
}     
if(repassword!=password){
alert("两次密码不一致！");
$("#b").html("两次密码不一致");
}

function IsEmail()     
{     
        var str = document.getElementById("email").value.trim();    
        if(str.length!=0){    
        reg=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;    
        if(!reg.test(str)){    
            alert("对不起，您输入的邮箱格式不正确!");//请将“字符串类型”要换成你要验证的那个属性名称！    
        }    
        }    
}     
}
//判断输入的邮编(只能为六位)是否正确    
function IsZIP()     
{     
        var str = document.getElementById('str').value.trim();    
        if(str.length!=0){    
        reg=/^\d{6}$/;    
        if(!reg.test(str)){    
            alert("对不起，您输入的字符串类型格式不正确!");//请将“字符串类型”要换成你要验证的那个属性名称！    
        }    
        }    
}     
</script> 
<script type="text/javascript">
function check(){
var password=$("#password").val();
var repassword=$("#repassword").val();
alert(password);alert(repassword);
if(repassword!=password){
alert("两次密码不一致！");
return false;
}
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
    
    
       
    
    
   <form action="user/adduser.action" method="post" onsubmit="return check()">
    <center style="margin-top: 100"><li style="color: red;font-size:18px">用户注册</li>
    <table >
    <tr>
    <td id="a" style="font-size: 14px;">用户:</td>
    <td><input name="user.loginName" type="text" class="loginpwd1" /></td>
    
    <tr>
    <td id="a"></td>
    <td height="20"></td>
    <tr>
    <tr>
    <td  style="font-size: 14px;">密码:</td>
    <td><input name="user.password" type="text"  class="loginpwd1" id="password"/></td>
    </tr>
    <tr>
    <td id="a"></td>
    <td height="20"></td>
    <tr>
     <tr>
    <td  style="font-size: 14px;">确认密码:</td>
    <td><input name="user.repassword" type="text"  class="loginpwd1" id="repassword" /></td>
    </tr>
    <tr>
    <td id="a"></td>
    <td height="20" id="b" ></td>
    <tr>
     <tr>
    <td  style="font-size: 14px;">姓名:</td>
    <td><input name="user.realName" type="text"   class="loginpwd1"/></td>
    </tr>
    <tr>
    <td id="a"></td>
    <td height="20"></td>
    <tr>
     <tr>
    <td  style="font-size: 14px;">手机:</td>
    <td><input name="user.mobilephone" type="text" class="loginpwd1" /></td>
    </tr>
    <tr>
    <td id="a"></td>
    <td height="20"></td>
    <tr>
     <tr>
    <td  style="font-size: 14px;">邮箱:</td>
    <td><input name="user.email" type="text"   class="loginpwd1" id="email"/></td>
    </tr>
    <tr>
    <td id="a"></td>
    <td height="20"></td>
    <tr>
     <tr >
    <td  style="font-size: 14px;">备注:</td>
    <td><input name="user.remark" type="text"   class="loginpwd1"/></td>
    </tr>
    <tr>
    <td id="a"></td>
    <td height="20"></td>
    <tr>
     <tr>
    <td></td>
    <td align="center"> <input name="" type="submit" class="loginbtn" value="注册" onclick=""/></td>
    </tr>
    </table>
    </center>
    </form>
    
    
    
    </div> 
    
   
    <center>
    
    
    </center>
    
    
    <!-- <div class="loginbm">版权所有  2013  <a href="http://www.uimaker.com">uimaker.com</a>  仅供学习交流，勿用于任何商业用途</div> -->
	
    
</body>

</html>
