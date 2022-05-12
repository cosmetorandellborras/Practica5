import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * Clase CalculadoraTest
 * @author Cosme Torandell i Rafel Llull
 *
 */
class CalculadoraTest {
	/**
	 * Metodo testSuma
	 * Creamos instancia de calculadora
	 * Creamos una variable integer que guardara el resultado
	 * Ejecutamos el metodo suma de la clase Calculadora y le pasamos por parámetro los valores 13 y 7
	 * Método assertEquals, en el primer parámetro le indicamos manualmente el resultado esperado de la operación, en el segundo parámetro el resultado que se ha guardado dentro de la variable res. Si concide no dara error.
	 */
	@Test
	void testSuma() {
		Calculadora calc = new Calculadora();
		int res = calc.suma(13,7);
		assertEquals(20, res);
	}
	/**
	 * Metodo testResta
	 * Creamos instancia de calculadora
	 * Creamos una variable integer que guardara el resultado
	 * Ejecutamos el metodo resta de la clase Calculadora y le pasamos por parámetro los valores 13 y 7
	 * Método assertEquals, en el primer parámetro le indicamos manualmente el resultado esperado de la operación, en el segundo parámetro el resultado que se ha guardado dentro de la variable res. Si concide no dara error.
	 */
	@Test
	void testResta() {
		Calculadora calc = new Calculadora();
		int res = calc.resta(13, 7);
		assertEquals(6,res);
	}
	/**
	 * Metodo testMultiplicacion
	 * Creamos instancia de calculadora
	 * Creamos una variable integer que guardara el resultado
	 * Ejecutamos el metodo multiplicacion de la clase Calculadora y le pasamos por parámetro los valores 13 y 7
	 * Método assertEquals, en el primer parámetro le indicamos manualmente el resultado esperado de la operación, en el segundo parámetro el resultado que se ha guardado dentro de la variable res. Si concide no dara error.
	 */
	@Test
	void testMultiplicacion() {
		Calculadora calc = new Calculadora();
		int res = calc.multiplicacion(13, 7);
		assertEquals(91,res);
	}
	/**
	 * Metodo testDivision
	 * Creamos instancia de calculadora
	 * Creamos una variable integer que guardara el resultado
	 * Ejecutamos el metodo division de la clase Calculadora y le pasamos por parámetro los valores 13 y 7
	 * Método assertEquals, en el primer parámetro le indicamos manualmente el resultado esperado de la operación, en el segundo parámetro el resultado que se ha guardado dentro de la variable res. Si concide no dara error.
	 */
	@Test
	void testDivision() {
		Calculadora calc = new Calculadora();
		float res = calc.division(13, 7);
		assertEquals(1.8571428060531616,res);
	}

}

