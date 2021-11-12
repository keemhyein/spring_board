<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>User Info</title>
</head>
<body>

<table border="1">
	
	<tr>
		<td>회원번호</td>
		<td>회원명</td>
		<td>연락처</td>
		<td>주소</td>
		<td>나이</td>
		<td>성별</td>
		<td>등록일</td>
		<td></td>
		<td></td>
	</tr>
	
	<tr>
		<td>${userInfo.uno}</td>
		<td>${userInfo.uname}</td>
		<td>${userInfo.utel}</td>
		<td>${userInfo.uaddress}</td>
		<td>${userInfo.uage}</td>
		<td>${userInfo.ugender}</td>
		<td>${userInfo.uregdate}</td>
		<td><a href="/updateUserForm?uno=${userInfo.uno}">수정하기</a></td>
		<td><a href="/deleteUser?uno=${userInfo.uno}" onclick="return confirm('삭제?')">삭제하기</a></td>
	</tr>

</table>

<a href="/userList">뒤로가기</a>
	
</body>
</html>
