import javax.swing.*;
import java.awt.event.*;

public class SimpleGuiOne implements ActionListener {

	JButton button;

	public static void main(String[] args) {
		SimpleGuiOne gui = new SimpleGuiOne();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame("Event Listener");
		button = new JButton("Click Here");

		button.addActionListener(this);

		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {

		button.setText("I've been clicked.");

	}
}