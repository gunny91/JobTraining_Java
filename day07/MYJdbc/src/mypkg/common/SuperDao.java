package mypkg.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Database, constructor, connection method
 * @author Geonhee Cho
 *
 */
public class SuperDao {

	
	String driver ="oracle.jdbc.driver.OracleDriver";
	//String url = "jdbc:oracle:thin:@ip:port:SID"; //data base source
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; //data base source

	String id = "oraman";
	String password = "oracle";
	
	protected Connection connect = null; // connection object
	
	protected SuperDao()
	{
		try {
			//String class --> make String to driver object
			Class.forName(driver);
			this.connect = getConnection();
			if(connect !=null)
			{
				System.out.println("Connected!");
			}else
			{
				System.out.println("Not connected!");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Connection getConnection() {
		try {
			return DriverManager.getConnection(url,id,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
