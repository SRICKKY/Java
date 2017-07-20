import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JTextFieldDemo extends JApplet {
	JTextField textfield;
	public void init() {
		try {
			SwingUtilities.invokeAndWait(
				new Runnable() {
					public void run() {
						makeGUI();
					}
				});
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

	private void makeGUI() {
		setLayout(new FlowLayout());

		textfield = new JTextField(15);
		add(textfield);

		textfield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				showStatus(textfield.getText());
			}
		});
	}
}