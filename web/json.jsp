<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/7/5
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
    <script type="text/javascript" src="jquery-3.5.1（1）.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.post("jsonServlet",null,function (msg) {
                        // alert(msg);
                        //解析对象
                        // alert(msg);
                        // alert(msg.sname+","+msg.phone);

                    //解析数组
                    // for (var i=0;i<msg.length;i++) {
                    //     alert(msg[i]);


                    //解析混合类型
                    $.each(msg, function (index, content) {
                        alert(content.sname+","+content.email);
                    });
                },"json");
            });
        });
    </script>
</head>
<body>
<input type="submit" value="JSON测试" id="btn">
</body>
</html>
