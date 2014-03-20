package com.ruchi.servlet.allmemberexecution;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/amef")
public class All8MemberExeFlow extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int a = m1();

	static int m1() {
		System.out.println("SV 'a' is created");
		return 10;
	}

	int x = m2();

	int m2() {
		System.out.println("NSV 'x' is created");
		return 20;
	}

	static {
		System.out.println("SB is executed");
	}
	{
		System.out.println("NSB is executed");
	}

	public All8MemberExeFlow() {
		System.out.println("No-arg Constructor is executed");

	}

	public All8MemberExeFlow(int x) {
		System.out.println("Parameterized Constructor is executed");

		this.x = x;

	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() method is executed");
		System.out.println("a :" + a);
		System.out.println("x :" + x);

	}

	public void destroy() {
		System.out.println("destroy() method is executed");
	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() method execution is started");
		System.out.println("a :" + a);
		System.out.println("x :" + x);
		m3();
		m4();
		PrintWriter out = response.getWriter();
		out.println("servlet instance values are");
		out.println("a :" + a);
		out.println("x :" + x);
		out.println("Check server consol");
		System.out.println("service() method execution end");

	}

	private void m4() {
		System.out.println("NSM m4() is executed");

	}

	private void m3() {
		System.out.println("SM m3() is executed");

	}

}
