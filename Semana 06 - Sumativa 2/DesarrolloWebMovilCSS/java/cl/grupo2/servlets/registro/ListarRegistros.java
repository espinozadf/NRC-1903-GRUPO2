package cl.grupo2.servlets.registro;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Registro;
import java.io.IOException;
import java.util.List;

import cl.grupo2.daos.RegistroDAO;
/**
 * Servlet implementation class ListarRegistros
 */
public class ListarRegistros extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RegistroDAO registroDAO = RegistroDAO.getInstancia();
	    List<Registro> registros = registroDAO.obtenerRegistro();
	   
	    request.setAttribute("registros", registros);
	    request.getRequestDispatcher("ListarRegistros.jsp").forward(request, response);
	}
}