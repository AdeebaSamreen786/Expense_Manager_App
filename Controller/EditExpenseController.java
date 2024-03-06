package Controller;

import Model.Expense;
import Service.ExpenseService;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet ("/editexpense")
public class EditExpenseController extends GenericServlet {

    private boolean Expense;

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        try {
            ExpenseService.editExpense(new Expense());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        PrintWriter writer = servletResponse.getWriter();

        writer.println(Expense);
    }
}
