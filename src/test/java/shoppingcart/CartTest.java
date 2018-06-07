package shoppingcart;

import org.junit.Before;
import org.junit.Test;

public class CartTest {

		Cart underTest;
		Item item1;
		Item item2;
		Item item3;
		
	@Before
	public Void setUp() {
		underTest = new Cart();
		item1 = new Item("Shoes", 49.50, 1);
		item2 = new Item("Books", 24.30, 3);
		
	}
	@Test
	public void shouldBeAbleToAddItemToCart() {
		underTest.addItem(item1);
		Item retrievedItem = Cart.getItem(item1.getName());
	
		
	}	
}
