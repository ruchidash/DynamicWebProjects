package com.ruchi.servlet.movie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HeroInfoServlet", urlPatterns = { "/HeroInfoServlet" }, initParams = { @WebInitParam(name = "hname", value = "JNTR") })
public class HeroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		ServletConfig config = getServletConfig();
		String heroName = config.getInitParameter("hname");
		out.print("Hero :" + heroName + "<br>");

	}

}
