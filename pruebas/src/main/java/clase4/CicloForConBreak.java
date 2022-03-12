package clase4;

public class CicloForConBreak {

	public static void main(String[] args) {
		
		int[] datos = new int[] {10,0,15};
		
		for(int dato : datos) {
			if(dato == 0) {
				break;
			}
			System.out.println("Dato:" + dato);
		}
		
		for(int dato : datos) {
			if(dato == 0) {
				continue;
			}
			System.out.println("Dato=" + dato);
		}
		
        System.out.println("Fin");
	}

}
