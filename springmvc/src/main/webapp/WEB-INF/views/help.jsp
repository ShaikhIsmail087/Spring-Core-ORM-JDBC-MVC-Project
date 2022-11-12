<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help page</title>
</head>
<body>
	
	<%
		/* String name=(String)request.getAttribute("name");
		Integer rollNumber=(Integer)request.getAttribute("rollNumber");
		LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
	%>
	
	<h1>Date & Time is ${time }<%-- <%=time %> --%></h1>
	<h1>Hello my name is ${name }<%-- <%=name %> --%></h1>
	<h1>my rollNumber is ${rollNumber }<%-- <%=rollNumber %> --%></h1>
	<h1>This is help controller</h1>
	<h1>Random number is...<%=new java.util.Random().nextInt()*1000000 %></h1>
	<h1>This is server time servicing by controller...<%=new java.util.Date() %></h1>
	<hr>
	<%-- ${marks } --%>
	<c:forEach var="item" items="${marks}">
		<%-- <h1>${item}</h1> --%>
		<h1><c:out value="${item }"></c:out></h1>
	</c:forEach>
</body>
</html>