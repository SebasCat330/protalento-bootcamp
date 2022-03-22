package clase4;

import java.util.Scanner;

public class ejercicioDiagonal {

	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de filas");
        int cantFilas = teclado.nextInt();

        System.out.println("Ingrese cantidad de coulmnas");
        int cantColumnas = teclado.nextInt();
        
        if(cantFilas == cantColumnas) {
        	teclado.close();
        	System.exit(0);
        }
        	
        	Integer[][] matriz = new Integer[cantFilas][cantColumnas];
        	
        	System.out.println("Ingrese valores:");
        	
        	for(int f = 0; f<cantFilas; f++) {
        		for(int c = 0; c<cantColumnas; c++) {
				System.out.println("Ingrese (" + f + "," + c +")");
        		int aux = teclado.nextInt();
        		matriz[f][c] = aux;
        	}
        }
	
            boolean todosUno = true;
        	for(int f=0; f<cantFilas; f++){
            	for(int c=0; c<cantColumnas; c++) {
            		if(f == c){
            			if(matriz[f][c] != 1) { 
            			todosUno = false;
            			break;
            			}
            		}
            		
            	}
            }
            if(todosUno) {
            	System.out.println("Matriz con diagonal en 1");
            }else {
            	System.out.println("Matriz sin diagonal en 1");
            }
            
	}

}
