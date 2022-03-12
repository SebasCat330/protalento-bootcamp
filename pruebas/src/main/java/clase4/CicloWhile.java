package clase4;

public class CicloWhile {

	public static void main(String[] args) {
		
		short[] edades = new short[] {10,5,25}; //length = 3, pos: 0,1,2
		
		int i = 0;
		//0 < 3 ? SI
		//1 < 3 ? SI
		//2 < 3 ? SI
		//3 < 3 ? NO
		
		while(i < edades.length) {
			System.out.println("Pos" + i + ",val" + edades[i]);
		    //0 - VAL 10
			//1 - VAL 5
			//2 - VAL 25
			i++;
		}
		
		System.out.println("---------------------");
		
		i = edades.length - 1;//3
		
		while(i >=0 ) {
			System.out.println("Pos" + i + ",val" + edades[i]);
		    //0 - VAL 10
			//1 - VAL 5
			//2 - VAL 25
			i--;
		}
		System.out.println("FIN");
	}

}
