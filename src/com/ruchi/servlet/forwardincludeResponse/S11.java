/*S11---->S22---->S33*/

package com.ruchi.servlet.forwardincludeResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S11")
public class S11 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		System.out.println("in S1 servlet before Forward/Include Call");
		out.print("<html>");
		out.print("<body>");
		out.println("in S1 servlet before Forward/Include Call <br>");

		RequestDispatcher rd = request.getRequestDispatcher("/s22");
		// rd.forward(request, response);
		rd.include(request, response);

		out.println("in S1 servlet after Forward/Include Call <br>");
		out.print("</body>");
		out.print("</html>");

		System.out.println("in S1 servlet after Forward/Include Call");

	}

}
