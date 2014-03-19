package com.ruchi.servlet.movie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MovieServlet")
public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		ServletContext ctxt = getServletContext();

		String movie = ctxt.getInitParameter("movieName");
		String director = ctxt.getInitParameter("directorName");
		String producer = ctxt.getInitParameter("producerName");

		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print(movie + "Movieis Details :<br>");
		out.print("<pte>");
		out.print("Director :" + director + "<br>");
		out.print("Director :" + producer + "<br>");

		RequestDispatcher rd;

		rd = request.getRequestDispatcher("HeroInfoServlet");
		rd.include(request, response);

		rd = request.getRequestDispatcher("HeroineInfoServlet");
		rd.include(request, response);

		out.print("<pre>");
		out.print("<body>");
		out.print("<html>");

	}
}
