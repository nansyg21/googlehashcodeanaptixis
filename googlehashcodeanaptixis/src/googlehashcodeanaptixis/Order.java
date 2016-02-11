package googlehashcodeanaptixis;

import java.util.ArrayList;

public class Order {

	int locationX;
	int locationY; 
	ArrayList<Product> products;
	ArrayList<Integer> quantities;
	
	boolean done;
	
	
	public Order(int locationX, int locationY,ArrayList<Product> products, ArrayList<Integer> quantities, boolean done) {
		super();
		this.locationX = locationX;
		this.locationY = locationY;
		this.products=products;
		this.quantities=quantities;
		this.done = done;
	}
	public int getLocationX() {
		return locationX;
	}
	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}
	public int getLocationY() {
		return locationY;
	}
	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	public ArrayList<Integer> getQuantities() {
		return quantities;
	}
	public void setQuantities(ArrayList<Integer> quantities) {
		this.quantities = quantities;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	
	
	
}
