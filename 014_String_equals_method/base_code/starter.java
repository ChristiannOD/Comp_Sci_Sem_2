import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Wizard, Warrior, Rogue...");
		String joe = sc.nextLine();
		if(joe.equals("Wizard")) {
			System.out.println("Are you sure you want to be a Wizard?");
			String answer = sc.nextLine();
			if(answer.equals("no")) {
				System.out.println("Choose Wizard, Warrior, Rogue...");
			}
			if(answer.equals("yes")) {
				System.out.println("You are now a Wizard");
			}
		}
		else if(joe.equals("Warrior")) {
			System.out.println("Are you sure you want to be a Warrior");
		}
		if(!joe.equals("Warrior")) {
			System.out.println("Choose Wizard, Warrior, Rogue...");
		}
		if(joe.equals("Warrior")) {
		String jake = sc.nextLine();
		System.out.println("You are now a Warrior");
		if(joe.equals("Rogue")) {
			System.out.println("Are you sure you want to be a Rogue?");
		}
		if(!joe.equals("Rogue")) {
			System.out.println("Choose Wizard, Warrior, Rogue...");
		}
		if(joe.equals("Rogue")) {
		String tony = sc.nextLine();
		System.out.println("You are now a Wizard");
		
		if(!joe.equals("Warrior") && (!joe.equals("Wizard")) && (!joe.equals("Rogue"))) {
			System.out.println("You are not the chosen one");
		}
	}
		}
	}
	}

