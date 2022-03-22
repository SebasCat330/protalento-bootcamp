package clase4;

public class Matriz {

	public static void main(String[] args) {
		
		int cantFilas = 2;
		int cantCols  = 2;
		
		String[][] matriz = new String[cantFilas][cantCols];
		
		System.out.println(matriz.length);//filas
		System.out.println(matriz[0].length);//columnas
		
		//cargamos
		for(int fila = 0; fila  < cantFilas; fila ++);{
			for(int columna=0; columna <  cantCols; columna++){
				matriz[fila] [columna] = (fila + columna);
			}
		}
		
		//mostrar
		for(int fila = 0; fila < cantFilas; fila++);{
			for(int columna=0; columna <  cantCols; columna++){
				matriz[fila][columna] = (fila + columna);
				System.out.println(fila+"-" + columna + "=" + matriz[fila][columna]);
			}
		}

	}

}
