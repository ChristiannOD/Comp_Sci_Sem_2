import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random a =  new Random();
		int n = a.nextInt(1000)+1;
		System.out.println("Choose any number from 1 - 1000");
		int joe = sc.nextInt();
		boolean b = n==joe;
		if(b)
		{
			System.out.print("The number you guess was wrong. The number was" + n);
		}
		else
		{
			System.out.print("The number you guessed was wrong. The number was " + n);
		}
	
		
	}
}
