import java.util.Scanner;

public class Bobcar
{
	public static void main(String[] args)
	{
		int Economy = 35;
		int Compact = 45;
		int Standard = 95;
		int result = 0;
		int dayPrice = 0;
		float discount = 0;
		float PlatinumCost = 0;
		float total = 0;

		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");


		Scanner input = new Scanner(System.in);
		System.out.print("Please choose the rental cars: ");
		int car = input.nextInt();

		System.out.print("Please enter the number of rental days: ");
		int day = input.nextInt();

		if (car == 1) {
			dayPrice = Economy;
			result = dayPrice * day;
			System.out.println("Base: " + day + " days for an Economy @ $35 per day:     $ " + result);
		}
		else if (car == 2) {
			dayPrice = Compact;
			result = dayPrice * day;
			System.out.println("Base: " + day + " days for a Compact @ $45 per day:     $ " + result);
		}
		else if (car == 3) {
			dayPrice = Standard;
			result = dayPrice * day;
			System.out.println("Base: " + day + " days for a Standard @ $95 per day:    $ " + result);
		}
		
		System.out.print("Club member?:");
		System.out.print(" Press 1 for Yes or Press 0 for No: ");
		int club = input.nextInt();

		if (club == 1){
			
			discount = (int)(day / 7) * dayPrice;
			System.out.println("Club Member Discount: - $ " + discount);
		
			System.out.print("Platinum Executive Package?" );
			System.out.print(" Press 1 for Yes or Press 0 for No: ");
			int platinum = input.nextInt();

			if (platinum == 1) {
				PlatinumCost = (float)(result * 0.15);
				System.out.println("Platinum Executive Package: + $ " + PlatinumCost);
				}
		}
		
		total = result + PlatinumCost - discount;
		System.out.println("Total Estimate for Rental: + $ " + total);


	}
}
