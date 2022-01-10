import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random a = new Random();
		int n = sc.nextInt(1000)+1;
		System.out.println("Pick a number from 1 - 1000");
		int joe = sc.nextInt();
		boolean carl = n==joe;
		if(carl)
		{
			System.out.println("The number you guessed was greater than" +n);
		}
		else
		{
			System.out.println("The number you guessed was smaller than" +n);
		}
		
	}
}
