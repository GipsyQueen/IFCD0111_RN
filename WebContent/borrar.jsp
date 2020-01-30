<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Elimina un contacto</title>
</head>
<body>
	<%
		if (request.getParameter("id") != null) {
	%>
	<jsp:useBean id="c1" class="app.modelo.Contacto" scope="request"></jsp:useBean>
	<jsp:setProperty property="id" name="c1" />
	<jsp:forward page="control?op=5"></jsp:forward>
	<%
		}
	%>
	<h1>Elimina un contacto</h1>
	<form action="borrar.jsp" method="post">
	Id del contacto:
	<input type="number" name="id" />
	<br></br>
	<input type="submit" value="Eliminar" />
	</form>
</body>
</html>