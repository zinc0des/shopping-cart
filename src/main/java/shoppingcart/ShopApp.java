package shoppingcart;

import java.util.ArrayList;

public class ShopApp {

	public static void main(String[] args) {
		Cart cart = new Cart();
		Item item1 = new Item("trousers", 34.50, 2);
		Item item2 = new Item("jeans", 12.40, 3);
		Item item3 = new Item("top", 9.99, 4);
		Item item4 = new Item("shoes", 45.89, 1);
		Item item5 = new Item("skirt", 10.99, 5);
		cart.addItem(item1);
		ArrayList<String> shoppingItems = new ArrayList<String>();
		
	}

}
