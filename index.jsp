<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form</title>
</head>
<body>
<div align="center">
    <form action="cadastrar" method="post">
        <p>Digite o nome: <input type="text" name="nome" required></p>
        <p>Digite o cpf: <input type="number" name="cpf" required></p>
        <p><input type="submit" value="Cadastrar"></p>
    </form>
</div>
</body>
</html>