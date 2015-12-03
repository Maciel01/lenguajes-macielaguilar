/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContenedorGraficadora extends Canvas {
    public static float apertura=0.01f;
@Override
    public void paint(final Graphics g) { 
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(),getHeight());
        g.setColor(Color.black);
       //eje x
        
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        //eje y
        
        g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
        
        g.translate(getWidth()/2, getHeight()/2);
        
        g.drawString("Origen",0,0);
        //Vamos a graficar una parábola.
       Thread t1=new Thread(new Runnable(){
       float x0=-100;
       float x1=-99;
       float y0;
       float y1;
       public void run(){
               while(true){           
       ///ciclo for
       for(int i=0;i<=200;i++){ 
        y0=-apertura*-x0*x0;
        y1=-apertura*x1*x1;
        g.drawLine((int)x0,(int)y0,(int)x1,(int)y1);
        x0++;
        x1++;
           try {
               Thread.sleep(300);
           } catch (InterruptedException ex) {
               Logger.getLogger(ContenedorGraficadora.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       }
       }
       });
       t1.start();
     /*  
       // Vamos a graficar la funcion seno
        
       double xseno0=-100*Math.PI-1;
       double xseno1=-100*Math.PI;
       double yseno0;
       double yseno1;
       
       
       
        g.setColor(Color.white);
        
        for(int i=0;i<=600;i++){
       
        yseno0=100*Math.sin(xseno0*(apertura*5));
        yseno1=100*Math.sin(xseno1*(apertura*5));
        
       
       g.drawLine((int)xseno0,(int)yseno0,(int)xseno1,(int)yseno1);
       
       
        xseno0++;
        xseno1++;
        
        }
        
        */
    }

    @Override
    public boolean mouseDown(Event evt, int x, int y) {
        System.out.println("Posicion es :("+x+","+y+")");
        return super.mouseDown(evt, x, y); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
