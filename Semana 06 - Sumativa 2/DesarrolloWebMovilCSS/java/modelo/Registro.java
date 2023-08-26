package modelo;

public class Registro {
	private int id;
	private String RUT;
	private String Nombre;
	private String Apellidos;
	private String Empresa;
	private String Cargo;
	private String Departamento;
	private String Estado;
	private String HoraEntrada;
	private String HoraSalida;




	public Registro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Registro(int id, String rUT, String nombre, String apellidos, String empresa, String cargo, String departamento,
			String estado, String horaEntrada, String horaSalida) {
		super();
		this.id = id;
		RUT = rUT;
		Nombre = nombre;
		Apellidos = apellidos;
		Empresa = empresa;
		Cargo = cargo;
		Departamento = departamento;
		Estado = estado;
		HoraEntrada = horaEntrada;
		HoraSalida = horaSalida;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRUT() {
		return RUT;
	}
	public void setRUT(String rUT) {
		RUT = rUT;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getHoraEntrada() {
		return HoraEntrada;
	}
	public void setHoraEntrada(String horaEntrada) {
		HoraEntrada = horaEntrada;
	}
	public String getHoraSalida() {
		return HoraSalida;
	}

	public void setHoraSalida(String horaSalida) {
		HoraSalida = horaSalida;
	}	
	@Override
	public String toString() {
		return "Registro [id=" + id + ", RUT=" + RUT + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Empresa="
				+ Empresa + ", Cargo=" + Cargo + ", Departamento=" + Departamento + ", Estado=" + Estado
				+ ", HoraEntrada=" + HoraEntrada + ", HoraSalida=" + HoraSalida + ", getId()=" + getId() + ", getRUT()="
				+ getRUT() + ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getEmpresa()="
				+ getEmpresa() + ", getCargo()=" + getCargo() + ", getDepartamento()=" + getDepartamento()
				+ ", getEstado()=" + getEstado() + ", getHoraEntrada()=" + getHoraEntrada() + ", getHoraSalida()="
				+ getHoraSalida() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}