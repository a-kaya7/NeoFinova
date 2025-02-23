package persistence.benutzer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.benutzer.aussensicht.*;
import persistence.DAOVerbindung.DBVerbindung;

public class BenutzerAnzeigenDAO { // Die information von BEnutzer aus der DB ziehen und in einer list auslesen
									// bzw. speihern
	

	public List<BenutzerBean> getBenutzer() throws SQLException {

		List<BenutzerBean> benutzerList = new ArrayList<>();

		String sql = "SELECT VORNAME, NACHNAME, USERNAME, DATE, BENUTZERTYP FROM USERS";

		try (Connection con = DBVerbindung.getConnection();
				PreparedStatement statement = con.prepareStatement(sql);
				ResultSet rs = statement.executeQuery()) {

			while (rs.next()) {

				BenutzerBean beBean = new BenutzerBean();
				beBean.setVorname(rs.getString("vorname"));
				beBean.setNachname(rs.getString("nachname"));
				beBean.setUsername(rs.getString("username"));
				beBean.setDatum(rs.getString("date"));
				beBean.setBenutzerTyp(rs.getString("benutzerTyp"));
				benutzerList.add(beBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return benutzerList;
	}

}
