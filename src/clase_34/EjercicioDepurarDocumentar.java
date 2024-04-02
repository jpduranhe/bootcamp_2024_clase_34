package clase_34;
/**
 * Esta clase permite ejercitar JAva Doc
 */
public class EjercicioDepurarDocumentar {
	/**
	 *  Metodo de que permite ejecutar las clase
	 * @param args 
	 */
	public static void main(String[] args) {
		// Variable de para ser evaluada en el while
		int x=0;
		// Se ejecuta metodo
		depurar(x);

	}

	/**
	 * Metodo que imprime el valor de la variable X mientras su valor sea menor a 1
	 * @param x variable int que sera evaluada para la ejecucion del ciclo
	 */
	private static void depurar(int x) {
		while(x<1) {
			System.out.println("Ciclo");
			x++;
		}
		
	}

}
