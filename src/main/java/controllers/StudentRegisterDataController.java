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



    public StudentRegisterDataController(){

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String family = req.getParameter("family");
        String major = req.getParameter("major");
        String ssn = req.getParameter("ssn");
        Student student = new Student(ssn,name,family,major);
        try {
            StudentService studentService = new StudentService();
            studentService.save(student);
            resp.sendRedirect("/student-list-page.do");

        } catch (SQLException e) {
            e.printStackTrace();
            resp.sendRedirect("/error.do");
        }
    }
}
