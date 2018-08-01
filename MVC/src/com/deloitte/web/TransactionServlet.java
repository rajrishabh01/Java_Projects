package com.deloitte.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TransactionServlet
 */
@WebServlet("/transact")
public class TransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		HttpSession session = request.getSession(false);
		
		if(session!=null) {
		if (action != null) {
			if (action.equals("inbox")) {
				request.getRequestDispatcher("/inbox123.jsp").forward(request, response);
			} else if (action.equals("compose")) {
				request.getRequestDispatcher("/compose123.jsp").forward(request, response);

			} else if (action.equals("sent")) {
				request.getRequestDispatcher("/sent123.jsp").forward(request, response);

			} else if (action.equals("logout")) {
				request.getRequestDispatcher("homeabc123.jsp").forward(request, response);

			}
		}
		
		}
		else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("Session Expired.");
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
