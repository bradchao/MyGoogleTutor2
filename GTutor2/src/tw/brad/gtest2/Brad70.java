package tw.brad.gtest2;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad70 extends JFrame {
	private MyPanel gamePanel;
	public Brad70() {
		super("");
		setLayout(new BorderLayout());
		
		gamePanel = new MyPanel();
		add(gamePanel, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MyPanel extends JPanel {
		private Timer timer;
		private int x, y;
		
		MyPanel(){
			timer = new Timer();
			
			timer.schedule(new MyBallTask(), 1*1000, 200);
		}
		
		private class MyBallTask extends TimerTask {
			@Override
			public void run() {
				x += 10; y+= 10;
				repaint();
			}
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Graphics2D g2d = (Graphics2D)g;
			
			try {
				BufferedImage ball = 
						ImageIO.read(new File("imgs/ball.png"));
				
				g2d.drawImage(ball,x,y,null);
				
			}catch(Exception e) {
				System.out.println(e.toString());
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		new Brad70();
	}

}
