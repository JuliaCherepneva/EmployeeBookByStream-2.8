package pro.sky.EmployeeByStream;

import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    String maxSalary (departmentId);
    String minSalary (departmentId);
    String allByDept(departmentId);
    String allEmployees(departmentId);

}
