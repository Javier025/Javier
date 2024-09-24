package proyecto1;

import java.util.Scanner;

public class Regla_De_Tres_3 {
	
	public static void main(String[] args) {
		Scanner prueba = new Scanner(System.in);
		System.out.print("introduce a: "); //texto de prueba !ñ ó
		float a = prueba.nextFloat();
		System.err.print("introduce b: ");
		float b = prueba.nextFloat();
		System.out.print("introduce c: ");
		float c = prueba.nextFloat();
		
		float x = (b*c)/a;
		
		System.err.println("el resultado es "+ x);
				
		prueba.close();
		
	}
}
