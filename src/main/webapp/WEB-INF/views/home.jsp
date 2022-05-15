<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="ko">
<head>
<title>API 연습</title>
<script src="../resources/js/jquery-3.6.0.js"></script>
<script>
		$.ajax({
			url:"some.php",
			method: "POST",
			data: { name: "John", location: "boston"}
		})
			.done(function (msg)) {
				alert("Data Saved:" + msg);
		});
</script>
</head>
<body>
	<h1>[내 사이트임 ㅎㅇ]</h1>





</body>
</html>
