package eva3_15_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EVA3_15_SERIALIZABLE {

    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Persona persona = new Persona("Walter","White");
            saveObject(persona);
            
            Persona persona_copy = loadObject();
            System.out.println(persona_copy);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
    
    public static void saveObject(Persona obj) throws Exception{
        String path = "C:\\archivosxd\\persona.PSON"; // ruta
        FileOutputStream file = new FileOutputStream(path); // carga el archivo
        ObjectOutputStream writefile = new ObjectOutputStream(file); // crea el escritor
        writefile.writeObject(obj); // guarda el objeto
        //writefile.close();
    }
    
    public static Persona loadObject() throws Exception{
        Persona persona = null;
        String path = "C:\\archivosxd\\persona.PSON";
        FileInputStream file = new FileInputStream(path);
        ObjectInputStream loadfile = new ObjectInputStream(file);
        persona = (Persona)loadfile.readObject();
        //loadfile.close();
        
        return persona;
    }
    
}

class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public Persona() {
        this.nombre = "&";
        this.apellido = "&";
    }
    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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
    
    @Override
    public String toString() {
        return nombre+" "+apellido;
    }
    
}