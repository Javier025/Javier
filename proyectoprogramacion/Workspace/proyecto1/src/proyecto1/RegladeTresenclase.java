package proyecto1;

import java.util.Scanner;

public class RegladeTresenclase {

    public static void main(String[] args) {
        
        System.out.println("""
        		Introduce los valores para resolver la regla de 3
        		a ---> b
        		c ---> x
        		""");
        Scanner scan = new Scanner(System.in);
        System.out.println("\nIntroduce a: ");
        double a = scan.nextDouble();  
        System.out.println("Introduce b: ");
        double b = scan.nextDouble();
        System.out.println("\nIntroduce c: ");
        double c = scan.nextDouble();   
        
        //solución xx= (b*c)/a
        //TODO: Controlar que no se dé a=0
        double x = (b * c) / a;
        
        System.out.println("\nEl resultado de la regla de tres es: " + x);
        System.out.print(a);
        System.out.print(" ---> ");
        System.out.print(b);
        
        
        scan.close();  
    }
}
