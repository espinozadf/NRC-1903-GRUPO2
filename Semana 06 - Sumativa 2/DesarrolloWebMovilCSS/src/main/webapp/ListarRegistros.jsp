<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="modelo.Registro"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Listado de registros</title>
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
		<h2 class="titulo-cont">Listado de Registros</h2>
	</div>
	
	<div class= "tabla">
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>RUT</th>					
					<th>Nombre</th>
					<th>Apellidos</th>
					<th>Empresa</th>
					<th>Cargo</th>					
					<th>Departamento</th>					
					<th>Estado</th>					
					<th>Hora Entrada</th>
					<th>Hora Salida</th>								
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<Registro> registros = (List<Registro>) request.getAttribute("registros");
				%>
				<%
				for (Registro registro : registros) {
				%>
				<tr>
					<td><%= registro.getId() %></td>
					<td><%= registro.getRUT() %></td>
					<td><%= registro.getNombre() %></td>
					<td><%= registro.getApellidos() %></td>
					<td><%= registro.getEmpresa() %></td>
					<td><%= registro.getCargo() %></td>					
					<td><%= registro.getDepartamento() %></td>
					<td><%= registro.getEstado() %></td>
					<td><%= registro.getHoraEntrada() %></td>	
					<td><%= registro.getHoraSalida() %></td>												
					<td>
					<a class="botonEditar" href="EditarRegistro?id=<%= registro.getId() %>"class="">Editar</a>
					<a class="botonEliminar"href="EliminarRegistro?id=<%= registro.getId() %>"onclick="return confirm('Seguro quieres eliminar el registro?')">Eliminar</a></td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>

</body>
</html>

