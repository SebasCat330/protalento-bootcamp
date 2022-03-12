package clase4;

import java.util.Scanner;

public class CicloDoWhileEjercicio {

	public static void main(String[] args) {

        // Leer un valor
		// > 0 && <=10
		// Acumular la suma de dichos valores
		// MOSTRAR EL VALOR ACUMULADO
		
		Scanner teclado = new Scanner(System.in);
		int valor;
		int suma = 0;
		
		do {
			System.out.println("Ingrese valor");
			valor = teclado.nextInt();
			
			// Logica
			suma += valor;
			
			// ??
			// 10>0 && 10<=10 => SI
			// 20>0 && 20<=10 => SI
		} while(valor > 0 && valor <= 10);

		// AFUERA!!
		
		System.out.println("SUMA:" + suma);
		
	}

}
