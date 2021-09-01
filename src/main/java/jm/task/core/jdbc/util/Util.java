package jm.task.core.jdbc.util;

import java.sql.*;




public class Util {

//    public static Connection connectDB() {
//
//        final String password = "12345678";
//        final String user = "root";
//        final String url = "jdbc:mysql://localhost:3306/userdb";
//
//        try {
//            Connection connection = DriverManager.getConnection(url, user, password);
//            System.out.println("Соединение установлено");
//        } catch (SQLException e) {
//            System.out.println("Ошибка соединения");
//        }
//        return ;
//    }
public static Connection connectDB() {
    String userName = "root";
    String password = "12345678";
    String url = "jdbc:mysql://localhost:3306/userdb";

    try {
        return DriverManager.getConnection(url, userName, password);
    } catch (SQLException e) {
        e.printStackTrace();
        throw new IllegalStateException();
    }
}
}



