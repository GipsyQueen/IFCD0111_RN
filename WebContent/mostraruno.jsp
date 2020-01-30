<%@page import="app.modelo.Contacto"%>
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
		<h1>Estos son todos los contactos de la agenda</h1>

		<%
			Contacto c1 = (Contacto) request.getAttribute("c1");
		%>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Email</th>
				<th>Telefono</th>

			</tr>
			<tr>
				<td><%=c1.getId()%></td>
				<td><%=c1.getNombre()%></td>
				<td><%=c1.getEmail()%></td>
				<td><%=c1.getTelefono()%></td>

			</tr>

		</table>
		<input type="submit" value="Volver a Inicio">
	</form>
</body>
</html>