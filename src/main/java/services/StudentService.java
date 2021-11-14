package services;

import data.StudentDAO;
import entities.Student;

import java.sql.SQLException;

public class StudentService {

    private StudentDAO studentDAO;

    public StudentService() {

        studentDAO = new StudentDAO();
    }

    public int save(Student student) throws SQLException {
        return studentDAO.save(student);
    }

}
