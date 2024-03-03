package CBMS.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CBMS.DAO.CustSignUpDAO;
import CBMS.DTO.CustSignUpDTO;

@WebServlet("/fetchAllCust")
public class FetchAllCust extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);

		CustSignUpDAO dao = new CustSignUpDAO();
		List<CustSignUpDTO> l = dao.fetchAll();

		req.setAttribute("allcust", l);
		RequestDispatcher rd = req.getRequestDispatcher("fetchAllCust.jsp");
		rd.forward(req, resp);

	}
}
