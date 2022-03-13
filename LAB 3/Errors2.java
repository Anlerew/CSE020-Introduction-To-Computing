import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Change kbd to input
		int number = 0;
 // Don't need theSquare here

		System.out.print("Enter a number and I will "); // Need ;
		System.out.print("square it for you:  ");
		
		number =  input.nextInt(); // Change keyboard to input also add quotations

		int theSquare = 0;
		theSquare = (number * number);
		// thesquare = number * number;

		System.out.println("The square of the number is"); // Need () and ;
		System.out.print(theSquare); // Don't need quotations
	}
}