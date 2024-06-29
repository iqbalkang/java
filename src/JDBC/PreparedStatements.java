package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatements {
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/students";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        String query = "INSERT INTO student (name, age, marks) VALUES (?, ?, ?)";

        try (
                Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(query)
        ) {
            preparedStatement.setString(1, "abhishek");
            preparedStatement.setInt(2, 29);
            preparedStatement.setDouble(3, 75.5);

            int rowsAffected = preparedStatement.executeUpdate();
            if(rowsAffected > 0) System.out.println("data has been inserted");
            else System.out.println("something went wrong");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
