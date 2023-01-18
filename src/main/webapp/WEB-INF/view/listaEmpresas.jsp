<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Empresas</title>
</head>
<body>


<c:import url="logout-parcial.jsp"/>

<c:if test="${not empty empresa }">
	Empresa: ${empresa } cadastrada com sucesso!
</c:if>

Lista de empresas: </br>

<c:forEach items="${lista }" var="empresas">
	<ul>
	Nome: ${empresas.nome }
	<a href="/empresas/entrada?acao=MostraEmpresas&id=${empresas.id }">Editar</a>
	<a href="/empresas/entrada?acao=RemoveEmpresas&id=${empresas.id }">Remove</a>
	
	</ul>
</c:forEach>

</body>
</html>