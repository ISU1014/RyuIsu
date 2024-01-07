<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 리스트</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<h2>일반 게시판 글 수정</h2>
	<form action="update.do" method="post">
	
	<div class="form-group">
		<label for="no">번호</label>
		<input id="no" name="no" value="${vo.no}" class="form-control" readonly>
	</div>
	
	<div class="form-group">
		<label for="title">제목</label>
		<input id="title" name="title" class="form-control" value="${vo.title}" required>
	</div>
	
	<div class="form-group">
		<label for="content">내용</label>
		<textarea rows="5" id="content" name="content" class="form-control" required>${vo.content}</textarea>
		
	</div>
	
	<div class="form-group">
		<label for="writer">작성자</label>
		<input id="writer" name="writer" class="form-control" value="${vo.writer}" required>
	</div>
	
	<div class="form-group">
		<label for="pw">비밀번호</label>
		<input id="pw" name="pw" type="password" class="form-control" required>
	</div>
	
	<button class="btn btn-default">수정</button>
	</form>
</div>
</body>
</html>
