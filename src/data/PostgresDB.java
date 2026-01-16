package data;

import data.interfaces.IDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDB implements IDB {
    
    // ⚠️ ИЗМЕНИ ЭТИ ЗНАЧЕНИЯ НА СВОИ:
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/hotel_db";  // CHANGE: имя БД
    private static final String DB_USER = "postgres";                                   // CHANGE: пользователь
    private static final String DB_PASSWORD = "0000";                                   // CHANGE: пароль
    private static final String DB_DRIVER = "org.postgresql.Driver";
    
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
            // Load the PostgreSQL driver
            Class.forName(DB_DRIVER);
            
            // Create and return connection
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("✅ Successfully connected to PostgreSQL database!");
            return connection;
            
        } catch (ClassNotFoundException e) {
            System.out.println("❌ PostgreSQL Driver not found: " + e.getMessage());
            System.out.println("Make sure postgresql-42.x.x.jar is added to your project libraries!");
            throw e;
            
        } catch (SQLException e) {
            System.out.println("❌ Database connection failed: " + e.getMessage());
            System.out.println("Check your DB_URL, DB_USER, and DB_PASSWORD!");
            throw e;
        }
    }
}
