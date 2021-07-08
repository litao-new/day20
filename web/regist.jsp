<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/7/5
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <script type="text/javascript" src="jquery-3.5.1（1）.js"></script>
    <script>
        $(function () {
            $("#un").blur(function () {
                var username=$("#un").val();
                $.get("registServlet",{"us":username},function (msg) {
                    if (msg) {
                        $("#un_msg").text("√");
                    }else{
                        $("#un_msg").text("用户名已被注册，请重新输入");
                    }
                },"json");
            });
        });
    </script>
</head>
<body>
<form>
    用户名:<input type="text" name="username" id="un" >
    <span id="un_msg" style="color: red"></span><br>
    密  码:<input type="password" name="password" id="pwd" ><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
