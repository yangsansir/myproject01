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
          <h4 class="M1"><span></span>财务管理</h4>
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
<h3> 住户缴费单</h3> 
  <form action="houseHoldBill/update.action" method="post"> 
  <s:hidden name="singlePayment.id"/>
  <s:hidden name="singlePayment.houseHoldBill.id"/>
    <table border="1" cellpadding="10" cellspacing="0">
    <tr>
    <td>户主姓名:<input readonly="readonly" type="text" name="houseHoldBill.RealName" value='<s:property value='singlePayment.houseHoldBill.RealName' />'/></td>
    <td>状态：<input type="text" name="singlePayment.status" value='<s:property value='singlePayment.status'/>'/></td>
    
    </tr>
    <tr>
    <td>费用类型：<select name="singlePayment.costType.id">
			<s:iterator var="costType" value="#session.costTypelist">
				<option value="<s:property value='#costType.id'/>"><s:property
						value='#costType.CostTypeName' /></option>
			</s:iterator>
		</select> </td>
    <td>费用：<input type="text" name="singlePayment.Cost" value='<s:property value='singlePayment.Cost'/>'/></td>
   
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
<div id="footer"><p>Copyright©  2015 版权所有 京ICP备05019125号-10  来源:<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p></div>
<script>navList(12);</script>

  </body>
</html>
