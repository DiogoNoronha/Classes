package academy.mindswap;

import academy.mindswap.persons.Employee;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private List<Employee> employeeList;
    private String name;

    public Department(DepartmentENUM departmentENUM){
        this.employeeList = new ArrayList<>();
        this.name = departmentENUM.getDescription();
    }

    public void add(Employee employee){
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public String getName() {
        return name;
    }
}
