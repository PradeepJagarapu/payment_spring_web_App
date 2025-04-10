<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.header {
		background-color: #007bff;
		color: white;
		padding: 20px;
		text-align: center;
		box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
	}
	
	.header button {
		background-color: #ff4c4c;
		color: white;
		border: none;
		padding: 10px 20px;
		cursor: pointer;
		border-radius: 5px;
	}
	
	.header button:hover {
		background-color: #d43b3b;
	}
</style>
</head>
<body>
	<div class="header">
		<h2>Payments Web App</h2>
		<p>Welcome<User Full Name></p>
		<a href="${pageContext.request.contextPath}/logout"><button>Logout</button></a>
	</div>
</body>
</html>