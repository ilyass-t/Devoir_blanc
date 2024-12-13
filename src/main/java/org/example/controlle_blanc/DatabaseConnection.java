package org.example.controlle_blanc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    Connection con;
    private String db="Membre";
    private String username;
    private String password;
    private String url;

    public DatabaseConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/" +db , username, password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public Connection getConnection() {
        return con;
    }
    public void closeConnection() {
        this.con=null;
    }
}
