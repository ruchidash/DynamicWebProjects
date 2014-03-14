package com.ruchi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hs")
public class HelloServlet extends GenericServlet {

	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse resp)
			throws ServerException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("Hi RuchiDash");
		System.out.println("Hello RuchiDash");

	}

}
