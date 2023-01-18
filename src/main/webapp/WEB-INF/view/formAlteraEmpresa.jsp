<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Nova Empresa</title>
</head>
<body>


<form action="/empresas/entrada" method="post">
Nome: <input type="text" name="nome" value="${empresa.nome }"/>
<c:import url="logout-parcial.jsp"/>
<!-- "hidden" significa que está ali, mas não está visível, para que o usuário não consiga mexer -->

<input type="hidden" name="id"value="${empresa.id }"/>
<input type="hidden" name="acao"value="AlteraEmpresas"/>
<input type="submit"/>

</form>

</body>
</html>