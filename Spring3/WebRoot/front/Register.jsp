<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />



<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>客户注册</title>

<link href="css/style_9625.css" rel="stylesheet" type="text/css" />

<style type="text/css">

body {

	background-image: url(style/index_23_8578.jpg);

}

</style>

</head>

<body>

<div class="wrap994">

<div class="top">

<div class="wz"><a href="/">首页</a> |  <a href="message.html">在线留言</a> |  <a href="#" target="_blank">设为首页</a> |  <a href="#" target="_blank">加入收藏</a></div>

</div>

<div id="container">

   <ul id="nav">
   <li class=" span"><a href="index.html">网站首页</a></li>

      <li><a href="aboutus.html">关于我们</a></li>

      <li><a href="news.html">新闻动态</a></li>

      <li><a href="products.html">报修&投诉 </a></li>
      <li><a href="message.html">客户留言</a></li>

      <li><a href="contact.html">联系我们</a></li>

      <li><a href="sgxc.html">友情链接</a></li>

      <li><a href="video.html">视频演示</a></li>

   </ul>

</div>

<div class=" banner_230"><img src="images/khly_73359.jpg" width="960" height="230" /></div>

<div class="main">

<div class="ejym_left">

  <div class="mian-right">  <a href="contact.html"><img src="images/index_06_7226.jpg" width="222" height="65" /></a>

  <a href="video.html"><img src="images/index_07_6385.jpg" width="222" height="65" style=" margin-top:10px;"/></a>

  <a href="products.html"><img src="images/index_08_6366.jpg" width="222" height="65" style=" margin-top:10px;"/></a></div>

</div>

<div class="ejym_right">

<div class="title">

  您现在的位置： 首页 >><b>客户注册</b>

</div>

<ul class="qyjs_nr">

 <form action="residernt/addResidernt.action" method="post">

  <table width="704" border="0" cellpadding="0" cellspacing="1">

    <tbody>

      <tr>

        <td height="40" colspan="2" align="left"> 尊敬的客户朋友,请认真填写您的信息！</td>

      </tr>

      <tr bgcolor="#FFFFFF">

        <td height="30" align="right" bgcolor="#F6F6F6">登录名： </td>

        <td height="25" align="left" bgcolor="#F6F6F6">  

         <input type="text" name="residernt.LoginName" />

          *</td>

      </tr>
        <tr bgcolor="#FFFFFF">

        <td height="30" align="right" bgcolor="#F6F6F6">密码： </td>

        <td height="25" align="left" bgcolor="#F6F6F6">  

       <input type="password" name="residernt.Password" />

          *</td>

      </tr>


      <tr bgcolor="#FFFFFF">

        <td height="30" align="right" bgcolor="#F6F6F6">姓名： </td>

        <td height="25" align="left" bgcolor="#F6F6F6">  

        <input type="text" name="residernt.RealName" />

          *</td>

      </tr>

      <tr bgcolor="#FFFFFF">

        <td height="30" align="right" bgcolor="#F6F6F6">小区： </td>

        <td height="25" align="left" bgcolor="#F6F6F6">  

         <select
			name="district" id="district">
			<s:iterator var="district" value="#session.districtlist">
				<option value="<s:property value='#district.id'/>"><s:property
						value='#district.DistrictName' /></option>
			</s:iterator>
		</select>
楼栋： <select name="residernt.middleFloor.id" id="middleFloor">
			<s:iterator var="middleFloor"
				value="#session.districtlist[0].middleFloorSet">
				<option value="<s:property value='#middleFloor.id'/>"><s:property
						value='#middleFloor.BuildNUmber' /></option>
			</s:iterator>
		</select>
          *</td>

      </tr>

    
  <tr bgcolor="#FFFFFF">

        <td height="30" align="right" bgcolor="#F6F6F6">房号： </td>

        <td height="25" align="left" bgcolor="#F6F6F6">  

          <input type="text" name="residernt.RoomNumber"/>

          *</td>

      </tr>
       <tr bgcolor="#FFFFFF">

        <td height="30" align="right" bgcolor="#F6F6F6">联系方式： </td>

        <td height="25" align="left" bgcolor="#F6F6F6">  

          <input type="text" name="residernt.Telephone"/>

          *</td>

      </tr>

      <tr bgcolor="#FFFFFF">

        <td height="50" colspan="2" align="center" bgcolor="#F6F6F6"><input type="submit" name="Submit" value="提交" />

          <input type="reset" name="Submit2" value="重置" /></td>

      </tr>

    </tbody>

  </table>

  </form>

   

</ul>

</div>

<div class="clear"></div>

</div>

</div>

<div class="foot">

  <ul>

    <div class="wenzi"><a href="aboutus.html">关于我们</a>  |  <a href="news.html">新闻动态</a>  |  <a href="products.html">产品展示</a>  |  <a href="sgxc.html">施工现场</a>  |  <a href="video.html">视频演示</a>  |  <a href="message.html">客户留言</a>  |  <a href="contact.html">联系我们</a></div>

    

  版权所有: 苏ICP备14258989554号<br />

  网址：www.xri.cn   电话：021-32878788985 电邮：3697809@qq.com <br />

  地址：上海市

  </ul>

</div>


</body>

</html>

