<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>input</title>
<script type="text/javascript">

function productAdd(){
	var formData = document.productForm;
	formData.action="add.do";
	formData.submit();	
}
function productList(){
	var formData = document.productForm;
	formData.action="list.do";
	formData.submit();		
}

</script>
</head>
<body>
<center>
	<h2>상품 관리 - 상품등록화면</h2>
	<form name="productForm" method="POST" >
	<table border="1">	
		<tr>
			<td colspan="2" align="right">* 표시는 필수 입력 사항입니다.</td>
		</tr>
		<tr>
			<td>*상품 코드</td>
			<td><input type="text" name="code" /></td>		
		</tr>	
		<tr>
			<td>*상&nbsp;품&nbsp;명</td>
			<td><input type="text" name="name"/></td>		
		</tr>		
		<tr>
			<td>*가&nbsp;&nbsp;격</td>
			<td><input type="text" name="price"/></td>		
		</tr>
		<tr>
			<td>*수&nbsp;&nbsp;량</td>
			<td><input type="text" name="amount" /></td>					
		</tr>
		<tr>
			<td>*상품설명</td>
			<td><textarea name="discription" rows="4" cols="17"></textarea></td>			
		</tr>			
		<tr>
			<td colspan="2">
				<input type="button" align="left" value="상품정보 추가" onclick="productAdd()"/>
				<input type="button" align="right" value="상품정보 목록" onclick="productList()"/>	
			</td>					
		</tr>	
	</table>
	</form>
</center>
</body>
</html>