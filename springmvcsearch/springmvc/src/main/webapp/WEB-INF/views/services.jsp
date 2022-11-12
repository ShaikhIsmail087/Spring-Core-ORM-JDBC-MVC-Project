<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Services page</title>
</head>
<body>
	<h1>This is service controller...</h1>
	<h1>Random number is...<%=new java.util.Random().nextInt()*1000000 %></h1>
	<h1>This is server time servicing by controller...<%=new java.util.Date() %></h1>
</body>
</html>