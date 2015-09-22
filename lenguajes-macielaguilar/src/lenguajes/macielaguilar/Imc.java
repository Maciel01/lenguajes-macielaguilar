/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.macielaguilar;

/**
 *
 * @author T-107
 */
public class Imc {
    float peso;
    float altura;
    
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
        b=(byte)i;
        l=i;
        s=(short)l;
        s=b;
        l=s;
        s=(short)l;
        s=(short)i;
        l=b;
        
    }
    public float calcular(){
        float resultadoImc=peso/(altura*altura);
        return resultadoImc;
    }
   
    
}
