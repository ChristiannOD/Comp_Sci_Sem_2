import java.util.Scanner;
import java.util.Random;

class starter {
	public static String multDiv3(int a, int b) {
		int x = a;
		int y = b;
		int product = x * y;
		if(product%3 == 0){
			return ("It is divisible by 3");
		}
		else{
			return ("It is not divisible by 3");
		}
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type first number");
		int a = sc.nextInt();
		System.out.println("Type second number");
		int b = sc.nextInt();
		System.out.println(multDiv3(a,b));


		
	}
}
