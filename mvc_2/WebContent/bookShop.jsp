<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- bookShop.jsp -->
<html>
<head>
	<title>�����ֹ�</title>
</head>
<body>
	<h1>���� �ֹ� ������</h1>
	<form name="f" action="bookShop.do" method="post">
		<input type="hidden" name="command" value="ADD">
		<b>�������� : </b>
		<select name="book">
			<option>��Ʈ�� ��Ʈ / ���ο� / 22000</option>
			<option>�̰��� �ڹٴ� / �ſ�� / 30000</option>
			<option>������ ������ / �鱤�� / 35000</option>
			<option>���̽� for Beginner / ���糲 / 27000</option>
		</select>
		<b>���� : </b>
		<input type="text" name="qty" size="2" value="1">
		<input type="submit" value="�����ֹ�">
	</form>
	<hr color="red">
	<jsp:include page="cart.jsp"/><!-- �ش��ϴ� �������� ���ٰ� �� ���� �Ѵ�. -->
</body>
</html>
