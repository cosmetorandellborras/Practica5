# Práctica 5, pruebas unitarias mediante JUnit

## Objetivos
Los objetivos de esta practica son la creación de un nuevo proyecto con una interfaz ICalculadora con las operaciones sumar, restar, multiplicar y dividir.
Crear una clase Calculadora que implemente los metodos de la interfaz y seguidamente realizar los tests unitarios mediante JUnit
Finalmente repasaremos los resultados obtenidos

## Diagrama de ramas y commits del proyecto
![DiagramaDeVersiones](https://github.com/cosmetorandellborras/Practica5/blob/master/capturas/Diagrama%20de%20versiones.png)

## Paso 1
En primer lugar creamos la interfaz ICalculadora con las operaciones sumar, restar, multiplicar y dividir.
~~~
public interface ICalculadora {
	public abstract int suma (int x, int y);
	public abstract int resta (int x, int y);
	public abstract int multiplicacion (int x, int y);
	public abstract int division (int x, int y);
}
~~~
Seguidamente creamos la clase Calculadora que implementa los metodos de la interfaz.
~~~
public class Calculadora implements ICalculadora{
	public Calculadora() {
	}
	public int suma(int x, int y) {
		return x+y;
	}
	public int resta(int x, int y) {
		return x-y;
	}
	public int multiplicacion(int x, int y) {
		return x*y;
	}
	public int division(int x, int y) {
		return x/y;
	}
}
~~~
Finalmente realizamos el primer commit a Github de nuestro proyecto, asi como el primer tag con la version 1.0.0 del proyecto

## Paso 2 - Crear tests Unitarios con JUnit en IDE Eclipse
En primer lugar, clickamos botón derecho sobre la clase que queremos testear y creamos un nuevo "JUnit Test Case", que llamaremos CalculadoraTest, clicamos sobre "next" y seguidamente marcaremos todos los metodos que queremos testear y le damos a "finalizar".
![JUnit1](https://github.com/cosmetorandellborras/Practica5/blob/master/capturas/JUnit1.png)
![JUnit2](https://github.com/cosmetorandellborras/Practica5/blob/master/capturas/JUnit2.png)

Seguidamente en nuestro nueva clase CalculadoraTest, implementamos los tests unitarios de cada método. Para ello en cada método haremos lo siguiente:

1. Crearemos una instancia de la clase Calculadora 
2. Crearemos una nueva variable que guardará el resultado y llamaremos al metodo correspondiente, por parámetro pasamos los valores a operar
3. mediante el metodo assertEquals, le indicaremos por parámetro el resultado que esperamos por un lado y por el otro lado la variable que hemos creado anteriormente que guardara el resultado.

~~~
	import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calc = new Calculadora();
		int res = calc.suma(5,2);
		assertEquals(7, res);
	}
}
~~~
**Este paso hay que realizarlo con todos los metodos a testear**

Una vez realizado este paso, realizaremos el segundo commit, con la versión 1.1.0

## Paso 3 - Realización de tests unitarios con JUnit

Partiendo de los tests unitarios creados, situandonos sobre la clase CalculadoraTest, click derecho y seleccionamos la opción "Run As JUnit Test"
![RunAsTest](https://github.com/cosmetorandellborras/Practica5/blob/master/capturas/RunTest.png)

Seguidamente nos lanzará los tests y nos indicará el resultado obtenido, en nuestro caso podemos comprobar como ha fallado el metodo division
![Test1](https://github.com/cosmetorandellborras/Practica5/blob/master/capturas/Test1.png)

En la siguiente captura, nos indica en detalle que se esperaba un resultado de 2.5 y el resultado obtenido es de 2, de ahi el error
![Test2](https://github.com/cosmetorandellborras/Practica5/blob/master/capturas/Test2.png)

Analizando el código comprobamos que hay un error en el tipo de datos que maneja el metodo dividir. Procedemos a cambiar el tipo de datos a "float" y realizaremos un commit con el error subsanado siendo esta, la version 1.2.0

## Paso 4 - Realización de diferentes pruebas y exposición de resultados

Mediante los cambios realizados en el ultimo commit, volvemos a ejecutar los tests unitarios con los mismos valores ejecutados anteriormente, recordemos el valor 5 para la x y el valor 2 para la y.
Como podemos comprobar en este caso se ha subsanado el error ya que los tests unitarios no dan ningún tipo de error.
![Test3](https://github.com/cosmetorandellborras/Practica5/blob/master/capturas/Test3.png)
![Test4](https://github.com/cosmetorandellborras/Practica5/blob/master/capturas/Test4.png)

Seguidamente realizaremos los mismos tests variando los valores introducidos por parámetro, para comprobar los resultados con nuevos valores. 
~~~
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calc = new Calculadora();
		int res = calc.suma(13,7);
		assertEquals(20, res);
	}

	@Test
	void testResta() {
		Calculadora calc = new Calculadora();
		int res = calc.resta(13, 7);
		assertEquals(6,res);
	}

	@Test
	void testMultiplicacion() {
		Calculadora calc = new Calculadora();
		int res = calc.multiplicacion(13, 7);
		assertEquals(91,res);
	}

	@Test
	void testDivision() {
		Calculadora calc = new Calculadora();
		float res = calc.division(13, 7);
		assertEquals(1.8571428060531616,res);
	}

}
~~~
Volvemos a ejecutar las pruebas y el resultado obtenido es positivo, ningún metodo ha dado error
![Test5](https://github.com/cosmetorandellborras/Practica5/blob/master/capturas/Test5.png)

Finalmente realizaremos un test final con valores por parámetro negativos
~~~
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calc = new Calculadora();
		int res = calc.suma(-3,6);
		assertEquals(3, res);
	}

	@Test
	void testResta() {
		Calculadora calc = new Calculadora();
		int res = calc.resta(-3, 6);
		assertEquals(-9,res);
	}

	@Test
	void testMultiplicacion() {
		Calculadora calc = new Calculadora();
		int res = calc.multiplicacion(-3, 6);
		assertEquals(-18,res);
	}

	@Test
	void testDivision() {
		Calculadora calc = new Calculadora();
		float res = calc.division(-3, 6);
		assertEquals(-0.5,res);
	}

}
~~~
Volvemos a ejecutar las pruebas y el resultado obtenido es positivo, ningún metodo ha dado error
![Test6](https://github.com/cosmetorandellborras/Practica5/blob/master/capturas/Test6.png)

**Con esto concluimos que nuestro proyecto ha superado nuestras pruebas unitarias con diferentes valores y supuestos**
Salvo en las primeras pruebas unitarias en las que nos ha fallado un metodo, por lo tanto un 25% de las pruebas. Después de solventar el error el resultado de nuestras pruebas unitarias ha sido del 100% de éxito.

## Paso 5 - Finalización

Finalmente comentaremos todo el código mediante JavaDoc y realizaremos un merge con la rama main de github. Una vez realizado el merge con la rama main, realizaremos el último commit que resultara en la version 2.0.0 del proyecto.

## Código fuente

### Clase Calculadora
~~~
/**
 * Clase Calculadora
 * Implementa la interfaz ICalculadora
 * @author Cosme Torandell i Rafel Llull
 *
 */
public class Calculadora implements ICalculadora{
	/**
	 * Contructor vacío
	 */
	public Calculadora() {
		
	}
	/**
	 * Metodo suma, 
	 * @param x, se le pasa por parámetro un integer x con el valor para realizar la operación
	 * @param y, se le pasa por parámetro un integer y con el valor para realizar la operación
	 * @return x+y, retorna un integer con el resultado de la operación
	 */
	public int suma(int x, int y) {
		return x+y;
	}
	/**
	 * Metodo suma, 
	 * @param x, se le pasa por parámetro un integer x con el valor para realizar la operación
	 * @param y, se le pasa por parámetro un integer y con el valor para realizar la operación
	 * @return x-y, retorna un integer con el resultado de la operación
	 */
	public int resta(int x, int y) {
		return x-y;
	}
	/**
	 * Metodo suma, 
	 * @param x, se le pasa por parámetro un integer x con el valor para realizar la operación
	 * @param y, se le pasa por parámetro un integer y con el valor para realizar la operación
	 * @return x*y, retorna un integer con el resultado de la operación
	 */
	public int multiplicacion(int x, int y) {
		return x*y;
	}
	/**
	 * Metodo suma, 
	 * @param x, se le pasa por parámetro un integer x con el valor para realizar la operación
	 * @param y, se le pasa por parámetro un integer y con el valor para realizar la operación
	 * @return x/y, retorna un integer con el resultado de la operación
	 */
	public float division(float x, float y) {
		return x/y;
	}

}
~~~
### Interfaz ICalculadora
~~~
/**
 * Interfaz ICalculadora
 * @author Cosme Torandell i Rafel Llull
 *
 */
public interface ICalculadora {
	/**
	 * Método abstracto suma
	 * @param x, se le pasa por parámetro un integer x con el valor para realizar la operación
	 * @param y, se le pasa por parámetro un integer xy con el valor para realizar la operación
	 * @return retornara un integer con el resultado de la operación
	 */
	public abstract int suma (int x, int y);
	/**
	 * 
	 * @param x, se le pasa por parámetro un integer x con el valor para realizar la operación
	 * @param y, se le pasa por parámetro un integer x con el valor para realizar la operación
	 * @return retornara un integer con el resultado de la operación
	 */
	public abstract int resta (int x, int y);
	/**
	 * 
	 * @param x, se le pasa por parámetro un integer x con el valor para realizar la operación
	 * @param y, se le pasa por parámetro un integer x con el valor para realizar la operación
	 * @return retornara un integer con el resultado de la operación
	 */
	public abstract int multiplicacion (int x, int y);
	/**
	 * 
	 * @param x, se le pasa por parámetro un integer x con el valor para realizar la operación
	 * @param y, se le pasa por parámetro un integer x con el valor para realizar la operación
	 * @return retornara un float con el resultado de la operación
	 */
	public abstract float division (float x, float y);

}
~~~
### Clase CalculadoraTest
~~~
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
~~~
