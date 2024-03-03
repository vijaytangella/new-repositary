package CBMS.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CBMS.DAO.AdminSignUpDAO;
import CBMS.DAO.CustSignUpDAO;
import CBMS.DTO.AdminSignUpDTO;
import CBMS.DTO.CustSignUpDTO;

@WebServlet("/custsignup")
public class CustSignUp extends HttpServlet {

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

		CustSignUpDTO cdto = new CustSignUpDTO();
		cdto.setUserAdmin(userAdmin);
		cdto.setCreatePass(createPass);
		cdto.setConfirmPass(confirmPass);
		cdto.setPhone(phno);
		cdto.setMail(mail);
		cdto.setGender(gen);
		cdto.setAddress(addr);

		req.setAttribute("un", userAdmin);

		CustSignUpDAO addao = new CustSignUpDAO();
		addao.insert(cdto);

		RequestDispatcher rd = req.getRequestDispatcher("custlogin.jsp");
		rd.forward(req, resp);

	}
}
