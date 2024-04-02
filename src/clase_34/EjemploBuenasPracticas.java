package clase_34;

import java.util.Scanner;


//import com.google.util.*; -> ejemplo de import de paquete de terceros



//import cl.bootcamp.curso3.util.*; -> ejemplo de import de paquete propio


public class EjemploBuenasPracticas {

	public static void maineee(String[] args) {
		/*
		 * 
		 * 
		  	La clase debe llamarse “ejemplo buenas prácticas”.
			las variables a utilizar son “nombre usuario” y “edad usuario”.
			importar scanner.
			mostrar por consola los datos ingresados.

		 * 
		 * */
		String nombreUsuario="";
		int edadUsuario=0;

		Scanner scanner= new Scanner(System.in);
		
		
		System.out.print("Ingrese su nombre: ");
		nombreUsuario=scanner.nextLine();
		
		System.out.println("-------------------------------");
		
		System.out.print("Ingrese su Edad: ");
		edadUsuario=scanner.nextInt();
		
		
		
		System.out.println("-------------------------------");
		System.out.println("Hola "+ nombreUsuario+ " tu edad es "+edadUsuario+ " años");
		
	}

}
