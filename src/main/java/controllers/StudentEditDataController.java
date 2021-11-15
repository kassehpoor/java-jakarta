package controllers;

import entities.Student;
import services.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/student-edit.do")

public class StudentEditDataController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sid = req.getParameter("id");
        String name = req.getParameter("name");
        String family = req.getParameter("family");
        String major = req.getParameter("major");
        Student student = new Student(name,family,major);
        int id = Integer.parseInt(sid);
        StudentService service = new StudentService();
        try{
            service.edit(id, student);
            resp.sendRedirect("student-list.do");
        }
        catch (SQLException e) {
            resp.sendRedirect("/error.do");
        }
    }
}
