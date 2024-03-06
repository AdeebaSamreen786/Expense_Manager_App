<%--
  Created by IntelliJ IDEA.
  User: HAMMAD
  Date: 06-03-2024
  Time: 07:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get ExpenseBy Id</title>
</head>
<body>
<h2>Get Expense By Id Form</h2>

<form action="http://localhost:8080/servlet_001_war/getexpensebyid" method="get">
    <table>
        <tr>
            <td>Enter Expense ID</td>
            <td><input type="number" name="id"></td>
        </tr>


        <tr>
            <td><input type="submit" value="Expense By Id"></td>
        </tr>
    </table>
</form>
</body>
</html>
