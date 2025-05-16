package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		
		int cateto1 = ((int) (Math.random() * 10 - 1 + 1) + 1);
		int cateto2 = ((int) (Math.random() * 10 - 1 + 1) + 1); 
		
		TrianguloRectangulo primero = new TrianguloRectangulo(cateto1, cateto2);
		TrianguloRectangulo segundo = new TrianguloRectangulo();
		
		double areaComprobacion = primero.area();
		double perimetroComprobacion = primero.perimetro();
		
		double areaComprobacion2 = segundo.area();
		double perimetroComprobacion2 = segundo.perimetro();
		perimetroComprobacion2 += 0; //Hago esto para poder ver el perimetro 
	}

}
