<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, book.*"%>
<%
		List<BookDTO> list = (List)session.getAttribute("cart");
		if (list != null && list.size()!=0){%>
		<b>���� �ֹ��� ���� ����</b>
		<table border="1" width="500">
			<tr>
				<th>��������</th>
				<th>�۰�</th>
				<th>����</th>
				<th>����</th>
				<th>����</th>
			</tr>
<%		for(int i=0; i<list.size(); ++i){ //for(BookDTO dto : list) �� ���� for ��
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
					<input type="submit" value="����">
				</form>
				</td>	
			</tr>
<%		} %>					
		</table>	
		<form name="check" method="post" action="bookShop.do">
			<input type="hidden" name="command" value="ORD">
			<input type="submit" value="�����ֹ��Ϸ��������� �̵�">
		</form>
<%	}%>
