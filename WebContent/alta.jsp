<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Añadir contacto</title>
</head>
<body>
	<%
		if (request.getParameter("nombre") != null) {
	%>
	<jsp:useBean id="c1" class="app.modelo.Contacto" scope="request"></jsp:useBean>
	<jsp:setProperty property="*" name="c1"></jsp:setProperty>
	<jsp:forward page="control?op=4"></jsp:forward>

	<%
		}
	%>
	<h1>Alta de empleado</h1>
	<form action="alta.jsp" method="post">
		ID: <input type="number" name="id"> <br></br>
		Nombre: <input type="text" name="nombre"> <br></br> Email: <input
			type="text" name="email"> <br></br> Telefono: <input
			type="text" name="telefono"> <br></br> <input type="submit"
			value="Añadir contacto">
	</form>
	<br>
	<a href="index.html">Volver a inicio</a>
	<br>
</body>
</html>