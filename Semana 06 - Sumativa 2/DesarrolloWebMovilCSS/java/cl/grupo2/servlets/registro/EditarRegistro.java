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
 * Servlet implementation class EditarCapacitacion
 */
public class EditarRegistro extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id = Integer.parseInt(request.getParameter("id"));
	
	RegistroDAO registroDAO = RegistroDAO.getInstancia();
	Registro registro = registroDAO.obtenerRegistroPorId(id);
	
	
	request.setAttribute("registro", registro);
	request.getRequestDispatcher("editarRegistro.jsp").forward(request, response);
}
}