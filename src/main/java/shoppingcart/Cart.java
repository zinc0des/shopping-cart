package shoppingcart;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cart {
	DecimalFormat df = new DecimalFormat("#.##");
	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item myItem) {
		items.add(myItem);
	}

	public void removeItem(Item myItem) {
		items.remove(myItem);
	}

	public List<Item> getItems() {
		return this.items;
	}

	public double checkout() {
		double totalCost = 0.0;
		for (Item item : items) {
			totalCost = totalCost + (item.getPrice() * item.getQuantity());
			df.format(totalCost);
		}
		return totalCost;
	}

	public Collection<Item> getAllItems() {
		return items;
	}
}