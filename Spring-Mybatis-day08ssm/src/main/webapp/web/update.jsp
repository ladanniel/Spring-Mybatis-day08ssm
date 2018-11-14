<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>修改信息列表</title>
</head>
<body style="font-size: 30px;">
  <form action="${pageContext.request.contextPath}/dept/up.do" method="post">
  
                    部门编号：<input name="id" type="text" id="id"><br>
                    部门名称：<input name="deptName" type="text" id="deptName"> <br/>
		部门地址：<input name="deptLoc" type="text" id="deptLoc"> <br/>
	  <input type="submit" value="提交"/>
	   
  </form>
       <!-- <a href="${pageContext.request.contextPath}/dept/showall.do"><button type="submit">查询修改</button></a> --> 
</body>
</html>