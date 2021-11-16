package exceptions;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;

import java.sql.SQLException;

public class StudentNotFoundException extends SQLException {

    public StudentNotFoundException(String message){
        super(message);
    }

}
