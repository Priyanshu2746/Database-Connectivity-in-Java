import java.sql.*;

public class DatabaseExample {
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
   static final String USER = "root";
   static final String PASS = "password";

   public static void main(String[] args) {
      Connection conn = null;
      Statement stmt = null;
      try{
         // Register JDBC driver
         Class.forName("com.mysql.jdbc.Driver");

         // Open a connection
         System.out.println("Connecting to database...");
         conn = DriverManager.getConnection(DB_URL,USER,PASS);

         // Execute a query
         System.out.println("Creating statement...");
         stmt = conn.createStatement();
         String sql;
         sql = "SELECT id, name, age FROM customers";
         ResultSet rs = stmt.executeQuery(sql);

         // Extract data from result set
         while(rs.next()){
            //Retrieve by column name
            int id  = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");

            //Display values
            System.out.print("ID: " + id);
            System.out.print(", Name: " + name);
            System.out.println(", Age: " + age);
         }
         // Clean-up environment
         rs.close();
         stmt.close();
         conn.close();
      } catch(SQLException se) {
         // Handle errors for JDBC
         se.printStackTrace();
      } catch(Exception e) {
         // Handle errors for Class.forName
         e.printStackTrace();
      } finally {
         // Finally block used to close resources
         try {
            if(stmt!=null)
               stmt.close();
         } catch(SQLException se2) {
         } try {
            if(conn!=null)
               conn.close();
         } catch(SQLException se) {
            se.printStackTrace();
         }
      }
      System.out.println("Goodbye!");
   }
}
