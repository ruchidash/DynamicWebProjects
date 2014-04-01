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

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

     // reading form parameters value
        String num1 = request.getParameter("fno");
        String num2 = request.getParameter("sno");
        String button = request.getParameter("requesttype");

        AddSubOperation ao = new AddSubOperation();
        double res;

        // Server side validation
        try {
            double fno = Double.parseDouble(num1);
            double sno = Double.parseDouble(num2);

            if (button.equals("Add")) {
                res = ao.add(fno, sno);
            } else {
                res = ao.sub(fno, sno);
            }

            request.setAttribute("resptype", "success");
            request.setAttribute("result", res);

        } catch (NumberFormatException nfe) {
            request.setAttribute("resptype", "failed");
            request.setAttribute("result", "Only Enter Numbers");

        }
        // Forwarding request to RespPrepServlet for response generation
        RequestDispatcher rd = request.getRequestDispatcher("/ResponsePrepServlet");
        rd.forward(request, response);

    }
}