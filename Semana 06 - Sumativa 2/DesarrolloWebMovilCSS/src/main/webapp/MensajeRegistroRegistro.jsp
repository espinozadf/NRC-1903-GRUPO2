<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mensaje de Registro de Registro</title>
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
        <h2 class="titulo-cont">Mensaje de Registro</h2>
    </div>    
    <div>
        <% String mensaje = (String) request.getAttribute("mensaje"); %>
        <%= mensaje %>
    </div>
    <form class="formularioMensaje"action="ListarRegistros" method="get">      
        <div>
            <input class="botones-out" type="submit" value="Ver Lista">
        </div>
                
        <div class="text-left">
            <a href="index.jsp" class="boton-formulario">Atrás</a>
        </div>                
    </form>
</body>
</html>