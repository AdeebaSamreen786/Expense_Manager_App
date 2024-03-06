package Service;

import Dao.ExpenseDao;
import Model.Expense;

import java.sql.SQLException;
import java.util.List;

public class ExpenseService {
    static ExpenseDao expenseDao = new ExpenseDao();

    public static Expense findExpenseById(int expenseId) throws SQLException {
        return null;
    }

        public void addExpense (Expense expense) throws SQLException {
            expenseDao.addExpense(expense);
        }

        public static void editExpense (Expense expense) throws SQLException {
            expenseDao.editExpense(expense);
        }

        public static void deleteExpense (Expense expense) throws SQLException {
            expenseDao.deleteExpense(expense);
        }

        public void getExpenseById (Expense expense) throws SQLException {
            int Expense = 0;
            expenseDao.getExpenseById(Expense);
        }


        public static List<Expense> getAllExpenses() throws SQLException {
            Object Expense = null;
            return (List<Model.Expense>) expenseDao.getAllExpenses(Expense);
        }


    }