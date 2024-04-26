package eva3_3_propagacion_excepciones;

public class EVA3_3_PROPAGACION_EXCEPCIONES {
    
    public static void main(String[] args) {
        // TODO code application logic here
        A();
    }
    
    public static void A() {
        B();
    }
    
    public static void B() {
        C();
    }
    
    public static void C() {
        int x = 989, y = 0;
        int r = x/y;
        System.out.println(r);
    }
}
