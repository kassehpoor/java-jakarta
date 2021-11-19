package exceptions;

import java.sql.SQLException;

public class StudentNotFoundException extends SQLException {

    public StudentNotFoundException(String message){
        super(message);
    }

}
