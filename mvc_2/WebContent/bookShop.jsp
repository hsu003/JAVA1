<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- bookShop.jsp -->
<html>
<head>
	<title>도서주문</title>
</head>
<body>
	<h1>도서 주문 페이지</h1>
	<form name="f" action="bookShop.do" method="post">
		<input type="hidden" name="command" value="ADD">
		<b>도서선택 : </b>
		<select name="book">
			<option>스트링 부트 / 김인우 / 22000</option>
			<option>이것이 자바다 / 신용권 / 30000</option>
			<option>딥러닝 교과서 / 백광수 / 35000</option>
			<option>파이썬 for Beginner / 우재남 / 27000</option>
		</select>
		<b>수량 : </b>
		<input type="text" name="qty" size="2" value="1">
		<input type="submit" value="도서주문">
	</form>
	<hr color="red">
	<jsp:include page="cart.jsp"/><!-- 해당하는 페이지을 갔다가 재 실행 한다. -->
</body>
</html>
