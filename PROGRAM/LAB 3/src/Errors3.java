import java.util.Scanner;

public class Errors3 { // Need {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Change kbd to input and add ()
		int numerator; // Change to lower case i
		int denominator; // Change to int

		System.out.println("This program divides two numbers."); // Forgot out
		System.out.print("Enter the numerator: "); // Forgot out
		numerator = input.nextInt(); // Change to input
		System.out.print("Enter the denominator: ");
		denominator = input.nextInt(); // Change to input and correctly spell denominator

		int answer; // Add int called answer
		answer = (numerator / denominator); // Divide numerator by denominator
		
		System.out.print(numerator); // Change to capital S
		System.out.print("/");
		System.out.print(denominator); // Change to capital S and lower case p
		System.out.print(" = ");
		System.out.println(answer); // Change to answer and change to lower case p
	}
} // Add }

