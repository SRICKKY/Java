import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// <applet code="MySwingApplet" width=220 height=90></applet>

public class MySwingApplet extends JApplet {
	JButton alpha;
	JButton beta;

	JLabel label;

	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					makeGUI();
				}
			});
		} catch (Exception exc) {
			System.out.println("Can't create because of "+exc);
		}
	}

	private void makeGUI() {
		setLayout(new FlowLayout());

		alpha = new JButton("Aplha");
		beta = new JButton("Beta");

		alpha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				label.setText("Alpha was pressed.");
			}
		});

		beta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				label.setText("Beta was pressed.");
			}

		});

		add(alpha);
		add(beta);

		label = new JLabel("Press a button");
		add(label);


	}


}












