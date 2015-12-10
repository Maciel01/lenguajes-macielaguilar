package proyectofinal;

import java.awt.*;


public class ContenedorGraficadora extends Canvas {
    public static float apertura=0.01f;

    static float A,B,C;
    static double XV,YV,XC,XC2,YC;
    
    //Lo estatico es lo primero que el compilador corre ya que no necesita constructor ni inicializar variables
    

    @Override
    public  void paint(Graphics g) {    
        //Calculos
      // VARIABLES
         A= Float.parseFloat( MiGraficadora.textoA.getText());
         B=Float.parseFloat(MiGraficadora.textoB.getText());
         C=Float.parseFloat(MiGraficadora.textoC.getText());
        //CALCULO VERTICE
          XV=(-1*B)/(2*A);
          YV= (float) ((A*Math.pow(XV, 2))+(B*XV)+C);
          //CALCULO CORTE EJE X
          XC=((-B+(Math.sqrt((Math.pow(B,2)-4*A*C))))/2*A);
          XC2=((-B-(Math.sqrt((Math.pow(B,2)-4*A*C))))/2*A);
          // CORTE EJE Y
          YC=C;
      
          
          System.out.println("El vertice es:"+XV+","+YV);
          System.out.println("corte en eje x:"+XC+","+XC2);
          System.out.println("corte en eje y:"+YC);
        
          
      
        super.paint(g); 
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(),getHeight());
        //eje x
        g.setColor(Color.WHITE);
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        //eje y
        g.setColor(Color.white);
        g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
        
        g.translate(getWidth()/2, getHeight()/2);
        
        g.drawString("Origen",0,0);
        
        
        
       
       
       float x0=-100;
       float x1=-99;
       float y0;
       float y1;
       
       
      
      
       for(int i=0;i<=200;i++){ 
           
        
           int AX=i;
           float AY=(float) (A*(Math.pow(AX, 2))+(AX*B)+C);
           
           System.out.println(AX+","+AY);
           
           
        y0=apertura*-x0*x0;
        y1=apertura*-x1*x1;
        g.drawLine((int)x0,(int)y0,(int)x1,(int)y1);
        x0++;
        x1++;
       
    }
   
    }

    @Override
    public boolean mouseDown(Event evt, int x, int y) {
        System.out.println("Posicion es :("+x+","+y+")");
        return super.mouseDown(evt, x, y); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
