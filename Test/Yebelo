import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.util.*;
public class Yebelo {
	
	
	static final String JDBC_DRIVER = "org.h2.Driver";   
	   static final String DB_URL = "jdbc:h2:~/test"; 
	   static final String USER = "sa"; 
	   static final String PASS = ""; 
	public static void main(String[] args) {
		Connection conn = null; 
	      Statement stmt = null; 
	      
	      try { 
	          Class.forName(JDBC_DRIVER); 
	              
	          System.out.println("Connecting to database..."); 
	          conn = DriverManager.getConnection(DB_URL,USER,PASS);  
	          stmt = conn.createStatement(); 
	          Scanner sc = new Scanner(System.in);
	          String categoryCode = sc.next();
	          getCategoryCode(categoryCode,stmt);
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
	      }
	private static void getCategoryCode(String categoryCode, Statement stmt) {
		// TODO Auto-generated method stub
		String sql="select category_value from Category where category_code ='"+categoryCode+"'";
		 
	}
	}
