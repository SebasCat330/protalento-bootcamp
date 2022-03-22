package clase6.oop;

public class Buscador {

	// Atributos
	// Modificador
	private String claveBusqueda;
	private Articulo[] resultados;
	
	private Integer cantidadResultados;
	
	//public Integer unAtributo; /NO SE HACE!!
	
	//CONSTRUCTOR
	
	
	public Buscador(){
		System.out.println("Creando buscador..........");
	}
	
	public void  buscar() {
		System.out.println("Buscando.." +  this.claveBusqueda);
		
		//Como mi buscador necesita usar un objeto de la clase DB
		//Debe instanciar un objeto de dicha clase
		DB db = new DB();
		
		this.resultados = db.consultar(claveBusqueda);
		
		//invacmos un metodo interno (privado)
		this.setCantidadResultados(this.resultados.length);
		
	}
	
	private void setCantidadResultados(int cantidad) {
		if(cantidad < 0) {
			this.cantidadResultados = 0;
		}else {
			this.cantidadResultados = cantidad;
		}
	}
	/*
	void definirClaveBusqueda(String clave) {
		claveBusqueda = clave;
	}
	*/
	public void mostrarResultados(){
		if(this.resultados.length > 0) {
			for(Articulo aux : this.resultados) {
				 aux.detalleArticulo();
			}
		} else {
			System.out.println("No hay resultados para " + this.claveBusqueda);
		}
	}
	
	public String getClaveBusqueda() {
		return claveBusqueda;
	}
	
	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}
	
	public Articulo[] getResultados() {
		return resultados;
	}

	
	
	
	
}
