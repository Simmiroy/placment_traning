package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDeleteDemo {
    public static void main(String[] args)throws Exception {
        //Load the JDBC Driver [jar file]
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Start  /Establish the connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCE",
                "root","12345");
        System.out.println("Connection Established");
        String f_name = "Simmi";
        //SQL Injections - we don't write the exact column names in QUERY
        //We give question works for the parameters
        PreparedStatement ps = connection.
                prepareStatement("DELETE FROM STUDENT WHERE f_name=?");
        ps.setString(1,f_name);
        int i = ps.executeUpdate(); //This returns the number of rows affected
        if(i>0){
            System.out.println("Deleted data successfully !");
        }else {
            System.out.println("Failed to update the data ");
        }
    }
}
