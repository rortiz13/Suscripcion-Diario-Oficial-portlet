package la.netco.suscripcion.dto;

public class SuscripcionTO {

	private int id_suscripcion;
	private String nombres;
	private int id_tipo_doc;
	private String num_documento;
	private String email;
	private String direccion;
	private String telefono;
	private int id_ciudad;
	private String nombres_contacto;
	private String telefono_contacto;
	private String medio;
	private String tipo;
	private String estado_pago;
	private String valor_pagado;
	private int tipo_persona;
	
	
	public int getId_suscripcion() {
		return id_suscripcion;
	}
	public void setId_suscripcion(int id_suscripcion) {
		this.id_suscripcion = id_suscripcion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public int getId_tipo_doc() {
		return id_tipo_doc;
	}
	public void setId_tipo_doc(int id_tipo_doc) {
		this.id_tipo_doc = id_tipo_doc;
	}
	public String getNum_documento() {
		return num_documento;
	}
	public void setNum_documento(String num_documento) {
		this.num_documento = num_documento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getId_ciudad() {
		return id_ciudad;
	}
	public void setId_ciudad(int id_ciudad) {
		this.id_ciudad = id_ciudad;
	}
	public String getNombres_contacto() {
		return nombres_contacto;
	}
	public void setNombres_contacto(String nombres_contacto) {
		this.nombres_contacto = nombres_contacto;
	}
	public String getTelefono_contacto() {
		return telefono_contacto;
	}
	public void setTelefono_contacto(String telefono_contacto) {
		this.telefono_contacto = telefono_contacto;
	}
	public String getMedio() {
		return medio;
	}
	public void setMedio(String medio) {
		this.medio = medio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstado_pago() {
		return estado_pago;
	}
	public void setEstado_pago(String estado_pago) {
		this.estado_pago = estado_pago;
	}
	public String getValor_pagado() {
		return valor_pagado;
	}
	public void setValor_pagado(String valor_pagado) {
		this.valor_pagado = valor_pagado;
	}
	public int getTipo_persona() {
		return tipo_persona;
	}
	public void setTipo_persona(int tipo_persona) {
		this.tipo_persona = tipo_persona;
	}
	
}
