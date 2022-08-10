package com.lti.javajdbc;

 

import java.sql.*;

 


public class JDBCDemo {
    
    public static void main(String[] args) {
        
        Connection con = null;
        Statement statement = null;
        ResultSet rs = null;
        
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","root","parthu123");
            
            System.out.println("Connection is successful");
        }
        
        
        catch(SQLException | ClassNotFoundException e){
            System.out.println(e);
            
        }
    
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
            
    }

 

}




//
//
//
//package com.lti.jdbc;
//
//
//
//import java.sql.*;
//
// 
//
//public class JDBCPractise {
//public static void main(String[] args) {
//        
//        Connection con = null;
//        Statement statement = null;
//        ResultSet rs = null;
//        
//        try {
//            
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
//            
//            System.out.println("Connection is successful");
//            statement=con.createStatement();
//            rs=statement.executeQuery("select * from student");
//            while(rs.next()) {
//                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//                
//            }
//        }
//        
//        
//        
//        catch(SQLException | ClassNotFoundException e){
//            System.out.println(e);
//            
//        }
//    
//        finally {
//            try {
//                statement.close();
//                rs.close();
//                con.close();
//            } catch (SQLException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//}}

 