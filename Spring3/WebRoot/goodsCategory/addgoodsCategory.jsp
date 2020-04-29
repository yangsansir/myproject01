<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addRole.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="<%=basePath%>css/style.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=basePath%>js/jquery.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/select-ui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>editor/kindeditor.js"></script>
<script type="text/javascript">
$(function(){
$("#btn").click(function(){
		
		$("<input name='role.roleName' type='text' class='dfinput'  style='width:218px;''/><br/>").insertBefore($("#save"));
	});
});
</script>
  </head>
  
  <body>
  <div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">系统设置</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    
    <div id="usual1" class="usual"> 
    
    <div class="itab">
  	<ul> 
    <li><a href="#tab1" class="selected">添加商品类别</a></li> 
    <!-- <li><a href="#tab2">自定义</a></li> --> 
  	</ul>
    </div> 
    
  	<div id="tab1" class="tabson">
    
    <div class="formtext">Hi，<b>${loginName}</b>，欢迎您使用商品类别添加功能！</div>
    <form action="goodsCategory/add.action" method="post">
     <ul class="forminfo">
    <table>
    <tr>
    <td><li><label>商品类别名称<b>*</b></label><input name="goodsCategory.categoryName" type="text" class="dfinput"  style="width:218px;"/></li></td>
    </tr>
     <tr>
    <td><li><label>商品类别描述<b>*</b></label><input name="goodsCategory.categoryDescription" type="text" class="dfinput"  style="width:218px;"/></li></td>
    </tr>
     <tr>
    <td align="center"> <li><label><b></b></label><input name="" type="submit" class="btn" value="添加" id="save"/></li></td>
    </tr>
    </table>
   <a href="role/findAll">所有</a>
   </ul>
</form>
  </body>
</html>
