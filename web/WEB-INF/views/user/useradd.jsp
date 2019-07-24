<%--
  Created by IntelliJ IDEA.
  User: xmx
  Date: 2019/7/10
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/command.do" method="post">
    用户名<input type="text" required autofocus autocomplete="on" placeholder="姓名" name="username"><br>
    密码<input type="password" required name="password" autofocus><br>
    性别<input type="text"  name="gender"><br>
    生日<input type="datetime-local" name="birthday"><br>
    <input type="submit">
</form>
</body>
</html>
