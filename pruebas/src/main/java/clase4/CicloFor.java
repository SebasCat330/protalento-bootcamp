package clase4;

public class CicloFor {

	public static void main(String[] args) {
	
		float[] alturas_ = new float[2];
		alturas_[0] = 1;
		alturas_[1] = 2;
		
		float[] alturas = new float[] {1,2};
		float aux = alturas[0];
		
		// Ciclo FOR: recorre de a uno
		for(int i=0;i < alturas.length;i++) {
			aux = alturas[i];
			System.out.println("Pos:"+i + ",val" + aux);	
		}
		System.out.println("------------FOREACH-------------");
		
		for(float dato :alturas) {
			System.out.println(", Val" + dato);
		}
		System.out.println("------------------------------------");
		for(int i=0;i < alturas.length;i+=2) {
			aux = alturas[i];
			System.out.println("Pos:"+i + ",val" + aux);	
		}
        System.out.println("------------------------------------");
        
        for(int i=alturas.length -1;i >= 0; i--) {
        	System.out.println("Pos:"+ i + ", val" + alturas[i]);
        }
        
	}

}
