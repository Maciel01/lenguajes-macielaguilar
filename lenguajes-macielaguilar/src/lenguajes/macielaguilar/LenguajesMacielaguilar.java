
package lenguajes.macielaguilar;

public class LenguajesMacielaguilar {

    public static void main(String[] args) {
        
        System.out.println("mi primer programa de java");
        Imc objeto=new Imc();
        System.out.println(objeto.calcular());
                float peso=98f;
                float altura=1.79f;
                
               // String x ="12";
               // float valor = Float.parseFloat(x);
               // System.out.println(valor);
                float imc=peso/(altura*altura);
                System.out.println("Tu imc es:"+imc);
    }
    
}
