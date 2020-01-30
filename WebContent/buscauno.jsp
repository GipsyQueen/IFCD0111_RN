<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulta</title>
</head>
<body>
	<%
		if (request.getParameter("id") != null) {
	%>
	<jsp:useBean id="c1" class="app.modelo.Contacto" scope="request"></jsp:useBean>
	<jsp:setProperty property="id" name="c1" />
	<jsp:forward page="control?op=2"></jsp:forward>
	<%
		}
	%>
	<h1>Busca un contacto por ID</h1>
	<form action="buscauno.jsp" method="post">
	Id del contacto:
	<input type="number" name="id" />
	<br></br>
	<input type="submit" value="Consultar" />
	</form>
	<br>
	<a href="index.html">Volver a inicio</a>
	<br>
</body>
</html>