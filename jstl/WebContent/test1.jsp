<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jstl테스트</title>
</head>
<body>
	<c:set var="country" value="${korea}"/>
	설정 후 :<c:out value="${country}"/><br>
	<c:remove var="country"/>
	삭제 후 : <c:out value="${country}"/><br>
</body>
</html>