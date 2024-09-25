package Unidad01;

import java.util.Scanner;

public class HolaYo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("introduce tu nombre:");
		String nombre = scan.nextline();
		
		String nombre;
		nombre = numero % 2 == 0 ? "par" : "impar";
		
		
		
		System.out.print("introduce tu año de nacimiento");
		int anionacimiento = scan.nextInt();
		int edad = 2024 - anionacimiento;
		
	}

}
