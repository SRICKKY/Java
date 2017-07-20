import java.awt.*;
import javax.swing.*;

// <applet class="JLabelDemo" width=500 height=500></applet>

public class JLabelDemo extends JApplet {
	public void init() {
		try {
			SwingUtilities.invokeAndWait(
				new Runnable(){
					public void run() {
						makeGUI();
					}
				});
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void makeGUI() {
		ImageIcon ii = new ImageIcon("hourglass.png");
		JLabel label = new JLabel("Hourglass", ii, JLabel.CENTER);
		add(label);
	}

}

