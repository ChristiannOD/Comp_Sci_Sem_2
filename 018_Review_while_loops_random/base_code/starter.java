import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the number from 1 - 1000");
		int guess = sc.nextInt();
		Random rand = new Random();
		int secret = rand.nextInt(100) + 1;
		while( guess != secret) {
			System.out.println("The guess is wrong. Guess again");
			guess = sc.nextInt();
			if( guess == secret) {
				break;
			}
			if( guess > secret) {
				System.out.println("Your guessing to high");
			}
			else {
				System.out.println("Your guessing to low");
			}
		
		}
		System.out.println("The number you guessed was right");
}
}
