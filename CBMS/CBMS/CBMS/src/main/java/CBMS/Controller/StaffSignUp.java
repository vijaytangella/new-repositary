package CBMS.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CBMS.DAO.AdminSignUpDAO;
import CBMS.DAO.StaffSignUpDAO;
import CBMS.DTO.AdminSignUpDTO;
import CBMS.DTO.StaffSignUpDTO;

@WebServlet("/staffsignup")
public class StaffSignUp extends HttpServlet {

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

		StaffSignUpDTO sdto = new StaffSignUpDTO();
		sdto.setUserAdmin(userAdmin);
		sdto.setCreatePass(createPass);
		sdto.setConfirmPass(confirmPass);
		sdto.setPhone(phno);
		sdto.setMail(mail);
		sdto.setGender(gen);
		sdto.setAddress(addr);

		StaffSignUpDAO addao = new StaffSignUpDAO();
		addao.insert(sdto);

		RequestDispatcher rd = req.getRequestDispatcher("stafflogin.jsp");
		rd.forward(req, resp);

	}
}
