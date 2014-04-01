package com.ruchi.servlet.calculator;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ruchi.servlet.addsubproject.AddSubOperation;

@WebServlet("/RequestProcessServlet")
public class RequestProcessServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void service(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

        // reading form parameters value
        final String num1 = request.getParameter("fno");
        final String num2 = request.getParameter("sno");
        final String button = request.getParameter("requesttype");

        final AddSubOperation ao = new AddSubOperation();
        double res;

        // Server side validation
        try {
            final double fno = Double.parseDouble(num1);
            final double sno = Double.parseDouble(num2);

            if (button.equals("Add")) {
                res = ao.add(fno, sno);
            } else {
                res = ao.sub(fno, sno);
            }

            request.setAttribute("resptype", "success");
            request.setAttribute("result", res);

        } catch (final NumberFormatException nfe) {
            request.setAttribute("resptype", "failed");
            request.setAttribute("result", "Only Enter Numbers");

        }
        // Forwarding request to RespPrepServlet for response generation
        final RequestDispatcher rd = request.getRequestDispatcher("/ResponsePrepServlet");
        rd.forward(request, response);

    }
}
