package com.study.common;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
   
   private static Connection con;
   private static final String USERNAME = "root";
   private static final String PASSWORD = "r1r2r3r4";
   private static final String DRIVER_NAME = "org.mariadb.jdbc.Driver";
   private static final String URL = "jdbc:mariadb://localhost/jooyoung";
   
   public static Connection getCon() {
      if(con==null) {
         try {
            Class.forName(DRIVER_NAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
         } catch (ClassNotFoundException e) {
            e.printStackTrace();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
      return con;
   }
   
   public static void main(String[] args) {
      DBCon.getCon();
   }
}