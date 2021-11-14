package data;

import entities.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {



    private static Connection connection;


    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int save(Student student) throws SQLException {

        if(connection != null){
            PreparedStatement ps = connection.prepareStatement("INSERT INTO STUDENT (NAME , FAMILY ,MAJOR) VALUES (?, ? , ?)");
            ps.setString(1, student.getName());
            ps.setString(2, student.getFamily());
            ps.setString(3, student.getMajor());
            int res = ps.executeUpdate();
            return res;
        }
        return -1;

    }
}
