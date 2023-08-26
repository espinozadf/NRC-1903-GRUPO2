package cl.grupo2.servlets.registro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import cl.grupo2.daos.RegistroDAO;

/**
 * Servlet implementation class EliminarCapacitacion
 */
public class EliminarRegistro extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		RegistroDAO registroDAO = RegistroDAO.getInstancia();
		registroDAO.eliminarRegistro(id);
		
		response.sendRedirect("ListarRegistros");
	}
}
