
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>视屏点赞</title>
    <script type="text/javascript">
        function like() {
            var xhr = new XMLHttpRequest();
            xhr.open("get","likeServlet",true);
            xhr.send();
            xhr.onreadystatechange=function () {
                var state = xhr.readyState;
                if (state ==4) {
                    var msg = xhr.responseText;
                    document.getElementById("count").innerText=msg;
                }
            }
        }
    </script>
</head>
<body>
<video src="snowPerson.mp4" autoplay loop controls width="400"></video><br>
<input type="button" value="点赞" onclick="like()">
当前点赞量：<span style="color: blue" id="count">0</span>
</body>
</html>
