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
          <h4 class="M1"><span></span>保安管理</h4>
          <div class="list-item none">
          <table>
        <s:iterator value="#session.rolelist[2].functionSet" var="function">
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
								<li><a
					href="GoodsType/AddGoodsType.jsp">添加物品类别</a></li>
						</ul>
						
			</div>
			<div class="main">
				<center><table border="1" cellspacing="0" cellpadding="10">
			<tr>
				<td>Id</td>
				<td>维修类型</td>
				<td>操作</td>
			</tr>
			<s:iterator value="#session.goodsTypelist" var="goodsType">
			<tr>
				<td>${id}</td>
				<td>${GoodsTypeName}</td>
				<td><a href="goods/findById.action?id=${id}">修改</a> <a
					href="goods/delete.action?id=${id}">删除</a>
					
					</td>
			</tr>
			</s:iterator>
		</table>

	
				<center>当前是第${currentPage}页,共有${totalPage}页
 <a href="goods/findAll?currentPage=1">首页</a>
 <s:if test="%{currentPage>1}"><a href="goods/findAll?currentPage=${currentPage-1}" >上一页</a>
 <a href="goods/findAll?currentPage=${currentPage-1}">${currentPage-1}</a></s:if>
 <a href="goods/findAll?currentPage=${currentPage}">${currentPage}</a>
 <s:if test="%{totalPage>currentPage}"><a href="goods/findAll?currentPage=${currentPage+1}" >${currentPage+1}</a>
 <a href="goods/findAll?currentPage=${currentPage+1}" >下一页</a></s:if>
 <a href="goods/findAll?currentPage=${totalPage}" >尾页</a></center>
		</center>		
			</div>
			
		</div>
		
</div>
<div class="bottom"></div>
<div id="footer"><p>Copyright©  2015 版权所有 京ICP备05019125号-10  来源:<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p></div>
<script>navList(12);</script>

  </body>
</html>
