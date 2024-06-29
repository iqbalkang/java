package JDBC;

import java.sql.*;
import java.util.Iterator;

public class YoutubeTut {
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/students";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {

        try (
                Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                Statement statement = connection.createStatement();
        ) {
//            String query = "INSERT INTO student (name, age, marks) VALUES ('%s', %d, %f)".formatted("jeeto", 30, 99.99);
            String query = "UPDATE student SET marks = %f WHERE id = %d".formatted(99.5, 1);
            int rowAffected = statement.executeUpdate(query);

            if(rowAffected > 0) System.out.println("Data has been updated successfully");
            else System.out.println("Data could not be inserted");



//            String query = "SELECT * FROM student";
//            ResultSet resultSet = statement.executeQuery(query);
//
//            while(resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                double marks = resultSet.getDouble("marks");
//                System.out.println("ID " + id);
//                System.out.println("Name " + name);
//                System.out.println("Age " + age);
//                System.out.println("Marks " + marks);
//
//            }

        }catch (SQLException e) {
            System.out.println(e);
        }

    }
}



