package CBMS.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CBMS.DAO.AdminSignUpDAO;
import CBMS.DTO.AdminSignUpDTO;

@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String userAdmin = req.getParameter("un");
		String passAdmin = req.getParameter("pass");
		long phno = Long.parseLong(req.getParameter("phno"));

		AdminSignUpDAO adminDAO = new AdminSignUpDAO();
		AdminSignUpDTO ad = adminDAO.fetchById(phno);

		if (ad != null) {
			long confirmPhno = ad.getPhone();
			String confirmPass = ad.getConfirmPass();

			if (confirmPass.equals(passAdmin)) {
				req.setAttribute("un", userAdmin);
				HttpSession hs=req.getSession();
				hs.setAttribute("phno", phno);
				RequestDispatcher rd = req.getRequestDispatcher("admin.jsp");
				rd.forward(req, resp);
			} else {
				resp.getWriter().print("Invalid Password");
			}
		} else {
			resp.getWriter().print("Admin not found with the provided phone number");
		}

	}
}