package cl.grupo2.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import modelo.Registro;

public class RegistroDAO {
	private static RegistroDAO instancia;
	private Connection conexion;
	
	private RegistroDAO() {
		conexion = obtenerConexion();
	}

	public static RegistroDAO getInstancia() {
		if (instancia == null) {
			instancia = new RegistroDAO();
		}
		return instancia;
	}
	
	
	public List<Registro> obtenerRegistro() {
	    List<Registro> registros = new ArrayList<>();
	    String consulta = "SELECT id, RUT, Nombre, Apellidos, Empresa, Cargo, Departamento, Estado, HoraEntrada, HoraSalida FROM registro";

	    try (PreparedStatement statement = conexion.prepareStatement(consulta);
	         ResultSet resultSet = statement.executeQuery()) {

	        while (resultSet.next()) {
	            Registro registro = new Registro();
	            registro.setId(resultSet.getInt("id"));
	            registro.setRUT(resultSet.getString("rut"));
	            registro.setNombre(resultSet.getString("nombre"));
	            registro.setApellidos(resultSet.getString("apellidos"));
	            registro.setEmpresa(resultSet.getString("empresa"));
	            registro.setCargo(resultSet.getString("cargo"));
	            registro.setDepartamento(resultSet.getString("departamento"));
	            registro.setEstado(resultSet.getString("estado"));
	            registro.setHoraEntrada(resultSet.getString("horaEntrada"));
	            registro.setHoraSalida(resultSet.getString("horaSalida"));
	            registros.add(registro);	
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return registros;
	}
	
	public Registro obtenerRegistroPorId(int id) {
        Registro registro = null;
        String consulta = "SELECT id, RUT, Nombre, Apellidos, Empresa, Cargo, Departamento, Estado, HoraEntrada, HoraSalida FROM registro WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    registro = new Registro();
                	registro.setId(resultSet.getInt("id"));
    	            registro.setRUT(resultSet.getString("rut"));
                	registro.setNombre(resultSet.getString("nombre"));
                	registro.setApellidos(resultSet.getString("apellidos"));
                	registro.setEmpresa(resultSet.getString("empresa"));
                	registro.setCargo(resultSet.getString("cargo"));
                	registro.setDepartamento(resultSet.getString("departamento"));
                	registro.setEstado(resultSet.getString("estado"));
                	registro.setHoraEntrada(resultSet.getString("horaEntrada"));
                	registro.setHoraSalida(resultSet.getString("horaSalida"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return registro;
    }

	
	public void agregarRegistro(Registro registro) {
        String consulta = "INSERT INTO registro (RUT, Nombre, Apellidos, Empresa, Cargo, Departamento, Estado, HoraEntrada, HoraSalida) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (

        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, registro.getRUT());
            statement.setString(2, registro.getNombre());
            statement.setString(3, registro.getApellidos());
            statement.setString(4, registro.getEmpresa());
            statement.setString(5, registro.getCargo());
            statement.setString(6, registro.getDepartamento());
            statement.setString(7, registro.getEstado());
            statement.setString(8, registro.getHoraEntrada());
            statement.setString(9, registro.getHoraSalida());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public void actualizarRegistro(Registro registro) {
        String consulta = "UPDATE registro SET RUT = ?, Nombre = ?, Apellidos = ?, Empresa = ?, Cargo = ?, Departamento = ?, Estado = ?, HoraEntrada = ?, HoraSalida = ? WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, registro.getRUT());
            statement.setString(2, registro.getNombre());
            statement.setString(3, registro.getApellidos());
            statement.setString(4, registro.getEmpresa());
            statement.setString(5, registro.getCargo());
            statement.setString(6, registro.getDepartamento());
            statement.setString(7, registro.getEstado());
            statement.setString(8, registro.getHoraEntrada());
            statement.setString(9, registro.getHoraSalida());
            statement.setInt(10, registro.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	
	public void eliminarRegistro(int id) {
        String consulta = "DELETE FROM registro WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	private Connection obtenerConexion() {
        Connection conexion = null;
        try {
            String url = "jdbc:mysql://localhost:3306/registro_ingreso";
            String usuario = "pruebaConexion";
            String password = "Cursojava";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }
	
	
	
	

}
