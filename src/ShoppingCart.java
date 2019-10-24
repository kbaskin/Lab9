import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {

		// when done adding items, display a list of all items ordered with prices in
		// columns
		// display avg price of items ordered
		// use a map to keep track of menu of items - it should have a String key(for
		// item name) and Double value(for item price)

		// extend.challenge - display the most and least expensive item ordered

		Scanner scan = new Scanner(System.in);
		double totalPurchase = 0;
		double avgPriceOrdered = 0;
		double thisPurchase = 0; 
		double formattedTotal = 0; 
		double counter = 0;

		System.out.println("Welcome to the Baskin Bodega!\n");
		System.out.println("Here is a list of our items: ");
		// System.out.printf("%-15sItems %.2fPrice");
		System.out.println("   Item:           Price:");
		System.out.println("==========================");
		
		// display a list of at least 8 item names and prices
		// use parallel ArrayLists(one of strings, one of doubles) to store the items
		// ordered and their prices
		String[] itemNum = { "1.", "2.", "3.", "4.", "5.", "6.", "7.", "8." };
		String[] foodList = { "apples", "bananas", "strawberries", "grapes", "peaches", "raspberries", "smoothie",
				"green juice" };
		double[] foodPrice = {4.49, 1.99, 3.29, 2.30, 3.80, 4.00, 8.99, 10.99}; 
		
		for (int i = 0; i < foodList.length; i++) {
			System.out.printf("%-1s %-15s $%.2f\n", itemNum[i], foodList[i], foodPrice[i]);
		}

		System.out.println("\nWould you like to order something? (y/n)");
		String cont = scan.nextLine();

		while (cont.equalsIgnoreCase("yes") || cont.equalsIgnoreCase("y")) {

			// if that item doesn't exist, display an error and re-prompt the user (display
			// the menu again if you'd like)
			// extended challenges - implement a menu system so the user can enter just a
			// letter or number for the item
			System.out.println("   Item:           Price:");
			System.out.println("==========================");
			for (int i = 0; i < foodList.length; i++) {
				System.out.printf("%-1s %-15s $%.2f\n", itemNum[i], foodList[i], foodPrice[i]);
			}
			int order = Validator.getInt(scan,
					"\nPlease enter the number next to what item you would like to order.", 1,
					8);
			order -= 1;

			// if that items exists, display that item and price and add that item and its
			// price to the user's order
			// formattedTotal = Math.round(thisPurchase * 100.00) / 100.00;

			System.out.printf("\nAdding " + foodList[order] + " to cart at $%.2f", foodPrice[order]);
			System.out.println(".");
			// ask if they want to add another, repeat if they do - can ask for quantity
			System.out.println("How many would you like to add?");
			double numItems = scan.nextInt();

			scan.nextLine();

			thisPurchase = numItems * foodPrice[order];
			totalPurchase += thisPurchase;
			counter++;
			System.out.printf("Ok, that will be: $%.2f", thisPurchase);

			System.out.println("\nContinue shopping? (y/n)"); // Or enter 'done' to checkout."
			String done = scan.nextLine();
			if (done.equalsIgnoreCase("n") || (done.equalsIgnoreCase("no"))) {
				break;
			} else {
				continue;
			}


		}

		//double formattedPurchase = Math.round(totalPurchase * 100.00) / 100.00;
		System.out.println("Thanks for shopping! Here is your order: ");
		System.out.printf("\nYour Grand Total is: $%.2f", totalPurchase);
		System.out.printf("\nAverage price per item in your cart was: $%.2f", totalPurchase / counter);
		System.out.println("\nHave a great day!");
		scan.close();

	}

	// method1 - find the avg cost of the items ordered
	// FIX ME
	public static ArrayList<Double> avgCost(ArrayList<Double> cost) {
		return null;
	}

	// method2 - indexes of the highest cost items
	// FIX ME
	public static ArrayList<String> highCostItems(ArrayList<String> item) {
		// item.get(index[]);
		return item;
	}

	// method3 - indexes of lowest cost items
	// FIX ME
	public static ArrayList<String> lowestCostItem(ArrayList<String> item) {
		return item;
	}

}
