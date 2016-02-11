package googlehashcodeanaptixis;

import java.util.ArrayList;

public class Order {

	int locationX;
	int locationY;
	ArrayList<Integer> types;
	ArrayList<Integer> quantity;
	boolean done;
	
	
	public Order(int locationX, int locationY, ArrayList<Integer> types,
			ArrayList<Integer> quantity, boolean done) {
		super();
		this.locationX = locationX;
		this.locationY = locationY;
		this.types = types;
		this.quantity = quantity;
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
	public ArrayList<Integer> getTypes() {
		return types;
	}
	public void setTypes(ArrayList<Integer> types) {
		this.types = types;
	}
	public ArrayList<Integer> getQuantity() {
		return quantity;
	}
	public void setQuantity(ArrayList<Integer> quantity) {
		this.quantity = quantity;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	
	
	
}
