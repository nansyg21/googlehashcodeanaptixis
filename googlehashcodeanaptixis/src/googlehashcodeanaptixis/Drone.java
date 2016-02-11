package googlehashcodeanaptixis;

import java.util.ArrayList;

public class Drone {
	int payload;
	int id;
	ArrayList<Integer> types;
	ArrayList<Integer> quantity;
	int locationX;
	int locationY;
	boolean free;
	int payloadAvailable;
	
	
	
	public Drone(int payload, int id, ArrayList<Integer> types,
			ArrayList<Integer> quantity, int locationX, int locationY,int payloadAvailable) {
		super();
		this.payload = payload;
		this.id = id;
		this.types = types;
		this.quantity = quantity;
		this.locationX = locationX;
		this.locationY = locationY;
		this.free=true;
		this.payloadAvailable=payloadAvailable;
	}
	
	
	
	public int getPayloadAvailable() {
		return payloadAvailable;
	}



	public void setPayloadAvailable(int payloadAvailable) {
		this.payloadAvailable = payloadAvailable;
	}



	public boolean isFree() {
		return free;
	}



	public void setFree(boolean free) {
		this.free = free;
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
