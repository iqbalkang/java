package NestedClasses;

import java.util.Comparator;

public class Employee {

    public static class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

        private String sortOrder;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortOrder) {
            this.sortOrder = sortOrder;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            if(sortOrder.equalsIgnoreCase("yearStarted")) {
                return o1.yearStarted - o2.yearStarted;
            }

            return o1.getName().compareTo(o2.getName());
        }
    }

    private int id;

    private String name;

    private int yearStarted;

    public Employee() {
    }

    public Employee(int id, String name, int yearStarted) {
        this.id = id;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %s %d".formatted(id, name, yearStarted);
    }
}
