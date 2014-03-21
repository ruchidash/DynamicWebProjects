package com.ruchi.servlet.addsubproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/ReqProcessServlet" })
public class ReqProcessServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void service( HttpServletRequest request,  HttpServletResponse response)
            throws ServletException, IOException {

        // readind form parameters value
         String num1 = request.getParameter("fno");
         String num2 = request.getParameter("sno");
         String button = request.getParameter("reqtype");

             int fno = Integer.parseInt(num1);
         int sno = Integer.parseInt(num2);

         AddSubOperation ao = new AddSubOperation();
        int res;

        // Checking reqtype to call appropriate business logic from POJO

        if (button.equals("Add")) {
            res = ao.add(fno, sno);
        } else {
            res = ao.sub(fno, sno);
        }

        // storing res in request scope
        request.setAttribute("result", res);

        // Forwarding request to RespPrepServlet for response generation
          RequestDispatcher rd =
         request.getRequestDispatcher("/RespPrepServlet");
         rd.forward(request, response);
    }
}
