package JDBC;


import java.sql.*;
import java.util.Scanner;

public class BatchProcessing {
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/students";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        String query = "INSERT INTO student (name, age, marks) VALUES (?, ?, ?)";

        try (
                Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            while(true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter student name ");
                String name = scanner.next();

                System.out.println("Enter student age ");
                int age = scanner.nextInt();

                System.out.println("Enter student marks ");
                double marks = scanner.nextDouble();

                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, age);
                preparedStatement.setDouble(3, marks);
                preparedStatement.addBatch();

                System.out.println("Do you want to add more values (Y/N)? ");
                String choice = scanner.next();

                if(choice.equalsIgnoreCase("n")) break;
            }

            int[] arr = preparedStatement.executeBatch();

            for(int i : arr) {
                if(i == 0) System.out.printf("query# %d could not run successfully%n", i);
                else System.out.println("data inserted successfully");
            }

        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }
}


//package JDBC;
//
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class BatchProcessing {
//    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/students";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "password";
//
//    public static void main(String[] args) {
//
//        try (
//                Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
//                Statement statement = connection.createStatement();
//                ) {
//            while(true) {
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Enter student name ");
//                String name = scanner.next();
//
//                System.out.println("Enter student age ");
//                int age = scanner.nextInt();
//
//                System.out.println("Enter student marks ");
//                double marks = scanner.nextDouble();
//
//                String query = "INSERT INTO student (name, age, marks) VALUES ('%s', %d, %f)".formatted(name, age, marks);
//                statement.addBatch(query);
//
//                System.out.println("Do you want to add more values (Y/N)? ");
//                String choice = scanner.next();
//
//                if(choice.equalsIgnoreCase("n")) break;
//            }
//
//            statement.executeBatch();
//
//        }
//        catch (SQLException e) {
//            System.out.println(e);
//        }
//    }
//}
