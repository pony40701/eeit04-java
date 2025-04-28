package tw.pony.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.pony.apis.MyDrwaer;

public class MySign extends JFrame{
	private MyDrwaer myDrwaer;
	private JButton clear, undo, redo, chColor;
	
	public MySign() {
		super("Sign App");
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		chColor = new JButton("Color");
		
		myDrwaer = new MyDrwaer();
		add(myDrwaer, BorderLayout.CENTER);
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear); top.add(undo); top.add(redo);
		top.add(chColor);
		
		add(top, BorderLayout.NORTH);
		
		
		setSize(800,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initEvent();
	}
	
	private void initEvent() {
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrwaer.clear();
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrwaer.undo();
			}
		});
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrwaer.redo();
			}
		});
		chColor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor();
			}
		});
		
	}
	
	private void changeColor() {
		Color newColor = JColorChooser.showDialog(null, "Change Color", Color.BLUE);
		if (newColor != null) {
			
		}
	}
	
	
	public static void main(String[] args) {
		new MySign();
	}

}