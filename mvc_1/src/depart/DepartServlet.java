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
		
		req.setAttribute("advice", list);	//�����ϱ�
		RequestDispatcher view = req.getRequestDispatcher("result.jsp");
		//jsp��� �θ���   //jsp�ҷ�����
		view.forward(req, resp);
		//jsp����� �� �ѱ��  //jsp���� �� ���� �ϱ�
		
		//PrintWriter pw = resp.getWriter();
		//pw.println("<h2>" + depart +"������ �����ϼ̽��ϴ�.</h2>");
	}
	
}









