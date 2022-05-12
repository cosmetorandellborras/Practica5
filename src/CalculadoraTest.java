import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calc = new Calculadora();
		int res = calc.suma(5,2);
		assertEquals(7, res);
	}

	@Test
	void testResta() {
		Calculadora calc = new Calculadora();
		int res = calc.resta(5, 2);
		assertEquals(3,res);
	}

	@Test
	void testMultiplicacion() {
		Calculadora calc = new Calculadora();
		int res = calc.multiplicacion(5, 2);
		assertEquals(10,res);
	}

	@Test
	void testDivision() {
		Calculadora calc = new Calculadora();
		float res = calc.division(5, 2);
		assertEquals(2.5,res);
	}

}
