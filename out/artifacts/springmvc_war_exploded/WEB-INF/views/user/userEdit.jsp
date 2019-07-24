<%--
  Created by IntelliJ IDEA.
  User: xmx
  Date: 2019/7/10
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/update.do" method="post">
    用户名<input type="text" required autofocus autocomplete="on" placeholder="姓名" name="username" value="${user.username}"><br>
    性别<input type="text" required name="gender" autofocus value="${user.gender}"><br>
    年龄<input type="number"  name="age" value="${user.age}"><br>
    <input type="submit">
</form>
</body>
</html>
