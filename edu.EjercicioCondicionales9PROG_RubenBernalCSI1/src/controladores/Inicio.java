/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * rbr - 071024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 071024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variable
		int nota;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pregunto al usuario por consola que indique la nota y la guardo en su variable
		System.out.println("Introduzca la nota como número entero: ");
		nota = sc.nextInt();
		
		//Muestro el mensaje correspondiente según la nota dada
		if(nota <= 4) {
			System.out.println("Insuficiente");
		}else if(nota == 5) {
			System.out.println("Suficiente");
		}else if(nota == 6) {
			System.out.println("Bien");
		}else if(nota == 7 || nota == 8) {
			System.out.println("Notable");
		}else if(nota == 9) {
			System.out.println("Sobresaliente");
		}else if(nota == 10) {
			System.out.println("Matrícula de honor");
		}else {
			System.err.println("La nota introducida está fuera de rango...");
		}

	}

}