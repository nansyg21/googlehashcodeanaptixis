package googlehashcodeanaptixis;

import java.util.ArrayList;

public class Warehouse {
	
	int locationX;
	int locationY;
	ArrayList<Integer> types;
	ArrayList<Integer> quantity;
	
	
	
	public Warehouse(int locationX, int locationY, ArrayList<Integer> types,
			ArrayList<Integer> quantity) {
		super();
		this.locationX = locationX;
		this.locationY = locationY;
		this.types = types;
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
	
	
	
	

}
