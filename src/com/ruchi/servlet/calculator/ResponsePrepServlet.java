package com.ruchi.servlet.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResponsePrepServlet")
public class ResponsePrepServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void service(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        final PrintWriter out = response.getWriter();

        // reading form parameters value
        final String num1 = request.getParameter("fno");
        final String num2 = request.getParameter("sno");
        final String button = request.getParameter("requesttype");

        // Reading result
        final double res = (double) request.getAttribute("result");
        // Preparing response
        String msg;
        if (button.equals("Add")) {
            msg = "adding ";

        } else {
            msg = "substracting ";
        }

        // Include Addsub.html code in the response object
        final RequestDispatcher rd1 = request.getRequestDispatcher("/AdditionSubstraction.html");
        rd1.include(request, response);

        // Reading Response type
        final String resptype = (String) request.getAttribute("resptype");
        if (resptype.contains("success")) {

            out.print("<br>");
            out.print("<hr>");
            out.print("After " + msg + num1 + " and " + num2);
            out.print("<br>");
            out.print("result = " + res);
            out.print("</hr>");

        } else {

            final String msg1 = (String) request.getAttribute("result");
            out.print("<br>");
            out.print("<hr>");
            out.print("Error : " + msg1);
            out.print("</hr>");
        }

    }
}
