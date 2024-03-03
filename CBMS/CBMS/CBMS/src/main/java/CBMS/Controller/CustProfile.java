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
import CBMS.DAO.CustSignUpDAO;
import CBMS.DTO.AdminSignUpDTO;
import CBMS.DTO.CustSignUpDTO;

@WebServlet("/custprofile")
public class CustProfile extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);

		HttpSession hs=req.getSession();
		long phno=(long) hs.getAttribute("phno");
		
		CustSignUpDAO dao=new CustSignUpDAO();
		CustSignUpDTO dto=dao.fetchById(phno);
		
		req.setAttribute("data", dto);
		RequestDispatcher rd=req.getRequestDispatcher("custprofile.jsp");
		rd.forward(req, resp);

	}
}
