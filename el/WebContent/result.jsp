<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String name = (String)request.getAttribute("name");
%>
<h2>전송하신 이름은 <%=name%> 입니다.</h2>
<h2>전송하신 이름은 ${session.name} 입니다.</h2>