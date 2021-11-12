<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Insert User</title>
</head>
<body>

<form action="/updateUser" method="post" onsubmit="return confirm('수정????')">
	<input type="hidden" name="uno" value="${userInfo.uno}">
	
	<table border="1">
	
		<tr>
			<td>회원명</td>
			<td><input type="text" name="uname" value="${userInfo.uname}"></td>
		</tr>
		
		<tr>
			<td>연락처</td>
			<td><input type="text" name="utel" value="${userInfo.utel}"></td>
		</tr>
		
		<tr>
			<td>나이</td>
			<td><input type="number" name="uage" value="${userInfo.uage}"></td>
		</tr>
		
		<tr>
			<td>주소</td>
			<td><input type="text" name="uaddress" value="${userInfo.uaddress}"></td>
		</tr>
		
		<tr>
			<td>성별</td>
			<td>
			<c:if test="${userInfo.ugender eq 'm'}">
				<input type="radio" name="ugender" value="m" checked="checked">남
				<input type="radio" name="ugender" value="f">여
			</c:if>
			<c:if test="${userInfo.ugender eq 'f'}">
				<input type="radio" name="ugender" value="m">남
				<input type="radio" name="ugender" value="f" checked="checked">여
			</c:if>
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
