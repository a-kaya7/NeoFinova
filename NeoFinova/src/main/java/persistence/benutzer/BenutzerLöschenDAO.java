package persistence.benutzer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.benutzer.aussensicht.BenutzerBean;
import persistence.DAOVerbindung.DBVerbindung;

public class BenutzerLöschenDAO {
	
	
		
		 public boolean benutzerLöschen(String username) {
		        String sql = "DELETE FROM USERS WHERE USERNAME = ?";
		        
		        try (Connection con = DBVerbindung.getConnection();
		             PreparedStatement statement = con.prepareStatement(sql)) {
		            
		            statement.setString(1, username);
		            int rowsAffected = statement.executeUpdate();
		            
		            return rowsAffected > 0;
		            
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		        return false;
		    }
	
	
	

}
