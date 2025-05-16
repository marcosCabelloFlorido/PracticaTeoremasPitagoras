package clases;


public class TrianguloRectangulo {
	/**
     * Calcula el el area, perimtero e hipotenusa de un triangulo rectangulo
     * @param a primer cateto 
     * @param b segundo cateto 
     * @param b hipotenusa
     */
	
	private int a;
	private int b;
	private double c;
	
	
	/**
	 * Constructor por defecto donde los catetos miden 1 cm
	 * 
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}

	
	/**
     * Constructor que recibe las medidas por parametros de ambos catetos
     * @throws IllegalArgumentException si el número es menor o igual a 0
     */
	
	public TrianguloRectangulo(int a, int b) {
		if(a<=0) {
			throw new IllegalArgumentException("El numero debe de ser positivo para poder hacer los calculos oportunos");
		}
		else {
			this.a = a;
		}
		if(b<=0) {
			throw new IllegalArgumentException("El numero debe de ser positivo para poder hacer los calculos oportunos");
		}
		else {
			this.b = b;
		}
	}

	/**
     * Calcula el area del triangulo rectangulo
     * @return el area del triangulo rectangulo
     */
		
	public double area() {   
		return (a*b)/2;
	}
	
	/**
     * Calcula la hipotenusa del triangulo rectangulo
     * @return la hipotenusa del triangulo rectangulo
     */
	public double hipotenusa() {
		return c = Math.sqrt((a*a)+(b*b));
	}
	
	/**
     * Calcula el perimetro del triangulo rectangulo
     * @return el perimetro del triangulo rectangulo
     */
	public double perimetro() {
		return a+b+hipotenusa();
	}
	
	/**
     * Muestra el valor del cateto A
     * @return valor guardado en el cateto A
     */
	public int getA() {
		return a;
	}

	/**
     *Permite modificar el valor del cateto A
     */
	public void setA(int a) {
		this.a = a;
	}
	
	/**
     * Muestra el valor del cateto b
     * @return valor guardado en el cateto b
     */
	public int getB() {
		return b;
	}
	
	/**
     *Permite modificar el valor del cateto A
     */
	public void setB(int b) {
		this.b = b;
	}

	/**
     * Muestra el valor de la hipotenusa
     * @return valor guardado en la hipotenusa
     */
	public double getC() {
		return c;
	}

	/**
     *Permite modificar el valor de la hipotenusa
     */
	public void setC(int c) {
		this.c = c;
	}

	/**
     * Muestra la informacion del triangulo rectangulo
     * @return valores del triangulo rectangulo
     */
	@Override
	public String toString() {
		return "TrianguloRectangulo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
