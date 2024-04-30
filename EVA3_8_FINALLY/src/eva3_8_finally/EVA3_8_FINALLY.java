package eva3_8_finally;

import java.util.*;

public class EVA3_8_FINALLY {

    public static void main(String[] args) {
        // TODO code application logic here
        try{
            // posible generador de excepciones
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce un número entero:");
            int num = input.nextInt();
            System.out.println("Su cuadrado es "+num*num);
        } catch (InputMismatchException e) {
            // corregir las excepciones
            System.out.println("[!] No es un número.");
        } finally {
            // codigo critico
            System.out.println("[!] Yo soy inevitable.jpg");
        }
    }
    
}
