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
          <tr> <td><a href='${Url}'>${FunctionName}</a></td> 
          <td><a href='repairType/AddRepairType.jsp'>添加报修类型</a></td>
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
	
    <form action="yearReport/add.action" method="post">
    <table>
    <tr>
    <td>支出项：</td>
     <td><input name="yearReport.yearPay" type="text" id="form" size="22" /></td>
    </tr>
    <tr>
    <td>支出费用：</td>
     <td> <input name="yearReport.yearPayCount" type="text" id="fax" size="22" /></td>
    </tr>
    <tr>
    <td>收入项：</td>
     <td><input name="yearReport.yearIncome" type="text" id="form" size="22" /></td>
    </tr>
    <tr>
    <td>收入费用：</td>
     <td> <input name="yearReport.yearIncomeCount" type="text" id="fax" size="22" /></td>
    </tr>
    <tr>
    <td>小区：</td>
     <td> <select name="yearReport.district.id">
    				<s:iterator var="district" value="#session.districtlist">
    					<option value="<s:property value='#district.id'/>"><s:property value='#district.DistrictName'/></option>
    				</s:iterator>
    		    </select></td>
    </tr>
    <tr>
    <td>年份</td>
     <td><select name="yearReport.year">
				<option>--请选择--</option>
				<option value="2010">--2010--</option>
				<option value="2011">--2011--</option>
				<option value="2012">--2012--</option>
				<option value="2013">--2013--</option>
				<option value="2014">--2014--</option>
				<option value="2015">--2015--</option>
				<option value="2016">--2016--</option>
				<option value="2017">--2017--</option>
				<option value="2018">--2018--</option>
				<option value="2019">--2019--</option>
				<option value="2010">--2020--</option>
			
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
