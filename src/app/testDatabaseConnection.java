/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.sql.Connection;
import java.sql.SQLException;

public class testDatabaseConnection {
    public static void main(String[] args) {
        try (Connection connection = sqlConnection.getConnection()) {
            if (connection != null) {
                System.out.println("Bağlantı başarılı!");
            } else {
                System.out.println("Bağlantı başarısız.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

