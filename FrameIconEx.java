package com.srikant;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FrameIconEx extends JFrame {
	public FrameIconEx() {
		initUI();
	}

	private void initUI() {
		ImageIcon icon = new ImageIcon("hourglass.png");
		setIconImage(icon.getImage());
		setTitle("Icon");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			FrameIconEx ex = new FrameIconEx();
			ex.setVisible(true);
		});
	}
}