package Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	RawMaterialList rmList = new RawMaterialList();
	ProductList proList = new ProductList();

	public static void main(String[] args) {
		Main obj = new Main();
		System.out.println("**** Welcome to Drink & Delight ****");
		obj.selectSystem();
	}

	// method to chose to order raw material or product
	public void selectSystem() {
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

	public void selectRawMaterialOperation() {
		System.out.println("Select your Operation:");
		int flag = 1;
		rmList = new RawMaterialList();
		while (flag == 1) {
			System.out.println(
					"1. Place Raw Material Order\n2. Display Ordered Items\n3. Raw Material Menu\n4. Terminate");
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
				rmList.addRawMaterialList(br);
				break;
			case 2: // display
				rmList.displayRawMaterialOrder();

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

	public void selectProductOperation() {
		System.out.println("Select your Operation:");
		int flag = 1;
		proList = new ProductList();
		while (flag == 1) {
			System.out.println(
					"1. Place Product Order\n2. Display Ordered Items\n3. Product Menu\n4. Terminate");
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
				proList.addProductList(br);
				break;
			case 2: // display
				proList.displayOrderList();
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
}
