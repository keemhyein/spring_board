<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>User List</title>
</head>
<body>

<a href="/insertUserForm">회원등록</a>

<table border="1">
	
	<tr>
		<td>회원번호</td>
		<td>회원명</td>
		<td>등록일</td>
	</tr>
	
	<c:forEach var="userList" items="${userList}">
		<tr>
			<td>${userList.uno}</td>
			<td><a href="/userInfo?uno=${userList.uno}">${userList.uname}</a></td>
			<td>${userList.uregdate}</td>
		</tr>
	</c:forEach>

</table>
	
</body>
</html>
