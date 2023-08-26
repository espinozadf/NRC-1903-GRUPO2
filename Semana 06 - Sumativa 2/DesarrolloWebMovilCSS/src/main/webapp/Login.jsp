<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
  <link href="css/styles.css" rel="stylesheet">
</head>

<body class = "cuerpo-principal">
  <div>
    <h1 class="titulo-log">SISTEMA DE CONTROL DE ACCESO DE VISITAS</h1>
  </div>

  <div>
    <h2 class="titulo">UNIO S.A.</h2>
  </div>

  <div class="formulario">
    <form action="Inicio" method="post">
      <div class="form-group">
        <label for="username"><strong>Usuario:</strong></label>
        <input type="text" class="form-control" id="username" name="username" required>
      </div>
              
      <div>
        <label for="password"><strong>Contraseña:</strong></label>
        <input type="password" class="form-control" id="password" name="password" required>
      </div> 
      
      <div>
        <input class="boton-formulario" type="submit" value="INGRESAR">
      </div>
    </form>
  </div>

</body>
</html>
