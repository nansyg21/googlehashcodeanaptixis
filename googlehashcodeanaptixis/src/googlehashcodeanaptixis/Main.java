package googlehashcodeanaptixis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		

		String[] myStringArray = {"busy_day.in","mother_of_all_warehouses.in","redundancy.in"};
		ArrayList<Warehouse> warehouseList = new ArrayList<Warehouse>(); 
		ArrayList<Product> warehouseTypes  = new ArrayList<Product>();
		ArrayList<Order> ordersList  = new ArrayList<Order>();
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<String> Commands = new ArrayList<String>();
		ArrayList<Drone> Drones = new ArrayList<Drone>();
	//	DeliverySchedule ds = new DeliverySchedule(drones, orders, warehouses, totalTurns, totalRows, totalColumns, Commands)
		
		try 
		{
			for(int outer=0;outer<1;outer++)
			{
				File fileIn = new File(myStringArray[outer]);
				FileReader reader = new FileReader(fileIn);
				BufferedReader bReader = new BufferedReader(reader);
				File fileOut = new File("solution"+outer+".in");
				FileWriter writer;
				int count = 0;
				int instructions = 0;

				writer = new FileWriter(fileOut);
				BufferedWriter bWriter = new BufferedWriter(writer);



				String firstLine=  bReader.readLine() ;	//read lines
				StringTokenizer st = new StringTokenizer(firstLine);
				int ROWS= Integer.parseInt( st.nextToken());
				int COLUMNS=Integer.parseInt( st.nextToken());
				int DRONES=Integer.parseInt( st.nextToken());
				int TURNS=Integer.parseInt( st.nextToken());
				int MAXPAYLOAD=Integer.parseInt( st.nextToken());
				
				//System.out.println(ROWS +"-"+COLUMNS +"-"+DRONES+"-"+TURNS+"-"+MAXPAYLOAD); 
				
				String secondLine=  bReader.readLine() ;	//read lines
			    st = new StringTokenizer(secondLine);
				int NUMBER_OF_PRODUCT_TYPES= Integer.parseInt( st.nextToken());
				//System.out.println(NUMBER_OF_PRODUCT_TYPES +" PRODUCT TYPES"); 
				
			 
				
				
				String thirdLine=  bReader.readLine() ;	 
			    st = new StringTokenizer(thirdLine);
			  
			    for(int i=0;i<NUMBER_OF_PRODUCT_TYPES;i++)//read product weights
			    {
			    	
			    	int weight=Integer.parseInt( st.nextToken());
			    	 
			    	productList.add(new Product(i,weight));
			    }

			    String fourthline=  bReader.readLine() ;	//read lines
			    st = new StringTokenizer(fourthline);
				int NUMBER_OF_WEREHOUSES= Integer.parseInt( st.nextToken());
				//System.out.println(NUMBER_OF_WEREHOUSES +" WAREHOUSES"); 
				 
			    for(int i=0;i<NUMBER_OF_WEREHOUSES;i++) //2 LINES FOR EACH WAREHOUSES
			    {
			    	
			    	String wlines=  bReader.readLine() ;	//2 LINES FOR EACH WAREHOUSE
			    	//System.out.println(" READ  "+wlines); 
				    st = new StringTokenizer(wlines);
				    int x=Integer.parseInt( st.nextToken());
				    int y=Integer.parseInt( st.nextToken());
				   // System.out.println(" WARE HOUSE " +i +" IS AT :"+x+","+y); 
				    
				    wlines=  bReader.readLine() ;	//2 LINES FOR EACH WAREHOUSE	 
				    st = new StringTokenizer(wlines);
				    ArrayList<Integer> capacityTemp = new  ArrayList<Integer>() ;capacityTemp.clear();
				    for(int p=0;p<NUMBER_OF_PRODUCT_TYPES;p++)
				    {
				    	 capacityTemp.add( Integer.parseInt( st.nextToken()));
				    }
				    
				    warehouseList.add(new Warehouse(x, y, productList, capacityTemp,i));

				}
			    
			    //read orders
			    String ord=  bReader.readLine() ;	//read lines
			    st = new StringTokenizer(ord);
				int NUMBER_OF_ORDERS= Integer.parseInt( st.nextToken());
				 // System.out.println(" NUM OF ORDERS IS " +NUMBER_OF_ORDERS); 
				for(int i=0;i<NUMBER_OF_ORDERS;i++) //2 LIENS FOR EACH WAREHOUSES
				{
					String ordCoor=  bReader.readLine() ;	//2 LINES FOR EACH WAREHOUSE	'
					
				    st = new StringTokenizer(ordCoor);
				    int xOrd=Integer.parseInt( st.nextToken());
				    int yOrd=Integer.parseInt( st.nextToken());
				   // System.out.println(" ORD  " +i +" IS AT :"+xOrd+","+yOrd); 
				    String ordNumProd=  bReader.readLine() ;	//2 LINES FOR EACH WAREHOUSE	 
				    st = new StringTokenizer(ordNumProd);
				    int numer_of_ordered_prod=Integer.parseInt( st.nextToken());
				    //System.out.println(" total:  " +numer_of_ordered_prod); 
				    ArrayList<Integer> quantity = new ArrayList<Integer>();
				    for(int j=0;j<NUMBER_OF_PRODUCT_TYPES;j++)//starting by 0 for all products
					{
				    	quantity.add(j, 0);
					}
				    
				    st = new StringTokenizer(bReader.readLine());
				    for(int j=0;j<numer_of_ordered_prod;j++) //2 LIENS FOR EACH WAREHOUSES
					{
				    	int temp=Integer.parseInt( st.nextToken());//ADDINNG PRODUCTS, starts by zeros
				    	quantity.add(temp,quantity.get(temp)+1);
					}
				    
				    ordersList.add(new Order(xOrd, yOrd, warehouseTypes, quantity, false));
				    
				}
				
				//create drones
				for(int j=0;j<DRONES;j++) 
				{	
					Drones.add(new Drone(MAXPAYLOAD,j,warehouseList.get(0).locationX,warehouseList.get(0).locationY,MAXPAYLOAD,TURNS));

				}
				
 
				
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}
	
	

}
