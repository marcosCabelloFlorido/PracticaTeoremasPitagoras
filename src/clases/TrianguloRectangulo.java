package clases;


public class TrianguloRectangulo {
	
	private int a;
	private int b;
	private double c;
	
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	
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
		public double area() {
	       
		return (a*b)/2;
	}
		
	public double hipotenusa() {
		return c = Math.sqrt((a*a)+(b*b));
	}
	
	public double perimetro() {
		return a+b+hipotenusa();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "TrianguloRectangulo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
