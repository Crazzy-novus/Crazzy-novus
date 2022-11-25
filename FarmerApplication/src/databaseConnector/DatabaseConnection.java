/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseConnector;

//import java.io.IOException;
import java.sql.*;
/**
 *
 * @author Muthu Pandi
 */
public class DatabaseConnection {
   
    private Connection connection;
    
    public DatabaseConnection(){
        connection = null;
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void start(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerApplication","root","");
            if(connection == null){
                System.out.println("Not connected");
            } else{
                System.out.println("connected");
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
