package com.ruchi.servlet.addsubproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RespPrepServlet")
public class RespPrepServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void service(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        final PrintWriter out = response.getWriter();

        // readind form parameters value
        final String num1 = request.getParameter("fno");
        final String num2 = request.getParameter("sno");
        final String button = request.getParameter("reqtype");

        // Reading result
        final int res = (int) request.getAttribute("result");

        // Preparing response
        String msg;
        if (button.equals("Add")) {
            msg = "adding ";

        } else {
            msg = "substracting ";
        }

        // Include Addsub.html code in the response object

        out.print("<br>");
        out.print("<hr>");
        out.print("After " + msg + num1 + " and " + num2);
        out.print("<br>");
        out.print("result = " + res);
        out.print("</hr>");

    }

}
