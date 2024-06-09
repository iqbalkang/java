package NestedClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee[] employesArray = {
                new Employee(100, "bala", 2017),
                new Employee(101, "jeeto", 2020),
                new Employee(102, "abhi", 2016),
                new Employee(103, "prince", 2010)
        };

        List<Employee> employes = new ArrayList<>(List.of(employesArray));
        System.out.println(employes);

//        Comparator<Employee> sorter = new EmployeeComparator<>();
//        employes.sort(sorter);

        Comparator<Employee> sorter = new Employee.EmployeeComparator<>("yearStarted");
        employes.sort(sorter);

        for(Employee e : employes) {
            System.out.println(e);
        }




    }
}
