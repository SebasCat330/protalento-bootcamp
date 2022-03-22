package clase4;

import java.util.Arrays;

public class Vectores {

	public static void main(String[] args) {
		
		//crear vectores
		//1- tipoDatos[] nombre = new tipoDatos[] {valor1,valor2...valorn}
        
		//2- tipoDatos[] nombre = new tipoDatos[tamaño]	
	
		//crear un vector vacio
		String[] nombres = new String[] {"luz", "jose", "edwin", "carlos", "herana", "samir"};//X
		//                                0       1       2        3          4        5        6
		String[] nombresConE = new String[nombres.length]; 
	
		int j = 0;
		//int size = nombres.length;//sabemos el tamaño del vector
		
		// buscar los nombres que inician con e
		for(int i=0; i < nombres.length; i++) {//0
			String nombre = nombres[i];//Luz
			
			if(nombre.startsWith("e")) {
				nombresConE[j] = nombre;
				j++;
			}
		}
			
			/*
			 * System.out.println(Arrays.toString(nombresConE));
			//con un for recorriendo el vecor y un if para comparar si esta null o no
			for(String nombre :  nombresConE) {
				if(nombre != null) {
					System.out.println(nombre);
				}
			}
			*/
			
			
	/*if(dato.charAt(0) == 'e') {
				
	     	}
			if(dato.indexOf("e") == 0) { // >=0 sino -1
			
			}
			if(dato.startsWith("e")) {
				
			}
		}
	*/
		
	 
	}
}
