<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Profile </title>
</head>
<body>
	<h1>Your profile</h1>
<c:out value="${user.username}" /><br/>
<c:out value="${user.firstName}" />
<c:out value="${user.lastName}" />
<c:out value="${user.email}" />
</body>
</html>