<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>用户注册</title>
</head>
<body style="font-size: 30px;">
<!-- pageContext.request.contextPath:绝对路径 -->
	<form action="${pageContext.request.contextPath}/dept/add.do" method="post">
		部门名称：<input name="deptName" type="text" id="deptName"> <br/>
		部门地址：<input name="deptLoc" type="text" id="deptLoc"> <br/>
		<input type="submit" value="添加">
	</form>
</body>
</html>