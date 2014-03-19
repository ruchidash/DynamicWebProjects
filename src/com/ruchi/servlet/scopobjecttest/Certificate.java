package com.ruchi.servlet.scopobjecttest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ruchi.servlet.scopobjecttest.College;
import com.ruchi.servlet.scopobjecttest.Student;

@WebServlet("/Certificate")
public class Certificate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		College c1 = (College) request.getAttribute("clg1");
		Student s1 = (Student) request.getAttribute("stud1");

		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print(s1.studentname + "'s Details :<br>");
		out.print("<pte>");
		out.print("College Name :" + c1.clgname + "<br>");
		out.print("Course :" + c1.course + "<br>");
		out.print("Duration of the course :" + c1.durration + "<br>");
		out.print("Mark :" + s1.marks + "<br>");
		out.print("<pre>");
		out.print("<body>");
		out.print("<html>");

	}

}
