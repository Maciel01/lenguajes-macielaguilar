
package lenguajes.macielaguilar;


public class Imc {
    float peso;
    float altura;
    //constructor
    public Imc(float p,float a){
        peso = p;
        altura = a;

}
    //constructor
    public Imc(){
    
        peso=98f;
        altura=1.79f;
    
    }
    public Imc(float f){
    //este codigo no tiene nada que ver con los constructores
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        //reasignamos
      //  b=(byte)i;
        //l=i;
       // s=(short)l;
      //  s=b;
      //  l=s;
      //  s=(short)l;
      //  s=(short)i;
      //  l=b;
        
    }
    
    
    public float calcular(){
        float resultadoImc=peso/(altura*altura);
        return resultadoImc;
    
    }
}