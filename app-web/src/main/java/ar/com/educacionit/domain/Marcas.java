package ar.com.educacionit.domain;

public class Marcas {

	 private Long Id;
	 private String marca;
	 private String codigo;
	 private Long habilitada;//1 o 0
	 
	//Constructor
	public Marcas(Long id, String marca, String codigo, Long habilitada) {
		Id = id;
		this.marca = marca;
		this.codigo = codigo;
		this.habilitada = habilitada;
	}
	
	public Marcas(String marca, String codigo, Long habilitada) {
		this.marca = marca;
		this.codigo = codigo;
		this.habilitada = habilitada;
	}
    
	//Get/Set
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getHabilitada() {
		return habilitada;
	}

	public void setHabilitada(Long habilitada) {
		this.habilitada = habilitada;
	}

	@Override
	public String toString() {
		return "Marcas [Id=" + Id + ", marca=" + marca + ", codigo=" + codigo + ", habilitada=" + habilitada + "]";
	}
	 
	 
	 
}
