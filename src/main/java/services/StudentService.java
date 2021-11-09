package services;

import data.StudentDAO;
import entities.Student;

public class StudentService {

    private StudentDAO studentDAO;

    public StudentService() {

        studentDAO = new StudentDAO();
    }

    public void save(Student student){
        studentDAO.save(student);
    }

}
