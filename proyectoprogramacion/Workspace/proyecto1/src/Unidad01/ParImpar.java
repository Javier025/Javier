package Unidad01;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Inroduce un número entero y veremos si es par o impar ");
		int numero;
		numero = scan.nextInt();
		String paridad;
		paridad = numero % 2 == 0 ? "par" : "impar";
		System.out.println("el número introducido es: " + paridad);
		
		
		scan.close();

	}

}
