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

@WebServlet(urlPatterns = { "/HeroineInfoServlet" }, initParams = { @WebInitParam(name = "hinename", value = "Samantha") })
public class HeroineInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		ServletConfig config = getServletConfig();
		String heroineName = config.getInitParameter("hinename");
		out.print("Hero :" + heroineName + "<br>");

	}

}
