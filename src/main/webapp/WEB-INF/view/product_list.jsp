<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list page</title>
</head>
<body>
	<center>
	<h2>상품정보 관리 - 리스트</h2>	    	
		<table border="1">
			<tr>
				<th>상품 아이디</th>
				<th>상&nbsp;품&nbsp;명</th>
				<th>가&nbsp;&nbsp;&nbsp;격</th>
				<th>재고&nbsp;물량</th>				
			</tr>				
			<c:forEach items="${requestScope.productList}" var="product">
			<tr>
				<td>${product.code}</td>
				<td><a href='view.do?code=${product.code}'>${product.name}</a></td>
				<td>${product.price}</td>
				<td>${product.amount}</td>
			</tr>			
			</c:forEach>					
		</table>		
				<a href="add.do">상품 정보 등록</a>					
	</center>
</body>
</html>