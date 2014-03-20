package com.ruchi.servlet.scopobjecttest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ruchi.servlet.scopobjecttest.College;

@WebServlet(name = "collegeServlet", urlPatterns = { "/cs" })
public class collegeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String clgname="IIT kanpur";
	String course="VLSI";
	double fee=2000.0;
	String durration="2.5 Years";
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		College clg=new College();
		request.setAttribute("clg1", clg);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Certificate");
		rd.forward(request, response);

	}

}
