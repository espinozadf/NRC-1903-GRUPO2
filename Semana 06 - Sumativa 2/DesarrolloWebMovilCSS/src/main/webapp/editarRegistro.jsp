<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page import="modelo.Registro"%>

<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Editar Registro</title>
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
			<h2 class="titulo-cont">Editar Registro</h2>
			
			<%Registro registro = (Registro) request.getAttribute("registro");%>
			<form class="formularioEditar" action="ActualizarRegistro" method="POST">
			
				<input type="hidden" name="id" value="<%= registro.getId() %>">
				
			<div class="form-group">
				<label for="rut">RUT:</label> 
				<input type="text" class="form-control" name="RUT" value="<%= registro.getRUT() %>">
			</div>
			
			<div class="form-group">
				<label for="nombre">Nombre:</label> 
				<input type="text" class="form-control" name="Nombre" value="<%= registro.getNombre() %>">
			</div>
			
			<div class="form-group">
				<label for="apellidos">Apellidos:</label> 
				<input type="text" class="form-control" name="Apellidos" value="<%= registro.getApellidos() %>">
			</div>
			
			
			<div class="form-group">
				<label for="empresa">Empresa:</label> 
				<input type="text" class="form-control" name="Empresa"	value="<%= registro.getEmpresa() %>">
			</div>
			
			<div class="form-group">
				<label for="cargo">Cargo:</label> 
				<input type="text" class="form-control" name="Cargo" value="<%= registro.getCargo() %>">
			</div>
			
			<div class="form-group">
				<label for="departamento">Departamento:</label> 
				<input type="text" class="form-control" name="Departamento" value="<%= registro.getDepartamento() %>">
			</div>
			
			<div class="form-group">
				<label for="estado">Estado:</label> 
				<input type="text" class="form-control" name="Estado" value="<%= registro.getEstado() %>">
			</div>
			
			<div class="form-group">
				<label for="horaEntrada">Hora Entrada:</label> 
				<input type="text" class="form-control" name="HoraEntrada" value="<%= registro.getHoraEntrada() %>">
			</div>
			
			<div class="form-group">
				<label for="horaSalida">Hora Salida:</label> 
				<input type="text"	class="form-control" name="HoraSalida" value="<%= registro.getHoraSalida() %>">
			</div>
			
				<div>
                    <input class="boton-formulario" type="submit" value="Actualizar">
                </div>
				
				<div>
                    <a href="ListarRegistros" class="boton-formulario">Atrás</a>
                </div>
			</form>
		</div>
</body>
</html>