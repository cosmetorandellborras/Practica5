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
