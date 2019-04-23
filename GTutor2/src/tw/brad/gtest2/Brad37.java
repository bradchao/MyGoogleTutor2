package tw.brad.gtest2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Brad37 extends JFrame {
	private JButton b1, b2, b3, b4;
	private JTextArea textArea;
	
	public Brad37() {
		super("Brad37");
		
		setLayout(new BorderLayout());
		
		JPanel top = new JPanel(new FlowLayout());
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		b4 = new JButton("B4");
		top.add(b1); top.add(b2); top.add(b3); top.add(b4);
		
		add(top, BorderLayout.NORTH);
		
		textArea = new JTextArea();
		add(textArea, BorderLayout.CENTER);
		
		MyButtonListener listener = new MyButtonListener();
		b1.addActionListener(listener);
		
		MyListener l1 = new MyListener();
		b2.addActionListener(l1);
		b3.addActionListener(l1);
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("OK b4");
			}
		});
		
		addMouseListener(new MyMouseListener());
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Brad37();
	}

	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b2) {
				System.out.println("b2");
			}else if (e.getSource() == b3) {
				System.out.println("b3");
			}
		}
	}
}

class MyButtonListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String com = e.getActionCommand();
		
		System.out.println("OK" + com);
	}
}
class MyMouseListener extends MouseAdapter {
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//super.mouseClicked(e);
		int x = e.getX(), y = e.getY();
		System.out.println("Click:" +  x + " x" + y);
	}
}





