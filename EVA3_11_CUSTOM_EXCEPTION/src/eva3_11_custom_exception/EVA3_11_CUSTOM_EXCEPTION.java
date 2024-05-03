package eva3_11_custom_exception;

public class EVA3_11_CUSTOM_EXCEPTION {

    public static void main(String[] args) {
        // TODO code application logic here
        try{
            message();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void message() throws Excepcionista {
        System.out.println("Mensaje");
        throw new Excepcionista("Ya me cayo gordo su pishi jalada de su pishe tilin.");
    }
    
}

class Excepcionista extends Exception {

    public Excepcionista() {
        super();
    }

    public Excepcionista(String message) {
        super(message);
    }
    
}