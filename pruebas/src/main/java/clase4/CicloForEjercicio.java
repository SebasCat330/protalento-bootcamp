package clase4;

import java.util.Scanner;

public class CicloForEjercicio {

	public static void main(String[] args) {
		
		// Solicitar al usuario la cantidad de registros
		// Cargar en un vector de eneteros los datos ingresados por el usuario
		// Contar la cantidad de numeros pares
		// Contar la cantidad de numeros impares
		// Sumar los numeros pares
		// Sumar los numeros impares
		// Promedio de los valores ingresados
		
		int cantidadRegistros;
		int[] vector;
		int cantPares = 0;
		int cantImpares = 0;
		int sumaPares = 0;
		int sumaImpares = 0;
		double promedio;
		
		// 0 definir el tamaño del valor
		// 1 carga de datos
		// 2 procesamiento
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese la cantidad de registros a procesar");
			cantidadRegistros = teclado.nextInt();//-1	
		} while(cantidadRegistros < 0); // 0 < 0 ? falso => 1
		
		vector = new int[cantidadRegistros];
		
		for( int i=0; i < cantidadRegistros ; i++) {
			System.out.println("Ingres un dato");
			int datoleido = teclado.nextInt();
			vector[i] = datoleido;
		}
		
		//Procesamiento
		//r/while/dowwhile/foreach??
		
		for(int dato : vector) { 
			//D d
			//r c
			if(dato % 2 == 0) {
				cantPares++;//cantidad
				sumaPares += dato;
			}else { 
				cantImpares++;
				sumaImpares += dato;
			}
		}
		 promedio =  (double) (sumaImpares + sumaPares) /(cantImpares + cantPares);
		 
		 System.out.println(java.util.Arrays.toString(vector));
		 
		 //mostrar los datos calculados
		 System.out.println("cantidad de registros:" + cantidadRegistros);
		 System.out.println("cantidad de pares:" + cantPares);
		 System.out.println("cantidad de impares:" + cantImpares);
		 System.out.println("suma de pares:" + sumaPares);
		 System.out.println("suma de impares:" + sumaImpares);
		 System.out.println("promedio:" +  promedio);
		 
		 teclado.close();
		
		}

	}


