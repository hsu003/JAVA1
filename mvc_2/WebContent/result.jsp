<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, book.*"%>
<!-- result.jsp -->
<%
		Hashtable<String, BookDTO> ht = (Hashtable)request.getAttribute("order");
%>
<html>
<head>
	<title>�ֹ�����</title>
</head>
<body>
	<div align="center">
		<hr color="green" width="300">
		<h2>�� �� �� �� �� �� ��</h2>
		<hr color="green" width="300">
		<table border="1" width="600">
			<tr bgcolor="yellow">
				<th>��������</th>
				<th>�۰�</th>
				<th>�ܰ�</th>
				<th>����</th>
				<th>�ݾ�</th>
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
					<b>�հ�ݾ�</b>
				</td><p>
				<td colspan="3" align="center"><%= totalPrice%>��</td>
			</tr>		
		</table>
	</div>
</body>
</html>




