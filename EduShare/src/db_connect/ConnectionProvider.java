/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connect;
import java.sql.*;

/**
 *
 * @author nazal
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/files","root","123456");
        return con;
        }
        catch(Exception e){
        return null;
        }
    }
}
