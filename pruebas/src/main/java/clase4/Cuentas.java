package clase4;

public class Cuentas {

	public static void main(String[] args) {
		
		// viene desde afuera
		String[] archivo = new String[] {
				"1000, juan lopez, 1500, ca",
				"2000, jose guzman, 11500, ca",
				"3000, juan martinez, -100, cc",
				"4000, matias perez, 100000, cc",
				"5000, elsa moyano, 21000, cc"};
		
		//obtener las cuentas con saldo negativo con apyn
		//obtener las cuentas con saldo > 1000 con apyn
	    
		Object[][] saldos = new Object[archivo.length][2];
		Object[][] resultado = new Object[archivo.length][2];
		
		for(int i=0; i< archivo.length; i++) {
			String registro = archivo[i];
			
			String[] cuenta = registro.split(";");
			Integer numCuenta = Integer.parseInt(cuenta[0]);
			String apyn = cuenta[1];
			Double saldo = Double.parseDouble(cuenta[0]);
			String tipo = cuenta[3];
		
			if(saldo < 0) {
				resultado[i][0] = saldo;
				resultado[i][10] = apyn;
				resultado[i][2] = numCuenta;
				resultado[i][3] = tipo;
	        }
			if(saldo >= 100000) {
				resultado[i][0] = saldo;
				resultado[i][10] = apyn;
			 }
	       }
		
		 for(int f=0; f<resultado.length; f++) {
			 for(int c=0; c<resultado[f].length; c++) {
				 if(resultado[f][c] != null) {
				 System.out.println(resultado[f][c]);
				 
			 }
		 }
	       System.out.println("-----------");
	
	}

  }
}
