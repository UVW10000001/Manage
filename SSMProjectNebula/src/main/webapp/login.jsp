<%--
  Created by IntelliJ IDEA.
  User: Dazzling°
  Date: 2021/5/4
  Time: 0:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width" />
    <title>宠物洗护预约－后台登录</title>
    <meta name="description" content="宠物洗护预约登录页面"/>
    <meta name="keywords" content="宠物洗护预约后台页面">
    <!--[if lt IE 9]>
    <script src="./js/jslib/html5shiv.js"></script>
    <![endif]-->
    <link rel="stylesheet" href="./css/style.css">
    <script type="text/javascript">

        /* 设置登录块随不同分辨率改变大小并居中 */
        function vMiddle(){
            var middleDiv=document.getElementById("loginform");
            var divWidth = middleDiv.offsetWidth;
            var divHeight = divWidth*0.8;
            middleDiv.style.height = divHeight+"px";
            var bodyHeight=document.body.offsetHeight;
            //设置居中
            middleDiv.style.marginTop = -divHeight/2+"px";
            middleDiv.style.marginLeft = -divWidth/2 + "px";

            //设置标题位置垂直居中
            var titleDiv = document.getElementById("title");
            var titleHeight = titleDiv.offsetHeight;
            titleDiv.style.lineHeight = titleHeight + "px";
        }
    </script>
</head>
<body onload="vMiddle();">
<div class="divtop">

    宠物洗护预约后台管理系统
</div>
<div class="loginform" id="loginform">
    <div class="title" id="title">
        管理员登录
    </div>
    <!-- 登录错误显示 -->
    <div class="error">用户名或密码错误</div>

    <form id="login" action="login" method="get">
        <div class="item">
            <label for="phone" class="item-label">用户名</label>
            <input class="item-text" type="text" name="phone" id="phone">
        </div>
        <div class="item">
            <label for="password" class="item-label">密&nbsp;&nbsp;&nbsp;码</label>
            <input required class="item-text" type="password" name="password" id="password" maxlength="20">
        </div>

        <div class="item">
            <input type="submit" value="登录" class="loginbtn">
        </div>
    </form>
</div>

</body>
</html>