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
    
    <title>My JSP 'allRole.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="<%=basePath%>css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=basePath%>js/jquery.js"></script>

<script type="text/javascript">
/* $(document).ready(function(){
  $(".click").click(function(){
  $(".tip").fadeIn(200);
  });
  $(".click").click(function(){
  $(".add").fadeIn(200);
  });
  $(".tiptop a").click(function(){
  $(".tip").fadeOut(200);
});

  $(".sure").click(function(){
  $(".tip").fadeOut(100);
});

  $(".cancel").click(function(){
  $(".tip").fadeOut(100);
});


}); */
$(function(){
$("#add").click(function(){
window.open('role/addRole.jsp', 'windowName');


});

});
/* window.open('role/addRole.jsp', 'windowName', 'width=250, height=250'); */

</script>

  </head>
  
  <body>
  <div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">角色管理</a></li>
    <li><a href="#">所有角色</a></li>
    </ul>
    </div>
    
    <div class="rightinfo">
    
    <div class="tools">
    <input type="button" style="background-image:images/t01.png "  onclick="click()"/>
    	<ul class="toolbar">
   <%-- <a href="role/addRole.html" id="add">dd</a>
        <li class="click" id="add"><span><img src="images/t01.png" /></span>添加</li> --%>
      <!--   <li class="click"><span><img src="images/t02.png" /></span>修改</li>
        <li><span><img src="images/t03.png" /></span>删除</li>
        <li><span><img src="images/t04.png" /></span>统计</li> -->
        </ul>
        
        
        <ul class="toolbar1">
     <!--    <li><span><img src="images/t05.png" /></span>设置</li> -->
        </ul>
    
    </div>
    
    
    <table class="tablelist">
 
    	<thead>
    	<tr>
       
        <th>Id<i class="sort"><img src="images/px.gif" /></i></th>
        <th>商品类别名称</th>
      <th>商品类别描述</th>
       <th>操作</th>
        </tr>
        </thead>
         <s:iterator var="role" value="#session.goodsCategorylist">
        <tbody>
        <tr>
        <td>${id}</td>
        <td>${categoryName}</td>
       <td>${categoryDescription}</td>
        <td><a href="#" class="tablelink">修改</a>    <a href="#" class="tablelink"> 删除</a></td>
        </tr> 
       </tbody>
       </s:iterator>
    </table>
      
   
    <div class="pagin">
    	当前是第${currentPage}页,共有${totalPage}页
 <a href="district/findAll.action?currentPage=1" >首页</a>
 <s:if test="%{currentPage>1}"><a href="district/findAll.action?currentPage=${currentPage-1}" >上一页</a>
 <a href="district/findAll.action?currentPage=${currentPage-1}" >${currentPage-1}</a></s:if>
 <a href="district/findAll.action?currentPage=${currentPage}" >${currentPage}</a>
 <s:if test="%{totalPage>currentPage}"><a href="district/findAll.action?currentPage=${currentPage+1}" >${currentPage+1}</a>
 <a href="district/findAll.action?currentPage=${currentPage+1}" >下一页</a></s:if>
 <a href="district/findAll.action?currentPage=${totalPage}" >尾页</a>
    </div>
    
    
    <div class="tip">
    	<div class="tiptop"><span>添加信息</span><a></a></div>
        
     
        <!-- <span><img src="images/ticon.png" /></span> -->
      
    <!--  <form action="" id="add">
  
      <div class="tipbtn">
        <input name="" type="button"  class="sure" value="确定" />&nbsp;
        <input name="" type="button"  class="cancel" value="取消" />
        </div>
     </form> -->
      
       
   
    </div>
    <!--  -->
   
    
    
    </div>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>

  </body>
</html>
