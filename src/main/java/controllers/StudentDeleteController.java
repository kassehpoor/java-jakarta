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

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sid = req.getParameter("id");
        int id = Integer.parseInt(sid);
        StudentService service = new StudentService();
        try {
            service.delete(id);
            resp.sendRedirect("/student-list.do");
        } catch (SQLException e) {
            resp.sendRedirect("/error.do");
        }


    }
}
