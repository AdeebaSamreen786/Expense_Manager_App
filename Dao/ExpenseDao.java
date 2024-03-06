package Dao;

import Model.Expense;
import Util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDao {
    public void addExpense(Expense expense) throws SQLException {
        String query = "insert into course(id, title, amount,payment_mode) values(?,?,?,?)";

        Connection connection = ConnectionUtil.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, expense.getId());
        preparedStatement.setString(2, expense.getTitle());
        preparedStatement.setDouble(3, expense.getAmount());
        preparedStatement.setString(4, expense.getPayment_mode());

        preparedStatement.executeUpdate();
    }

    public void editExpense(Expense expense) throws SQLException {
        String query1 = "update expense set  id=?, title = ?, amount = ?,payment_mode = ? ";

        Connection connection = ConnectionUtil.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(query1);
        preparedStatement.setInt(1, expense.getId());
        preparedStatement.setString(2, expense.getTitle());
        preparedStatement.setDouble(3, expense.getAmount());
        preparedStatement.setString(4, expense.getPayment_mode());

        preparedStatement.executeUpdate();
    }

    public void deleteExpense(Expense expense) throws SQLException {
        String query2 = "delete expense where  id=?";

        Connection connection = ConnectionUtil.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(query2);
        preparedStatement.setInt(1, expense.getId());
        preparedStatement.setString(2, expense.getTitle());
        preparedStatement.setDouble(3, expense.getAmount());
        preparedStatement.setString(4, expense.getPayment_mode());

        preparedStatement.executeUpdate();
    }

    public Expense getExpenseById(int expenseId) throws SQLException {
        Expense expense = null;
        Connection connection = ConnectionUtil.getConnection();
        String query3 = "select * from expense where id=" + expenseId + " limit 1";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query3);
        while (resultSet.next()) {
            expense = Expense.builder()
                    .expenseId(resultSet.getInt("id"))
                    .expenseTitle(resultSet.getString("title"))
                    .expenseAmount(resultSet.getString("amount"))
                    .expensePayment_mode(resultSet.getDouble("amount"))

                    .build();
        }
        return expense;
    }

    public List<Expense> getAllExpenses(Object expense) throws SQLException {
        List<Expense> expenseList = new ArrayList<>();
        Connection connection = ConnectionUtil.getConnection();
        String query4 = "select * from expense";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query4);
        while (resultSet.next()) {
            Expense expense = Expense.builder()
                    .expenseId(resultSet.getInt("id"))
                    .expenceTitle(resultSet.getString("title"))
                    .expenseAmount(resultSet.getDouble("amount"))
                    .expensePayment_mode(resultSet.getString("payment_mode"))
                    .build();
            expenseList.add(expense);
        }
        return expenseList;
    }
}
