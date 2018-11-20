/**
 * 
 *
 * @author danielhan
 *
 */
public class Dice 
{
		public static void main(String[] args)
			{
			DiceMain die1 = new DiceMain();
			DiceMain die2 = new DiceMain();
			int sum =0;
			int total[] = {2,3,4,5,6,7,8,9,10,11,12};
			
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
		System.out.println("You rolled " + (total[0] - 2) + " twos");
		System.out.println("You rolled " + (total[1] - 3) + " threes");
		System.out.println("You rolled " + (total[2] - 4) + " fours");
		System.out.println("You rolled " + (total[3] - 5) + " fives");
		System.out.println("You rolled " + (total[4] - 6) + " sixes");
		System.out.println("You rolled " + (total[5] - 7) + " sevens");
		System.out.println("You rolled " + (total[6] - 8) + " eights");
		System.out.println("You rolled " + (total[7] - 9) + " nines");
		System.out.println("You rolled " + (total[8] - 10)+ " tens");
		System.out.println("You rolled " + (total[9] - 11)+ " elevens");
		System.out.println("You rolled " + (total[10] - 12)+ " twelves");
			}
}	
