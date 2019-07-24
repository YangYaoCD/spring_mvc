<%--
  Created by IntelliJ IDEA.
  User: xmx
  Date: 2019/7/16
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login.do" method="post">
    用户名:<input type="text" name="username" autocomplete="true" autofocus><br>
    密码:<input type="text" name="password"><br>

<input type="submit" value="提交">
</form>
</body>
</html>
