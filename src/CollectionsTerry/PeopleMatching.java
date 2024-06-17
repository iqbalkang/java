package CollectionsTerry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employee {
    String firstName;
    String lastName;
    String dob;

    public Employee(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(dob, employee.dob);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName, dob);
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}

public class PeopleMatching {

    public static void main(String[] args) {
        String people = """
            Flinstone, Fred, 10/10/2000
            Rubble, Barney, 2/2/1905
            Flinstone, Wilma, 3/3/1910
            Bubble, Betty, 4/4/1915
            """;

        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4})\\n";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(people);

        Employee employee = null;
        List<Employee> employees = new ArrayList<>();

        while (mat.find()) {
            employee = new Employee(mat.group("firstName"), mat.group("lastName"), mat.group("dob"));
            employees.add(employee);
        }

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int result = o1.lastName.compareTo(o2.lastName);
                return result != 0 ? result : o1.dob.compareTo(o2.dob);
            }
        });




        for(Employee e : employees) {
            System.out.println(e);
        }



        Employee employee1 = employees.get(1);
        Employee employee2 = new Employee("Barney", "Rubble", "2/2/1905");
//        System.out.println(employees.contains(employee2));
//        System.out.println(employee1.equals(employee2));



    }

}
