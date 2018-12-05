<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page session="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Spitter </title>
    	
	</head>
	
	<body>
		<h1>Rejestracja</h1>
		
		<sf:form method="POST"  modelAttribute="user">
			<sf:errors path="*" element="div" cssClass="errors" />
				<sf:label path="firstName" cssErrorClass="error"> </sf:label>
					<sf:input path="firstName" cssErrorClass="error" /><br/>
	      		<sf:label path="lastName" cssErrorClass="error"></sf:label>
					<sf:input path="lastName" cssErrorClass="error" /><br/>
	      		<sf:label path="email" cssErrorClass="error"> </sf:label>
					<sf:input path="email" cssErrorClass="error" /><br/>
		        <sf:label path="username" cssErrorClass="error"> </sf:label>
					<sf:input path="username" cssErrorClass="error" /><br/>
	      		<sf:label path="password" cssErrorClass="error"> </sf:label>
					<sf:password path="password" cssErrorClass="error" /><br/>
				<input type="submit" value="Register" />
		</sf:form>
	</body>
</html>