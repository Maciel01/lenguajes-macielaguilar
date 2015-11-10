/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;


public class pruebaThreads implements Runnable {
    public static void main(String[] args) {
        
        //primer pso creado
        primerThread t1=new primerThread();
        //segundo paso iniciado
       // t1.start();
        
        pruebaThreads r=new pruebaThreads();
        Runnable r2=new pruebaThreads();//referencia de un tipo y la instancia de otro tipo
        Thread t2=new Thread(r2);//
        
        t1.start();
        t2.start();
    }
  public void run(){
      System.out.println("Soy el segundo Thread");
  }
    } 
    


