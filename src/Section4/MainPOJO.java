package Section4;

public class MainPOJO {

    public static void main(String[] args) {

        for(int i = 1; i <=5; i++) {

            String name = "";

            switch (i) {
                case 1 -> name = "bala";
                case 2 -> name = "jeeto";
                case 3 -> name = "abhi";
                case 4 -> name = "prince";
                case 5 -> name = "vicky";
            }

            Student s = new Student("1" + i, name, "01/15/1991", "Java class");

//            System.out.println(s);
        }

        Student s = new Student("1", "bala", "01/15/1991", "Java class");
        StudentRecord sr = new StudentRecord("2", "jeeto", "01/25/1991", "Swift class");

        System.out.println(s.getName() + " is taking " + s.getClassList());
        System.out.println(sr.name() + " is taking " + sr.classList());

    }

}
