/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author maciel
 */
public class ContenedorGraficadora extends Canvas{

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    g.setColor(Color.red);
    g.fillRect(0, 0, 120, 120);
    }
    
    
    
    
    
    
}
