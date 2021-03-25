<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- test4.jsp -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title>JSTL test4</title>
</head>
<body>
	<c:set var="sum" value="0" />
	<c:forEach var="k" begin="1" end="100" step="1">
		<c:if test="${k%2==0}">
			<c:set var="sum" value="${sum+k}"/>
		</c:if>
	</c:forEach>
	1~100사이 짝수의 합 : <c:out value="${sum}"/>
</body>
</html>