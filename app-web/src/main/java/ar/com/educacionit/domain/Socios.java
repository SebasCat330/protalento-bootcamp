package ar.com.educacionit.domain;

public class Socios {
 
	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	private String direccion;
	private String paisesId;
	
	//Consructor
	public Socios(Long id, String nombre, String apellido, String email, String direccion, String paisesId) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccion = direccion;
		this.paisesId = paisesId;
	}

	public Socios(String nombre, String apellido, String email, String direccion, String paisesId) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccion = direccion;
		this.paisesId = paisesId;
	} 
	
	
	
	
}
