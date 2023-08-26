<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="cl.grupo2.servlets.Inicio"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio</title>
    <link href="css/styles.css" rel="stylesheet">
  </head>

  <body class = "cuerpo-principal">
    <div class="nav-bg">
		<nav nav class="navegacion-principal contenedor">
		  <a class="nav-link" href="index.jsp">Inicio</a>
		  <a class="nav-link" href="FormularioRegistros.jsp">Entrada</a>
		  <a class="nav-link" href="ListarRegistros">Panel de control</a>
		  <a class="nav-link" href="Login.jsp">Salir del sistema</a>
		</nav>
  	</div>

    <div>
      <h1 class="titulo">Bienvenido al sistema de registro de ingreso de visitas</h1>
    </div>
    
    <div>
      <p class="cuerpo">En este sistema podrás agregar, visualizar, editar, y eliminar elementos</p>
    <div>
    <a href="FormularioRegistros.jsp" class="boton-siguiente">Entrada</a>
    <a href="ListarRegistros" class="boton-siguiente2">Panel de control</a>
    <a href="Login.jsp" class="boton-siguiente3">Salir del sistema</a>
  </body>
</html>
