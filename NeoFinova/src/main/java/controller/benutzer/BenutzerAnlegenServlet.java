package controller.benutzer;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.benutzer.aussensicht.BenutzerBean;
import persistence.benutzer.BenutzerAnlegenDAO;

/**
 * Servlet implementation class BenutzerAnlegenServlet
 */
@WebServlet("/benutzeranlegen")
public class BenutzerAnlegenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BenutzerAnlegenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		String vorname = request.getParameter("vorname");
		String nachname = request.getParameter("nachname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String passwordWiederholung = request.getParameter("passwordWiederholung");
		String date = request.getParameter("date");
		String benutzerTyp = request.getParameter("benutzerTyp");
		
		BenutzerBean benutzerBean =  new BenutzerBean();
		
		benutzerBean.setVorname(vorname);
		benutzerBean.setNachname(nachname);
		benutzerBean.setUsername(username);
		benutzerBean.setPassword(password);
		benutzerBean.setPasswordWiederholung(passwordWiederholung);
		benutzerBean.setDatum(date);
		benutzerBean.setBenutzerTyp(benutzerTyp);
		
		BenutzerAnlegenDAO  benutzerAnlegenDao = new BenutzerAnlegenDAO();
		try {
			if(benutzerAnlegenDao.benutzerAnlegen(benutzerBean)) {
				response.sendRedirect("benutzeranlegen.jsp");
			}else {
				response.sendRedirect("benutzeranlegen.jsp");
			}
		} catch (SQLException | IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
