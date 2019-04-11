package co.simplon.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Login
 */
@WebServlet(urlPatterns = "/controller", loadOnStartup = 1)
public class controller extends HttpServlet {

	private static final long serialVersionUID = -4319076288258537575L;

	@Override
	public void init() throws ServletException {
		//ProjetbankConnection.java.init(this.getServletContext());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter( "txtLogin" );
        String password = request.getParameter( "txtPassword" );
        if ( login == null ) login = "";
        if ( password == null ) password = "";
        
        HttpSession session = request.getSession( true );
        session.setAttribute( "login", login );
        session.setAttribute( "password", password );
        
        request.getRequestDispatcher( "/login.jsp" ).forward( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
              throws ServletException, IOException {
		String login = request.getParameter( "txtLogin" );
        String password = request.getParameter( "txtPassword" );

        HttpSession session = request.getSession( true );
        session.setAttribute( "login", login );
        session.setAttribute( "password", password );

        System.out.println( "in the doPost" );
        
        if ( login.equals( "google" ) && password.equals( "alpha" ) ) {
            session.setAttribute( "isConnected", true );
            request.getRequestDispatcher( "/comptes.html" ).forward( request, response );
        } else {
            session.setAttribute( "isConnected", false );
            request.getRequestDispatcher( "/login.jsp" ).forward( request, response );
        }
        
    }

}
