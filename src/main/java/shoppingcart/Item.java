package shoppingcart;

import java.text.DecimalFormat;

public class Item {
	DecimalFormat df = new DecimalFormat("#.##");
	private String name;
	private double price;
	private int quantity;

	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return this.getPrice() * this.getQuantity();
	}

	@Override
	public String toString() {
		return "Item: " + getName() + "            Price: $" + df.format(getPrice()) + "            Quantity: "
				+ getQuantity();
	}
}