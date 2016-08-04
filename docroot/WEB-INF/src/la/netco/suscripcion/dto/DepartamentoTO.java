package la.netco.suscripcion.dto;

public class DepartamentoTO {
	
	private int id_departamento;
	private String nombre;
	private int id_pais;
	
	public int getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId_pais() {
		return id_pais;
	}
	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}
}
