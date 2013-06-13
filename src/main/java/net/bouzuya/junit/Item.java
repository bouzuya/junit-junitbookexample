package net.bouzuya.junit;

public class Item {
	private final String name;
	private final int price;

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}