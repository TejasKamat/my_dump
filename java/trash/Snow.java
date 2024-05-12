import java.applet.Applet;
import java.awt.*;

public class Snow extends Applet {
   public void paint(Graphics g) {
      // Set background color to light blue
      setBackground(new Color(135, 206, 250));
      
      // Draw snowman body
      g.setColor(Color.WHITE);
      g.fillOval(100, 100, 100, 100);
      g.fillOval(75, 175, 150, 150);
      g.fillOval(50, 300, 200, 200);
      
      // Draw snowman eyes
      g.setColor(Color.BLACK);
      g.fillOval(130, 140, 10, 10);
      g.fillOval(160, 140, 10, 10);
      
      // Draw snowman nose
      g.setColor(Color.ORANGE);
      int[] xPoints = {150, 160, 140};
      int[] yPoints = {155, 165, 165};
      g.fillPolygon(xPoints, yPoints, 3);
      
      // Draw snowman hat
      g.setColor(Color.BLACK);
      g.fillRect(120, 95, 60, 10);
      g.fillRect(135, 50, 30, 45);
   }
}
