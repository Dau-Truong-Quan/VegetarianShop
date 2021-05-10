package com.QuanWebDeveloper.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDAO {
//	private static String DB_URL = "jdbc:sqlserver://localhost\\cnpm";
//    private static String USER_NAME = "sa";
//    private static String PASSWORD = "123456";
//    public static Connection getConnection() {
//    	Connection conn = null;
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//             conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
//            System.out.println("connect successfully!");
//        } catch (Exception ex) {
//            System.out.println("connect failure!");
//            ex.printStackTrace();
//        }
//        return conn;
//    }
    
    
    
    public Connection getConnection()throws Exception {
        String url = "jdbc:sqlserver://"+serverName+":"+portNumber + "\\" + instance +";databaseName="+dbName;
        if(instance == null || instance.trim().isEmpty())
            url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }   
    /*Insert your other code right after this comment*/
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "localhost";
    private final String dbName = "cnpm";
    private final String portNumber = "1433";
    private final String instance="";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
    private final String userID = "sa";
    private final String password = "123456";
}
