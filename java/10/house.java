import java.applet.Applet;
import java.awt.*;

public class house extends Applet {
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    @Override
    public void paint(Graphics g) {
        g.drawLine(60, 40, 40, 70);
        g.drawLine(60, 40, 80, 70);
        g.drawLine(40, 70, 80, 70);
        
        g.drawLine(40, 70, 40, 110);
        g.drawLine(80, 70, 80, 110);
        
        g.drawLine(40, 110, 80, 110);
        
        g.setColor(Color.CYAN);
        g.fillOval(53, 53, 15, 15);
        g.fillRect(56, 85, 10, 20);
    }
}
