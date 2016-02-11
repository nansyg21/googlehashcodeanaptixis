package googlehashcodeanaptixis;

import java.util.ArrayList;

public class Warehouse {
	
	int locationX;
	int locationY;
	ArrayList<Product> products;
	ArrayList<Integer> quantity;
	int ID;
	
	
	
	public Warehouse(int locationX, int locationY, ArrayList<Product> products,
			ArrayList<Integer> quantity, int iD) {
		super();
		this.locationX = locationX;
		this.locationY = locationY;
		this.products = products;
		this.quantity = quantity;
		ID = iD;
	}

	
	public ArrayList<Product> getProducts() {
		return products;
	}


	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}


	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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
	
	public ArrayList<Integer> getQuantity() {
		return quantity;
	}
	public void setQuantity(ArrayList<Integer> quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
