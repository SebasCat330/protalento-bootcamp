package clase6.oop;

public class ProgramaAuto {

	public static void main(String[] args) {
      
		Auto miClio = null;
		
		miClio = new Auto("Renault","Clio Mio",178);//Constructor
		
		//ctrl+shit+i
		miClio.encender();//f5
		
		miClio.acelerar();
		
		miClio.apagar();//f6
		
	}//f8

}
