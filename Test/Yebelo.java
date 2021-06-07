import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
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
	private static void getCategoryCode(String categoryCode, Statement stmt) throws InterruptedException, SQLException {
		// TODO Auto-generated method stub
		String sql="select category_value from Category where category_code ='"+categoryCode+"'";
		 ResultSet rs = stmt.executeQuery(sql);
		 int val =0;
		 while(rs.next()) {
			 int num =0;
			 val = rs.getInt("category_value");
			 Thread.sleep(5000);
			 num = val-1;
			 if(num>val)
			 {
				 UpdateCategoryval(categoryCode,stmt,num);
			 }
			  System.out.print("old_valu"+val+"new_value"+num);
		 }
		 if(val>0)
		 {
			 System.out.print(val);
			 
		 }
		 
		 
	}
	private static void UpdateCategoryval(String categoryCode, Statement stmt, int val) throws SQLException {
		// TODO Auto-generated method stub
		stmt.executeUpdate("update Category set  category_value="+val+" where category_code='"+categoryCode+"' ");
	}
	}
