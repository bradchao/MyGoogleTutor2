package tw.brad.gtest2;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.LinkedList;
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
		private int viewW, viewH;
		private boolean isInit;	// false
		private BufferedImage[] bufImags = new BufferedImage[ballImags.length];
		private LinkedList<Ball> balls;
		
		
		MyPanel(){
			balls = new LinkedList<>();
			timer = new Timer();
			timer.schedule(new RefreshTask(), 0, 60);
			
			
			for (int i=0; i<ballImags.length; i++) {
				try {
					bufImags[i] = 
							ImageIO.read(new File(ballImags[i]));
				}catch(Exception e) {
					
				}
				
			}

			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					super.mousePressed(e);
					addBall(e.getX(), e.getY());
				}
			});
		}
		
		private void addBall(int x, int y) {
			Ball ball = new Ball(x,y);
			balls.add(ball);
			timer.schedule(ball, 1000, 60);

		}
		
		
		private class Ball extends TimerTask {
			private int x, y, dx, dy;
			private int img;
			Ball(int x, int y){
				img = (int)(Math.random()*3);
				
				this.x = (int)(x - bufImags[img].getWidth()/2.0);
				this.y = (int)(y - bufImags[img].getHeight()/2.0);
				
				dx = dy = 10;
			}
			@Override
			public void run() {
				if (x<=0 || x + bufImags[img].getWidth() >= viewW) {
					dx *= -1;
				}
				if (y<=0 || y + bufImags[img].getHeight() >= viewH) {
					dy *= -1;
				}
				
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
			
			for (Ball ball : balls) {
				g2d.drawImage(bufImags[ball.getImage()], 
						ball.getX(),ball.getY(),null);
			}
					
		}
	}
	
	
	public static void main(String[] args) {
		new Brad70();
	}

}
