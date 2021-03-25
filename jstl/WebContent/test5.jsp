<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSTL test5</title>
</head>
<body>
	<table border="1" width="500">
	<c:set var="sum" value="1" />
		<tr><c:forEach var="i" begin="1" end="9" ></tr>
			<c:if test="${i<9}">
				<td><c:forEach var="j" begin="9" end="1" /></td>
			</c:if>
	</c:forEach>
	<c:out value="${sum}"/>
	</table>
</body>
</html>
