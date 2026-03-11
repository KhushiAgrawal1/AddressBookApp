package com.addressbookapp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Database URL
    private static final String URL = "jdbc:mysql://localhost:3306/addressbook_service";
    private static final String USER = "root";
    private static final String PASSWORD = "8770B26@k";

    // Get database connection
    public static Connection getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Successfully");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
