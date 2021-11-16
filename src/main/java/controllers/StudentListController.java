package controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Student;
import services.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/student-list.do")
public class StudentListController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        try {
            StudentService service = new StudentService();

            List<Student> students = service.getAll();
//            ObjectMapper mapper = new ObjectMapper();
//            String responseText =  mapper.writeValueAsString(students);
//            resp.getWriter().print(responseText);
            req.setAttribute("list", students);
            req.getRequestDispatcher("/WEB-INF/student-list.jsp").forward(req, resp);

        } catch (SQLException e) {
            resp.sendRedirect("/error.jsp");
        }


    }
}
