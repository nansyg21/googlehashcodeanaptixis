package googlehashcodeanaptixis;

import java.util.ArrayList;

public class DeliverySchedule {

	ArrayList<Drone> drones;
	ArrayList<Order> orders;
	ArrayList<Warehouse> warehouses;

	int totalTurns;
	int totalRows;
	int totalColumns;

	String corType;



	public DeliverySchedule(ArrayList<Drone> drones, ArrayList<Order> orders,
			ArrayList<Warehouse> warehouses, int totalTurns, int totalRows,
			int totalColumns) {
		super();
		this.drones = drones;
		this.orders = orders;
		this.warehouses = warehouses;
		this.totalTurns = totalTurns;
		this.totalRows = totalRows;
		this.totalColumns = totalColumns;
	}

	public int FindTurns(int sourceX, int sourceY, int destX, int destY)
	{
		double distance;
		double turn;

		distance=Math.sqrt(Math.abs(sourceX-destX)^2 + Math.abs(sourceY-destY)^2);

		turn=Math.ceil(distance);

		return (int)turn;
	}

	public void CalculateTotalTurns(Order o)
	{
		int bestTurn=1000000;
		int temp1,temp2;
		int tempTotal=bestTurn-1;
		int maxWeight=0;
		int tempWeight=0;
		int dronePayload;
		int totalWeight=0;

		for(Drone d: drones)
		{
			if(d.isFree())
			{
				for(Warehouse w: warehouses)
				{
					for(Product p: o.getProducts())
					{
						if(CheckAvailability(w,p.getId(),o.getQuantities().get(p.getId())))
						{
							tempWeight=p.getWeight()*o.getQuantities().get(p.getId());
							//dronePayload=d.getPayloadAvailable();
							
						}
						dronePayload=d.getPayloadAvailable();
						if(dronePayload>totalWeight+tempWeight)
						{
							totalWeight=totalWeight+tempWeight;
						}
						else
						{
							if(tempWeight>totalWeight)
							{
								totalWeight=tempWeight;
							}
						}
						
					}
					
					temp1=FindTurns(d.getLocationX(),d.getLocationY(),w.getLocationX(),w.getLocationY());
					temp2=FindTurns(w.getLocationX(),w.getLocationY(),o.getLocationX(),o.getLocationY());
					tempTotal=temp1+temp2;
				}
				if(tempTotal<bestTurn)
				{
					bestTurn=tempTotal;
				}
			}
		}
		
		//Load
		//Deliver

	}

	public boolean CheckAvailability(Warehouse w, int type, int quantity)
	{
		ArrayList<Integer> p=w.getQuantity();

		if(p.get(type)>=quantity)
			return true;
		else
			return false;
	}
	/*public boolean CheckWarehouseAvailiable(Warehouse w,ArrayList<Integer> productType,ArrayList<Integer> quantity)
	{
		boolean exists=false;
		//Check existance
		if(warehouses.get(w.getID()).getTypes().contains(productType))
			exists=true;

		//Check quantity
		if(exists)
			if(warehouses.get(w.getID()).getQuantity().get(productType) >= quantity)
				return true;

		return false;
	}*/
	/*public void FillOrder(Order o)
	{
		int type=0;
		ArrayList<Integer> quantities=o.getQuantities();

		for(int q: quantities)
		{
			if(q>0)
				CalculateNearestWarehouse(type, q, o);
			type++;
		}
	}
*/

	//	public int CalculateNearestWarehouse(Order o)
	//	{
	/*public int CalculateNearestWarehouse(int productType, int productQuantity, Order o)
	{
		int bestWarehouseID=-1;
		int temp=0,bestDist=-1;
		boolean warehouseAvailiable=true;
		int type=productType;
		boolean isAvailable=false;

		//	ArrayList<Integer> orderProducts=o.getQuantity();

		for(Warehouse w: warehouses)
		{
			isAvailable=false;

			if(CheckAvailability(w,type,productQuantity))
			{
				isAvailable=true;
			}
			//Load
			//o.getQuantity().set(type,0);
			//type++;

			if(isAvailable)
			{
				if(bestDist<0)
				{
					bestDist=temp=FindTurns(w.getLocationX(),w.locationY,o.getLocationX(),o.locationY);
					bestWarehouseID=w.getID();
				}

				temp = FindTurns(w.getLocationX(),w.locationY,o.getLocationX(),o.locationY);

				if(temp<bestDist )
				{
					bestDist=temp;
					bestWarehouseID=w.getID();
				}
			}

		}

		return bestWarehouseID;
	}*/

	public String CheckCorrdinates(int x, int y)
	{
		corType="empty";
		if(!orders.isEmpty())
		{
			for(Order o: orders)
			{
				if((x==o.getLocationX())&&(y==o.getLocationY()))
				{
					corType="order";
					break;
				}

			}
		}

		if(!warehouses.isEmpty())
		{
			for(Warehouse w: warehouses)
			{
				if((x==w.getLocationX())&&(y==w.getLocationY()))
				{
					corType="warehouse";
					break;
				}

			}
		}

		return corType;
	}

	public ArrayList<Drone> getDrones() {
		return drones;
	}
	public void setDrones(ArrayList<Drone> drones) {
		this.drones = drones;
	}
	public ArrayList<Order> getOrders() {
		return orders;
	}
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	public ArrayList<Warehouse> getWarehouses() {
		return warehouses;
	}
	public void setWarehouses(ArrayList<Warehouse> warehouses) {
		this.warehouses = warehouses;
	}
	public int getTotalTurns() {
		return totalTurns;
	}
	public void setTotalTurns(int totalTurns) {
		this.totalTurns = totalTurns;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getTotalColumns() {
		return totalColumns;
	}
	public void setTotalColumns(int totalColumns) {
		this.totalColumns = totalColumns;
	}





}
