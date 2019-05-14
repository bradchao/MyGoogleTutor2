package tw.brad.gtest2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MySignature extends JFrame{
	private JButton clear, undo, redo, save;
	
	public MySignature() {
		super("簽名app");
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		save = new JButton("Save");
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear);top.add(undo);top.add(redo);
		top.add(save);
		
		add(top, BorderLayout.NORTH);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MySignature();
	}
}
