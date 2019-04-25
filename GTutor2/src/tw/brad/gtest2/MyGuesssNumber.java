package tw.brad.gtest2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyGuesssNumber extends JFrame{
	private JTextField input;
	private JButton guess;
	private JTextArea log;
	
	public MyGuesssNumber() {
		super("猜數字");
		
		setLayout(new BorderLayout());

		JPanel top = new JPanel(new BorderLayout());
		guess = new JButton("Guess");
		input = new JTextField();
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		add(top, BorderLayout.NORTH);
		
		log = new JTextArea();
		add(log, BorderLayout.CENTER);
		
//		guess.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				doGuess();
//			}
//		});

		MyListener listener = new MyListener(this);
		guess.addActionListener(listener);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void doGuess() {
		String strInput = input.getText();
		input.setText("");
		log.append(strInput + "\n");
		
	}
	
	public JTextField getInput() {
		return input;
	}
	public JTextArea getLog() {
		return log;
	}
	
	public static void main(String[] args) {
		new MyGuesssNumber();
	}

}

class MyListener implements ActionListener {
	private MyGuesssNumber game;
	
	public MyListener(MyGuesssNumber game) {
		this.game = game;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String input = game.getInput().getText();
		game.getLog().append("Google:" + input + "\n");
		
	}
	
}



