import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Baskin Bodega!\n");
		System.out.println("Here is a list of our items: ");
		// System.out.printf("%-15sItems %.2fPrice");
		System.out.println("   Item:           Price:");
		System.out.println("==========================");

		Map<String, Double> items = new HashMap<>();
		items.put("apples", 4.49);
		items.put("bananas", 1.99);
		items.put("strawberries", 3.29);
		items.put("grapes", 2.30);
		items.put("peaches", 3.80);
		items.put("raspberries", 4.25);
		items.put("smoothie", 8.99);
		items.put("green juice", 10.99);

		int counter = 1; // HashMap does not have index and using this to start user friendly at 1
		for (String key : items.keySet()) {
			System.out.println(counter++ + ". " + key + " $" + items.get(key));
		}

//		String[] itemNum = { "1.", "2.", "3.", "4.", "5.", "6.", "7.", "8." };
//		String[] foodList = { "apples", "bananas", "strawberries", "grapes", "peaches", "raspberries", "smoothie",
//				"green juice" };
//		double[] foodPrice = { 4.49, 1.99, 3.29, 2.30, 3.80, 4.00, 8.99, 10.99 };
//
//		for (int i = 0; i < foodList.length; i++) {
//			System.out.printf("%-1s %-15s $%.2f\n", itemNum[i], foodList[i], foodPrice[i]);
//		}

		System.out.println("\nWould you like to order something? (y/n)");
		String cont = scan.nextLine();

		while (cont.equalsIgnoreCase("yes") || cont.equalsIgnoreCase("y")) {

			// if that item doesn't exist, display an error and re-prompt the user (display
			// the menu again if you'd like)
			// extended challenges - implement a menu system so the user can enter just a
			// letter or number for the item
			System.out.println("   Item:           Price:");
			System.out.println("==========================");
			for (String key : items.keySet()) {
				System.out.println(counter + ". " + key + " $" + items.get(key));
			}

			int order = Validator.getInt(scan, "\nPlease enter the number next to what item you would like to order.",
					1, 8);
			order -= 1;

			// if that items exists, display that item and price and add that item and its
			// price to the user's order
			// formattedTotal = Math.round(thisPurchase * 100.00) / 100.00;

//			System.out.println("\nAdding " + foodList[order] + " to cart at $" + foodPrice[order] + ".");
//			// ask if they want to add another, repeat if they do - can ask for quantity
//			System.out.println("How many would you like to add?");
//			double numItems = scan.nextInt();
//
//			scan.nextLine();
//
//			thisPurchase = numItems * foodPrice[order];
//			totalPurchase += thisPurchase;
//			System.out.println("Ok, that will be: $" + thisPurchase);

			System.out.println("\nContinue shopping? (y/n)"); // Or enter 'done' to checkout."
			String done = scan.nextLine();
			if (done.equalsIgnoreCase("n") || (done.equalsIgnoreCase("no"))) {
				break;
			} else {
				continue;
			}

		}

		System.out.println("Thanks for shopping! Here is your order: ");
		// System.out.println("Your Grand Total is: $" + totalPurchase);
		System.out.println("Average price per item in your cart was: $");
		System.out.println("Have a great day!");
		scan.close();
	}

}
