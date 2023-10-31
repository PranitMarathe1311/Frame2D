import javax.swing.JFrame;
import java.awt.*;

public class Frame2D extends Canvas
{
	public void paint(Graphics g)
	{

		g.setColor(Color.red);
		g.drawRect(10,10,150,130);
		g.fillRect(10,160,210,130);
		g.setColor(Color.blue);
		g.drawOval(10,310,150,170);
		g.fillOval(10,500,190,170);
		g.setColor(Color.yellow);
		g.drawLine(260,10,260,1000);
		g.setColor(Color.green);
		g.drawArc(10,680,130,360,0,180);
		g.fillArc(280,10,180,360,0,180);
		g.setColor(Color.black);
		g.drawRoundRect(280,210,460,180,30,30);
		g.fillRoundRect(280,410,460,130,30,30);
	}

	public static void main(String [] args)
	{
		Frame2D f2d =new Frame2D();
		JFrame frame =new JFrame("Frame 2D Demo");
		frame.add(f2d);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}