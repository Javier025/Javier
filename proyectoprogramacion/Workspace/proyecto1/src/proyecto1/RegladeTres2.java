package proyecto1;

import java.util.Scanner;

public class RegladeTres2 {

    public static void main(String[] args) {
        
        System.out.println("""
        		Introduce los valores para resolver la regla de 3
        		a ---> b
        		c ---> x
        		""");
        Scanner scan = new Scanner(System.in);
        System.out.println("\nIntroduce a: ");
        float a = scan.nextFloat();  
        System.out.println("Introduce b: ");
        float b = scan.nextFloat();
        System.out.println("\nIntroduce c: ");
        float c = scan.nextFloat();   
   
        float x = (b * c) / a;
        
        System.out.println("El resultado de la regla de tres es: " + x);
        
        scan.close();  
    }
}
