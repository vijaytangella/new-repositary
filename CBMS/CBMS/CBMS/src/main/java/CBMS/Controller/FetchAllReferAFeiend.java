package CBMS.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CBMS.DAO.FeedBackDAO;
import CBMS.DAO.ReferAFriendDAO;
import CBMS.DTO.FeedBackDTO;
import CBMS.DTO.ReferAFriendDTO;

@WebServlet("/fetchraf")
public class FetchAllReferAFeiend extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		ReferAFriendDAO dao = new ReferAFriendDAO();
		List<ReferAFriendDTO> list = dao.fetchAll();

		req.setAttribute("raf", list);
		RequestDispatcher rd = req.getRequestDispatcher("fetchAllReferAFriend.jsp");
		rd.forward(req, resp);
	}
}
