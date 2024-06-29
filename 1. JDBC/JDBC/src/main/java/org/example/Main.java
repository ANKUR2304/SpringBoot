package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres"; // Database URL
        String username = "your_username"; // Database username
        String password = "your_password"; // Database password

        String insertSQL = "INSERT INTO test (id, username, currorg) VALUES (?, ?, ?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, username, password);

            // Create a prepared statement
            preparedStatement = connection.prepareStatement(insertSQL);

            // Set the parameters
            preparedStatement.setInt(1, 1); // ID
            preparedStatement.setString(2, "user1"); // username
            preparedStatement.setString(3, "org1"); // currOrg

            // Execute the update
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}