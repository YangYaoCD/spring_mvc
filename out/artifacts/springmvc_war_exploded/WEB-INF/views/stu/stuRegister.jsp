<%--
  Created by IntelliJ IDEA.
  User: xmx
  Date: 2019/7/10
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="../../../js/jquery-1.11.3.min.js" type="text/javascript"/>
<html>
<head>
    <title>发json格式数据到spring mvc</title>
    <script type="text/javascript">
        window.onload=function (ev) {
            document.querySelector("#sb").onclick=function () {
                var url="${pageContext.request.contextPath}/stu/save.do";
                var name=document.querySelector("#name").value;
                var gender=document.querySelector("#gender").value;
                var parameters={
                    name:name,
                    gender:gender
                };
                var jsonObj=JSON.stringify(parameters);
                alert(jsonObj)
                $.ajax({
                    type:"post",
                    contentType: 'application/json',
                    url:url,
                    data:JSON.stringify(parameters),
                    success:function (data) {
                        console.log(data);
                    }
                })
            }
        }
    </script>
    <script>

        function register() {
            var url="${pageContext.request.contextPath}/stu/save.do";
            var name=document.querySelector("#name").value;
            var gender=document.querySelector("#gender").value;
            var parameters={
                name:name,
                gender:gender
            };
            var jsonObj=JSON.stringify(parameters);
            console.log("原始数据："+parameters);
            console.log("发出去的json数据："+jsonObj)
            alert(jsonObj)
            $.ajax({
                type:'post',
                dataType:'json',
                contentType: 'application/json',
                url:url,
                data:JSON.stringify(parameters),

                success:function (data) {
                    console.log("接收到的json数据："+data);
                }
            })
        }
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/stu/save1.do" method="post">
    学生名字：<input type="text" name="name" id="name"><br>
    性别：<input type="text" name="gender" id="gender"><br>
    <input type="button" value="json提交" id="sb" onclick="register()">
    <input type="submit">
</form>

</body>
</html>
