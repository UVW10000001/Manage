<%--
  Created by IntelliJ IDEA.
  User: Dazzling°
  Date: 2021/4/24
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-cn">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>后台管理中心</title>
  <link rel="stylesheet" href="css/pintuer.css">
  <link rel="stylesheet" href="css/admin.css">
  <script src="js/jquery.js"></script>
  <script type="text/javascript">
    $(function(){
      $(".leftnav h2").click(function(){
        $(this).next().slideToggle(200);
        $(this).toggleClass("on");
      })
      $(".leftnav ul li a").click(function(){
        $("#a_leader_txt").text($(this).text());
        $(".leftnav ul li a").removeClass("on");
        $(this).addClass("on");
      })
    });
  </script>
</head>
<body>

<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img src="images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" />后台管理中心</h1>
  </div>
</div>

<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>



  <h2><span class="icon-pencil-square-o"></span>用户管理</h2>
  <ul>
    <li><a href="user_add.jsp" target="right"><span class="icon-caret-right"></span>添加用户</a></li>
    <li><a href="allUsers" target="right"><span class="icon-caret-right"></span>用户列表</a></li>
  </ul>

  <h2><span class="icon-pencil-square-o"></span>预约管理</h2>
  <ul>
    <li><a href="order_add.jsp" target="right"><span class="icon-caret-right"></span>添加预约</a></li>
    <li><a href="allOrders" target="right"><span class="icon-caret-right"></span>预约列表</a></li>
  </ul>

</div>

<div class="rightContent">
  <ul class="bread">
    <li><a href="hello.jsp" target="right" class="icon-home"> 首页</a></li>
  </ul>
  <div class="admin">
    <iframe scrolling="auto" rameborder="0" src="info.jsp" name="right" width="100%" height="100%"></iframe>
  </div>
</div>

</body>
</html>
