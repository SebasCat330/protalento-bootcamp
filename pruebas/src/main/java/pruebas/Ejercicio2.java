package pruebas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		//ahora puedo ller datos desdee el teclado
		
		System.out.println("Ingrese el valor de a:");
	    int a = teclado.nextInt();//lee un dato entero
	    
	    System.out.println("Ingrese el valor de b:");
	    int b = teclado.nextInt();

		int suma = a + b;
		
		System.out.println("La suma es = " + suma);
		
        teclado.close();
		//cierro teclado
	}

}
