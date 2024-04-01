package clase_34;

import java.util.Scanner;


public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 =0; 
		int num2 = 0;
		int resultado = 0;
		String accionUsuario ="";
		String operador ="";
		
		System.out.println("Bienvenido a la calculadora de terminal");
		
		do {
			
			try {
				
				System.out.println("Ingrese el primer número:");
				num1 = scanner.nextInt();
				System.out.println("Ingrese el segundo número:");
				num2 = scanner.nextInt();
				
				System.out.println("Ingrese el operador (+,/,-, *,):");
				operador = scanner.next();
				switch (operador)
				{
					case "+":
						resultado =Calculadora.sumar(num1,num2); 
						break;
					case "-":
						resultado =Calculadora.restar(num1,num2);
						 break; 
					case "*":
						resultado =Calculadora.multiplicar(num1,num2);
						 break;
					case "/":
						resultado =Calculadora.dividir(num1,num2);
						 break;
					default:
						System.out.println("Operador inválido"); 
						break;
				}
				
				if (operador.equals("+") ||
						operador.equals("-") || operador.equals("*") ||
						operador.equals("/")){

					System.out.println("El resultado es: " +resultado);
				
				}
			} catch (Exception e) {
				System.out.println("Error " +e.getMessage());
			} finally {
				System.out.println(" ");
				System.out.println("Stop para detener la app,'s' para seguir ");
				accionUsuario = scanner.next();
			}
		} while	(!accionUsuario.toLowerCase().equals("stop"));
		
		System.out.println("Calculadora finalizada");
	}
	public static int sumar(int a, int b)
	{ 
		return a + b;
	}
	public static int restar(int a, int b)
	{ 
		return a - b;
	}
	public static int dividir(int a, int b) throws ArithmeticException
	{ 
		return a / b;
	}
	public static int multiplicar(int a, int b)
	{ 
		return a * b;
	}
			
}
