<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, book.*"%>
<!-- result.jsp -->
<%
		Hashtable<String, BookDTO> ht = (Hashtable)request.getAttribute("order");
%>
<html>
<head>
	<title>주문내역</title>
</head>
<body>
	<div align="center">
		<hr color="green" width="300">
		<h2>도 서 주 문 내 역 서</h2>
		<hr color="green" width="300">
		<table border="1" width="600">
			<tr bgcolor="yellow">
				<th>도서제목</th>
				<th>작가</th>
				<th>단가</th>
				<th>수량</th>
				<th>금액</th>
			</tr>
<%		Enumeration<String> enu = ht.keys();
			int totalPrice = 0;
			while(enu.hasMoreElements()){
				String key = enu.nextElement();
				BookDTO dto = ht.get(key);
				totalPrice += dto.getQty() * dto.getPrice();%>
			<tr>
				<td><%=dto.getTitle()%></td>
				<td><%=dto.getAuthor()%></td>
				<td><%=dto.getPrice()%></td>
				<td><%=dto.getQty()%></td>
				<td><%=dto.getQty()*dto.getPrice()%></td>
			</tr>	
<%		}%>	
			<tr>
				<td colspan="3" align="center">
					<b>합계금액</b>
				</td><p>
				<td colspan="3" align="center"><%= totalPrice%>원</td>
			</tr>		
		</table>
	</div>
</body>
</html>




