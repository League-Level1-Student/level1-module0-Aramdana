import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SingleButton implements ActionListener {

	public static void main(String[] args) {
		SingleButton b = new SingleButton();
		b.createGui();
	}
	
	void createGui(){
		JFrame f = new JFrame();
		JButton b = new JButton();
		f.add(b);
		f.setVisible(true);
		f.pack();
		b.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Button Clicked!");
		
	}
	
	
}
