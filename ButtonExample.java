import javax.swing.*;

public class ButtonExample {
	public ButtonExample() {
		JFrame frame = new JFrame("Button Example");
		JButton button = new JButton(new ImageIcon("D:\\hourglass.png"));
		button.setBounds(100,100,100,40);
		frame.add(button);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ButtonExample();
	}
}