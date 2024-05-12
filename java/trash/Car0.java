import java.awt.*;
import java.applet.*;
public class Car0 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRoundRect(350,300,400,70,30,30);
		g.fillRoundRect(435,255,250,70,50,50);
		g.setColor(Color.red);
		g.fillOval(390,345,60,60);
		g.fillOval(660,345,60,60);
		g.setColor(Color.black);
		g.fillOval(395,350,50,50);
		g.fillOval(665,350,50,50);
		g.drawLine(550,255,550,365);
		g.drawLine(440,305,690,305);
	}
}