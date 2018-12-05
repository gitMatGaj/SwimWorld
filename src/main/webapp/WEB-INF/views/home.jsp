<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Spittr</title>
<link rel="stylesheet"
type="text/css"
href="<c:url value="/resources/style.css" />" >
</head>
<body>
<h1>Witamy w serwisie Spittr</h1>
<a href="<c:url value="/spittles" />">Login</a> |
<a href="<c:url value="/user/register" />">Rejestracja</a>
</body>
</html>