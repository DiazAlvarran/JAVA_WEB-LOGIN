package com.destacka2.pe;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String usuario = request.getParameter("usuario");
		
		if(usuario.equals("miguel")){
			session.setAttribute("usuario", usuario);
			session.setMaxInactiveInterval(10*60); //tiempo en segundos de inactiva la sesion para invalidarla
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/admin.jsp");
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/error.jsp");
			dispatcher.forward(request, response);
		}
	}

}
