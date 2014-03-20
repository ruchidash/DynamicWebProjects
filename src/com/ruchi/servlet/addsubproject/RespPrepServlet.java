package com.src.ruchi.servlet.addsubproject;
import java.lang.String;

@WebServlet("/RespPrepServlet")
public class RespPrepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// readind form parameters value
		String num1 = request.getParameter("fno");
		String num2 = request.getParameter("sno");
		String button = request.getParameter("reqtype");

		// Reading result
		int res = (int) request.getAttribute("result");

		// Preparing response
		String msg;
		if (button.equals("Add")) {
			msg = "adding ";

		} else {
			msg = "substracting ";
		}

		// Include Addsub.html code in the response object
		response.sendRedirect("/AddSub.html");

		out.print("<br>");
		out.print("<hr>");
		out.print("After " + msg + num1 + " and " + num2);
		out.print("<br>");
		out.print("result = " + res);
		out.print("</hr>");

	}

}
