import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a integer");
		int a = sc.nextInt();
		System.out.println("Type b integer");
		int b = sc.nextInt();
		System.out.println("Type c integer");
		int c = sc.nextInt();
		
		if ((a<b) && (a<c)) {
			System.out.println("A is the smallest number");
			
		}
	
		if ((b<a) && (b<c)) {
			System.out.println("B is the smallest number");
		}
		
		if ((c<a) && (c<b)) {
			System.out.println("C is is the smallest number");
		}
		
		if ((a>b) && (a>c)) {
			System.out.println("A is the greatest number");
		}
		
		if ((b>a) && (b>c)) {
			System.out.println("B is the greatest number");
		}
		
		if ((c>a) && (c>b)) {
			System.out.println("C is the greatest number");
		}
}
}

