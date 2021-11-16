package data;

import entities.Student;
import exceptions.StudentNotFoundException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {


    private Connection connection;


    public StudentDAO() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
        } catch (Exception e) {
            throw new SQLException("Database is not available!");
        }
    }

    public int save(Student student) throws SQLException {

        if (connection != null) {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO STUDENT (NAME , FAMILY ,MAJOR) VALUES (?, ? , ?)");
            ps.setString(1, student.getName());
            ps.setString(2, student.getFamily());
            ps.setString(3, student.getMajor());
            int res = ps.executeUpdate();
            return res;
        }
        return -1;

    }

    public List<Student> getAll() throws SQLException {
        List<Student> students = new ArrayList<>();
        if (connection != null) {

            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM STUDENT");

            while (set.next()) {
                Student student = new Student(set.getInt(1), set.getString(2), set.getString(3), set.getString(4));
                students.add(student);
            }
        }
        return students;
    }

    public void delete(int id) throws SQLException {
        if (connection != null) {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM STUDENT WHERE ID = ?");
            ps.setInt(1, id);
            int res = ps.executeUpdate();
        } else
            throw new SQLException("Connection is null");

    }

    public int edit(Student student) throws SQLException {
        if (connection != null) {
            PreparedStatement ps = connection.prepareStatement("UPDATE STUDENT SET NAME = ?  , FAMILY = ? ,MAJOR = ? WHERE ID = ?");
            ps.setString(1, student.getName());
            ps.setString(2, student.getFamily());
            ps.setString(3, student.getMajor());
            ps.setInt(4, student.getId());
            int res = ps.executeUpdate();
            return res;
        } else
            throw new SQLException("Connection is null");

    }

    public Student findById(int id) throws SQLException, StudentNotFoundException{
        Student student = null;
        if (connection != null) {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM STUDENT WHERE ID = ?");
            ps.setInt(1, id);
            ResultSet res = ps.executeQuery();

            if(res.next()){
                student = new Student();
                student.setId(res.getInt("id"));
                student.setName(res.getString(2));
                student.setFamily(res.getString(3));
                student.setMajor(res.getString(4));
            }
        } else
            throw new SQLException("Connection is null");
        if(student == null)
            throw new StudentNotFoundException("student no found");
        else
            return student;
    }
}
