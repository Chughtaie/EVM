package evm;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Oracle {

	public void addVoter( Voter vot)throws IOException, SQLException{
		
		try 
		{
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","tiger1234");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			String str = "insert into Voter values('" + vot.name + "','" + vot.cnic + "'," + vot.vote + ",'" + vot.sdate + "')";
			//sys
			stmt.executeQuery(str);	
    		con.close();
		}
    	catch(ClassNotFoundException e)
    	{
    		System.out.println("Diver not loaded..");
    	}
    	catch(SQLException e)
    	{
    		System.out.println("Connection not established...");
    	}
		
		
	}
	
	
	
	
	//abstract void Update(Vote acc)throws IOException, SQLException;
}
