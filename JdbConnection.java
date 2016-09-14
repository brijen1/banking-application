package com.Digitek;
import java.sql.*;

public class JdbConnection {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/EMP";
	   static final String USER = "root";
	   static final String PASS = "Booya10!";
	   
	   public static void main(String[] args) {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      Class.forName("com.mysql.jdbc.Driver");
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      String sql;
	      sql = "SELECT accountNumber,RoutingNumber,deposit,withdrawel,balance,transfer FROM banking";
	      ResultSet rs = stmt.executeQuery(sql);

	      while(rs.next()){
	         String accountNumber = rs.getString("accountNumber");
	         String RoutingNumber = rs.getString("RountingNumber");
	         double deposit = rs.getDouble("deposit");
	         double withdrawel = rs.getDouble("withdrawel");
	         double balance = rs.getDouble("balance");
	         double transfer = rs.getDouble("transfer");
	         //Display values
	    System.out.println("Account Number: " +accountNumber);
	    System.out.println("Rounting Number: "+ RoutingNumber);
	    System.out.println("Deposit: " +deposit);
	    System.out.println("Withdrawel: " + withdrawel);
	    System.out.println("Balance: " +balance);
	    System.out.println("Transfer: " + transfer);
	      }
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
		   try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
		}//end main
		}//end FirstExample