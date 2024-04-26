package eva3_5_try_catch;

import java.util.*;

public class EVA3_5_TRY_CATCH {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Introduzca el numerador:");
            double num1 = input.nextDouble();
            System.out.println("Introduzca el denominador:");
            double num2 = input.nextDouble();
            double r = num1 / num2;
            System.out.println("EL resultado es "+r);
        } catch(InputMismatchException e) {
            e.printStackTrace();
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Fin del camino :v");
    }
    
}
