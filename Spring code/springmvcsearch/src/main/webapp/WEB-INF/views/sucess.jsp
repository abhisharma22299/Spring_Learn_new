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
<h1>show </h1>
<h1>${user.email}</h1>
<h2>${user.password} </h2>
</body>
</html>