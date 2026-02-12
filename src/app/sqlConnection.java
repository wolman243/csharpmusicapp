package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqlConnection {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/csharp";
    private static final String USER = "beldag";
    private static final String PASSWORD = "Ka5dm7c3lw*";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

