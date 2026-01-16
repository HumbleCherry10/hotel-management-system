package data.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface IDB {
    /**
     * Gets a connection to the database
     * @return Connection object to the PostgreSQL database
     * @throws SQLException if connection fails
     * @throws ClassNotFoundException if PostgreSQL driver is not found
     */
    Connection getConnection() throws SQLException, ClassNotFoundException;
}
