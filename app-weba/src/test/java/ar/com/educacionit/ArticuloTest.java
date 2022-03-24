package ar.com.educacionit;

import java.sql.Date;

import ar.com.educacionit.domain.Articulos;

public class ArticuloTest {

	public static void main(String [] args) {
		
		
		 Articulos miArticulo = new Articulos("titulo1", new Date(0), "0001", 2500, 1l, 1l);
		
	/*miArticulo.getTitulo().equals("titulo1");
		
		System.out.println("OK");
	*/	
		 String titulo = miArticulo.getTitulo(true);
		 
		 boolean iguales = titulo.equals("TITULO1");
		 
		if (iguales) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
		}
	}
}