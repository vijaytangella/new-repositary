package CBMS.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CBMS.DAO.StaffSignUpDAO;
import CBMS.DTO.StaffSignUpDTO;

@WebServlet("/fetchAllStaff")
public class fetchAllStaff extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);

		StaffSignUpDAO dao = new StaffSignUpDAO();
		List<StaffSignUpDTO> l = dao.fetchAll();

		req.setAttribute("allstaff", l);
		RequestDispatcher rd = req.getRequestDispatcher("fetchAllStaff.jsp");
		rd.forward(req, resp);

	}
}
