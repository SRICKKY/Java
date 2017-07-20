import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SimpleGui3c implements ActionListener {
	JFrame frame;

	public static void main(String[] args) {
		SimpleGui3c gui = new SimpleGui3c();
		gui.go();
	}

	public void go() {
		frame = new JFrame("Third Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton buttton = new JButton("Change Color");
		button.addActionListener(this);

		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setSize(500,500);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		frame.repaint();
	}
}