package com.ruchi.servlet.forwardincludeResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s22")
public class S22 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		System.out.println("in S2 servlet before Forward Call");
		out.println("in S2 servlet before Forward Call<br>");

		RequestDispatcher rd = request.getRequestDispatcher("/S33");
		//rd.forward(request, response);
		rd.include(request, response);

		out.println("in S2 servlet after Forward Call<br>");
		System.out.println("in S2 servlet after Forward Call");

	}

}
