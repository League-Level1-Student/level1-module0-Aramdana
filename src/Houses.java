import org.jointheleague.graphical.robot.Robot;
import java.util.Random;

public class Houses 
{
	public static void main(String[] args) 
	{
		Robot a = new Robot();
		a.setSpeed(100);
		a.miniaturize();
		a.setX(10);
		a.setPenWidth(5);
		
		for (int i=0;i<10;i++) 
		{
			house(a, 10);
		}
	}

	private static void house(Robot a, int height) 
	{
		Random rand = new Random();
		int rh = rand.nextInt(3);
		int rr = rand.nextInt(2);
		int[] househeight = {60,120,250};
		a.setRandomPenColor();
		a.penDown();
		a.move(househeight[rh]);
		if (rr == 0) 
		{
			flatRoof(a);
		}
		else if (rr == 1)
		{
			peekedRoof(a);
		}
		a.move(househeight[rh]);
		a.setPenColor(102, 170, 68);
		a.turn(-90);
		a.move(30);
		a.turn(-90);
	}

	private static void flatRoof(Robot a) 
	{
		a.turn(90);
		a.move(45);
		a.turn(90);
	}
	private static void peekedRoof(Robot a) 
	{
		a.turn(45);
		a.move(30);
		a.turn(90);
		a.move(30);
		a.turn(45);
	}
	
}
