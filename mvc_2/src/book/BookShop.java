//서블릿 페이지
package book;

import java.io.*;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class BookShop extends HttpServlet {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=EUC-KR");
		req.setCharacterEncoding("EUC-KR");
		
		String cmd = req.getParameter("command");
		HttpSession session = req.getSession(); //기존 유지 되고 있는 세견 가져 오기
		List<BookDTO> list = (List)session.getAttribute("cart");
		//히든으로 벨류값이 넘어 오면서  맞는지 안맞는지 확인해주는 자바 패턴.
		if (cmd.equals("ORD")) {
			Hashtable<String, BookDTO> ht = new Hashtable<>();
			//list안에 내용을 집계
			//key: 도서명, value : BookDTO
			for(BookDTO dto : list) {
				if(ht.containsKey(dto.getTitle())) {
					BookDTO dto2 = ht.get(dto.getTitle());
					dto.setQty(dto2.getQty() + dto.getQty());
				}
				ht.put(dto.getTitle(), dto);	
			}
			req.setAttribute("order",ht);
			//req.setAttribute("키","값");
			RequestDispatcher view = req.getRequestDispatcher("result.jsp");
			view.forward(req, resp);
		}else {
			if (cmd.equals("ADD")){
				BookDTO dto = getBook(req);
				if (list==null) list = new ArrayList<>();//만약 list가 값이 없으면 새로운 어레이 리스트 만들어 주는 거
				list.add(dto);	
			}else if (cmd.equals("DEL")){
				String idx = req.getParameter("idx");
				list.remove(Integer.parseInt(idx));
			}
			session.setAttribute("cart", list);//jsp 에선 session 내장 객체여서 자동으로 생성된다.
			RequestDispatcher view = req.getRequestDispatcher("bookShop.jsp");
			view.forward(req, resp);
		}
	}
	
	@SuppressWarnings("resource")
	protected BookDTO getBook(HttpServletRequest req) { //값을 저장 하기.
		BookDTO dto = new BookDTO();
		String data = req.getParameter("book");
		Scanner in = new Scanner(data).useDelimiter("\\s*/\\s*");
		dto.setTitle(in.next());
		dto.setAuthor(in.next());
		dto.setPrice(in.nextInt());
		dto.setQty(Integer.parseInt(req.getParameter("qty")));
		return dto;
	}
}














