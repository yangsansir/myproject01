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
        <s:iterator value="#session.rolelist[1].functionSet" var="function">
          <tr> <td><a href='${Url}'>${FunctionName}</a></td> </tr>
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
	
    <form action="monthReport/update.action" method="post">
    <input name="monthReport.id" value='<s:property value='monthReport.id'/>' type="hidden" id="fax" size="22" />
    <table>
    <tr>
    <td>支出项：</td>
     <td><input name="monthReport.monthPay" value='<s:property value='monthReport.monthPay'/>' type="text" id="form" size="22" /></td>
    </tr>
    <tr>
    <td>支出费用：</td>
     <td> <input name="monthReport.monthPayCount" value='<s:property value='monthReport.monthPayCount'/>' type="text" id="fax" size="22" /></td>
    </tr>
    <tr>
    <td>收入项：</td>
     <td><input name="monthReport.monthIncome" value='<s:property value='monthReport.monthIncome'/>' type="text" id="form" size="22" /></td>
    </tr> 
    <tr>
    <td>收入费用：</td>
     <td> <input name="monthReport.monthIncomeCount" value='<s:property value='monthReport.monthIncomeCount'/>' type="text" id="fax" size="22" /></td>
    </tr>
    <tr>
    <td>小区：</td>
     <td> <select name="monthReport.district.id">
    				<s:iterator var="district" value="#session.districtlist">
    					<option value="<s:property value='#district.id'/>"><s:property value='#district.DistrictName'/></option>
    				</s:iterator>
    		    </select></td>
    </tr>
    <tr>
    <td>月份</td>
     <td><select name="monthReport.month">
				<option>--请选择--</option>
				<option value="01">--1月--</option>
				<option value="02">--2月--</option>
				<option value="03">--3月--</option>
				<option value="04">--4月--</option>
				<option value="05">--5月--</option>
				<option value="06">--6月--</option>
				<option value="07">--7月--</option>
				<option value="08">--8月--</option>
				<option value="09">--9月--</option>
				<option value="10">--10月--</option>
				<option value="11">--11月--</option>
				<option value="12">--12月--</option>
				</select></td>
    </tr>
    <tr>
    <td> <s:submit value="保存"></s:submit></td>
    
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
