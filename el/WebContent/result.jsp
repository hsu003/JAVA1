<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String name = (String)request.getAttribute("name");
%>
<h2>�����Ͻ� �̸��� <%=name%> �Դϴ�.</h2>
<h2>�����Ͻ� �̸��� ${session.name} �Դϴ�.</h2>