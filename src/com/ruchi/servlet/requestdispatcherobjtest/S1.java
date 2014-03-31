package com.ruchi.servlet.requestdispatcherobjtest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestDispatcherObjTest")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
RequestDispatcher rd1=request.getRequestDispatcher("/s2");
RequestDispatcher rd2=request.getRequestDispatcher("/s2");
PrintWriter out=response.getWriter();
out.println(rd1);
out.println(rd2);
out.println(rd1==rd2);
//rd1.include(null, null);


	}

}
