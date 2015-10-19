
package Excepcioes.Archivaldo;

import java.io.*;

public class InterfazDeUsuario {
    
    public static void main(String[] args)throws FileNotFoundException, IOException{
        //Primero generamos el archivo a guardar
        File file=new File("sucio.xxx");
        //Indicar si vamos a leer o guardar algo en ese archivo
        FileOutputStream fos=new FileOutputStream(file);
        //Ponemos algo en el archivaldo
        String mensajito= "Este es un mensajito muy basico";
        //Ahora si guardamos este mensajito serializado
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //Guardamos
        oos.writeObject(mensajito);
        System.out.println("Se guardo tu mensajito");
        
        
    }
}
