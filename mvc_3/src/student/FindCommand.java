package student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FindCommand implements CommandIf {

	@Override
	public Object processCommand(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("name");
		StudentDAO dao = new StudentDAO();
		List<StudentDTO> find = null;
		try{
			find = dao.findStudent(name);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("list", find);
		return "WEB-INF/student/list.jsp";
	}

}
