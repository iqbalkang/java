package NestedClasses.TimAgain;

import java.util.Comparator;

//public class EmployeeComparator<T> implements Comparator {
//
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        if(o1 instanceof Integer int1 && o2 instanceof Integer int2) {
//            return int1.compareTo(int2);
//        }
//        if(o1 instanceof Employee emp1 && o2 instanceof Employee emp2) {
//            return emp1.getName().compareTo(emp2.getName());
//        }
//        return 0;
//    }
//}

public class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}




