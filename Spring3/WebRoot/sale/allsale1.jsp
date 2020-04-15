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
          <h4 class="M1"><span></span>销售管理员管理</h4>
          <div class="list-item none">
          <table>
        <s:iterator value="#session.rolelist[1].functionSet" var="function">
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
								
						</ul>
						
			</div>
			<div class="main">
				
			
		<center>
		<form action="sale/query.action" method="post">
 <!--  <table border="1" cellspacing="0" cellpadding="10">
  <tr>
  <td>开始日期<label style="color: red"></label></td>
  <td> <input type="text" name="begindate" /> 
   <td>开始日期<label style="color: red"></label></td>
  <td> <input type="text" name="enddate" /><input type="submit" value="查询"  /><br></td>
  </tr>
  
  </table> -->
		 <table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<td>单据编号</td>
			<td>商品名称</td>
		<td>数量</td>
		<td>价格</td>
		<td>商品名称</td>
		<td>数量</td>
		<td>价格</td>
		<td>商品名称</td>
		<td>数量</td>
		<td>价格</td>
		<td>时间</td>
		

		</tr>
		
		<s:if test="#session.salelist==null" >
		              没有任何记录！
		
		</s:if>
		<s:else >
		<s:iterator value="#session.salelist" var="goods"  >
			<tr>
				<td>${goods}</td>
				<td>${num}</td>
					<td>${price}</td>
					<td>${goods1}</td>
				<td>${num1}</td>
					<td>${price1}</td>
					<td>${goods2}</td>
				<td>${num2}</td>
					<td>${price2}</td>

<td>${toprice}</td>
<td>${createdate}</td>
			
			
			</tr>

		</s:iterator>
		</s:else>
		<tr>
			
			
			<td>期间收入总费用：${price}元</td>
			
	<td></td>
		</tr>
	</table>
	<center>当前是第${currentPage}页,共有${totalPage}页
 <a href="salary/findAll?currentPage=1" >首页</a>
 <s:if test="%{currentPage>1}"><a href="salary/findAll?currentPage=${currentPage-1}" >上一页</a>
 <a href="salary/findAll?currentPage=${currentPage-1}" >${currentPage-1}</a></s:if>
 <a href="salary/findAll?currentPage=${currentPage}" >${currentPage}</a>
 <s:if test="%{totalPage>currentPage}"><a href="salary/findAll?currentPage=${currentPage+1}" >${currentPage+1}</a>
 <a href="salary/findAll?currentPage=${currentPage+1}" >下一页</a></s:if>
 <a href="salary/findAll?currentPage=${totalPage}" >尾页</a></center>
		</center>
			</div>
			
		</div>
		
</div>
<div class="bottom"></div>
<div id="footer"><p>Copyright©  2015 版权所有 京ICP备05019125号-10  来源:<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p></div>
<script>navList(12);</script>

  </body>
</html>
