package com.ruchi.servlet.scopobjecttest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ruchi.servlet.scopobjecttest.Student;

@WebServlet(name = "StudentServlet", urlPatterns = { "/ss" })
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String studentname="Ruchi Dash";
	double marks=100;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Student stud=new Student();
		request.setAttribute("stud1", stud);
		RequestDispatcher rd = request.getRequestDispatcher("/Certificate");
		rd.forward(request, response);
		
	}

}
