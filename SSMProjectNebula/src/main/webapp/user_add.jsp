<%--
  Created by IntelliJ IDEA.
  User: Dazzling°
  Date: 2021/5/4
  Time: 1:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加用户</title>
    <style type="text/css">
        table {
            background-color: #b8ecee;
            border: 3px;
            width: 50%;
            height: 210px;
        }

        table tr {
            height: 50px;
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
            left: 20%;
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
    <form name="client_form" action="updateUsers" method="POST">
        <table>
            <tr bgcolor="#f5f5f5">
                <td>
                    <div><font>*</font> 姓名:</div>
                </td>
                <td>
                     <input id="username" type="text" name="username" value="" size="40" >
                </td>
            </tr>
			 <tr bgcolor="#f0f0f0">
                <td>
                    <div><font>*</font> 手机号:</div>
                </td>
                <td><input id="phone" type="phone" name="phone" value="" size="40"></td>

            </tr>
      

            <tr bgcolor="#f5f5f5">
                <td></td>
                <td colspan="2">    
                    <input type="submit" value="提交" style="margin-left:150px;" >
                    <a href="user_add.jsp">
                    <input type="reset" value="重置" style="margin-left:110px;">
                    </a>
                </td>
            </tr>
        </table>
    </form>

</div>

</body>
</html>
