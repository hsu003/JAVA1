<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<head>
<meta charset="EUC-KR">
<title>eltest2</title>
</head>
<body>
	<form name="f" method="post">
	이름 : <input type="text"name="name">
	<input type="submit" value="확인">
	</form>
	<hr color="red">
	<% request.setCharacterEncoding("EUC-KR");%>
	<h2>입력하신 이름은 ${param.name}입니다.</h2>
</body>
</html>