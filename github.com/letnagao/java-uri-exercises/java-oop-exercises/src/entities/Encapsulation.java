package entities;

public class Encapsulation {
	private String name;
	private double price;
	private int quantity;
	
	public Encapsulation() {
		
	}
	
	public Encapsulation(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Encapsulation(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
