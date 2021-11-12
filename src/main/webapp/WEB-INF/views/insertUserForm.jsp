<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Insert User</title>
</head>
<body>

<form action="/insertUser" method="post" onsubmit="return confirm('등록하시겠습니까?')">
	
	<table border="1">
	
		<tr>
			<td>회원명</td>
			<td><input type="text" name="uname"></td>
		</tr>
		
		<tr>
			<td>연락처</td>
			<td><input type="text" name="utel"></td>
		</tr>
		
		<tr>
			<td>나이</td>
			<td><input type="number" name="uage" min="0"></td>
		</tr>
		
		<tr>
			<td>주소</td>
			<td><input type="text" name="uaddress"></td>
		</tr>
		
		<tr>
			<td>성별</td>
			<td>
				<input type="radio" name="ugender" value="m">남
				<input type="radio" name="ugender" value="f">여
			</td>
		</tr>
		
		<tr>
			<td colspan="2"><input type="submit" value="등록하기"></td>
		</tr>
		
	</table>



</form>

<a href="/userList">뒤로가기</a>


</body>
</html>
