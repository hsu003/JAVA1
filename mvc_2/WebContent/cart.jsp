<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, book.*"%>
<%
		List<BookDTO> list = (List)session.getAttribute("cart");
		if (list != null && list.size()!=0){%>
		<b>현재 주문한 도서 내역</b>
		<table border="1" width="500">
			<tr>
				<th>도서제목</th>
				<th>작가</th>
				<th>가격</th>
				<th>수량</th>
				<th>삭제</th>
			</tr>
<%		for(int i=0; i<list.size(); ++i){ //for(BookDTO dto : list) 와 같은 for 문
				BookDTO dto = list.get(i);%>
			<tr>
				<td><%=dto.getTitle()%></td>
				<td><%=dto.getAuthor()%></td>
				<td><%=dto.getPrice()%></td>
				<td><%=dto.getQty()%></td>
				<td>
				<form name="delete" method="post" action="bookShop.do">
					<input type="hidden" name="command" value="DEL"/>
					<input type="hidden" name="idx" value="<%=i%>"/>
					<input type="submit" value="삭제">
				</form>
				</td>	
			</tr>
<%		} %>					
		</table>	
		<form name="check" method="post" action="bookShop.do">
			<input type="hidden" name="command" value="ORD">
			<input type="submit" value="도서주문완료페이지로 이동">
		</form>
<%	}%>
