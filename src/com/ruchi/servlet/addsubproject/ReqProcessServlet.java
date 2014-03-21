package com.ruchi.servlet.addsubproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReqProcessServlet")
public class ReqProcessServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void service(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

        // readind form parameters value
        final String num1 = request.getParameter("fno");
        final String num2 = request.getParameter("sno");
        final String button = request.getParameter("reqtype");

        final int fno = Integer.parseInt(num1);
        final int sno = Integer.parseInt(num2);

        final AddSubOperation ao = new AddSubOperation();
        int res;

        // Checking reqtype to call appropriate business logic from POJO

        if (button.equals("Add")) {
            res = ao.add(fno, sno);
        } else {
            res = ao.sub(fno, sno);
        }

        // storing res in request scope
        request.setAttribute("result", res);

        // Forwarding request to RespPrepServlet for responce generation
        final RequestDispatcher rd = request.getRequestDispatcher("/RespPrepServlet");
        rd.forward(request, response);
    }
}
