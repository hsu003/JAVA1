<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<head>
<meta charset="EUC-KR">
<title>eltest2</title>
</head>
<body>
	<form name="f" method="post">
	�̸� : <input type="text"name="name">
	<input type="submit" value="Ȯ��">
	</form>
	<hr color="red">
	<% request.setCharacterEncoding("EUC-KR");%>
	<h2>�Է��Ͻ� �̸��� ${param.name}�Դϴ�.</h2>
</body>
</html>