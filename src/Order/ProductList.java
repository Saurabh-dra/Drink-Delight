package Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ProductList {
	Product proObject = new Product();
	HashMap<String, String> proMap = new HashMap<String, String>();

	public static void ProductMenu() {
		// List of Raw Material
		ArrayList<String> rawList = new ArrayList<String>();
		rawList.add("Lemonade");
		rawList.add("Orange-Juice");
		rawList.add("Grapes-Wine");
		rawList.add("Mojito");
		rawList.add("Kiwi-Juice");
		rawList.add("Pomegrante-Juice");
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

		System.out.println("Product List\tSupplier IDs\tWarehouse IDs");
	}

	public HashMap<String, String> addProductList(BufferedReader br) {
		try {
			System.out.println("Enter Product Name:");
			proObject.setProductName(br.readLine());

			System.out.println("Enter Quantity/Unit of Purchase:");
			proObject.setQuantity(Integer.parseInt(br.readLine()));

			System.out.println("Enter Price per Unit:");
			proObject.setPricePerUnit(Double.parseDouble(br.readLine()));
			try {
				System.out.println("Enter Date of Delivery:");
				String sDate = br.readLine();
				proObject.setExitDate(new SimpleDateFormat("dd/MM/yyyy").parse(sDate));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Random rand=new Random();
		String orderID = ""+rand.nextInt(20000-10000);
		proObject.setOrderID(orderID);

		proMap.put(proObject.getOrderID(), proObject.toString());
		return proMap;
	}

	public void displayOrderList() {
		if (proMap.isEmpty())
			System.out.println("Exception");
		else {
			proMap.forEach((k, v) -> {
				System.out.println(k + "\t" + v);
			});
		}

	}
}
