import javax.swing.*;
import java.awt.event.*;

public class TextFieldExample implements ActionListener {
	JTextField textfield_one, textfield_two, textfield_three;
	JButton button_one, button_two;

	TextFieldExample() {
		JFrame frame = new JFrame("Caclutaion");
		textfield_one = new JTextField();
		textfield_one.setBounds(50,50,300,300);
		textfield_two = new JTextField();
		textfield_two.setBounds(50,50,300,300);
		textfield_three = new JTextField();
		textfield_three.setBounds(50,50,150,20);
		textfield_three.setEditable(false);

		//Button

		button_one = new JButton("+");
		button_one.setBounds(50,200,50,50);
		button_two = new JButton("-");
		button_two.setBounds(100,200,50,50);

		button_one.addActionListener(this);
		button_two.addActionListener(this);

		frame.add(textfield_one);
		frame.add(textfield_two);
		frame.add(textfield_three); 
		frame.add(button_one);
		frame.add(button_two);
		//frame.setDeafaultCloseOpearion(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setLayout(null);
	}

	public void actionPerformed(ActionEvent ae) {
		String one = textfield_one.getText();
		String two = textfield_two.getText();

		int number_one = Integer.parseInt(one);
		int number_two = Integer.parseInt(two);
		int result= 0;

		if(ae.getSource() == button_one){
			result = number_one + number_two;
		}
		else {
			result = number_one - number_two;
		}

		String answer = String.valueOf(result);
		textfield_three.setText(answer);
	}

	public static void main(String[] args) {
		new TextFieldExample();
	}

}




















