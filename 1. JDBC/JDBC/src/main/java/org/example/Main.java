package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres"; // Database URL
        String username = "your_username"; // Database username
        String password = "your_password"; // Database password

        //String insertSQL = "INSERT INTO test (id, username, currorg) VALUES (?, ?, ?)";

        Connection connection = null;
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connection Established!");

            /*
            // Create a prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);

            // Set the parameters
            preparedStatement.setInt(1, 1); // ID
            preparedStatement.setString(2, "user1"); // username
            preparedStatement.setString(3, "org1"); // currOrg

            // Execute the update
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
            */

            // Create a simple statement
            Statement statement = connection.createStatement();

            // Execute a query
            String query = "SELECT * FROM test";
            ResultSet resultSet = statement.executeQuery(query);

            // Process the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("username");
                String currOrg = resultSet.getString("currorg");

                System.out.println("ID: " + id + ", Name: " + name + ", Org: " + currOrg);
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