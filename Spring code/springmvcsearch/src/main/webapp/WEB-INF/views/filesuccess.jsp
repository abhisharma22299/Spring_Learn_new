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
<img alt="profile" src="<c:url value="/resources/image/${er}"/>" />
</body>
</html>