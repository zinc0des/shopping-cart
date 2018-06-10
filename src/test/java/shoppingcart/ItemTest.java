package shoppingcart;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class ItemTest {
	Cart cart;
	Item underTest;
	private Item myItem1;
	private Item myItem2;
	
	@Before
	public void setUp() {
		cart = new Cart();
		underTest = new Item("Dress", 25.0, 2 );
		myItem1 = new Item("Books", 20.0, 4);
		myItem2 = new Item("Scarf", 10.0, 1);
	}
	
	@Test
	public void setNameTest() {
		myItem1.setName("Dress");
		assertEquals(myItem1.getName(), "Dress");
	}
	
	@Test
	public void setPriceTest() {
		myItem2.setPrice(20.0);
		assertEquals(myItem2.getPrice(), 20.0, 0);
	}
	
	@Test
	public void setQuantity() {
		myItem1.setQuantity(2);
		assertEquals(myItem1.getQuantity(), 2);
	}
	
	@Test
	public void shouldBeAbleToAddOneItem() {
		cart.addItem(myItem1);
		Item retrievedItem = myItem1;
		assertThat(retrievedItem, is(myItem1));
	}
	
	@Test
	public void shouldBeAbleToAddTwoItems() {
		cart.addItem(myItem1);
		cart.addItem(myItem2);
		Collection<Item> allItems = cart.getAllItems();
		assertEquals(2, allItems.size());
	}
	
	@Test
	public void shouldBeAbleToRemoveOneItem() {
		cart.addItem(myItem1);
		cart.addItem(myItem2);
		Collection<Item> allItems = cart.getAllItems();
		cart.removeItem(myItem2);
		assertEquals(1, allItems.size());
		
	}

	@Test
	public void shouldBeAbleToAddTotalItems() {
		System.out.println(myItem1.toString());
		assertEquals(80.0, myItem1.getTotalPrice(), 0.0);
		assertEquals(10.0, myItem2.getTotalPrice(), 0.0);
	}

	@Test
	public void shouldBeAbleToAddTotalPriceInCart() {
		cart.addItem(myItem1);
		cart.addItem(myItem2);
		cart.checkout();
		assertEquals(90.0, (myItem1.getPrice()*myItem1.getQuantity()) + (myItem2.getPrice()*myItem2.getQuantity()), 0.00);
	}
}
