<%--
  Created by IntelliJ IDEA.
  User: Dazzling°
  Date: 2021/5/4
  Time: 1:03
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
            background-color: #caebeb;
            border: 3px;
            width: 80%;
            height: 310px;
        }
        table tr {
            height: 28px;
        }
        table tr th{
            font-size: 20px;
            font-family: '幼圆';
        }
        td {
            font-size: 27px;
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

            <th colspan="2">操作</th>
        </tr>
        <c:forEach items="${allUsers}" var="allUsers">
        <tr>
            <td>${allUsers.upassword}</td>
            <td>${allUsers.uname}</td>

            <td><a href="delUsers?uid=${allUsers.uid}">删除</a></td>
            <td><a href="findUsersById?uid=${allUsers.uid}">修改</a></td>
        </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
