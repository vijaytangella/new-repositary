package CBMS.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CBMS.DAO.FeedBackDAO;
import CBMS.DTO.FeedBackDTO;

@WebServlet("/feedback")
public class FeedBack extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String feedback=req.getParameter("fb");
		
		FeedBackDTO dto=new FeedBackDTO();
		dto.setFeedBack(feedback);
		
		FeedBackDAO dao=new FeedBackDAO();
		String msg = dao.insert(dto);
		resp.getWriter().print(msg);
	}
}
