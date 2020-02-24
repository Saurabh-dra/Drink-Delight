package Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RawMaterialList {
	RawMaterial rw=new RawMaterial();
	HashMap<String, String> mMap = new HashMap<String, String>();

	public static void RawMaterials() {
		// List of Raw Material
		ArrayList<String> rawList = new ArrayList<String>();
		rawList.add("Lemon");
		rawList.add("Orange");
		rawList.add("Grapes");
		rawList.add("Mint");
		rawList.add("Kiwi");
		rawList.add("Pomegrante");
		rawList.add("Sparkling Water");
		rawList.add("Soda");

		// SupplierID List
		ArrayList<String> supplierList = new ArrayList<String>();
		supplierList.add("Supplier101");
		supplierList.add("Supplier102");
		supplierList.add("Supplier103");
		supplierList.add("Supplier104");
		supplierList.add("Supplier105");

		// WarehouseID List
		ArrayList<String> warehouseList = new ArrayList<String>();
		warehouseList.add("Warehouse101");
		warehouseList.add("Warehouse102");
		warehouseList.add("Warehouse103");

		System.out.println("Raw MAterial List\tSupplier IDs\tWarehouse IDs");
	}
	
	//Method to add RawMaterial for ordering
	public HashMap<String, String> addRawMaterialList(BufferedReader br) {
		try {
			System.out.println("Enter Raw Material Name:");
			rw.setRawName(br.readLine());
			System.out.println("Enter Supplier ID:");
			rw.setSupplierID(br.readLine());
			System.out.println("Enter Warehouse ID:");
			rw.setWarehouseID(br.readLine());
			System.out.println("Enter Quantity/Unit of Purchase:");
			rw.setQuantity(Integer.parseInt(br.readLine()));
			System.out.println("Enter Price per Unit:");
			rw.setPricePerUnit(Double.parseDouble(br.readLine()));
			try {
				System.out.println("Enter Date of Delivery:");
				String sDate = br.readLine();
				rw.setDateOfDelivery(new SimpleDateFormat("dd/MM/yyyy").parse(sDate));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Enter Stock ID:");
			rw.setStockID(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Random rand = new Random();
		String orderID=""+rand.nextInt(10000);
		rw.setOrderID(orderID);
		mMap.put(rw.getOrderID(), rw.toString());
		System.out.println(rw.getOrderID());
		return mMap;
	}
	
	//method to Display Ordered RawMaterial List 
	public void displayRawMaterialOrder() {
		if(mMap.isEmpty())
			System.out.println("Exception");
		else {
			mMap.forEach((k,v)->{
				System.out.println(k+"\t"+v);
			});
		}
	}
}
