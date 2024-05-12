/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapidfastner;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class NewApplet extends Applet {

    public void paint(Graphics g) {
//        g.setColor(Color.RED);
//        g.drawLine(0, 0, 110, 0); // outer box
//        g.drawLine(110, 0, 110, 80);
//        
//        g.drawLine(110, 80, 0, 80); // outer box
//        g.drawLine(0, 80, 0, 0);
//        
//        g.setColor(Color.blue);
//        g.drawLine(10, 10, 100, 10); // inner box
//        g.drawLine(10, 10, 10, 70);
//        
//        g.drawLine(100, 70, 100, 10); // inner box 
//        g.drawLine(10, 70, 100, 70);
//        
//        g.drawLine(10, 70, 50, 10); // triangle
//        g.drawLine(50, 10, 100, 70);
//        
//        g.drawLine(10, 10, 50, 70);
//        g.drawLine(50, 70, 100, 10);

//        for(int i = 10, j = 10; i <= 100; i=i+5, j+=5) {
//            if(i%2 == 0) {
//                g.setColor(Color.red);
//            } else {
//                g.setColor(Color.blue);
//            }
//            g.drawOval(i, j, 20, 20);
//        }
        int x = 450, y = 360;
        for(int i = 10, j = 10; i <= 750; i+=10, j+=10) {
            if(i<= 80) {
                continue;
            }
            g.drawOval(x, y, i, i);
            x-=5;
            y-=5;
        }
 
    }    
    
}
