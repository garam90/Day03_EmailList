package com.sds.icto.email.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailServlet
 */
@WebServlet("/email")
public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EmailServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		String address = request.getParameter("email");
		
		request.setAttribute("firstName", fn);
		request.setAttribute("lastName", ln);
		request.setAttribute("address", address);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		//request.getRequestDispatcher("show_emaillist.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

}
