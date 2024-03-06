<%--
  Created by IntelliJ IDEA.
  User: HAMMAD
  Date: 06-03-2024
  Time: 07:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get All Expenses</title>
</head>
<body>
<h2>Get All Expense Form</h2>

<form action="http://localhost:8080/servlet_001_war/getexpenses" method="get">
    <table>

        <tr>
            <td><input type="submit" value="Get All Expenses"></td>
        </tr>
    </table>
</form>
</body>
</html>
