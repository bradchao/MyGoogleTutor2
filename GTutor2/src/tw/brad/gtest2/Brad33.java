package tw.brad.gtest2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad33 extends JFrame {
	private JButton b1, b2, b3;
	
	public Brad33() {
		super("偶的視窗");
	
		setLayout(new FlowLayout());
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		
		add(b1); add(b2); add(b3);
		
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Brad33();
	}
}
