package academy.mindswap;

import academy.mindswap.persons.Employee;
import academy.mindswap.persons.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeAnalyser {

    public long quantityPerNumberOfYears(List<Employee> company,DepartmentENUM departmentENUM, int numberOfYears){
        return company.stream()
                .filter(department -> department.getDepartment().equals(departmentENUM.getDescription()))
                .filter(employee -> employee.getSeniority() < numberOfYears)
                .count();
    }

    public List<Employee> salaryOver(List<Employee> company, double salary){
        return company.stream()
                .filter(employee -> employee.getSalary() < salary)
                .collect(Collectors.toList());
    }

    public List<Employee> oldestAmount(List<Employee> company, double numberOfEmployees){
        return company.stream()
                .sorted(Comparator.comparingInt(Employee::getSeniority))
                .limit((long) numberOfEmployees)
                .collect(Collectors.toList());
    }

    public Employee firstOldestThen(List<Employee> company, int ageLimit){
        return company.stream()
                .filter(employee -> employee.getSeniority() > ageLimit)
                .max(Comparator.comparingInt(Employee::getSeniority))
                .get();
    }

    public double averageSalary(List<Employee> company, DepartmentENUM departmentENUM){
        return company.stream()
                .filter(department -> department.getDepartment().equals(departmentENUM.getDescription()))
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();
    }

    public List<Employee> sameName (List<Employee> company, DepartmentENUM departmentENUM1, DepartmentENUM departmentENUM2){
        return company.stream()
                .filter(department -> department.getDepartment().equals(departmentENUM1.getDescription()))
                .filter(dep -> dep.getName().subSequence(0, dep.getName().indexOf(" "))
                                .equals(Arrays.stream(company.stream()
                                        .filter(department -> department.getDepartment()
                                                .equals(departmentENUM2.getDescription()))
                                                .map(Person::getName).toString().split(" ")).findFirst()))
                .toList();
    }
}
