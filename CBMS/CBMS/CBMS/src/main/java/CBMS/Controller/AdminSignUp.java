package CBMS.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CBMS.DAO.AdminSignUpDAO;
import CBMS.DTO.AdminSignUpDTO;

@WebServlet("/adminsignup")
public class AdminSignUp extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String userAdmin = req.getParameter("un");
		String createPass = req.getParameter("createpass");
		String confirmPass = req.getParameter("confirmpass");
		long phno=Long.parseLong(req.getParameter("phno"));
		String mail=req.getParameter("mail");
		String gen=req.getParameter("gen");
		String addr=req.getParameter("addr");

		AdminSignUpDTO addto = new AdminSignUpDTO();
		addto.setUserAdmin(userAdmin);
		addto.setCreatePass(createPass);
		addto.setConfirmPass(confirmPass);
		addto.setPhone(phno);
		addto.setMail(mail);
		addto.setGender(gen);
		addto.setAddress(addr);

		AdminSignUpDAO addao = new AdminSignUpDAO();
		addao.insert(addto);

		RequestDispatcher rd = req.getRequestDispatcher("adminlogin.jsp");
		rd.forward(req, resp);

	}
}
