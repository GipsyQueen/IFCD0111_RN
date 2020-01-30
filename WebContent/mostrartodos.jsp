<%@page import="java.util.List"%>
<%@page import="app.modelo.Contacto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todos los contactos</title>
</head>
<body>
	<form action="index.html">
		<h1>Estos son todos los contactos de la agenda</h1>

		<%
			ArrayList<Contacto> c1 = (ArrayList<Contacto>) request.getAttribute("c1");
		%>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Email</th>
				<th>Telefono</th>

				<%
					for (Contacto elemento : c1) {
				%>

			</tr>
			<tr>
				<td><%=elemento.getId()%></td>
				<td><%=elemento.getNombre()%></td>
				<td><%=elemento.getEmail()%></td>
				<td><%=elemento.getTelefono()%></td>

			</tr>
			<%
				}
			%>
		</table>
		<input type="submit" value="Volver a Inicio">
	</form>
</body>
</html>