<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>testJSTL</title>
</head>
<body>
	<c:set var="country" value="${'korea'}"/>
	<c:if test="${country!= null}">
		국가명 : <c:out value="${country}"/>
	</c:if>
</body>
</html>