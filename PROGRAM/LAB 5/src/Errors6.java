import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int ni1, ni2; // Duplicate variable so change name for each action

		System.out.print("Please enter the first number: "); // Add Space
		ni1 = input.nextInt();

		System.out.print("Please enter the second number: ");
		ni2 = input.nextInt();

		int averagein; // Duplicate average variable so chnage name for each
		averagein = (ni1+ni2)/2;
		System.out.println("The average of the numbers is " + averagein);

		float nf1, nf2;

		System.out.print("Please enter the first number: ");
		nf1 = input.nextFloat();

		System.out.print("Please enter the second number: ");
		nf2 = input.nextFloat();

		float averagefl;
		averagefl = (nf1+nf2)/2;
		System.out.println("The average of the numbers is " + averagefl);

		short s1, s2;

		System.out.print("Please enter the first number: ");
		s1 = input.nextShort();

		System.out.print("Please enter the second number: ");
		s2 = input.nextShort();

		int shortAvg;
		shortAvg = (int)((s1+s2)/2); // not right variable
		System.out.print("The average of the numbers is " + shortAvg);
	}

}
