<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<!-- to use the jsp exprstional language -->
	<%@page isELIgnored="false" %>
	  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Help.jsp</h2>

	<%
/*  	String name = (String) request.getAttribute("name"); */


%>
<c:forEach var="item" items="${as} }">

	<h1> ${item} </h1>
</c:forEach>
<h1> ${name} </h1>

<h2>${as}</h2>
</body>
</html>