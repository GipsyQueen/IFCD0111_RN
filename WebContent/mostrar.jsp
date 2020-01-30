<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="index.html">
<h1><%=request.getAttribute("mensaje") %></h1>
<input type="submit" value="Volver a Inicio">
	</form>
</body>
</html>