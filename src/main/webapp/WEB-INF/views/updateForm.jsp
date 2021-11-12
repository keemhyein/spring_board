<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Board Content</title>
</head>
<body>

<form action="/update" method="post">

	<p>번호 : <input type="hidden" name="bno" value="${dto.bno}">${dto.bno}</p>
	<p>제목 : <input type="text" name="btitle" value="${dto.btitle}"></p>
	<p>내용 : <input type="text" name="bcontent" value="${dto.bcontent}"></p>
	<p>작성자 : ${dto.bwriter}</p>
	<p>등록일 : ${dto.bregdate}</p>
	
	<input type="submit" value="수정완료">
	
</form>

</body>
</html>
