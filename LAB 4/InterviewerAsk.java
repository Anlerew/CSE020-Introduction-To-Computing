import java.util.Scanner;

public class InterviewerAsk{

	public static void main(String[] args) {
	System.out.println("Interview Questions");
	Scanner kbd = new Scanner(System.in);
	kbd.useDelimiter(System.getProperty("line.separator"));
	int n1, n2, n3, n4;
	
	System.out.print("How old are you? ");
	n1 = kbd.nextInt();
	
	System.out.print("How many devices do you own? ");
	n2 = kbd.nextInt();
	
	System.out.print("How many roommates do you have? ");
	n3 = kbd.nextInt();
	
	System.out.print("How many units are you taking? ");
	n4 = kbd.nextInt();
	
	String s1;
	
	System.out.print("Where are you from? ");
	s1 = kbd.next();
	
	float n6;
	System.out.println("I can convert pounds to kilograms. What is you weight in pounds?");
	n6 = kbd.nextFloat();
	float conversion;
	conversion = n6 * ((float)5 / 11);
	
	System.out.println("You are " + n1 + " years old.");
	System.out.println("You own " + n2 + " devices.");
	System.out.println("You have " + n3 + " roommates.");
	System.out.println("You are taking " + n4 + " units.");
	System.out.println("You are from " + s1 + " .");
	System.out.print("Your weight in kilograms is " + conversion + " kilograms.");
	
	
			
	}

}
