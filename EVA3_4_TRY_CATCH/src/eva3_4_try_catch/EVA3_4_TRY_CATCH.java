package eva3_4_try_catch;


public class EVA3_4_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10, y = 0, r = 0;
        
        try{
            r  = x/y;
            System.out.println(r);
        }catch(ArithmeticException e) { // se crea un objeto excepcion  llamado "e"
            r = 0;
            System.out.println("No se puede xd ("+e.toString()+")");
            //e.printStackTrace(); // muestra el mensaje de la excepcion sin detener el programa
        }
    }
    
}
