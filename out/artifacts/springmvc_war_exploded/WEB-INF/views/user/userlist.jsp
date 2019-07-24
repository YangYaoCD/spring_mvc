<%--
  Created by IntelliJ IDEA.
  User: xmx
  Date: 2019/7/9
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
用户列表：
<table border="1">
    <tr>
        <td>名字</td>
        <td>年龄</td>
        <td>性别</td>
        <td>修改</td>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.age}</td>
            <td>${user.gender}</td>
            <td>${user.id}
                <a href="${pageContext.request.contextPath}/user/edit.do?id=${user.id}">修改</a>
                <a href="${pageContext.request.contextPath}/user/edit2/${user.id}.do">修改2</a>
            </td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
