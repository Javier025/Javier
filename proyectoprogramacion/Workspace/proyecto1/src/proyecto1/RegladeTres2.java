package proyecto1;

import java.util.Scanner;

public class RegladeTres2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce a: ");
        float a = scan.nextFloat();  // Cambié a float para incluir decimales
        System.out.print("Introduce b: ");
        float b = scan.nextFloat();
        System.out.print("Introduce c: ");
        float c = scan.nextFloat();
        
        // Cálculo de regla de tres
        float x = (b * c) / a;
        
        // Mostrar el resultado
        System.out.println("El resultado de la regla de tres es: " + x);
        
        scan.close();  // Cerramos el scanner para evitar posibles fugas de memoria
    }
}
