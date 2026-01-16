import data.PostgresDB;
import data.interfaces.IDB;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("🔍 Testing database connection...\n");
        
        IDB db = new PostgresDB();
        
        try {
            Connection connection = db.getConnection();
            
            if (connection != null && !connection.isClosed()) {
                System.out.println("✅ Connection is ACTIVE and WORKING!");
                System.out.println("🎉 You are ready to proceed with the project!\n");
                
                // Close the connection after testing
                connection.close();
                System.out.println("Connection closed.");
            } else {
                System.out.println("❌ Connection failed - returned null");
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println("❌ ERROR: PostgreSQL driver not found!");
            System.out.println("   Please add postgresql-42.x.x.jar to your project libraries");
            e.printStackTrace();
            
        } catch (Exception e) {
            System.out.println("❌ ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
