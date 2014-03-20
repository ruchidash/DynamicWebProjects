package com.ruchi.servlet.heroheroinedetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/HeroineServlet" }, initParams = { @WebInitParam(name = "hineName", value = "Samantha") })
public class HeroineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String heroineName;
	private String movie;
	private String director;
	private String producer;

	public void init(ServletConfig config) throws ServletException {
		ServletContext context = config.getServletContext();

		heroineName = config.getInitParameter("hineName");
		movie = context.getInitParameter("movieName");
		director = context.getInitParameter("directorName");
		producer = context.getInitParameter("producerName");
	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(heroineName + "'s movie details : </BR>");
		out.println("movie name :" + movie + "</BR>");
		out.println("Director :" + director + "</BR>");
		out.println("Producer :" + producer + "</BR>");

	}

}
