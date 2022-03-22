package ar.com.educacionit.domain;

public class Categorias {
	
	//Atributos
	private Long id;
	private String descripcion;
    private String codigo;
	
	//Constructor
	public Categorias(Long id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.codigo = codigo;
	}

	public Categorias(String descripcion) {
		super();
		this.descripcion = descripcion;
		this.codigo = codigo;
	}
    
	//Get/Set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	//Metodos
	
	

}
