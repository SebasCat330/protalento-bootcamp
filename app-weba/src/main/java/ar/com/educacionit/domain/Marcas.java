package ar.com.educacionit.domain;

public class Marcas {

	private Long id;
	private String nombre;
	private Long codigo;
	private Long habilitado;//1 o 0
	
	//Constructor
	public Marcas(String nombre, Long codigo, Long habilitado) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.habilitado = habilitado;
	}
	public Marcas(Long id, String nombre, Long codigo, Long habilitado) {
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
		this.habilitado = habilitado;
	}
	
	//Get and Set
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Long getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(Long habilitado) {
		this.habilitado = habilitado;
	}
	
	@Override
	public String toString() {
		return "Marcas [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", habilitado=" + habilitado + "]";
	}
	
	
	
	
}
