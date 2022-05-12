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
