import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener 
{
	public static void main(String[] args) 
	{
		FortuneCookie fc  = new FortuneCookie();
		fc.showButton();
	}
	public void showButton() 
	{
		JFrame f = new JFrame();
		f.setVisible(true);
		JButton b =  new JButton();
		f.add(b);
		f.pack();
		b.addActionListener(this);
		
		System.out.println("Button Clicked");
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		Random rand = new Random();
		int fortunedisplayed = rand.nextInt(5);
		if (fortunedisplayed == 1) 
		{
			JOptionPane.showMessageDialog(null, "Quote 1");
		}
		else if (fortunedisplayed == 2) 
		{
			JOptionPane.showMessageDialog(null, "Quote 2");
		}
		else if (fortunedisplayed == 3) 
		{
			JOptionPane.showMessageDialog(null, "Quote 3");
		}
		else if (fortunedisplayed == 4) 
		{
			JOptionPane.showMessageDialog(null, "Quote 4");
		}
		else if (fortunedisplayed == 0) 
		{
			JOptionPane.showMessageDialog(null, "Quote 0");
		}
	}
}
