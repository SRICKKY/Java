package com.srikant;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class SimpleEx extends JFrame {
	
	public SimpleEx() {
		initUI();
	}

	private void initUI() {
		setTitle("Simple Example");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String args[]) {
		SimpleEx se = new SimpleEx();
		se.setVisible(true);
	}
}