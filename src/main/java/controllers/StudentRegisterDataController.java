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

@WebServlet("/student-register.do")
public class StudentRegisterDataController extends HttpServlet {

    StudentService studentService;

    public StudentRegisterDataController(){
        studentService = new StudentService();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String family = req.getParameter("family");
        String major = req.getParameter("major");
        Student student = new Student(name,family,major);
        try {
            studentService.save(student);
            resp.sendRedirect("/");

        } catch (SQLException e) {
            e.printStackTrace();
            resp.sendRedirect("/error.do");
        }
    }
}
