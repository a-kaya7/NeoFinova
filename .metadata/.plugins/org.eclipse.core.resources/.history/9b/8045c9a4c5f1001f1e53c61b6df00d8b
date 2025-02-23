package persistence.benutzer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.benutzer.aussensicht.BenutzerBean;
import persistence.DAOVerbindung.DBVerbindung;

public class BenutzerAnmeldenDAO {
	
private static final String SELECT_SQL = "SELECT * FROM USERS WHERE USERNAME = ? AND PASSWORD = ?";
	
	public BenutzerAnmeldenDAO() {
		
	}
	
	public boolean validation (BenutzerBean bBean) throws SQLException {
		
		boolean status = false;
		try (Connection con = DBVerbindung.getConnection();
			PreparedStatement statement = con.prepareStatement(SELECT_SQL)) {
				
			statement.setString(1, bBean.getUsername());
			statement.setString(2, bBean.getPassword());
			ResultSet rs = statement.executeQuery();
			status = rs.next();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}


}
