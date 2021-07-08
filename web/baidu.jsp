<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>百度一下</title>
    <style type="text/css">
        * {
            margin: 0px;
            padding: 0px;
        }
        #box {
            display: inline-block;
        }
        #search {
            width: 545px;
            height: 42px;
            border-color: #4E6EF2;
            border-top-left-radius: 10px;
            border-bottom-left-radius: 10px;
            float: left;
        }
        #btn {
            width: 108px;
            height: 42px;
            background-color: #4e6ef2;
            color: #fff;
            border: none;
            font-size: 17px;
            font-weight: 400;
            border-top-right-radius: 10px;
            border-bottom-right-radius: 10px;
            float: left;
        }
        #show {
            width: 545px;
            border: 1px solid #4e6ef2;
            position: relative;
            left: -55px;
            text-align: left;
        }
    </style>
    <script type="text/javascript" src="jquery-3.5.1（1）.js"></script>
    <script type="text/javascript">
        $(function () {
            //键盘抬起
            $("#search").keyup(function () {
                var content = $("#search").val();
                //判断是否为空，不为空才执行里面代码
                if (content !=null && content !="") {
                    $("#show").html("");//清空(每次自动补全清空)
                    $.get("studentServlet",{"sname":content},function (msg) {
                        //each循环
                        //content为返回对应内容
                            $.each(msg, function (index, content) {
                                var snameDiv = "<div>"+content.sname+"</div>";
                                $("#show").append(snameDiv);
                            })
                    },"json");
                }else {
                    $("#show").html("");//清空
                }
            });
        })

    </script>



</head>
<body>
<center>
    <img alt="" width="310" height="150"
         src="http://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png">
    <br/>
    <div id="box">
        <input id="search" type="text" name="search"/>
        <button id="btn">百度一下</button>
    </div>
    <div id="show">


    </div>
</center>
</body>
</html>
