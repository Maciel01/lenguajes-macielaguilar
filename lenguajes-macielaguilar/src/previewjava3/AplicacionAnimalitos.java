//inyeccion de dependencias

package previewjava3;


public class AplicacionAnimalitos {
    
    public static void main(String[] args) {
        
       ComportamientoRuido r=new perro();
        
        System.out.println(botonSonido(r));
        //aqui el niño seleccionara de un listado un animalito
        //pj el raton
        //raton r;
    }
    public static String botonSonido(ComportamientoRuido r){
        return r.hacerRuido();
        
    }
           
}
