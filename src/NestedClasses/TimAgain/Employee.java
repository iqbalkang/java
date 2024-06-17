package NestedClasses.TimAgain;

import java.util.Comparator;

public class Employee {

//!    inner class
    static class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

        String sortType;

    public EmployeeComparator() {
        this("name");
    }

    public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
            public int compare(Employee o1, Employee o2) {
                if(sortType.equals("yearStarted")) return o1.yearStarted - o2.yearStarted;
                return o1.getName().compareTo(o2.getName());
            }
    }

//!    outer class members
    private String name;
    private int id;
    private int yearStarted;

    public Employee() {
    }

    public Employee(String name, int id, int yearStarted) {
        this.name = name;
        this.id = id;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %s, %d".formatted(id, name, yearStarted);
    }
}
