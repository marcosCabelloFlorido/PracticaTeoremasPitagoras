package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {

    @Test
    public void testAreaPorDefecto() {
        TrianguloRectangulo pruebaArea1 = new TrianguloRectangulo();
        double resultadoEsperado = (1*1)/2;
        assertEquals(resultadoEsperado, pruebaArea1.area());
    }
    
    
    @Test
    public void testPerimetroPorDefecto() {
        TrianguloRectangulo pruebaPerimetro1 = new TrianguloRectangulo();
        double resultadoEsperado = (1+1+pruebaPerimetro1.hipotenusa());
        assertEquals(resultadoEsperado, pruebaPerimetro1.perimetro());
    }
    
    @Test
    public void testHipotenusaPorDefecto() {
        TrianguloRectangulo pruebaHipotenusa1 = new TrianguloRectangulo();
        double resultadoEsperado = Math.sqrt((1*1)+(1*1));
        assertEquals(resultadoEsperado, pruebaHipotenusa1.hipotenusa());
    }
    
    
    @Test
    public void testArea() {
        TrianguloRectangulo pruebaArea2 = new TrianguloRectangulo(5,5);
        double resultadoEsperado = (5*5)/2;
        assertEquals(resultadoEsperado, pruebaArea2.area());
    }
    
    @Test
    public void testPerimetro() {
        TrianguloRectangulo pruebaPerimetro2 = new TrianguloRectangulo(5,5);
        double resultadoEsperado = (5+5+pruebaPerimetro2.hipotenusa());
        assertEquals(resultadoEsperado, pruebaPerimetro2.perimetro());
    }
    
    @Test
    public void testHipotenusa() {
        TrianguloRectangulo pruebaHipotenusa2 = new TrianguloRectangulo(5,5);
        double resultadoEsperado = Math.sqrt((5*5)+(5*5));
        assertEquals(resultadoEsperado, pruebaHipotenusa2.hipotenusa());
    }
    
    @Test
    public void testExcepciones() {
        assertThrows(IllegalArgumentException.class, () -> new TrianguloRectangulo(-3,5));
    }
    
    
    
    
    
    
  

}
