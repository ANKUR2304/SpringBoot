package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres"; // Database URL
        String username = "your_username"; // Database username
        String password = "your_password"; // Database password

        Connection connection = null;
        try{
            // Load and Register the Driver for your DB
            Class.forName("org.postgresql.Driver");
            // Make the connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established!");

            // Create a simple statement
            Statement statement = connection.createStatement();

            // Execute a query
            String query = "SELECT * FROM test";
            ResultSet resultSet = statement.executeQuery(query);

            // Process the results
            while (resultSet.next()) {
                // parse complete row (using the columnLabels - "id", "username", "currorg")
                int id = resultSet.getInt("id");
                String name = resultSet.getString("username");
                String currOrg = resultSet.getString("currorg");

                System.out.println("ID: " + id + ", Name: " + name + ", Org: " + currOrg);
            }
            // Close the Connection
            connection.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}