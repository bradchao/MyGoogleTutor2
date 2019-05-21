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
		private String[] ballImags = {"imgs/ball.png","imgs/ball1.png","imgs/ball2.png"};
		private Ball ball;
		private int viewW, viewH;
		private boolean isInit;	// false
		private BufferedImage[] bufImags = new BufferedImage[ballImags.length];
		
		MyPanel(){
			timer = new Timer();
			timer.schedule(new RefreshTask(), 0, 60);
			
			ball = new Ball(0,0);
			timer.schedule(ball, 1000, 100);
			
			for (int i=0; i<ballImags.length; i++) {
				try {
					bufImags[i] = 
							ImageIO.read(new File(ballImags[i]));
				}catch(Exception e) {
					
				}
				
			}

			
		}
		
		private class Ball extends TimerTask {
			private int x, y, dx, dy;
			private int img;
			Ball(int x, int y){
				this.x = x; this.y = y;
				img = (int)(Math.random()*3);
				dx = dy = 10;
			}
			@Override
			public void run() {
				x += dx; y += dy;
			}
			
			int getX() {return x;}
			int getY() {return y;}
			int getImage() {return img;}
		}
		
		private class RefreshTask extends TimerTask {
			@Override
			public void run() {
				repaint();
			}
		}
		
		private void init() {
			viewW = getWidth();
			viewH = getHeight();
			//System.out.println(viewW + " x " + viewH);
			//isInit = true;
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (!isInit) init();
			
			Graphics2D g2d = (Graphics2D)g;
			
			g2d.drawImage(bufImags[ball.getImage()], ball.getX(),ball.getY(),null);
				
		}
	}
	
	
	public static void main(String[] args) {
		new Brad70();
	}

}
