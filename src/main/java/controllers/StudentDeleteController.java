package controllers;

import services.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/student-delete.do")
public class StudentDeleteController extends HttpServlet {


    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sid = req.getParameter("id");
        int id = Integer.parseInt(sid);

        try {
            StudentService service = new StudentService();
            service.delete(id);
            resp.sendRedirect("/student-list-page.do");
        } catch (SQLException e) {
            resp.sendRedirect("/error.do");
        }


    }
}
