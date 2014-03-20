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

@WebServlet(urlPatterns = { "/HeroServlet" }, initParams = { @WebInitParam(name = "hName", value = "Ajay") })
public class HeroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String heroName;
	private String movie;
	private String director;
	private String producer;

	public void init(ServletConfig config) throws ServletException {

		ServletContext context = config.getServletContext();

		heroName = config.getInitParameter("hName");
		movie = context.getInitParameter("movieName");
		director = context.getInitParameter("directorName");
		producer = context.getInitParameter("producerName");

	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(heroName + "'s movie details : </BR>");
		out.println("movie name :" + movie + "</BR>");
		out.println("Director :" + director + "</BR>");
		out.println("Producer :" + producer + "</BR>");

	}

}
