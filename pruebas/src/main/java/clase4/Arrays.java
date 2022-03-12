package clase4;

public class Arrays {

	public static void main(String[] args) {
		// Crear vector
		
		int[] edades = new int[2]; //un vector de 3  posiciones 0,1
		
		// [0,0,0]
		//  0,1,2
		
		// carga
		edades[0] = 5;
		edades[1] = 10;
		
		// atributo length 
		
		int tamanio = edades.length; //Tamaño del vector
		
		// acceder al ultimo elemento
		int edad = edades[tamanio - 1];
		
		//edades[0];
		//edades[2];
		

	}

}
