package ar.com.educacionit.domain;

public class Users {
	
	private Long id;
	private String username;
	private String password;
	
	private Socios socio;

	public Users(Long id, String username, String password, Socios socio) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.socio = socio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Socios getSocio() {
		return socio;
	}

	public void setSocio(Socios socio) {
		this.socio = socio;
	}
    
	

}
