public class Driver 
{
	public static void main(String[] args) 
	{
		Dice d4 = new Dice(4);
		Dice d6 = new Dice(6);
		Dice d8 = new Dice(8);
		Dice d10 = new Dice(10);
		Dice d12 = new Dice(12);
		Dice d20 = new Dice(20);
		
		System.out.println(d6.roll());
		System.out.println(d8.roll());
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println(d4.roll() + ", " + d6.roll() + ", " + d8.roll() + ", " + d10.roll() + ", " + d12.roll() + ", " + d20.roll());
		}

	}

}