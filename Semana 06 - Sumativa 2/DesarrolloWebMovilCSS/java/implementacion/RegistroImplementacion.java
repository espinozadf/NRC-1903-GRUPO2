package implementacion;

import java.util.ArrayList;
import java.util.List;

import interfaces.Iregistro;
import modelo.Registro;

public class RegistroImplementacion implements Iregistro{

	@Override
	public List<Registro> obtenerRegistros() {
		List<Registro> registros = new ArrayList<>();
        registros.add(new Registro(1, "RUT 1", "Nombre 1", "Apellidos 1", "Empresa 1","Cargo 1", "Departamento 1", "Estado 1","Hora Entrada 1", "Hora Salida 1"));
        registros.add(new Registro(2, "RUT 2", "Nombre 2", "Apellidos 2", "Empresa 2","Cargo 2", "Departamento 2", "Estado 2","Hora Entrada 2", "Hora Salida 2"));
        registros.add(new Registro(3, "RUT 3", "Nombre 3", "Apellidos 3", "Empresa 3","Cargo 3", "Departamento 3", "Estado 3","Hora Entrada 3", "Hora Salida 3"));
		return registros;
	}

	@Override
	public void registrarRegistro(Registro registro) {
		// Simula la acción de registrar una capacitación mostrando sus datos por consola
		System.out.println("Registro incluido:");
        System.out.println(registro);
	}
	

}
