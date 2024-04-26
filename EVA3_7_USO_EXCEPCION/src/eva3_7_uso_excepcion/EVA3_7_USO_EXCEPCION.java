package eva3_7_uso_excepcion;

import java.util.*;

public class EVA3_7_USO_EXCEPCION {

    public static void main(String[] args) {
        // TODO code application logic here
        int excepcion = 1;
        
        //do {
        while (excepcion == 1) {
            excepcion = 0;
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Ingrese un numero entero:");
                int num = input.nextInt();
            } catch(InputMismatchException e) {
                //xd
                excepcion = 1;
            }
        }
        //} while (excepcion == 1);
        
        System.out.println("Termino la ejecucion");
    }
    
}
