<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Formulario registro</title>
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
        <h2 class="titulo-cont">Formulario de registro</h2>
    </div>

    <div class="formularioRegistro">
            <form action="AgregarRegistros" method="post">
                <div>
                    <label for="rut">RUT:</label>
                    <input type="text" id="rut" name="RUT" class="form-control" required>
                </div>            
            
                <div>
                    <label for="nombre">Nombre:</label>
                    <input type="text" id="nombre" name="Nombre" class="form-control" required>
                </div>
                
                <div>
                    <label for="apellidos">Apellidos:</label>
                    <input type="text" id="apellidos" name="Apellidos" class="form-control" required>
                </div>
                
                <div>
                    <label for="empresa">Empresa:</label>
                    <input type="text" id="empresa" name="Empresa" class="form-control" required>
                    <!--  
                    <select class="form-select" id="empresa" name="Empresa" required>
                        <option>UNIO S.A.</option>
                        <option>Externo</option>
                    </select>
                    -->
                </div>
                
                <div>
                    <label for="cargo">Cargo:</label>
                    <input type="text" id="cargo" name="Cargo" class="form-control" required>
                </div>   
                             
                <div>
                    <label for="departamento">Departamento:</label>
                    <input type="text" id="departamento" name="Departamento" class="form-control" required>
                </div>   
                             
                <div>
                    <label for="estado">Estado:</label>
                    <input type="text" id="estado" name="Estado" class="form-control" required>
                </div>    
                            
                <div>
                    <label for="horaEntrada">Hora Entrada:</label>
                    <input type="text" id="horaEntrada" name="HoraEntrada" class="form-control" required>
                </div>
<!--  
                <div>
                    <label for="horaSalida">Hora Salida:</label>
                    <input type="text" id="horaSalida" name="HoraSalida" class="form-control" required>
                </div>
-->                                                
                <div>
                    <input class="boton-formulario" type="submit" value="Registrar">
                </div>
                
                <div>
                    <a href="index.jsp" class="boton-formulario">Atrás</a>
                </div>
            </form>
        </div>
    </body>
</html>