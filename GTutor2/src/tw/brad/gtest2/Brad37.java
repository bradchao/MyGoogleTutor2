package tw.brad.gtest2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Brad37 extends JFrame {
	private JButton b1, b2, b3;
	private JTextArea textArea;
	
	public Brad37() {
		super("Brad37");
		
		setLayout(new BorderLayout());
		
		JPanel top = new JPanel(new FlowLayout());
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		top.add(b1); top.add(b2); top.add(b3);
		
		add(top, BorderLayout.NORTH);
		
		textArea = new JTextArea();
		add(textArea, BorderLayout.CENTER);
		
		MyButtonListener listener = new MyButtonListener();
		b1.addActionListener(listener);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Brad37();
	}

}

class MyButtonListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
	}
}





