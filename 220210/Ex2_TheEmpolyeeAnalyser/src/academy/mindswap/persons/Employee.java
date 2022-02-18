package academy.mindswap.persons;

import academy.mindswap.DepartmentENUM;

public class Employee extends Person {

    private int seniority;
    private int salary;
    private String department;


    public Employee(int seniority, int salary, String name, DepartmentENUM departmentENUM){
        super(name);
        this.seniority = seniority;
        this.salary = salary;
        this.department = departmentENUM.getDescription();
    }

    public int getSeniority() {
        return seniority;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}