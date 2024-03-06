package Controller;

import Model.Expense;
import Service.ExpenseService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/addexpense")

public class AddExpenseController implements Servlet {
    ExpenseService expenseService = new ExpenseService();


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        try {
            expenseService.addExpense(new Expense());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        PrintWriter writer = servletResponse.getWriter();

        writer.println(expenseService);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
