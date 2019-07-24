<%--
  Created by IntelliJ IDEA.
  User: xmx
  Date: 2019/7/10
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/register.do" method="post">
    用户名<input type="text" required autofocus autocomplete="on" placeholder="姓名" name="username"><br>
    密码<input type="password" required name="password" autofocus><br>
    性别<input type="text"  name="gender"><br>
    年龄<input type="number" min="0" max="200" name="age"><br>
    爱好<input type="checkbox"  name="hobbyIds" value="1">java课程
    <input type="checkbox"  name="hobbyIds" value="2">python课程
    <input type="checkbox"  name="hobbyIds" value="3">c课程<br>
    生日<input type="date" name="birthday"><br>

<%--  注意：     模型中的模型提交name=user.age--%>
<%--    提交list类型，用user[i].age--%>
<%--    提交map类型，用*['age']来存--%>
    <input type="submit">
</form>
</body>
</html>
