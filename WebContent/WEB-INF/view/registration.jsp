<%@include file="include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
		<style>
		.error {
			color: red;
			font-weight: bold;
		}
		</style>
</head>
	<body>
		<form:form id="loginForm" method="post" action="registration" modelAttribute="loginBean">
			${message}<br>
			
			<form:label path="username">Enter your user-name</form:label>
			<form:input id="username" name="username" path="username" />
			<form:errors path="username" cssClass="error"/>
			<br>
			<form:label path="password">Please enter your password</form:label>
			<form:password id="password" name="password" path="password" />
			<form:errors  path="password" cssClass="error" />
			<br>
			<form:label path="profession">Please enter Profession </form:label>
			<form:select items="${professionList}"  path="profession" /><br>
			
			<input type="submit" value="Submit" />
		</form:form>
	</body>
</html>