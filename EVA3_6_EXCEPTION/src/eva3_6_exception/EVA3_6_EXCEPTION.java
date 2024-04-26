package eva3_6_exception;

import java.util.*;

public class EVA3_6_EXCEPTION {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Introduzca el numerador:");
            int num1 = input.nextInt();
            System.out.println("Introduzca el denominador:");
            int num2 = input.nextInt();
            int r = num1 / num2;
            System.out.println("EL resultado es "+r);
        } catch(Exception e) {
            if (e instanceof InputMismatchException) {
                System.out.println("InputMismatchException");
            } else {
                System.out.println("ArithmeticException");
            }
        }
        System.out.println("Fin del camino :v");
    }
    
}
