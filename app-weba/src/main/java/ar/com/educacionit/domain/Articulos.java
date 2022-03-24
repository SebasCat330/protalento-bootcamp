package ar.com.educacionit.domain;

import java.sql.Date;

public class Articulos {
	
	private static final String precio = null;
	private Long id;
	private String titulo;
	private Date fechaCreacion;
	private String codigo;
	private Integer stock;
	private Long marcaId;
	//private Marcas marca;
	private Long categoriaId;
	
	//Constructor hacia la DB
	public Articulos(String titulo, Date fechaCreacion, String codigo, Integer stock, Long marcaId, Long categoriaId) {
		
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.stock = stock;
		this.marcaId = marcaId;
		this.categoriaId = categoriaId;
	}
    
	//Desde la DB
	

	public Articulos(Long id, String titulo, Date fechaCreacion, String codigo, Integer stock, Long marcaId,
			Long categoriaId) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.stock = stock;
		this.marcaId = marcaId;
		this.categoriaId = categoriaId;
	}
	
	public Double getPrecio() {
		return this.getPrecio();
	}

	public String getPrecio(String pattern) {
		//##, ###.00
		return this.precio.toString();
	}
    
	//Get and Set
	
	public String getTitulo() {
		return titulo;
	}
    
	public String getTitulo(boolean isUpperCase) {
		if(isUpperCase) {
			return this.titulo.toUpperCase();
		}else {
			return this.titulo;
		}
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Long getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(Long marcaId) {
		this.marcaId = marcaId;
	}

	public Long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", codigo=" + codigo
				+ ", stock=" + stock + ", marcaId=" + marcaId + ", categoriaId=" + categoriaId + "]";
	}
	
	

}
