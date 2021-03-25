//���� ������
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
		HttpSession session = req.getSession(); //���� ���� �ǰ� �ִ� ���� ���� ����
		List<BookDTO> list = (List)session.getAttribute("cart");
		//�������� �������� �Ѿ� ���鼭  �´��� �ȸ´��� Ȯ�����ִ� �ڹ� ����.
		if (cmd.equals("ORD")) {
			Hashtable<String, BookDTO> ht = new Hashtable<>();
			//list�ȿ� ������ ����
			//key: ������, value : BookDTO
			for(BookDTO dto : list) {
				if(ht.containsKey(dto.getTitle())) {
					BookDTO dto2 = ht.get(dto.getTitle());
					dto.setQty(dto2.getQty() + dto.getQty());
				}
				ht.put(dto.getTitle(), dto);	
			}
			req.setAttribute("order",ht);
			//req.setAttribute("Ű","��");
			RequestDispatcher view = req.getRequestDispatcher("result.jsp");
			view.forward(req, resp);
		}else {
			if (cmd.equals("ADD")){
				BookDTO dto = getBook(req);
				if (list==null) list = new ArrayList<>();//���� list�� ���� ������ ���ο� ��� ����Ʈ ����� �ִ� ��
				list.add(dto);	
			}else if (cmd.equals("DEL")){
				String idx = req.getParameter("idx");
				list.remove(Integer.parseInt(idx));
			}
			session.setAttribute("cart", list);//jsp ���� session ���� ��ü���� �ڵ����� �����ȴ�.
			RequestDispatcher view = req.getRequestDispatcher("bookShop.jsp");
			view.forward(req, resp);
		}
	}
	
	@SuppressWarnings("resource")
	protected BookDTO getBook(HttpServletRequest req) { //���� ���� �ϱ�.
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














