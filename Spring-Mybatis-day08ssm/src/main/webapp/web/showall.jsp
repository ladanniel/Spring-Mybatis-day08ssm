<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*,cn.tedu.ssm.bean.*,cn.tedu.ssm.service.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>用户信息表</title>
</head>
<body style="font-size: 30px;">
	<form action="${pageContext.request.contextPath}/dept/up.do" method="post">
		<div align="center" style="color: red;">UserMessageForm</div>
		<table width="60%" border="1" cellpadding="0" cellspacing="0" align="center" style="color: blue;background-color: grey; text-align: center;" >
			<tr align="center">
				<td>Id</td>
				<td>deptName</td>
				<td>deptLoc</td>
				<td>del</td><!-- 增加一个添加功能，当点击添加的时候，连接到添加页面 -->
				<td>add</td>
				<td>update</td>
			</tr>
			<c:forEach items="${list}" var="u">
			<tr align="center"  >
				<td>${u.getId() }</td>
				<td>${u.getDeptName() }</td>
				<td>${u.getDeptLoc() }</td>
				<td>
				<a href="${pageContext.request.contextPath}/dept/delete.do?id=${u.getId()}"><button type="button" style="background-color:grey;">Delete</button></a>
				</td>
				<td><a href="${pageContext.request.contextPath}/dept/show.do" ><button type="button" style="background-color: grey;">Add</button></a>
				</td>
				<td><a href="${pageContext.request.contextPath}/dept/update.do" ><button type="button" style="background-color: grey;">Update</button></a></td>
			</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>