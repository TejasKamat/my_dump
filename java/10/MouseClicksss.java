import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseClicksss extends Applet implements MouseListener {
    int x1, y1;
    public void init() {
        System.out.println("im in init");
        addMouseListener(this);
    }
    
    public void start() {
        System.out.println("Im in start");
    }
    
    public void stop() {
        System.out.println("Im in stop");
    }
    
    public void paint(Graphics g) {
        System.out.println("Im in paint");
        g.drawOval(x1, y1, 50, 50);
    }
    
    public void destroy() {
        System.out.println("Im in destroy");
    }


    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
        Point p = e.getPoint();
        x1 = (int)p.getX();
        y1 = (int)p.getY();
        System.err.println("X:" + x1 + ", Y:" + y1);
        repaint();
    }


    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed");
    }


    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released");
    }


    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered");
    }


    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited");
    }
}
