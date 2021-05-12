<%--
  Created by IntelliJ IDEA.
  User: Dazzling°
  Date: 2021/5/4
  Time: 0:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加预约</title>
    <style type="text/css">
 table {
            background-color: #b8ecee;
            border: 3px;
            width: 50%;
            height: 280px;
            margin-left:14%;
        }

        table tr {
            height: 60px;
        }

        table tr div {
            text-align: left;
        }

        td font {
            color: red;
        }

        .mylable{
            color: red;
            font-size: 12px;
        }
        div{
            position:relative;
            top: 12%;
            left: 10%;
            font-size: 23px;

        }
        td input{
            font-size: 25px;
            text-align: center;
        }
    </style>
 

</head>
<body>
<div>
    <form name="client_form" action="insterOrders" method="POST">
        <table>
            <tr bgcolor="#f5f5f5">
                <td>
                    <div><font>*</font> 用户姓名:</div>
                </td>
                <td>
                    <input id="username" type="text" name="username" value="" size="40" style="margin-left:20px; margin-top: 22px;">
                </td>
            </tr>
			 <tr bgcolor="#f0f0f0">
                <td>
                    <div><font>*</font> 手机号:</div>
                </td>
                <td><input id="phone" type="phone" name="phone" value="" size="40" style="margin-left:20px; margin-top: 22px;">
                </td>
            </tr>
            <tr bgcolor="#f5f5f5">
                <td>
                    <div><font>*</font> 宠物姓名:</div>
                </td>
                <td>
                    <input id="petname" type="text" name="petname" value="" size="40" style="margin-left:20px; margin-top: 22px;">
                </td>
            </tr>
            <tr bgcolor="#f5f5f5">
                <td>
                    <div><font>*</font> 预约套餐:</div>
                </td>
                <td>
                    <input id="combo" type="text" name="combo" value="" size="40" style="margin-left:20px; margin-top: 22px;">
                </td>
            </tr>
            <tr bgcolor="#f5f5f5">
                <td>
                    <div><font>*</font> 预约时间:</div>
                </td>
                <td>
                    <input id="date" type="text" name="date" value="" size="40" style="margin-left:20px; margin-top: 22px;">
                </td>
            </tr>
            <tr bgcolor="#f5f5f5">
                <td></td>
                <td colspan="2">
                    <input type="submit" value="提交" style="margin-left:180px;">
                    <a href="order_add.jsp"><input type="reset" value="重置" style="margin-left:100px;"></a>
                </td>
            </tr>
        </table>
    </form>

</div>

</body>
</html>
