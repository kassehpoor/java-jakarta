package services;

import data.StudentDAO;
import entities.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentService {

    private StudentDAO studentDAO;

    public StudentService() {

        studentDAO = new StudentDAO();
    }

    public int save(Student student) throws SQLException {
        return studentDAO.save(student);
    }

    public List<Student> getAll() throws SQLException {
        return studentDAO.getAll();
    }

    public void delete(int id) throws SQLException {

        studentDAO.delete(id);
    }
}
