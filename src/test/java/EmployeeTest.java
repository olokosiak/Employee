//Aleksander Kosiak, 08/03/22

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    private Employee Emp;

    public void TestConstructorInvalidTitle(){
        String invalid = "Invalid title";
        Exception exception = assertThrows(IllegalArgumentException.class, ()->new Employee("","Alex","22150PO2",123456789,"Full-Time",22));
        assertEquals(invalid, exception.getMessage());
    }

    public void TestConstructorInvalidName(){
        String invalid = "Invalid name";
        Exception exception = assertThrows(IllegalArgumentException.class, ()->new Employee("Mr","","22150PO2",123456789,"Full-Time",22));
        assertEquals(invalid, exception.getMessage());
    }

    public void TestConstructorInvalidPPS(){
        String invalid = "PPS not valid";
        Exception exception = assertThrows(IllegalArgumentException.class, ()->new Employee("Mr","Alex","",123456789,"Full-Time",22));
        assertEquals(invalid, exception.getMessage());
    }

    public void TestConstructorInvalidType(){
        String invalid = "Employment type incorrect";
        Exception exception = assertThrows(IllegalArgumentException.class, ()->new Employee("Mr","Alex","22150PO2",123456789,"",22));
        assertEquals(invalid, exception.getMessage());
    }

    public void TestConstructorInvalidAge(){
        String invalid = "Age must be over 16";
        Exception exception = assertThrows(IllegalArgumentException.class, ()->new Employee("Mr","Alex","22150PO2",123456789,"Full-Time",12));
        assertEquals(invalid, exception.getMessage());
    }

    public void TestConstructorInvalidPhone(){
        String invalid = "Phone number must be a nine digit number";
        Exception exception = assertThrows(IllegalArgumentException.class, ()->new Employee("Mr","Alex","22150PO2",1234567,"Full-Time",22));
        assertEquals(invalid, exception.getMessage());
    }
}
