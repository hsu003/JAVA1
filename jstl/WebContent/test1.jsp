<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jstl�׽�Ʈ</title>
</head>
<body>
	<c:set var="country" value="${korea}"/>
	���� �� :<c:out value="${country}"/><br>
	<c:remove var="country"/>
	���� �� : <c:out value="${country}"/><br>
</body>
</html>