package Unidad01;

import java.util.Scanner;

public class HolaYo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("introduce tu nombre:");
		String nombre = scan.nextline();
		System.out.print("introduce tu año de nacimiento");
		int anionacimiento = scan.nextInt();
		int edad = 2024 - anionacimiento;
		
	}

}
