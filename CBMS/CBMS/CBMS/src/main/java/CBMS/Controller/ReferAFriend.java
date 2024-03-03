package CBMS.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CBMS.DAO.ReferAFriendDAO;
import CBMS.DTO.ReferAFriendDTO;

@WebServlet("/referafriend")
public class ReferAFriend extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//	super.doPost(req, resp);
		String name = req.getParameter("name");
		long phno = Long.parseLong(req.getParameter("phno"));

		ReferAFriendDTO dto = new ReferAFriendDTO();
		dto.setName(name);
		dto.setPhone(phno);

		ReferAFriendDAO dao = new ReferAFriendDAO();
		String msg = dao.insert(dto);
		resp.getWriter().print(msg);
	}
}
