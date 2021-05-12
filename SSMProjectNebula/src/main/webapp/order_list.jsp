<%--
  Created by IntelliJ IDEA.
  User: Dazzling°
  Date: 2021/5/4
  Time: 0:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>用户列表</title>
    <link href="css/tables.css" rel="stylesheet"/>
        <style type="text/css">
        table {
               background-color: #e7f7f7;
               border: 3px;
               width: 80%;
               height: 410px;
           }
           table tr {
               height: 20px;
           }
           table tr th{
               font-size: 20px;
               font-family: '幼圆';
           }
           td {
               font-size: 23px;
               font-family: '幼圆';
               font-weight: bold;
           }
       </style>
</head>
<body>
<div class="emp_contaner">
    <h2>用户列表</h2>
    <table>
        <tr>
            <th>手机号</th>
            <th>用户名</th>
            <th>宠物名</th>
            <th>预约套餐</th>
            <th>预约时间</th>
            <th colspan="2">操作</th>
        </tr>
          <c:forEach items="${allOrders}" var="allOrders">
        <tr>
            <td>${allOrders.phone}</td>
            <td>${allOrders.username}</td>
            <td>${allOrders.petname}</td>
            <td>${allOrders.combo}</td>
            <td>${allOrders.date}</td>
            <td><a href="delOrders?pid=${allOrders.pid}">删除</a></td>
            <td><a href="findOrdersById?pid=${allOrders.pid}">修改</a></td>
        </tr>
        </c:forEach>
       
    </table>
</div>
</body>
</html>
