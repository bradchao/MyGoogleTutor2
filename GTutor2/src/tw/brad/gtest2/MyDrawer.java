package tw.brad.gtest2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyDrawer extends JPanel {

	public MyDrawer() {
		setBackground(Color.GREEN);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
//		System.out.println(g.getClass().getName());
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(0, 0, 400, 400);

		
		
		
	}
	
}
