package com.deloitte.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProcessRequestServlet
 */
@WebServlet(name = "process", urlPatterns = { "/process" })
public class ProcessRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessRequestServlet() {
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
		// TODO Auto-generated method stub
		//(request, response);
		String username = request.getParameter("username");
		String passwd = request.getParameter("passwd");
		
		UserBean userbean = new UserBean();
		boolean status;
		try {
			status = userbean.authenticate(username, passwd);
			if (status) {
				HttpSession session = request.getSession(true);
				session.setMaxInactiveInterval(5);
				request.setAttribute("ub", userbean);
				request.getRequestDispatcher("/homeabc123.jsp").forward(request, response);
				
			} else {
				request.getRequestDispatcher("LoginDHF2343.jsp?flag=true").forward(request, response);
				;
			}
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

/*String action = request.getParameter("action");

		if (action != null) {
			if (action.equals("inbox")) {
				request.getRequestDispatcher("inbox123.jsp").forward(request, response);
			} else if (action.equals("compose")) {
				request.getRequestDispatcher("compose123.jsp").forward(request, response);

			} else if (action.equals("sent")) {
				request.getRequestDispatcher("sent123.jsp").forward(request, response);

			} else if (action.equals("logout")) {
				request.getRequestDispatcher("logout123.jsp").forward(request, response);

			}
		}
		*/
