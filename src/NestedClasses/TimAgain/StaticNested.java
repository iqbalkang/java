package NestedClasses.TimAgain;

import java.util.ArrayList;
import java.util.List;

public class StaticNested {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("jeeto", 2, 2015),
                new Employee("bala", 1, 2010),
                new Employee("prince", 3, 1990),
                new Employee("abhi", 4, 1980)
        ));

        var comp = new Employee.EmployeeComparator<>("yearStarted");
        employees.sort(comp);

        for(Employee e : employees) {
            System.out.println(e);
        }

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee("bala", 10, 2010, "pind"),
                new StoreEmployee("jeeto", 10, 2012, "kaiser"),
                new StoreEmployee("abhi", 10, 2001, "bank"),
                new StoreEmployee("abhi", 10, 2000, "bank"),
                new StoreEmployee("prince", 10, 2010, "verka"),
                new StoreEmployee("vicky", 10, 1990, "marcus")
        ));

        System.out.println("-".repeat(50));

        var newComp = new StoreEmployee(). new StoreComparator<>();
        storeEmployees.sort(newComp);

        for(StoreEmployee e : storeEmployees) {
            System.out.println(e);
        }


//        var newComp = new StoreEmployee.EmployeeComparator<>();
//        var comp = new EmployeeComparator<>();
//        employees.sort(comp);
//        List<Integer> l1 = new ArrayList<>(List.of(2, 4, 3, 1));
//        l1.sort(comp);
//        System.out.println(l1);
    }
}
