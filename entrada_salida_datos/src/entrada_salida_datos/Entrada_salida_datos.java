
package entrada_salida_datos;

import java.util.Scanner;


public class Entrada_salida_datos {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite nombre");
        String nombre = sc.next();
        System.out.println("Digite apellido");
        String apellido = sc.next();
        System.out.println("Digite edad");
        int edad = sc.nextInt();
        
        System.out.println("Bienvenido " + nombre + " " + apellido);
        System.out.println("Su edad es " + edad);
        
    }
    
}
