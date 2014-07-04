<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>view page</title>
<script type="text/javascript">
	
	function productList(){
		var formData = document.productForm;
		formData.action="list.do";
		formData.submit();		
	}
	function productUpdate(){
		var formData = document.productForm;
		formData.action="update.do";
		formData.submit();
	}
	function productDelete(){
		var formData = document.productForm;
		formData.action="delete.do";
		formData.submit();
}

</script>
</head>
<body>
<center>
	<h2>상품 관리 - 입력된 상품 정보</h2>
	<form name="productForm" method="post" >
	<table border="1">	
		<tr> 
			<td colspan="2" align="center">상품&nbsp;정보</td>					
		</tr>
		<tr>
			<td>상품코드</td>
			<td>
				<input type="text" name="code" value="${requestScope.product.code}"/>
			</td>					
		</tr>	
		<tr>
			<td>상&nbsp;품&nbsp;명</td>
			<td>
				<input type="text" name="name" value="${requestScope.product.name}"/>
			</td>		
		</tr>		
		<tr>
			<td>상품가격</td>
			<td>
				<input type="text" name="price" value="${requestScope.product.price}"/>			
			</td>		
		</tr>
		<tr>
			<td>상품수량</td>
			<td>
				<input type="text" name="amount" value="${requestScope.product.amount}"/>
			</td>		
		</tr>
		<tr>
			<td>상품설명</td>
			<td>
				<input type="text" name=discription value="${requestScope.product.discription}"/>
			</td>		
		</tr>		
		<tr>
			<td colspan="2">								
				<input type="button"  value="상품정보 수정" onclick="productUpdate()"/>&nbsp;&nbsp;&nbsp;
				<input type="button"  value="상품정보 삭제" onclick="productDelete()"/>&nbsp;&nbsp;&nbsp;
				<input type="button"  value="상품정보 목록" onclick="productList()"/>&nbsp;&nbsp;&nbsp;
			</td>					
		</tr>
	
	</table>
	</form>
</center>
</body>
</html>