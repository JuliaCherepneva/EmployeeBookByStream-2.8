package pro.sky.EmployeeByStream;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    String hello();
    Employee addEmployee(String firstName, String lastName, int salary, int departmentId);
    String removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    List<Employee> allEmployees();
    boolean validateInput(String firstName, String lastName);
}
