package clase6.oop;

public class DB {
	
	//No tiene atributos
	
	//No tiene constructor
	
	//Solo tiene un metodo
	Articulo[] consultar(String claveConsultada) {
	//simular datos
	
	Articulo res1 = new Articulo("Figura de Marvel Avengers Titan Hero Series Blast Gear - War", 35940, "http://iamgen.jpg", true, 10, true);
	Articulo res2 = new Articulo("Figura de accion de Marvel Avenger 6 pulgadas surtidas", 35940, "http://otraiamgen.jpg", false, 2, true);
  
	//??
	Articulo[] resultado = new Articulo[] {res1, res2};//length 2, 0 y 1
	
  }	
}
