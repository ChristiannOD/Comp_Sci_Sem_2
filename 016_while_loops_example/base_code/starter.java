import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String joe = sc.nextLine();
	System.out.println( joe + (", How many times do you want to repeat your name?"));
	int mary = sc.nextInt();
	int c = 1;
	while(true) {
		System.out.println(joe);
			if(c == mary) 
			{
				break;
			}
		c = c + 1;
		
}
}
}

