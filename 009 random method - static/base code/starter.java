import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int joe = rand.nextInt(10);
		System.out.println(joe);
		int mary = rand.nextInt(100)+1;
		System.out.println(mary);
		double saul = rand.nextDouble() + rand.nextInt(1) + 2.5;
		System.out.println(saul);
		double david = rand.nextDouble() + rand.nextInt(575) + 14;
		System.out.println(david);
			
		
		
	}
}
