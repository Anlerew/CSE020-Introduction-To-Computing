import java.util.Scanner;
public class Bobcathotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

		double s = 50.50;
		double d = 75.00;
		double q = 100.75;
		double k = 150.25;
		double m = 225.50;
		int comp = 0;
		int stand = 30;
		int delux = 50;
		int indulg = 85;
		int guest = 0;
		int nights = 0;
		int roomchoice = 0;
		double room = 0;
		int AAA = 0;
		double AAAdisc = 0;
		int club = 0;
		int clubnumb = 0;
		double clubdisc = 0;
		int rando = 0;
		int mealpack = 0;
		double roomcost = 0;
		double mealcost = 0;
		double pretotal = 0;
		double discount = 0;
		double fulltotal = 0;

		System.out.println("ROOM OPTIONS");
		System.out.println("1. Single @ $50.50 per night");
		System.out.println("2. Double @ $75.00 per night");
		System.out.println("3. Queen @ $100.75 per night");
		System.out.println("4. King @ $150.25 per night");
		System.out.println("5. Master Suite @ $225.50 per night");
		System.out.println("");


		System.out.println("Number of guests: ");
		guest = kb.nextInt();
		System.out.println("Please enter your room choice (enter 1/2/3/4/5 depending on options above)");
		roomchoice = kb.nextInt();
		System.out.println("Please enter the number of nights: ");
		nights = kb.nextInt();
		System.out.println("Are you a AAA member? (Enter 1 for yes, 0 for no)");
		AAA = kb.nextInt();
		System.out.println("Are you a club member? (Enter 1 for yes, 0 for no)");
		club = kb.nextInt();
		System.out.println();

		if (roomchoice == 5) {
			System.out.println("MEAL PACKAGES (PRICES ARE SHOWN PER NIGHT)");
			System.out.println("0. Complementary @ $0 per guest");
			System.out.println("1. Standard @ $30 per guest");
			System.out.println("2. Deluxe @ $50 per guest");
			System.out.println("3. Indulgence @ $85 per guest");
			System.out.println();

			System.out.println("Please enter your desired meal package (Enter 0/1/2/3 depending on options above)");
			mealpack = kb.nextInt();
			System.out.println();
		}

		else if (roomchoice <= 4) {
			System.out.println("MEAL PACKAGES (PRICES ARE SHOWN PER NIGHT)");
			System.out.println("0. Complementary @ $0 per guest");
			System.out.println("1. Standard @ $30 per guest");
			System.out.println("2. Deluxe @ $50 per guest");
			System.out.println();

			System.out.println("Please enter your desired meal package (Enter 0/1/2 depending on options above)");
			mealpack = kb.nextInt();
			System.out.println();
		}

		if (roomchoice == 1) 
			room = s;
		roomcost = (s * nights);
		if (roomchoice == 2)
			room = d;
		roomcost = (d * nights);
		if (roomchoice == 3)
			room = q;
		roomcost = (q * nights);
		if (roomchoice == 4)
			room = k;
		roomcost = (k * nights);
		if (roomchoice == 5)
			room = m;
		roomcost = (m * nights);

		if (mealpack == 0)
			mealcost = (guest * nights * comp);
		if (mealpack == 1)
			mealcost = (guest * nights * stand);
		if (mealpack == 2)
			mealcost = (guest * nights * delux);
		if (mealpack == 3)
			mealcost = (guest * nights *indulg);

		pretotal = (roomcost + mealcost);

		if (AAA == 1)
			AAAdisc = (double)(pretotal * 0.10);
		else
			AAAdisc = 0;

		if (club == 1) 
			rando = getRandom(10);

		if (rando >= 4) {
			System.out.println("Congrats! You qualify for a \"Stay 4 nights get 1 free promotion\"");
			System.out.println("Discount will be applied during checkout depending on the number of days");
			clubnumb = (int)(nights / 4);
			clubdisc = (clubnumb * room ); }

		if (rando < 4) {
			System.out.println("Sorry! You do not qualify for the club discount."); }

		System.out.println();

		System.out.println("CHECKOUT");
		System.out.println("Room cost: " + roomcost);
		System.out.println("Meal cost: " + mealcost);
		System.out.println("Preliminary Cost: " + pretotal);
		if (AAA == 1)
			System.out.println("AAA Membership Discount: -" + (double)(AAAdisc));

		if (rando >= 4)
			System.out.println("Club discount: -" + clubdisc);

		if (rando >= 4 && AAA == 1)
			fulltotal = (pretotal - AAAdisc - clubdisc);
		else if (rando < 4 && AAA == 1)
			fulltotal = (pretotal - AAAdisc);
		else if (rando >= 4 && AAA != 1)
			fulltotal = (pretotal - clubdisc);
		else 
			fulltotal = pretotal;

		if (fulltotal == pretotal)
			System.out.println ("No discounts applied!");

		System.out.println("Total Cost of Booking: " + fulltotal);

		System.out.println();
		System.out.println(rando);

	}

	public static int getRandom(int max) {
		// TODO Auto-generated method stub
		return (int) (Math.random()*max);
	}

}