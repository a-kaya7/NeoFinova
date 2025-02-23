package persistence.DAOVerbindung;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBVerbindung {
	

	private static final String URL = "jdbc:h2:C:\\Users\\ahmet\\Desktop\\H2db";
    private static final String USER = "sa";
    private static final String PASSWORD = "sa";

    
    public static Connection getConnection() {
        Connection connection = null;
        try {
           
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            
            if (connection == null) {
                System.err.println("FEHLER: Verbindung ist NULL!");
            } else {
                
            }
         
        } catch (ClassNotFoundException e) {
            System.err.println("H2 JDBC-Treiber nicht gefunden.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Fehler bei der Verbindung zur H2-Datenbank: " + e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }


}
