package academy.mindswap;

import academy.mindswap.persons.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Department account = new Department(DepartmentENUM.ACCOUNT);
        Department production = new Department(DepartmentENUM.PRODUCTION);
        Department packaging = new Department(DepartmentENUM.PACKAGING);
        Department sales = new Department(DepartmentENUM.SALES);

        Employee employee1 = new Employee(5,2000,"Ze Manel", DepartmentENUM.ACCOUNT);
        Employee employee2 = new Employee(2,1000,"Ze Quim", DepartmentENUM.PACKAGING);
        Employee employee3 = new Employee(7,2500,"Ze Maria", DepartmentENUM.ACCOUNT);
        Employee employee4 = new Employee(3,1500,"Maria Filipa", DepartmentENUM.ACCOUNT);
        Employee employee5 = new Employee(4,1500,"Maria Carla", DepartmentENUM.PACKAGING);
        Employee employee6 = new Employee(1,500,"Maria Alberta", DepartmentENUM.PRODUCTION);
        Employee employee7 = new Employee(10,1500,"Antonio Alberto", DepartmentENUM.PRODUCTION);
        Employee employee8 = new Employee(10,2000,"Manel Fonseca", DepartmentENUM.SALES);

        Employee[] employees = new Employee[]{employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8};

        List<Employee> mindera = Arrays.asList(employees);



    }
}
