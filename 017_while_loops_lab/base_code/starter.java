import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String joe = sc.nextLine();
	System.out.println( joe+ (", How many times do you want to repeat your name?"));
	int n = sc.nextInt();
	int a = 1;
	while(true) {
		System.out.println(joe);
		if(a==n)
			{
			break;
			}
		a = a + 1;
}
}
}
