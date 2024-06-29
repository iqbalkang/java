package JDBC;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String CONN_STR = "jdbc:mysql://localhost:3306/music";

    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection(CONN_STR, "root", "password");
            Statement statement = connection.createStatement()
        ) {
            System.out.println("Enter an artist id:");

            Scanner sc = new Scanner(System.in);
            String artistId = sc.nextLine();
            int artistid = Integer.parseInt(artistId);

            String QUERY = "SELECT * FROM music.artists WHERE artist_id = '%d'".formatted(artistid);

            ResultSet resultSet = statement.executeQuery(QUERY);
            System.out.println("connection successful!");

            ResultSetMetaData meta = resultSet.getMetaData();

            for(int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf("%-15s", meta.getColumnName(i).toUpperCase());
            }

            System.out.println();

            while(resultSet.next()) {
                for(int i = 1; i <= meta.getColumnCount(); i++) {
                    System.out.printf("%-15s", resultSet.getString(i));
                }
                    System.out.println();
            }


        }catch (Exception e) {
            System.out.println(e);
        }


    }

}
