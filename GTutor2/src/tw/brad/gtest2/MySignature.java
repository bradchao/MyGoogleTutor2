package tw.brad.gtest2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MySignature extends JFrame{
	private JButton clear, undo, redo, save, saveObj, loadObj;
	private MyDrawer myDrawer;
	
	public MySignature() {
		super("簽名app");
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		save = new JButton("Save");
		saveObj = new JButton("Save Object");
		loadObj = new JButton("Load Object");
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear);top.add(undo);top.add(redo);
		top.add(save);top.add(saveObj);top.add(loadObj);
		add(top, BorderLayout.NORTH);
		
		myDrawer = new MyDrawer();
		add(myDrawer, BorderLayout.CENTER);
		
		initFunction();
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initFunction() {
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
		
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
			}
		});
		
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
			}
		});
		
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					myDrawer.saveImage();
					JOptionPane.showMessageDialog(MySignature.this, 
							"Save JPEG OK");
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(MySignature.this, 
							"Save JPEG Fail");
				}
			}
		});
		
		saveObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.saveObject();
			}
		});
		
		loadObj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.loadObject();
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new MySignature();
	}
}
