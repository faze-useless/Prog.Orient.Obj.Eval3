package eva3_2_unchecked_exceptions;

/**
 *
 * @author DELL
 */
public class EVA3_2_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NULL POINTER EXCEPTION
        Gato gato = null;
        System.out.println(gato.toString());
        
        //INDEX OUT OF BOUNDS
        int array [] = new int[5];
        array[5] = 10;
        
        //ARITMETHIC EXCEPTION
        int x = 199, y = 0;
        int r = x/y;
        System.out.println(r);
        
        
    }
    
}

class Gato{

}