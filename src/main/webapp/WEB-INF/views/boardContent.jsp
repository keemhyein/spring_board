<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Board Content</title>
</head>
<body>

<p>번호 : ${dto.bno}</p>
<p>제목 : ${dto.btitle}</p>
<p>내용 : ${dto.bcontent}</p>
<p>작성자 : ${dto.bwriter}</p>
<p>등록일 : ${dto.bregdate}</p>

<a href="/updateForm?bno=${dto.bno}">수정하기</a>
<a href="/delete?bno=${dto.bno}">삭제하기</a>
<a href="/boardList">목록</a>


	
</body>
</html>
