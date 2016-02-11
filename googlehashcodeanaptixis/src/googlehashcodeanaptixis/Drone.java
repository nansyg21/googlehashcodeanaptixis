package googlehashcodeanaptixis;

import java.util.ArrayList;

public class Drone {
	int payload;
	int id;
	ArrayList<Integer> types;
	ArrayList<Integer> quantity;
	int locationX;
	int locationY;
	
	
	
	public Drone(int payload, int id, ArrayList<Integer> types,
			ArrayList<Integer> quantity, int locationX, int locationY) {
		super();
		this.payload = payload;
		this.id = id;
		this.types = types;
		this.quantity = quantity;
		this.locationX = locationX;
		this.locationY = locationY;
	}
	
	public int getPayload() {
		return payload;
	}
	public void setPayload(int payload) {
		this.payload = payload;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
}
