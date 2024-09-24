package Unidad01;
/*
Escribe un programa que dada una hora determinada (horas y minutos)
calcule los segundos que faltan para llegar a medianoche. 
*/

import java.util.Scanner;

public class ParaMedianochecontexto {

	public static void main(String[] args) {
		
		
		
		System.out.print("introduce la hora actual ");
		 Scanner scan = new Scanner(System.in);
	
		System.out.print("introduce los minutos actuales ");
		double minutos = scan.nextDouble();
		
		
		String horasString = scan.nextLine();
		
		//22:13
			double horas = Integer.parseDouble(horasString.substring(0, 2);
			double minutos = Integer.parseDouble()
		double horasTotales = (24 * 60 * 60);
				
		double horaactual = horas*60*60;
		double minutosactual = minutos*60;
		double segundosactual = horaactual + minutosactual;
		double segundosfaltantes = horasTotales - segundosactual;
		System.out.println("\nQuedan " + segundosfaltantes);
			
	}

}
