import java.util.Scanner; // Need to import java.util.Scanner:

public class Errors1 {

	public static void main(String[] args) {
		System.out.println("Can you spot and fix the errors?"); // Forgot Quotations

		System.out.print("Enter two numbers and I "); // Don't need new line
		System.out.println("add them for you");

		int n1, n2;

		Scanner input = new Scanner(System.in); // Change keyboard to input
		n1 = input.nextInt(); // put input before .nextInt
		n2 = input.nextInt(); // put input before .nextInt also change to capital I for nextInt

		System.out.println("The sum of the numbers is"); // Forgot out for System.out.println
		System.out.println(n1 + n2); // Change to addition
	}
}