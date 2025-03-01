package controller.benutzer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.benutzer.aussensicht.BenutzerBean;
import persistence.benutzer.BenutzerAnzeigenDAO;
import persistence.benutzer.BenutzerLöschenDAO;

/**
 * Servlet implementation class BenutzerLöschenServlet
 */
@WebServlet("/BenutzerLöschenServlet")
public class BenutzerLöschenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BenutzerLöschenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username = request.getParameter("username");
		 
		 if(username != null && !username.trim().isEmpty()) {
			 BenutzerLöschenDAO  benutzerLöschen = new BenutzerLöschenDAO();
			 boolean success = benutzerLöschen.benutzerLöschen(username);  //Benutzer wurde geschlöscht.. NUN muss aktualisiert werden.
			 
			 if(success) {
				 BenutzerAnzeigenDAO benutzerAnzeigen = new BenutzerAnzeigenDAO();
				 try {
					List<BenutzerBean> benutzerList = benutzerAnzeigen.getBenutzer();
					
					request.setAttribute("benutzerListe", benutzerList);
					request.getRequestDispatcher("benutzeranzeigen.jsp").forward(request, response);
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			 }else {
				 response.sendRedirect("benutzeranzeigen.jsp?error=true");
			 }
		 }else {
			 response.sendRedirect("benutzeranzeigen.jsp?error=invalid");
		 }
		 
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
