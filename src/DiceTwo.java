/**
 * 
 * @author danielhan
 *
 */
public class DiceTwo {
	public static void main(String[] args)
	{
	DiceMain die1 = new DiceMain();
	DiceMain die2 = new DiceMain();
	int sum =0;
	int [] total = new int[11];
for (int i = 0; i < 1000; i++)
{
	int roll1 = die1.roll();
	int roll2 = die2.roll();
	sum = roll1 + roll2;
		if(sum == 2)
		{

			++total[0];
			
		}
		if(sum == 3)
		{
			++total[1];
			
		}
		if(sum == 4)
		{
			++total[2];
		}
		if(sum == 5)
		{
			++total[3];
		}
		if(sum == 6)
		{
			++total[4];
		}
		if(sum == 7)
		{
			++total[5];
		}
		if(sum == 8)
		{
			++total[6];
		}
		if(sum == 9)
		{
			++total[7];
		}
		if(sum == 10)
		{
			++total[8];
		}
		if(sum == 11)
		{
			++total[9];
		}
		if(sum == 12)
		{
			++total[10];
		}
		}
System.out.println("You rolled " + (total[0]) + " twos");
System.out.println("You rolled " + (total[1]) + " threes");
System.out.println("You rolled " + (total[2]) + " fours");
System.out.println("You rolled " + (total[3]) + " fives");
System.out.println("You rolled " + (total[4])+ " sixes");
System.out.println("You rolled " + (total[5])+ " sevens");
System.out.println("You rolled " + (total[6])+ " eights");
System.out.println("You rolled " + (total[7]) + " nines");
System.out.println("You rolled " + (total[8])+ " tens");
System.out.println("You rolled " + (total[9])+ " elevens");
System.out.println("You rolled " + (total[10])+ " twelves");
	}
}	


