package com.cg.drinkndelight.placeorder.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.cg.drinkndelight.placeorder.services.RawMaterialServices;
import com.cg.drinkndelight.placeorder.services.ProductServices;
import com.cg.drinkndelight.placeorder.exception.InvalidInputExpection;
import com.cg.drinkndelight.placerorder.beans.Product;
import com.cg.drinkndelight.placerorder.beans.RawMaterial;

public class Main {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	RawMaterialServices rawmaterialservices=new RawMaterialServices();
	ProductServices productServices=new ProductServices();

	public static void main(String[] args) throws IOException, InvalidInputExpection {
		Main obj = new Main();
		System.out.println("**** Welcome to Drink & Delight ****");
		obj.selectSystem();
	}

	// method to chose to order raw material or product
	public void selectSystem() throws IOException, InvalidInputExpection {
		System.out.println("Select Your System:");
		int flag = 1;
		while (flag == 1) {
			System.out.println("1. Raw Material Manager\n2. Product Order Manager\n3. Terminate Operation");
			int choice = 0;
			try {
				choice = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch (choice) {
			case 1:
				selectRawMaterialOperation();
				break;
			case 2: // Product Order Manager
				selectProductOperation();
				break;
			case 3: // Termination
				flag = 0;
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}
	}

	public void selectRawMaterialOperation() throws IOException, InvalidInputExpection {
		System.out.println("Select your Operation:");
		int flag = 1;
		while (flag == 1) {
			System.out.println(
					"1. Place Raw Material Order\n2. Display Ordered Items\n3. Raw Material Menu\n4. Terminate");
			int choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1: // add item
				System.out.println("Enter Raw Material Name:");
				String rawName = br.readLine();
				System.out.println("Enter Supplier ID:");
				String supplierID = br.readLine();
				System.out.println("Enter Warehouse ID:");
				String warehouseID = br.readLine();
				System.out.println("Enter Quantity/Unit of Purchase:");
				int quantity = Integer.parseInt(br.readLine());
				System.out.println("Enter Price per Unit:");
				double pricePerUnit = Double.parseDouble(br.readLine());
				System.out.println("Enter Date of Delivery:");
				String sDate = br.readLine();
				LocalDate DateOfDelivery = null;
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				DateOfDelivery = LocalDate.parse(sDate, formatter);
				rawmaterialservices.addRawMaterial(
						new RawMaterial(rawName, supplierID, warehouseID, quantity, pricePerUnit, DateOfDelivery));
				break;
			case 2: // display
				rawmaterialservices.displayRawMaterial();
				break;
			case 3: //

				break;
			case 4: // terminate
				flag = 0;
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}

	}

	public void selectProductOperation() throws IOException, InvalidInputExpection {
		System.out.println("Select your Operation:");
		int flag = 1;
		while (flag == 1) {
			System.out.println("1. Place Product Order\n2. Display Ordered Items\n3. Product Menu\n4. Terminate");
			int choice1 = 0;
			try {
				choice1 = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch (choice1) {
			case 1: // add item
				System.out.println("Enter Product Name:");
				String productName = br.readLine();
				System.out.println("Enter Quantity/Unit of Purchase:");
				int quantity = Integer.parseInt(br.readLine());
				System.out.println("Enter Price per Unit:");
				double pricePerUnit = Double.parseDouble(br.readLine());
				System.out.println("Enter Date of Delivery:");
				String sDate = br.readLine();
				LocalDate ExitDate = null;
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				ExitDate = LocalDate.parse(sDate, formatter);
				productServices.addProduct(new Product(productName, pricePerUnit, quantity, ExitDate));
				break;
			case 2: // display
				productServices.displayProduct();
				break;
			case 3://
				break;
			case 4: // terminate
				flag = 0;
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}
	}
}
