<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
					<h4 class="M1">
						<span></span>库存管理员管理
					</h4>
					<div class="list-item none">
						<table>
							<s:iterator value="#session.rolelist[2].functionSet"
								var="function">
								<tr>
									<td><a href='${Url}'>${FunctionName}</a></td>
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

				<center style="margin-top: 100px;">
					<form action="singlePayment/update1.action" method="post">
						<input type="text" name="singlePayment.id"
							value='<s:property value='singlePayment.id'/>' />
							 <input type="text" name="houseHoldBill.id" value='<s:property value='singlePayment.houseHoldBill.id'/>'/>
							  <input type="hidden" name="checkUser.id" value='<s:property value='singlePayment.checkUser.id'/>'/>
						<table border="1">
							<tr>
								<td>时间：<input type="text" name="houseHoldBill.createTime"
									value='<s:property value='singlePayment.houseHoldBill.createTime'/>' /></td>
						   		<td>检验员：<input type="text" name="singlePayment.checkUser.id"
									value='<s:property value='singlePayment.checkUser.id'/>' />
								</td>
							</tr>
							<tr>
								<td>商品分类： <input type="text" name="singlePayment.categoryName"
									value='<s:property value='singlePayment.categoryName'/>' /></td>
								<td>商品名：<input type="text" name="singlePayment.goodsName"
									value='<s:property value='singlePayment.goodsName'/>' /></td>
							

							</tr>
							<tr>
								
								<td>数量：<input type="text" name="carPayment.number"
									value='<s:property value='carPayment.number'/>' /></td>
								<td>状态：
								<select name="carPayment.status"><option>已审批</option>
								         <option>审批未过</option>
								</select>
								<%-- <input type="text" name="carPayment.status"
									value='<s:property value='carPayment.status'/>' /> --%></td>

							</tr>
							<tr>
								<td><s:submit value="保存"></s:submit></td>
							</tr>
						</table>

					</form>
				</center>
			</div>

		</div>

	</div>
	<div class="bottom"></div>
	<div id="footer">
		<p>
			Copyright© 2015 版权所有 京ICP备05019125号-10 来源:<a
				href="http://www.mycodes.net/" target="_blank">源码之家</a>
		</p>
	</div>
	<script>
		navList(12);
	</script>

</body>
</html>
