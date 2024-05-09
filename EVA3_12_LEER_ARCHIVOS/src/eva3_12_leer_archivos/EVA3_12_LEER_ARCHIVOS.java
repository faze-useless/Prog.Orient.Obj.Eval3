package eva3_12_leer_archivos;

import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EVA3_12_LEER_ARCHIVOS {
    
    final static String PATH = "C:\\archivosxd\\momo.txt";

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            leerArchivoFiles(PATH);
            System.out.println("-----------------------------------");
            leerArchivoBuffer(PATH);
            System.out.println("-----------------------------------");
            leerArchivoFileReader(PATH);
            System.out.println("-----------------------------------");
            leerArchivoScanner(PATH);
            System.out.println("-----------------------------------");
            
        } catch (IOException ex) {
            System.out.println("[!] File not found");
                    
        }
    }
    // clase files.
    // se lee todo el archivo y se carga en memoria.
    public static void leerArchivoFiles(String targetpath) throws IOException {
        System.out.println("Leyendo archivo... [Clase files]");
        Path path = Paths.get(targetpath); // crea un objeto tipo ruta
        byte[] data = Files.readAllBytes(path); // genera excepcion
        System.out.println(new String(data));
    }
    public static void leerArchivoBuffer(String ruta) throws IOException {
        System.out.println("Leyendo archivo... [Clase BufferedReader]");
       //Abrir el archivo
        //Leer el archivo con informacion binaria
        //Convertir la informacion binaria a texto
        File file = new File(ruta);
        FileInputStream in = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        String linea;
        //asignamos la linea a la variable cade
        //si cade es diferente de null, estamos
        //leyendo texto,si leemos null,llegamos
        //al final del archivo
        while ((linea = br.readLine()) != null){
            System.out.println(linea);
        }
        br.close();

    }
    public static void leerArchivoFileReader(String ruta) throws IOException {
        System.out.println("Leyendo archivo... [Clase FileReader]");
        File file = new File(ruta);
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String linea;
        //asignamos la linea a la variable cade
        //si cade es diferente de null, estamos
        //leyendo texto,si leemos null,llegamos
        //al final del archivo
        while ((linea = br.readLine()) != null){
            System.out.println(linea);
        }
        br.close();
    }
   public static void leerArchivoScanner(String ruta) throws IOException {
       System.out.println("Leyendo archivo... [Clase Scanner]");
        Path path = Paths.get(ruta);
       Scanner leer = new Scanner(path);
       while (leer.hasNextLine()){
           System.out.println(leer.nextLine());
       }
        leer.close();
   }
    
}
