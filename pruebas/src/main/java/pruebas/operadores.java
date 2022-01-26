package pruebas;

public class operadores {

	public static void main(String[] args) {
		// ctrl+d > eliminar una lina
		
		// matematicos
		/*
		 
		 +
		 -
		 *
		 /
		  
		 */

		int edad1 = 10;
		int edad2 = 20;
		int res = edad1 + edad2;
		
		// syso + ctrl + space
		System.out.println("edad1+edad2=" + res);
		
		// aplica a tipos de datos String
		String nombre = "carlos";
		String apellido = "lopez";
		String res1 = nombre + apellido; 
		
		System.out.println("nombre+apellido=" + res1);
		
		double alto = 175.5;
		
		float ancho = 205.7F;
		
		// al hallar el valor de resDiv quiero que me quede el flotante de la operación.
		float resDiv = (float)alto/ancho;
		
		byte valor = -128; // -127 a +127
				
	    //Operadores relacionales: < > <= >= != todos > boolean
		
		boolean resAltoAncho = alto	!= ancho; //TRUE
		System.out.println(alto + " != " + ancho + " = " + resAltoAncho);
		
		int a = 10;
		int b = 5;
		
		// D |_d_
		// 0% 2 
		
		int mod = a % b;  
		System.out.println(a + "%" + b + "=" + mod);
		
		//operadores logicos:
		// && AND
		// || inclusivo OR
		// ! NOT
		// xor exclusivo XOR
		
		// dia sea martes cond1
		// horario 19:30 cond2
		// comienza el curso cond1 y cond2
		
		boolean esMartes = true;
		boolean horario19 = false;
		boolean curso = esMartes && horario19;
		System.out.println("El valor de verdad es" + esMartes + "&&" + horario19 +"=" + curso);
		
		int edadAdulto = 18;
		boolean tieneCarnet = true;
		String nombre1 = "jose";
		float altura = 0.75F;
		char letra ='M';
		
		// puedo conducir si es mayor y tiene carnet
		
		boolean puedeConducir = (edadAdulto >= 18) && tieneCarnet && (nombre1 ==  "jose") || (altura > 1.0) && (letra != 'G'); 
		System.out.println("Puede conducir=" + puedeConducir);
		
		boolean aux = true;  // 10 > 1010
		boolean baux = false; // 30 > 11110
		boolean resAux = aux ^ baux;
		
		//byte[] datos = new byte[]{0,1,0,1,0};
		System.out.println("XOR resAux=" + resAux);
		
	
		
		
		
		
		
		
	}

}
