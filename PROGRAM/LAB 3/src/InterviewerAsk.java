import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
	System.out.println("Interview Questions");
	Scanner kbd = new Scanner(System.in);
	int n1, n2, n3, n4, n5;
	System.out.print("How old are you? ");
	n1 = kbd.nextInt ();
	System.out.println("They are " + n1 + " years old.");
	
	System.out.print("How many devices do you own? ");
	n2 = kbd.nextInt ();
	System.out.println("They own " + n2 + " devices.");
	
	System.out.print("How many roommates do you have? ");
	n3 = kbd.nextInt();
	System.out.println("They have " + n3 + " roommates.");
	
	System.out.print("How many units are you taking? ");
	n4 = kbd.nextInt();
	System.out.println("They are taking " + n4 + " units.");
	
	System.out.print("How many colleges did you apply for? ");
	n5 = kbd.nextInt();
	System.out.println("They applied for " + n5 + " colleges.");
	

	}

}
