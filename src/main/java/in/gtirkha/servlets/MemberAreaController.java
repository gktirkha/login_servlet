package in.gtirkha.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MemberAreaController")
public class MemberAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String actionString = request.getParameter("action");
		switch (actionString) {
		case "memberArea":
			request.getRequestDispatcher("memberArea.jsp").forward(request, response);
			break;

		case "memberOnly":
			request.getRequestDispatcher("memberOnly.jsp").forward(request, response);
			break;

		case "logout":
			request.getSession().invalidate();
			response.sendRedirect(request.getContextPath() + "/SiteController?action=login");
			break;

		default:
			break;
		}

	}

}
