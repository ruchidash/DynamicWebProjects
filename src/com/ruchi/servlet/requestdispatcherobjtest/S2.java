package com.ruchi.servlet.requestdispatcherobjtest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/S2")
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	/*
	  System.out.println(request);
	System.out.println(response);
	PrintWriter out= response.getWriter();
	*/
	}

}
