package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

import org.junit.jupiter.api.BeforeAll;

class testTrianguloRectangulo {
	static TrianguloRectangulo A;
	static TrianguloRectangulo T;
	
	@BeforeAll
	static void arreglos() {
		A = new TrianguloRectangulo() {};
		T= new TrianguloRectangulo(1,1) {};
	}
	
	@Test
	void testArea() {
		assertEquals(0.0 , A.area());
		
	}

	@Test
	void testHipotenusa() {
		assertEquals(1.4142135623730951 , A.hipotenusa());
	}

	@Test
	void testPerimetro() {
		assertEquals(3.414213562373095 , A.perimetro());
	}
	
	
	@Test
	void testAreaT() {
		assertEquals(0.0 , T.area());
		
	}

	@Test
	void testHipotenusaT() {
		assertEquals(1.4142135623730951 , T.hipotenusa());
	}

	@Test
	void testPerimetroT() {
		assertEquals(3.414213562373095 , T.perimetro());
	}
	
	
	@Test
	void testfallo() {
		assertThrows(IllegalArgumentException.class, () -> {
			TrianguloRectangulo B = new  TrianguloRectangulo(-2,0) ;
		});
			
			assertThrows(IllegalArgumentException.class, () -> {
				TrianguloRectangulo B = new  TrianguloRectangulo(0,2) ;
		});
	}
}
