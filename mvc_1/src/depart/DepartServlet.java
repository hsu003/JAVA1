package depart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
public class DepartServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.setContentType("text/html; charset=EUC-KR");
		resp.setCharacterEncoding("EUC-KR");
		
		String depart = req.getParameter("depart");
		
		DepartExpert de = new DepartExpert();
		List<String> list = de.getAdvice(depart);
		
		req.setAttribute("advice", list);	//저장하기
		RequestDispatcher view = req.getRequestDispatcher("result.jsp");
		//jsp사원 부르기   //jsp불러오기
		view.forward(req, resp);
		//jsp사원에 값 넘기기  //jsp에서 값 저장 하기
		
		//PrintWriter pw = resp.getWriter();
		//pw.println("<h2>" + depart +"과목을 선택하셨습니다.</h2>");
	}
	
}









