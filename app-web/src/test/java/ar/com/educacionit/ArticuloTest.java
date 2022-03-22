package ar.com.educacionit;

import java.util.Date;

import ar.com.educacionit.domain.Articulos;


public class ArticuloTest {
	
	public static void main(String [] args) {
		//assert
		Articulos miArticulo = new Articulos("titulo1", new Date(), "0001", 2500d, 5 ,1L, 1L);
		
		String titulo = miArticulo.getTitulo(true);
		
		boolean iguales = titulo.equals("TITULO1");
		
		if(iguales) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
		}
		
	}

}
