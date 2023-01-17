<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Nova Empresa</title>
</head>
<body>

<form action="/empresas/entrada" method="post">
Login: <input type="text" name="login"/>
Senha: <input type="password" name="senha"/>
<input type="submit"/>
<input type="hidden" name="acao" value="Login"/>

</form>

</body>
</html>