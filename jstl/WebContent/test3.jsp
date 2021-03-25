<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- test3.jsp -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>JSTL test3</title>
</head>
<body>
	<c:set var="country" value="${'canada'}" />
	<c:choose>
		<c:when test="${country == 'korea'}">
			<c:out value="${country}"/>의 겨울은 춥습니다.
		</c:when>
		<c:when test="${country == 'canada'}">
			<c:out value="${country}"/>의 겨울은 매우 춥습니다.
		</c:when>
		<c:otherwise>
			<c:out value="${country}"/>의 겨울은 잘 몰라요
		</c:otherwise>
	</c:choose>
</body>
</html>