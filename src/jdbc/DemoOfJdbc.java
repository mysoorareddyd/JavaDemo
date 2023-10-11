package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC means --> Java DataBase Connectivity

/*
 * Pre-requisite
 * 1)We need to download database driver(.jar file)ojdbc.jar file we need to download
 * 2)Add driver jar to your project
 * 
 * Step to write JDBC program
 * -------------------------
 * 1)Create a connection
 * 2)Create a query/statement
 * 3)Execute statement/query
 * 4)Close connection
 */


public class DemoOfJdbc {

	public static void main(String[] args) throws SQLException {
		
		//1. create a connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborc1","hr","hr");//jdbc:oracle:thin:@ is (constant), Then localhost is location of sever :1521 is port number /pdborcl sevice name Last Hr is username and hr is password //Senta x changed for one database to another
		
		//2.Create a query/statement
		
		Statement stmt=con.createStatement(); //we need to assosiate with con.createStatement
		//String s="insert into student values(101,'Scott')";
		//String s="update student set where sname='KIM'"; // if we don't meantion where it will update all Sname
		
		//String s="delete student where sid=105";  //If we don't meation where it will delete the entire table
		
		String s="select * from employee"; //for retrive data 
		
		
		//3)Execute statement/query
		//ResultSet rs=stmt.execute(s); //we cane execute entire over here without variable
		
		 //4)Close connection
		con.close();
		
		System.out.println("Program is completed");
	}

}
