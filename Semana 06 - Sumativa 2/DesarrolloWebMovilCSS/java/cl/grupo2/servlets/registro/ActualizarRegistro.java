package cl.grupo2.servlets.registro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Registro;
import java.io.IOException;

import cl.grupo2.daos.RegistroDAO;

/**
 * Servlet implementation class ActualizarRegistro
 */
public class ActualizarRegistro extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
        String RUT = request.getParameter("RUT");
        String Nombre = request.getParameter("Nombre");
        String Apellidos = request.getParameter("Apellidos");
        String Empresa = request.getParameter("Empresa");
        String Cargo = request.getParameter("Cargo");
        String Departamento = request.getParameter("Departamento");
        String Estado = request.getParameter("Estado");
        String HoraEntrada = request.getParameter("HoraEntrada");
        String HoraSalida = request.getParameter("HoraSalida");

        Registro registro = new Registro();
        registro.setId(id);
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
        registroDAO.actualizarRegistro(registro);

        response.sendRedirect("ListarRegistros");
    }

}
