package shoppingcart;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {
		Cart cart = new Cart();
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter the name of the item: ");
			String myItemName = input.next();

			System.out.println("Enter the unit price: ");
			double myItemPrice = input.nextDouble();

			System.out.println("Enter the quantity: ");
			int myItemQty = input.nextInt();

			cart.addItem(new Item(myItemName, myItemPrice, myItemQty));
			System.out.println("Current Cart");
			for (Item item : cart.getItems()) {
				System.out.println(item.toString());
			}
			System.out.println("Total cost: $" + df.format(cart.checkout()));
			System.out.println("Continue shopping (y/n)");
			input.next(choice);
		}
		input.close();
	}

}
