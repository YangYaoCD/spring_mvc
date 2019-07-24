<%--
  Created by IntelliJ IDEA.
  User: xmx
  Date: 2019/7/9
  Time: 16:08
  To change this template use File | Settings | File Templates.

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>$Title$</title>
    <%--<script src="js/jquery.form.js"/>--%>
<%--    <script src="js/index.js" type="text/javascript"/>--%>
    <script src="js/jquery-3.4.1.js"></script>
    <script src="js/jquery.form.js"></script>
    <script type="text/javascript">
      function submitImg() {
        alert("111");
        $("form").ajaxSubmit({
          type: 'post', // 提交方式 get/post
          url: 'http://localhost:8081/rest/upload/itemspic', // 需要提交的 url
          success: function(data) { // data 保存提交后返回的数据，一般为 json 数据
            // 此处可对 data 作相关处理
            alert('提交成功！');
          }
        // var options={
        //   url:  "http://localhost:8081/upload/itemspic.do",
        //   type: "POST" ,
        //   data:{"uu":"www"},
        //   dataType:"json",
        //   success:function (respData) {
        //     console.log(respData);
        //   }
        // }
        // $('#itemForm').ajaxSubmit(options);

      })
      }
    </script>
  </head>
  <body>
  <form name="itemForm">
    名字：<input type="text" name="Username" autofocus autocomplete="true"><br>
    ID:<input type="text" name="ID"><br>
    <input type="file" name="itemspic1" onchange="submitImg()"><br>
    <input type="button" name="sub">
  </form>
  </body>
</html>
