package cl.grupo2.servlets.registro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Registro;
import interfaces.Iregistro;
import java.io.IOException;
import java.util.List;
import cl.grupo2.daos.RegistroDAO;
import implementacion.RegistroImplementacion;

/**
 * Servlet implementation class RegistroCapacitaciones
 */

public class AgregarRegistros extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idStr = request.getParameter("id");
		int id = 0;
		
		if (idStr !=null) {
			id = Integer.parseInt(idStr);
		}
		
        String RUT = request.getParameter("RUT");
        String Nombre = request.getParameter("Nombre");
        String Apellidos = request.getParameter("Apellidos");
        String Empresa = request.getParameter("Empresa");
        String Cargo = request.getParameter("Cargo");
        String Departamento = request.getParameter("Departamento");
        String Estado = request.getParameter("Estado");
        String HoraEntrada = request.getParameter("HoraEntrada");
        String HoraSalida = request.getParameter("HoraSalida");
		
		Registro registro = new Registro(id, RUT, Nombre, Apellidos, Empresa, Cargo, Departamento, Estado, HoraEntrada, HoraSalida);
        registro.setRUT(RUT);
        registro.setNombre(Nombre);
        registro.setApellidos(Apellidos);
        registro.setEmpresa(Empresa);
        registro.setCargo(Cargo);
        registro.setDepartamento(Departamento);
        registro.setEstado(Estado);
        registro.setHoraEntrada(HoraEntrada);
        registro.setHoraSalida(HoraSalida);
        
        RegistroDAO registroDAO = RegistroDAO.getInstancia();
        registroDAO.agregarRegistro(registro);
        
        Iregistro registroInterface = new RegistroImplementacion();
        registroInterface.registrarRegistro(registro);

        
        request.setAttribute("mensaje", "El registro ha sido ingresado exitosamente.");
        request.getRequestDispatcher("MensajeRegistroRegistro.jsp").forward(request, response);
        response.sendRedirect("ListarUsuarios");
    }
		
	}


