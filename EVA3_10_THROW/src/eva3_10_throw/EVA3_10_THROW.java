package eva3_10_throw;

import java.util.*;

public class EVA3_10_THROW {

    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            Scanner input = new Scanner(System.in);
            
        try {
            Persona persona = new Persona();
            
            System.out.println("Ingrese el nombre:");
            String nombre = input.nextLine();
            persona.setNombre(nombre);
            
            System.out.println("Ingrese los apellidos:");
            String apellido = input.nextLine();
            persona.setApellido(apellido);
            
            System.out.println("Ingrese la edad");
            int edad = input.nextInt();
            persona.setEdad(edad);
            
            break;
        } catch(Exception e) {
            //e.printStackTrace();
            System.out.println("[!] Error. Intente de nuevo");
        }
        }
        
        System.out.println("Fin de la ejecucion.");
    }
    
}

class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws Exception {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        if ((edad < 0) || (edad > 150)) {
            throw new Exception("Edad NO valida.");
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) throws Exception {
        if ((edad < 0) || (edad > 150)) {
            throw new Exception("Edad NO valida.");
        }
        
        this.edad = edad;
    }
    
    
}