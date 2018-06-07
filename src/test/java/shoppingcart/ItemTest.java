package shoppingcart;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ItemTest {
	Item underTest;
	private Item myItem1;
	private Item myItem2;
	
	@Before
	public void setUp() {
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
}
