package com.ruchi.servlet.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequesrHeader")
public class RequesrHeader extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieving and printing Header name and value
        Enumeration<String> headers = request.getHeaderNames();

        // Retrieving browser name
        String browser = request.getHeader("user-agent");

        // Retrieving locale of customer
        String locale = request.getHeader("accept-language");

        // Retrieving host information
        String host = request.getHeader("host");

        // Retrieving connection information
        String conn = request.getHeader("connection");

        // Retrieving accept information
        String accept = request.getHeader("accept");

        // Retrieving accept encoding information
        String acceptencode = request.getHeader("accept-encoding");

        // Response preparation
        out.println("<html>");
        out.println("<body>");
        out.println("<table border='4'>" + "align='center'");
        out.println("<tr>");
        out.println("<td>Header name</td>");
        out.println("<td>Header value</td>");
        out.println("<td>Browser name</td>");
        out.println("<td>locale of customer</td>");
        out.println("<td>Host</td>");
        out.println("<td>Connection</td>");
        out.println("<td>Accept</td>");
        out.println("<td>Accept Encode</td>");

        // Retrieving header name's value
        String name = null, value = null;
        while (headers.hasMoreElements()) {
            name = headers.nextElement();
            value = request.getHeader(name);

        }

        out.println("<tr>");
        out.println("<td>" + name + "</td>");
        out.println("<td>" + value + "</td>");
        out.println("<td>" + browser + "</td>");
        out.println("<td>" + locale + "</td>");
        out.println("<td>" + host + "</td>");
        out.println("<td>" + conn + "</td>");
        out.println("<td>" + accept + "</td>");
        out.println("<td>" + acceptencode + "</td>");

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

    }

}
