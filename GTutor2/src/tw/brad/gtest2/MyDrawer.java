package tw.brad.gtest2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<LinkedList<Point>> lines = new LinkedList<>();
	private LinkedList<LinkedList<Point>> recycle = new LinkedList<>();
	
	public MyDrawer() {
		setBackground(Color.GREEN);
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				int x = e.getX(), y = e.getY();
				
				recycle.clear();
				
				LinkedList<Point> line = new LinkedList<>();
				Point point = new Point(x, y);
				line.add(point);
				
				lines.add(line);
				
				repaint();
			}
		});
		
		addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				super.mouseDragged(e);
				
				int x = e.getX(), y = e.getY();
				Point point = new Point(x, y);
				lines.getLast().add(point);
				
				repaint();
			}
		});
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		
		for(LinkedList<Point> line : lines) {
			for (int i=1; i<line.size(); i++) {
				Point p0 = line.get(i-1);
				Point p1 = line.get(i);
				g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
			}
			
		}
	}
	
	public void clear() {
		lines.clear();
		recycle.clear();
		repaint();
	}
	
	public void undo() {
		if (lines.size()>0) {
			recycle.add(lines.removeLast());
			repaint();
		}
	}

	public void redo() {
		if (recycle.size()>0) {
			lines.add(recycle.removeLast());
			repaint();
		}
	}
	
	private class Point {
		int x, y;
		Point(int x, int y){this.x = x; this.y = y;}
	}
	
}
