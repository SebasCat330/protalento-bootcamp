package clase4;

import java.util.Scanner;

public class EjercicioIntegrador {

	public static void main(String[] args) {
		
		//ingrese 10 datos
		//maximo
		//minimo
		//posMax
		//posMin
		//suma total
		//contar cuantas veces se repite el mismo maximo
		
		float[] datos = new float[10];
		float maximo;
		float minimo;
		byte pMaximo;
		byte pMinimo;
		float sumaTotal = 0;
		
		Scanner teclado = new Scanner(System.in);
		for(int i=0; i<datos.length;i++) {
			System.out.println("Ingrese un valor:");
			datos[i] = teclado.nextInt();
		}
          teclado.close();
          
          maximo = datos[0];
          pMaximo = 0;
          minimo = datos[0];
          pMinimo = 0;
          
          int cantRepMax = 0;
          int cantRepMin = 0;
          for(int i=1; i < datos.length; i++) {
        	  //maximo
        	  if(datos[i] >= maximo) {
        		  maximo = datos[i];
        		  pMaximo = (byte) i;//casting/casteo
        		  if(datos[i] == maximo)
        		  cantRepMax++;
        		  else
        			  cantRepMax = 0;
        	  }
        	  //minimo
        	  if(datos[i] <= minimo) {
        		  minimo = datos[i];
        		  pMinimo = (byte) i;
        		  if(datos[i] == minimo)
            		  cantRepMin++;
            		  else
            			  cantRepMin = 0;
        	 }
         }        
          System.out.println("maximo:" + maximo);
          System.out.println("pMaximo:" + pMaximo);
          System.out.println("cant rep max:" + cantRepMax);
          
          System.out.println("minimo:" + minimo);
          System.out.println("p minimo" + pMinimo);
          System.out.println("cant rep min:" + cantRepMin);
          
          //System.out.println("suma:" + );
	}
}
