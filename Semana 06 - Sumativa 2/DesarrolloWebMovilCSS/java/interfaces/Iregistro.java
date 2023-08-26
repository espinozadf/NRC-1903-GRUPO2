package interfaces;

import java.util.List;

import modelo.Registro;

public interface Iregistro {
    
	List<Registro> obtenerRegistros();
	void registrarRegistro(Registro registro);
}
