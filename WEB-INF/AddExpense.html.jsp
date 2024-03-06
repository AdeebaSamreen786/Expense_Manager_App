<%--
  Created by IntelliJ IDEA.
  User: HAMMAD
  Date: 06-03-2024
  Time: 06:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddExpense</title>
</head>
<body>

<h2>Create AddExpense Form</h2>

<form action="http://localhost:8080/servlet_001_war/addexpense" method="post">
    <table>
        <tr>
            <td>Enter Expense ID</td>
            <td><input type="number" name="id"></td>
        </tr>
        <tr>
            <td>Enter Expense Title</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Enter Expense Amount</td>
            <td><input type="number" name="amount"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Add Expense"></td>
        </tr>
    </table>
</form>

</body>
</html>
