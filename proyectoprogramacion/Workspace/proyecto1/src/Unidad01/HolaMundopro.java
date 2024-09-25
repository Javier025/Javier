package Unidad01;

import java.util.Scanner;

/**
 *Clase para el saludo pro en java
 *Saluda con hola amigo si el usuario no introduce su nombre
 *Saluda con hola nombre si el usuario introduce su nombre
 */
public class HolaMundopro {

	public static void main(String[] args) {
		//metodo main
		Scanner scan = new Scanner(System.in);
		System.out.print("introduce tu nombre:");
		String nombre = scan.nextLine();
		
		//la librería scanner devuelve "" si no metes nada.
		
		//cuando el usuario no mete ningún nombre el valor que guarda es una cadena vacía, es decir, ""
		
		//nombre = "".equals(nombre) ? "amigo" : nombre;
		if ("".equals(nombre)) {
			nombre = "amigo";
		}
		
		//si el nombre es igual "" da amigo sino nombre
		
		System.out.println("hola " + nombre + "!");
	
		scan.close();
	}

}
