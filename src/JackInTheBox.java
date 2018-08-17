import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JackInTheBox implements ActionListener 
{
	JFrame f = new JFrame();
	JButton b = new JButton();
	int i = 0;
	public static void main(String[] args) 
	{
		JackInTheBox  j = new JackInTheBox();
		j.createGUI();
	}
	private void createGUI() 
	{
		f.add(b);
		b.setText("Surprise!");
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent arg0) 
	{
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == b) 
		{
			i++;
			if (i == 5) 
			{
				System.out.println("worked");
			}
		}
	}
}
