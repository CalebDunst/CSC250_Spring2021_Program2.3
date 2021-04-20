import java.util.Random;

public class Dice 
{
	int sides;
	
	Dice(int sides)
	{
		//self.sides = sides in python
		this.sides = sides;
	}
	
	int roll()
	{
		Random r = new Random();
		return r.nextInt(this.sides) + 1;
		
	}
}