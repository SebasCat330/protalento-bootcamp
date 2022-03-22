package clase4;

public class VecotrObject {

	public static void main(String[] args) {

        //la base de datos de todos los tipos de datos en Java
		Object edad = 10;
		Object nombres = "Carlos";
		Object flag = true;
		Object letra = 'a';
		
		Object[] datos =  new Object[] {edad, nombres, flag, letra};
		
		//determinar que datos son de tipo boolean ??
		for(Object dato : datos) {
			if(dato instanceof Boolean) {
		      //casteo
				boolean aux = (Boolean)dato;
				System.out.println("Encontre !!!" + aux  );
			}
		}
		/*
		// tipos de datos primitivos
		// byte < short < int < long < float < double
		
		// wrapper
		// Byte, Short, Interger, Long, Float, Double
		int a= 25;
		Integer a1 = 25;
		// Autoboxing
		a1 = a; //25 = 25
		a = a1;
		*/

	}

}

