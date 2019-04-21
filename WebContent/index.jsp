<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/MiLogin/LoginServlet" method="post">
		Usuario: <input type="text" name="usuario">
		<input type="submit" value="Enviar">
	</form>
	
	<script src="resources/jquery/jquery-3.3.1.min.js"></script>
	<script src="js/index.js"></script>	
</body>
</html>