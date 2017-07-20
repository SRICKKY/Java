import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class EventDemo {
	JLabel jlab;

	EventDemo() {

		JFrame jfram = new JFrame("An Event Example");
		jfram.setLayout(new FlowLayout());
		jfram.setSize(500,500);

		jfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton alpha = new JButton("Alpha");
		JButton beta = new JButton("Beta");

		alpha.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Alpha was pressed.");
			}

		});

		beta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				jlab.setText("Beta was pressed.");
			}
		});

		jfram.add(alpha);
		jfram.add(beta);

		jlab = new JLabel("Press a button.");

		jfram.add(jlab);
		jfram.setVisible(true);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new EventDemo();
			}

		});
	}
}