package eva3_9_throw;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_9_THROW {

    public static void main(String[] args) {
        try {
            // TODO code application logic here
            metodoProblematico();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void metodoProblematico() throws Exception{
        System.out.println("When haces tus momos en codigos");
        System.out.println("El futuro es hoy oiste java");
        System.out.println("Pero te salta una excepcion :,vv");
        System.out.println("Oh mi lente de contacto xdxddxd :,v");
        
        throw new Exception("Abatido por los guardianes.");
        
    }
    
}
