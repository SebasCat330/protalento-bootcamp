package clase6.oop;

public class Articulo {

	//Atributos
	 private String titulo;
	 private float precio;
	 private String imagen;
	 private boolean favorito;
	 private boolean envioGratis;
	 private boolean tieneDescuento;
	 private boolean tieneCuotas;
	 private int cantidad;
	 
	 //Constructor
	 public Articulo(String titulo, float precio, String imagen, boolean favorito, int cantidad, boolean tieneCuotas){
		 if(precio > 20000) {
			 this.envioGratis = true; 
		 }
		 this.favorito = favorito;
		 this.titulo = titulo;
		 this.imagen = imagen;
		 this.cantidad = cantidad;
		 this.tieneCuotas = tieneCuotas;
	 }
	 
	 public void agregarAFavorito() {
		 this.favorito = !this.favorito;
	 }
 
	 public void detalleArticulo() {
		 System.out.println("Titulo: " + this.titulo);
		 System.out.println();
		 //Completar
	 }
	 
	 public String getTitulo() {
		return titulo.toUpperCase();
	 }
	 public float getPrecio() {
			return precio;
	 }
	 public String getImagen() {
			return imagen;
     }
	 public boolean isTieneCuotas() {
			return tieneCuotas;
	 }
	 public int getCantidad() {
			return cantidad;
	 }
}






