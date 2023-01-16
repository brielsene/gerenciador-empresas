<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nova empresa cadastrada com sucesso</title>
</head>
<body>

<c:if test="${not empty nome }">
	Empresa: ${nome } cadastrada com sucesso!
</c:if>
<c:if test="${empty nome }">
	Nenhuma Empresa cadastrada!
</c:if>

</body>
</html>