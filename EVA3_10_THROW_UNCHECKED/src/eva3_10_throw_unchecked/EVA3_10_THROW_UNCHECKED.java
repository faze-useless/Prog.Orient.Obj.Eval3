package eva3_10_throw_unchecked;

import java.util.*;

public class EVA3_10_THROW_UNCHECKED {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Persona persona = new Persona("Walter","White",-52);
        } catch(Exception e) {
            e.printStackTrace();
            //System.out.println("[!] Error. Intente de nuevo");
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

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        if ((edad < 0) || (edad > 150)) {
            throw new RuntimeException("Edad NO valida.");
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
    public void setEdad(int edad) {
        if ((edad < 0) || (edad > 150)) {
            throw new RuntimeException("Edad NO valida.");
        }
        
        this.edad = edad;
    }
    
    
}