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
import CBMS.DTO.FeedBackDTO;

@WebServlet("/fetchfeedback")
public class FetchAllFeedBack extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		FeedBackDAO dao=new FeedBackDAO();
		List<FeedBackDTO> list = dao.fetchAll();
		
		req.setAttribute("feedbacks", list);
		RequestDispatcher rd=req.getRequestDispatcher("fetchAllFeedBack.jsp");
		rd.forward(req, resp);
	}
}
